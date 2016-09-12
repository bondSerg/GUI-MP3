package listeners;

import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class ChangeLAFListener {
    private LookAndFeel laf;
    private JFrame frame;
    
    public ChangeLAFListener(JFrame frame, LookAndFeel laf){
        this.frame = frame;
        this.laf = laf;
    }
    
      public void handler(){
        try {
            UIManager.setLookAndFeel(laf); 
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ChangeLAFListener.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        SwingUtilities.updateComponentTreeUI(frame);
        frame.pack();
    }
}
