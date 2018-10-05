/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgagestaopublica;

import java.awt.Component;
import javax.swing.JOptionPane;


public class MGAGestaoPublica {

  
    public static void animais(){
   
        
        String animal;

        JOptionPane.showMessageDialog(null,"Bem vindo ao jogo dos animais, "
                + "esse aplicativo faz parte do nosso processo seletivo"
                + "da MGA Gestão Publica. Vamos começar? " ,
                " Jogo dos Animais ", JOptionPane.INFORMATION_MESSAGE ); 
        
          JOptionPane.showMessageDialog(null," Pense em um animal! " , 
                  " Jogo dos Animais ", JOptionPane.INFORMATION_MESSAGE ); 
       
          
          int confirme = JOptionPane.showConfirmDialog(null, "O animal que você pensou vive na água? ",
                  "Jogo dos Animais ",JOptionPane.YES_NO_OPTION);
        
       if(confirme == JOptionPane.YES_OPTION){
          int tubarao = JOptionPane.showConfirmDialog(null, "O animal é um tubarão? ",
                  "Jogo dos Animais ",JOptionPane.YES_NO_OPTION);
                  if(tubarao == JOptionPane.YES_OPTION){
                      JOptionPane.showMessageDialog(null, "Acertei! ");
                
                  }else{
                 animal = JOptionPane.showInputDialog("Qual animal você pensou?");
                 JOptionPane.showInputDialog("Um(a)" + animal + "_____ mas um(a) Tubarão não");
                
                 
               }
                  
       }else{animal = JOptionPane.showInputDialog("Qual animal você pensou?");
           JOptionPane.showInputDialog("Um(a)" + animal + "_____ mas um(a) Tubarão não");
    
       }



    }
    
}
 
