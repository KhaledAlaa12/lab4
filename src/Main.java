
import java.awt.BorderLayout;
import javax.media.opengl.GLCanvas;
import javax.swing.JFrame;

public class Main extends JFrame {

    private GLCanvas glcanvas;
    private JavaEventListener listener = new JavaEventListener();

    public static void main(String[] args) {
        new Main();
    }

    public Main() {

        super("Main");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        glcanvas = new GLCanvas();
        glcanvas.addGLEventListener(listener);

        getContentPane().add(glcanvas, BorderLayout.CENTER);
        setSize(1000, 600);
        setLocationRelativeTo(this);
        setVisible(true);
    }
}
