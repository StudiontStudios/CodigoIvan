package ejemploLibro;

import com.github.javafaker.Faker;
import java.util.HashSet;
import java.util.Set;
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;

public class Run {

    public static void main(String[] args) {
        ODB odb = ODBFactory.open("EJEMPLO.DB");
        Faker f = new Faker();
        Articulos a;
        Clientes c = null;
        Ventas v = null;
        int i=0,j=0;
        HashSet<Ventas> compras = new HashSet<>();

        for (; j < 3; j++) {
            a = new Articulos();
            a.setCodarti(i);
            a.setDenom(f.pokemon().name());
            a.setPvp(f.number().numberBetween(1, 50));
            a.setStock(f.number().numberBetween(1, 50));
            for (; i < 10; i++) {
                c = new Clientes();
                v = new Ventas();

                c.setNombre(f.name().firstName());
                c.setNumcli(i);
                c.setPobla(f.country().capital());
                v.setCodventa(i);
                v.setFecha(f.date().toString());
                v.setNumcli(c);
                v.setUniven(f.number().numberBetween(1, 200));

                compras.add(v);
            }
            a.setCompras(compras);
            compras.clear();
            odb.store(c);
            odb.store(v);
            odb.store(a);
        }
        odb.close();
    }
    
}
