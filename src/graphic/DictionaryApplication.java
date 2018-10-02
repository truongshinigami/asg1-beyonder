package graphic;

import javax.swing.*;
import java.awt.*;

    class runApplication extends JFrame {
        private static int default_width = 500;
        private static int default_height = 500;

        public runApplication() {
            setSize(default_width, default_height);
        }

    }


public class DictionaryApplication {
    public static void main(String[] abc){
        EventQueue.invokeLater(() ->{
            runApplication run = new runApplication();
            run.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            run.setVisible(true);
        });
    }
}

