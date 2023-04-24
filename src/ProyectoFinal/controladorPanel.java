/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal;

import javax.swing.JPanel;

/**
 *
 * @author jesusgabriel
 */

    public abstract class controladorPanel extends JPanel {
        
        
            private boolean x=true;
            public void mostrar(){
            this.setVisible(x);
            this.setEnabled(x);
            }
            
            public void ocultar(){
            this.setVisible(!x);
            this.setEnabled(!x);
            }
        
        }

