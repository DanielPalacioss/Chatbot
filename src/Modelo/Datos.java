package Modelo;

import Contr.Controlador;
import java.text.Normalizer;
import javax.swing.JOptionPane;

/**
 *
 * @author aris-
 */
public class Datos {

    private String Nombre, Fnacimiento, Ciudad, Ruser, Bot, Rbot, Mensaje;
    private int Id, Edad;
    Controlador cont;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        Mensaje = Normalizer.normalize(Mensaje, Normalizer.Form.NFD);
        Mensaje = Mensaje.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        Mensaje = Mensaje.replace("¿", "").replace("?", "");
        this.Mensaje = Mensaje;
    }

    public String getFnacimiento() {
        return Fnacimiento;
    }

    public String getRbot() {
        return Rbot;
    }

    public void setRbot(String Rbot) {
        this.Rbot = Rbot;
    }

    public void setFnacimiento(String Fnacimiento) {
        this.Fnacimiento = Fnacimiento;
    }

    public int getEdad() {
        return Edad;
    }

    public String getBot() {
        return Bot;
    }

    public void setBot(int rand) {
        String bot = null;
        switch (rand) {
            case 1:
                bot = "Lucero";
                break;
            case 2:
                bot = "Luna";
                break;
            case 3:
                bot = "Andres";
                break;
            case 4:
                bot = "Yoiner";
                break;
            case 5:
                bot = "Hernan";
                break;
            case 6:
                bot = "Nikole";
                break;
            case 7:
                bot = "Yenner";
                break;
            case 8:
                bot = "Luis";
                break;
        }
        this.Bot = bot;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getRuser() {
        return Ruser;
    }

    public void setRuser(String Ruser) {
        this.Ruser = Ruser;
    }

    public void setControl(Controlador controlador) {
        this.cont = controlador;
    }

    public void identificador() {

        int a = 3;
        String v = this.Mensaje.replace(" ", "").replace("?", "").replace("¿", "");
        String respuestas[] = {"hola", "como estas", "mi edad",
            "cual es mi edad", "tienes novio", "tienes pareja",
            "bien", "muy bien", "excelente", "cual es mi identificacion", "regalame mi identificacion",
            "cual es mi ciudad", "regalame mi ciudad", "quien eres", "dime quien eres", "como te llamas", "cual es tu nombre", "dime tu nombre",
            "como me llamo", "dime mi nombre", "cual es tu funcionalidad", "como funcionas", "para que sirves", "dime un chiste",
            "cuentame un chiste", "dime una frase motivacional", "dime algo que me motive", "estoy triste", "finalizar chat", "adios", "bye"};

        //------------------------------------------------------------------------------------------------------------------------------------
        //hola
        for (int i = 0; i < this.Mensaje.replace(" ", "").length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("hola") || this.Mensaje.equals("hello") || this.Mensaje.equals("hi") || this.Mensaje.equals("oe")) {
                break;
            }
            if (v.replace(" ", "").charAt(i) == respuestas[0].charAt(i)) {

                if (num == 3) {
                    a = JOptionPane.showConfirmDialog(null, "¿QUISISTE DECIR >HOLA?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[0]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }

        }

        //------------------------------------------------------------------------------------------------------------------------------------
        //como estas
        for (int i = 0; i < this.Mensaje.replace(" ", "").length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("como estas") || this.Mensaje.equals("que mas") || this.Mensaje.equals("como vas") || this.Mensaje.equals("que hay")) {
                break;
            }
            if (v.charAt(i) == respuestas[1].replace(" ", "").charAt(i)) {
                
                if (num == 7) {
                    a = JOptionPane.showConfirmDialog(null, "¿QUISISTE DECIR >CÓMO ESTAS?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[1]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }

        }

        //------------------------------------------------------------------------------------------------------------------------------------
        //mi edad
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("cual es mi edad") || this.Mensaje.equals("regalame mi edad") || this.Mensaje.equals("dime mi edad")) {
                break;
            }
            if (v.charAt(i) == respuestas[2].replace(" ", "").charAt(i)) {
                
                if (num == 4) {
                    a = JOptionPane.showConfirmDialog(null, "¿QUISISTE DECIR >MI EDAD?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[2]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }

        }

        //------------------------------------------------------------------
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("cual es mi edad") || this.Mensaje.equals("regalame mi edad") || this.Mensaje.equals("dime mi edad")) {
                break;
            }
            if (v.charAt(i) == respuestas[3].replace(" ", "").charAt(i)) {
                
                if (num == 9) {
                    a = JOptionPane.showConfirmDialog(null, "¿QUISISTE DECIR >CÚAL ES MI EDAD?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[3]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }

        }

        //------------------------------------------------------------------------------------------------------------------------------------
        //tienes novio
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("tienes novio") || this.Mensaje.equals("tienes novia") || this.Mensaje.equals("tienes pareja")) {
                break;
            }
            if (v.charAt(i) == respuestas[4].replace(" ", "").charAt(i)) {
                
                if (num == 8) {
                    a = JOptionPane.showConfirmDialog(null, "¿QUISISTE DECIR >TIENES NOVIO?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[4]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }

        }
        //------------------------------------------------------------------------------------------------------------------------------------
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("tienes novio") || this.Mensaje.equals("tienes novia") || this.Mensaje.equals("tienes pareja")) {
                break;
            }
            if (v.charAt(i) == respuestas[5].replace(" ", "").charAt(i)) {
                
                if (num == 8) {
                    a = JOptionPane.showConfirmDialog(null, "¿QUISISTE DECIR >TIENES PAREJA?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[5]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }

        }
        //------------------------------------------------------------------------------------------------------------------------------------
        //bien
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("bien") || (this.Mensaje.equals("muy bien")) || (this.Mensaje.equals("excelente"))) {
                break;
            }
            if (v.charAt(i) == respuestas[6].replace(" ", "").charAt(i)) {
                
                if (num == 3) {
                    a = JOptionPane.showConfirmDialog(null, "¿QUISISTE DECIR >BIEN?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[6]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }

        }
        //------------------------------------------------------------------
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("bien") || (this.Mensaje.equals("muy bien")) || (this.Mensaje.equals("excelente"))) {
                break;
            }
            if (v.charAt(i) == respuestas[7].replace(" ", "").charAt(i)) {
                
                if (num == 6) {
                    a = JOptionPane.showConfirmDialog(null, "¿QUISISTE DECIR >MUY BIEN?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[7]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }

        }

        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("bien") || (this.Mensaje.equals("muy bien")) || (this.Mensaje.equals("excelente"))) {
                break;
            }
            if (v.charAt(i) == respuestas[8].replace(" ", "").charAt(i)) {
                
                if (num == 5) {
                    a = JOptionPane.showConfirmDialog(null, "¿QUISISTE DECIR >EXCELENTE?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[8]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }

        }
        //------------------------------------------------------------------------------------------------------------------------------------
        //identificación
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("cual es mi identificacion") || this.Mensaje.equals("regalame mi identificacion") || this.Mensaje.equals("regalame mi identificacion por favor")) {
                break;
            }
            if (v.charAt(i) == respuestas[9].replace(" ", "").charAt(i)) {
                
                if (num == 13) {
                    a = JOptionPane.showConfirmDialog(null, "¿QUISISTE DECIR >CÚAL ES MI IDENTIFICACIÓN?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[9]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }

        }
        //-----------------------------------------------------------------------------------
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("cual es mi identificacion") || this.Mensaje.equals("regalame mi identificacion") || this.Mensaje.equals("regalame mi identificacion por favor")) {
                break;
            }
            if (v.charAt(i) == respuestas[10].replace(" ", "").charAt(i)) {
                
                if (num == 14) {
                    a = JOptionPane.showConfirmDialog(null, "¿QUISISTE DECIR >REGÁLAME MI IDENTIFICACIÓN?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[10]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }

        }
        //----------------------------------------------------------------------------------------------------------------------------------------
        //CIUDAD
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("cual es mi ciudad") || this.Mensaje.equals("regalame mi ciudad") || this.Mensaje.equals("en que ciudad vivo")) {
                break;
            }
            if (v.charAt(i) == respuestas[11].replace(" ", "").charAt(i)) {
                
                if (num == 11) {
                    a = JOptionPane.showConfirmDialog(null, "¿QUISISTE DECIR >CÚAL ES MI CIUDAD?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[11]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }

        }
        //-----------------------------------------------------------------------------------
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("cual es mi ciudad?") || this.Mensaje.equals("regalame mi ciudad") || this.Mensaje.equals("en que ciudad vivo")) {
                break;
            }
            if (v.charAt(i) == respuestas[12].replace(" ", "").charAt(i)) {
                
                if (num == 13) {
                    a = JOptionPane.showConfirmDialog(null, "¿QUISISTE DECIR >REGÁLAME MI CIUDAD?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[12]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }

        }
        //----------------------------------------------------------------------------------------------------------------------------------------
        //quien eres
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("quien eres") || this.Mensaje.equals("dime quien eres")) {
                break;
            }
            if (v.charAt(i) == respuestas[13].replace(" ", "").charAt(i)) {
                
                if (num == 7) {
                    a = JOptionPane.showConfirmDialog(null, "¿QUISISTE DECIR >QUIÉN ERES?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[13]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }

        }
        //-----------------------------------------------------------------------------------
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("quien eres") || this.Mensaje.equals("dime quien eres")) {
                break;
            }
            if (v.charAt(i) == respuestas[14].replace(" ", "").charAt(i)) {
                
                if (num == 11) {
                    a = JOptionPane.showConfirmDialog(null, "¿QUISISTE DECIR >DIME QUIÉN ERES?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[14]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }

        }
        //----------------------------------------------------------------------------------------------------------------------------------------
        //NOMBRE DEL BOT
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("como te llamas") || this.Mensaje.equals("cual es tu nombre") || this.Mensaje.equals("dime tu nombre")) {
                break;
            }
            if (v.charAt(i) == respuestas[15].replace(" ", "").charAt(i)) {
                
                if (num == 9) {
                    a = JOptionPane.showConfirmDialog(null, "¿QUISISTE DECIR >CÓMO TE LLAMAS?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[15]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }

        }
        //-----------------------------------------------------------------------------------
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("como te llamas") || this.Mensaje.equals("cual es tu nombre") || this.Mensaje.equals("dime tu nombre")) {
                break;
            }
            if (v.charAt(i) == respuestas[16].replace(" ", "").charAt(i)) {
                
                if (num == 10) {
                    a = JOptionPane.showConfirmDialog(null, "¿QUISISTE DECIR >CÚAL ES TU NOMBRE?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[16]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }

        }
        //-----------------------------------------------------------------------------------
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("como te llamas") || this.Mensaje.equals("cual es tu nombre") || this.Mensaje.equals("dime tu nombre")) {
                break;
            }
            if (v.charAt(i) == respuestas[17].replace(" ", "").charAt(i)) {
                
                if (num == 8) {
                    a = JOptionPane.showConfirmDialog(null, "¿QUISISTE DECIR >DIME TU NOMBRE?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[17]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }

        }
        //----------------------------------------------------------------------------------------------------------------------------------------
        //Nombre del user
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("como me llamo") || this.Mensaje.equals("dime mi nombre")) {
                break;
            }
            if (v.charAt(i) == respuestas[18].replace(" ", "").charAt(i)) {
                
                if (num == 8) {
                    a = JOptionPane.showConfirmDialog(null, "¿QUISISTE DECIR >CÓMO ME LLAMO?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[18]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }

        }
        //-----------------------------------------------------------------------------------
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("como me llamo") || this.Mensaje.equals("dime mi nombre")) {
                break;
            }
            if (v.charAt(i) == respuestas[19].replace(" ", "").charAt(i)) {
                
                if (num == 8) {
                    a = JOptionPane.showConfirmDialog(null, "¿QUISISTE DECIR >DIME MI NOMBRE?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[19]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }
        }
        //----------------------------------------------------------------------------------------------------------------------------------------
        //Funcionalidad del bot
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("cual es tu funcionalidad") || this.Mensaje.equals("como funcionas") || this.Mensaje.equals("para que sirves")) {
                break;
            }
            if (v.charAt(i) == respuestas[20].replace(" ", "").charAt(i)) {
                
                if (num == 10) {
                    a = JOptionPane.showConfirmDialog(null, "¿QUISISTE DECIR >¿CÚAL ES TU FUNCIONALIDAD?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[20]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }
        }
        //-----------------------------------------------------------------------------------
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("cual es tu funcionalidad") || this.Mensaje.equals("como funcionas") || this.Mensaje.equals("para que sirves")) {
                break;
            }
            if (v.charAt(i) == respuestas[21].replace(" ", "").charAt(i)) {
                
                if (num == 6) {
                    a = JOptionPane.showConfirmDialog(null, "¿CÓMO FUNCIONAS?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[21]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }
        }
        //-----------------------------------------------------------------------------------
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("cual es tu funcionalidad") || this.Mensaje.equals("como funcionas") || this.Mensaje.equals("para que sirves")) {
                break;
            }
            if (v.charAt(i) == respuestas[22].replace(" ", "").charAt(i)) {
                
                if (num == 9) {
                    a = JOptionPane.showConfirmDialog(null, "QUISISTE DECIR >¿PARA QUE SIRVES?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[22]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }
        }
        //----------------------------------------------------------------------------------------------------------------------------------------
        //Un chiste
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("dime un chiste") || this.Mensaje.equals("cuentame un chiste")) {
                break;
            }
            if (v.charAt(i) == respuestas[23].replace(" ", "").charAt(i)) {
                
                if (num == 8) {
                    a = JOptionPane.showConfirmDialog(null, "QUISISTE DECIR >¿DIME UN CHISTE?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[23]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }
        }
        //-----------------------------------------------------------------------------------
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("dime un chiste") || this.Mensaje.equals("cuentame un chiste")) {
                break;
            }
            if (v.charAt(i) == respuestas[24].replace(" ", "").charAt(i)) {
              
                if (num == 11) {
                    a = JOptionPane.showConfirmDialog(null, "QUISISTE DECIR >¿CUENTAME UN CHISTE?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[24]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }
        }

        //----------------------------------------------------------------------------------------------------------------------------------------
        //Frase motivadora
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("dime una frase motivacional") || this.Mensaje.equals("dime algo que me motive") || this.Mensaje.equals("estoy triste")) {
                break;
            }
            if (v.charAt(i) == respuestas[25].replace(" ", "").charAt(i)) {
                
                if (num == 10) {
                    a = JOptionPane.showConfirmDialog(null, "QUISISTE DECIR >¿DIME UNA FRASE MOTIVACIONAL?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[25]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }
        }
        //-----------------------------------------------------------------------------------
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("dime una frase motivacional") || this.Mensaje.equals("dime algo que me motive") || this.Mensaje.equals("estoy triste")) {
                break;
            }
            if (v.charAt(i) == respuestas[26].replace(" ", "").charAt(i)) {
                
                if (num == 11) {
                    a = JOptionPane.showConfirmDialog(null, "¿QUISISTE DECIR >¿DIME ALGO QUE ME MOTIVE?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[26]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }
        }
        //-----------------------------------------------------------------------------------
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("dime una frase motivacional") || this.Mensaje.equals("dime algo que me motive") || this.Mensaje.equals("estoy triste")) {
                break;
            }
            if (v.charAt(i) == respuestas[27].replace(" ", "").charAt(i)) {
                
                if (num == 7) {
                    a = JOptionPane.showConfirmDialog(null, "¿ESTOY TRISTE?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[27]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }
        }
        //----------------------------------------------------------------------------------------------------------------------------------------
        //Despedida
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("finalizar chat") || this.Mensaje.equals("adios") || this.Mensaje.equals("bye")) {
                break;
            }
            if (v.charAt(i) == respuestas[28].replace(" ", "").charAt(i)) {
                
                if (num == 7) {
                    a = JOptionPane.showConfirmDialog(null, "¿FINALIZAR CHAT?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[28]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }
        }
        //-----------------------------------------------------------------------------------
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("finalizar chat") || this.Mensaje.equals("adios") || this.Mensaje.equals("bye")) {
                break;
            }
            if (v.charAt(i) == respuestas[29].replace(" ", "").charAt(i)) {
                
                if (num == 3) {
                    a = JOptionPane.showConfirmDialog(null, "¿ADIOS?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[29]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }
        }
        //-----------------------------------------------------------------------------------
        for (int i = 0; i < v.length(); i++) {
            int num = i + 1;
            if (this.Mensaje.equals("finalizar chat") || this.Mensaje.equals("adios") || this.Mensaje.equals("bye")) {
                break;
            }
            if (v.charAt(i) == respuestas[30].replace(" ", "").charAt(i)) {
                
                if (num == 1) {
                    a = JOptionPane.showConfirmDialog(null, "¿BYE?<", "WARNING", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                    if (a == 0) {
                        setMensaje(respuestas[30]);
                    } else if (a == 1) {
                        setMensaje("");
                    }
                }
            } else {
                break;
            }
        }
        //-----------------------------------------------------------------------------------THE FINALLY
    }

    public void respuestas(String Mensaje) {
        int num = (int) (Math.random() * 4 + 1);
        setMensaje(Mensaje);
        identificador();
        if (this.Mensaje.equals("hola") || this.Mensaje.equals("hello") || this.Mensaje.equals("hi") || this.Mensaje.equals("oe")) {
            switch (num) {
                case 1:
                    setRbot(this.Bot + ">> Hola " + this.Nombre + ", en que te puedo ayudar?\n");
                    break;
                case 2:
                    setRbot(this.Bot + ">> Que se dice mi perro, en que le puedo ayudar?\n");
                    break;
                case 3:
                    setRbot(this.Bot + ">> Hablamelo " + this.Nombre + ", en que te puedo ayudar?\n");
                    break;
                case 4:
                    setRbot(this.Bot + ">> " + this.Nombre + " Mi vida, en que te puedo ayudar?\n");
                    break;
            }

        } else if (this.Mensaje.equals("como estas") || this.Mensaje.equals("que mas") || this.Mensaje.equals("como vas") || this.Mensaje.equals("que hay")) {
            switch (num) {
                case 1:
                    setRbot(this.Bot + ">> Muy bien " + this.Nombre + " y tu?\n");
                    break;
                case 2:
                    setRbot(this.Bot + ">> Aquí llevandola " + this.Nombre + " y tu?\n");
                    break;
                case 3:
                    setRbot(this.Bot + ">> Excelente papi " + this.Nombre + " y usted?\n");
                    break;
                case 4:
                    setRbot(this.Bot + ">> " + this.Nombre + " Bien pai " + " y usted?\n");
                    break;
            }

        } else if (this.Mensaje.equals("") || this.Mensaje.equals(" ")) {
            switch (num) {
                case 1:
                    setRbot(this.Bot + ">> No has ingresado algo entendible " + this.Nombre + " \n");
                    break;
                case 2:
                    setRbot(this.Bot + ">> Revisa la caja de texto " + this.Nombre + " \n");
                    break;
                case 3:
                    setRbot(this.Bot + ">> Escribe correctamente por favor " + this.Nombre + "\n");
                    break;
                case 4:
                    setRbot(this.Bot + ">> Mijo hableme claro " + this.Nombre + " \n");
                    break;
            }

        } else if (this.Mensaje.equals("cual es mi edad") || this.Mensaje.equals("regalame mi edad") || this.Mensaje.equals("dime mi edad")) {
            switch (num) {
                case 1:
                    setRbot(this.Bot + ">>  Tu edad es de " + this.Edad + " años " + this.Nombre + " \n");
                    break;
                case 2:
                    setRbot(this.Bot + ">>  Estas viejo ya, tenes " + this.Edad + " años " + this.Nombre + " \n");
                    break;
                case 3:
                    setRbot(this.Bot + ">>  Tu edad es de " + this.Edad + " años " + this.Nombre + " \n");
                    break;
                case 4:
                    setRbot(this.Bot + ">>  Estas viejo ya, tenes " + this.Edad + " años " + this.Nombre + " \n");
                    break;
            }

        } else if (this.Mensaje.equals("cual es mi identificacion") || this.Mensaje.equals("regalame mi identificacion") || this.Mensaje.equals("regalame mi identificacion por favor")) {
            setRbot(this.Bot + ">> " + this.Nombre + " Tu #identificación es " + this.Id + " \n");
        } else if (this.Mensaje.equals("cual es mi ciudad") || this.Mensaje.equals("regalame mi ciudad") || this.Mensaje.equals("en que ciudad vivo")) {
            switch (num) {
                case 1:
                    setRbot(this.Bot + ">>  " + this.Nombre + " Tu ciudad es " + this.Ciudad + "\n");
                    break;
                case 2:
                    setRbot(this.Bot + ">> " + this.Nombre + " Usted reside en la ciudad de " + this.Ciudad + " \n");
                    break;
                case 3:
                    setRbot(this.Bot + ">>  " + this.Nombre + " Tu ciudad es " + this.Ciudad + "\n");
                    break;
                case 4:
                    setRbot(this.Bot + ">> " + this.Nombre + " Usted reside en la ciudad de " + this.Ciudad + " \n");
                    break;
            }

        } else if (this.Mensaje.equals("tienes novio") || this.Mensaje.equals("tienes novia") || this.Mensaje.equals("tienes pareja")) {
            setRbot(this.Bot + ">>  No, te estoy esperando a ti " + this.Nombre + " \n");
        } else if (this.Mensaje.equals("bien") || this.Mensaje.equals("muy bien") || this.Mensaje.equals("excelente")) {
            setRbot(this.Bot + ">> No sabes cuanto me alegra " + this.Nombre + "\n");
        } else if (this.Mensaje.equals("quien eres") || this.Mensaje.equals("dime quien eres")) {
            setRbot(this.Bot + ">>  Soy un bot diseñado por arin daniel para conversar con humanos ;)" + this.Nombre + " \n");
        } else if (this.Mensaje.equals("como te llamas") || this.Mensaje.equals("cual es tu nombre") || this.Mensaje.equals("dime tu nombre")) {
            setRbot(this.Bot + ">> " + this.Nombre + " mi nombre es " + this.Bot + "\n");
        } else if (this.Mensaje.equals("como me llamo") || this.Mensaje.equals("dime mi nombre")) {
            setRbot(this.Bot + ">>  Tu nombre es " + this.Nombre + " \n");
        } else if (this.Mensaje.equals("cual es tu funcionalidad") || this.Mensaje.equals("como funcionas") || this.Mensaje.equals("para que sirves")) {
            setRbot(this.Bot + ">>  Soy un bot creado para dar multiples respuestas dependiendo del dialogo y puedo recordarte datos personales " + this.Nombre + " \n");
        } else if (this.Mensaje.equals("dime un chiste") || this.Mensaje.equals("cuentame un chiste")) {
            switch (4) {
                case 1:
                    setRbot(this.Bot + ">> Por favor, ayudame, mi hija se ha perdido \n-¿Cómo se llama? \n"
                            + "-Esperanza \n-Imposible la esperanza es lo ultimo que se pierde JAJAJA" + " \n");
                    break;
                case 2:
                    setRbot(this.Bot + ">> Van dos ciegos y le dice el uno al otro: \n-Ojalá lloviera \n-Ojalá yo también" + " \n");
                    break;
                case 3:
                    setRbot(this.Bot + ">>  -¿QUÉ LE DICE UNA TAZA A OTRA TAZA? \n-¿QUÉ TAZA CIENDO?" + " \n");
                    break;
                case 4:
                    setRbot(this.Bot + ">>  -¡TOC, TOC! \n-¿QUIEN ES?\n-¡EL AMOR DE TU VIDA!\nNahh, mentiros@, la cerveza no habla" + " \n");
                    break;
            }

        } else if (this.Mensaje.equals("dime una frase motivacional") || this.Mensaje.equals("dime algo que me motive") || this.Mensaje.equals("estoy triste")) {
            switch (num) {
                case 1:
                    setRbot(this.Bot + ">>  La inteligencia consiste no sólo en el conocimiento, "
                            + "sino también en la destreza de aplicar los conocimientos en la práctica \n- Aristóteles" + "\n");
                    break;
                case 2:
                    setRbot(this.Bot + ">> El único modo de hacer un gran trabajo es amar lo que haces \n- Steve Jobs" + " \n");
                    break;
                case 3:
                    setRbot(this.Bot + ">> Un sueño no se hace realidad por arte de magia, necesita sudor, determinación y "
                            + "trabajo duro \n- Colin Powell" + "\n");
                    break;
                case 4:
                    setRbot(this.Bot + ">> Cuando algo es lo suficientemente importante, lo haces incluso si "
                            + "las probabilidades de que salga bien no te acompañan \n- Elon Musk" + " \n");
                    break;
            }

        } else if (this.Mensaje.equals("finalizar chat") || this.Mensaje.equals("adios") || this.Mensaje.equals("bye")) {
            int a = JOptionPane.showConfirmDialog(null, "SEGURO QUE DESEA SALIR?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (a == 0) {
                JOptionPane.showMessageDialog(null, "QUE TENGAS UN FELIZ DIA ;)", "Mensaje", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }
        } else {
            setRbot(this.Bot + ">> No comprendo lo que dices, articule mejor su escrito " + this.Nombre + " \n");
        }
    }

    public boolean DetNum(String dato) {
        try {
            Integer.parseInt(dato);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
