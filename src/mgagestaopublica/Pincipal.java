/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgagestaopublica;

import javax.swing.JOptionPane;
import static mgagestaopublica.MGAGestaoPublica.animais;

/**
 *
 * @author helto
 */
public class Pincipal {
    
        public static void main(String[] args) {
             int op = JOptionPane.YES_OPTION;
        while(op == JOptionPane.YES_OPTION) {

           animais();

           op = JOptionPane.showConfirmDialog(null, "Deseja continuar ?", "Jogo dos Animais", JOptionPane.YES_NO_OPTION);

        }
        }
    
}
