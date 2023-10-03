
package chatbot;

import Contr.Controlador;
import Modelo.Datos;
import Vista.*;
public class Chatbot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vinicio Pingreso = new Vinicio();
        Vbot Pbot = new Vbot();
        Datos datos = new Datos();
        Controlador controlador = new Controlador(datos, Pbot, Pingreso);
        Pingreso.setVisible(true);
        datos.setControl(controlador);
        Pingreso.setControl(controlador);
        Pbot.setControl(controlador);
        
        
        
    }

    
    
}
