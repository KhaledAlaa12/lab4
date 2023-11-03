
import java.awt.BorderLayout;
import javax.media.opengl.GLCanvas;
import javax.swing.JFrame;

public class Tree extends JFrame {

    private GLCanvas glcanvas;
    private TreeEventListener listener = new TreeEventListener();

    public static void main(String[] args) {
        new Tree();
    }

    public Tree() {

        super("Tree");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        glcanvas = new GLCanvas();
        glcanvas.addGLEventListener(listener);

        getContentPane().add(glcanvas, BorderLayout.CENTER);
        setSize(500, 300);
        setLocationRelativeTo(this);
        setVisible(true);
    }
}
