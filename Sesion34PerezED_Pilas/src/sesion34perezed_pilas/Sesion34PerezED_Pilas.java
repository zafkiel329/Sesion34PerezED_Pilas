
package sesion34perezed_pilas;

import java.util.Stack;
import javax.swing.JOptionPane;

public class Sesion34PerezED_Pilas {

    public static void main(String[] args) {
        // Declaracion de pila
        Stack<Integer> pilaPerez = new Stack<>();
        
        pilaPerez.push(100);
        pilaPerez.push(150);
        pilaPerez.push(230);
        pilaPerez.push(140);
        pilaPerez.push(160);
        
        JOptionPane.showMessageDialog(null, "Datos en pila ordenada es: \n"+pilaPerez);
        
        JOptionPane.showMessageDialog(null, "Autor: Brayan Perez Nava");
    }
    
}
