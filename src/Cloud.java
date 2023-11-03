import javax.media.opengl.GLCanvas;
import javax.swing.*;
import java.awt.*;

public class Cloud extends JFrame {

    private GLCanvas glcanvas;
    private CloudEventListener listener = new CloudEventListener();

    public static void main(String[] args) {
        new Cloud();
    }

    public Cloud() {

        super("Cloud");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        glcanvas = new GLCanvas();
        glcanvas.addGLEventListener(listener);

        getContentPane().add(glcanvas, BorderLayout.CENTER);
        setSize(500, 300);
        setLocationRelativeTo(this);
        setVisible(true);
    }
}
