package libreria;

import javax.swing.*;

public class Metodos {

    public static void mostrarPorConsola(String mensaxe) {
        System.out.println(mensaxe);
    }

    public static String pedirString(String mensaxe) {
        return JOptionPane.showInputDialog(mensaxe);
    }
    public static int pedirInt(String mensaxe) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }

    public static String lerString(String mensaxe) {
        return JOptionPane.showInputDialog(mensaxe);
    }
    public static  int lerInt(String mensaxe){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }
    public static int validacionInt(String menxase) {
        int dato;
        do {
            dato = Integer.parseInt(JOptionPane.showInputDialog(menxase));
        } while (dato <= 0);
        return dato;
    }
}
