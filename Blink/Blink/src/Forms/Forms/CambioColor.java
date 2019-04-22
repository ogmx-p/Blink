
package Forms.Forms;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.text.JTextComponent;

/**
 *
 * @Pipo
 */
public class CambioColor {
    
    int r,g,b,color;
    JComponent Componente;
    JTextComponent ComponenteTXT;
    
    /**
     * Este cambia el color de un componente
     * @param Componente componente
     * @param r cantidad de rojo
     * @param g cantidad de verde
     * @param b cantidad de azul 
     */    
    
        public CambioColor(JComponent Componente,int r,int g,int b)
        {
            this.Componente = Componente;
            this.r=r;
            this.g=g;
            this.b=b;
            
            Componente.setBackground(new java.awt.Color(r,g,b));
        }
    /**
     * Este cambia el color de un componente de texto
     * @param ComponenteTXT componente de texto
     * @param r cantidad de rojo
     * @param g cantidad de verde
     * @param b cantidad de azul
     */
        public CambioColor(JTextComponent ComponenteTXT,int r,int g,int b)
        {
            this.ComponenteTXT=ComponenteTXT;
            this.r=r;
            this.g=g;
            this.b=b;
            
            ComponenteTXT.setBackground(new java.awt.Color(r, g, b));

        }
    /**
     * Este cambia el color del texto de un componente de texto
     * @param ComponenteTXT componente de texto
     * @param color si es 1 se cambiara al color blanco 2 es negro 3 es rojo 4 es azul 5 es verde
     */
        public CambioColor(JTextComponent ComponenteTXT,int color)
        {
            this.ComponenteTXT=ComponenteTXT;
            this.color=color;
            
            switch(color){
                case 1:
                ComponenteTXT.setForeground(Color.BLACK);
                break;
                case 2:
                ComponenteTXT.setForeground(Color.WHITE);
                break;
                case 3:
                ComponenteTXT.setForeground(Color.RED);
                break;
                case 4:
                ComponenteTXT.setForeground(Color.BLUE);
                break;                
            }
        }

    CambioColor(JLabel Registro_Tag, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
}
