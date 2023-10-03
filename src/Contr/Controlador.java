package Contr;

import Modelo.Datos;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author aris-
 */
public class Controlador implements ActionListener {

    private Datos datos;
    private Vinicio Pingreso;
    private Vbot Pbot;
    private int num = (int)(Math.random()*8+1);
    
    public Controlador(Datos datos, Vbot Pbot, Vinicio Pingreso) {
        this.datos = datos;
        this.Pingreso = Pingreso;
        this.Pbot = Pbot;
        this.Pingreso.BtEnviar.addActionListener(this);
        this.Pbot.BtEnviar.addActionListener(this);
        this.Pbot.BtSalir.addActionListener(this);
        this.Pingreso.BtSalir.addActionListener(this);   
        Pingreso.setLocationRelativeTo(null);
        Pbot.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e) {
        boolean n =datos.DetNum(Pingreso.txtID.getText());
        if (e.getSource() == Pingreso.BtEnviar) {
            int a=1;
            if(Pingreso.txtNombre.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre", "Error!", JOptionPane.ERROR_MESSAGE);
            }else if(Pingreso.txtCiudad.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Por favor ingrese la ciudad", "Error!", JOptionPane.ERROR_MESSAGE);
            }else if((int) Pingreso.Nedad.getModel().getValue()==0){
                JOptionPane.showMessageDialog(null, "Por favor ingrese una edad valida", "Error!", JOptionPane.ERROR_MESSAGE);
            }else if(Pingreso.txtID.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Por favor ingrese la Identificación", "Error!", JOptionPane.ERROR_MESSAGE);
            }else if(n == false){
                JOptionPane.showMessageDialog(null, "Por favor ingrese solo numeros en la casilla ID", "Error!", JOptionPane.ERROR_MESSAGE);
            }
            else{
            datos.setNombre(Pingreso.txtNombre.getText());
            datos.setCiudad(Pingreso.txtCiudad.getText());
            datos.setId(Integer.parseInt(Pingreso.txtID.getText()));
            datos.setEdad((int) Pingreso.Nedad.getModel().getValue());
            a= JOptionPane.showConfirmDialog(null, "TIENES LOS DATOS ESCRITOS CORRECTAMENTE?","Advertencia",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE); 
            }
            
            
            if (a ==0) {
                this.Pingreso.dispose();
                this.Pbot.setVisible(true);
                datos.setBot(this.num);
                Pbot.setTitle(datos.getBot());
                Pbot.AreaBot.append(datos.getBot() + ">> Hola " + datos.getNombre()+", en que te puedo ayudar?"+"\n");
            }
            
        }
        
        if (e.getSource() == Pbot.BtEnviar) {
                  
                   datos.setRuser(Pbot.txtRespuesta.getText()); 
                   Pbot.AreaBot.append(datos.getNombre()+">> "+datos.getRuser()+"\n");
                   datos.respuestas(datos.getRuser().toLowerCase());
                   Pbot.AreaBot.append(datos.getRbot());
                   datos.setRbot("");
                   Pbot.txtRespuesta.setText("");
           
           
        }
        if (e.getSource() == Pbot.BtSalir) {
            int a=JOptionPane.showConfirmDialog(null, "SEGURO QUE DESEA SALIR?", "Advertencia",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            if (a==0) {
                JOptionPane.showMessageDialog(null, "QUE TENGAS UN FELIZ DIA ;)","Mensaje",JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }
            
        }
        if (e.getSource() == Pingreso.BtSalir) {
            int a=JOptionPane.showConfirmDialog(null, "SEGURO QUE DESEA SALIR?", "Advertencia",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            if (a==0) {
                JOptionPane.showMessageDialog(null, "QUE TENGAS UN FELIZ DIA ;)","Mensaje",JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }
        }
    }

}
