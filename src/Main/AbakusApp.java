package Main;

import javax.swing.UIManager;

/**
 * 
 * @author Tung
 */
public class AbakusApp {
    private final AppWindow window;
    
    public AbakusApp() {
        window = new AppWindow();
        window.setVisible(true);
    }
    
    public static void main(String[] args) {
        //set the system LookAndFeel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        
        new AbakusApp();
    }
}
