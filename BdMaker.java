/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploLibro;

import neodatis.Jugador;
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.ODBServer;
import org.neodatis.odb.Objects;

/**
 *
 * @author Vespertino
 */
public class BdMaker {

    public static void main(String[] args) {
        ODB odb = null;
        ODBServer server = null;
        try {
            // Crea el servidor en el Puerto 8000
            server = ODBFactory.openServer(8001);
            // BD a usar y el nombre que se usará para refererirse a ella
            server.addBase("base", "EJEMPLO.DB");
            // Se ejecuta el servidor
            server.startServer(true);

            // Se abre la BD
            odb = server.openClient("base");

        } finally {
            if (odb != null) {
                // Primero se cierra el cliente
                odb.close();
            }
            if (server != null) {
                // Y luego el servidor
                server.close();
            }
        }
    }
}


