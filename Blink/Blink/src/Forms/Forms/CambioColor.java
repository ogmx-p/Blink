
package Forms.Forms;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.text.JTextComponent;

/**
 *
 * @Pipo
 */
public class CambioColor {
    
    int r,g,b;
    String ColorTxt;
    JComponent Componente;
    JTextComponent ComponenteTXT;
    
        
    
        public CambioColor(JComponent Componente,int r,int g,int b)
        {
            this.Componente = Componente;
            this.r=r;
            this.g=g;
            this.b=b;
            
            Componente.setBackground(new java.awt.Color(r,g,b));
        }
        
        public CambioColor(JTextComponent ComponenteTXT,int r,int g,int b)
        {
            this.ComponenteTXT=ComponenteTXT;
            this.r=r;
            this.g=g;
            this.b=b;
            
            ComponenteTXT.setBackground(new java.awt.Color(r, g, b));

        }
        
        public CambioColor(JTextComponent ComponenteTXT,String ColorTxt)
        {
            this.ColorTxt=ColorTxt;
            this.ComponenteTXT=ComponenteTXT;
            
            ComponenteTXT.setForeground(Color.getColor(ColorTxt));
        }
    
}
