
import java.awt.BorderLayout;
import javax.media.opengl.GLCanvas;
import javax.swing.JFrame;

public class Pyramids extends JFrame {

    private GLCanvas glcanvas;
    private PyramidsEventListner listener = new PyramidsEventListner();

    public static void main(String[] args) {
        new Pyramids();
    }

    public Pyramids() {

        super("Pyramids");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        glcanvas = new GLCanvas();
        glcanvas.addGLEventListener(listener);

        getContentPane().add(glcanvas, BorderLayout.CENTER);
        setSize(500, 300);
        setLocationRelativeTo(this);
        setVisible(true);
    }
}
