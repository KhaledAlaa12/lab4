import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;


public class TreeEventListener implements GLEventListener {

    @Override
    public void init(GLAutoDrawable glAutoDrawable) {
        GL gl = glAutoDrawable.getGL();
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glLineWidth(2.0f);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        gl.glOrtho(-250.0, 250.0, -150.0, 150.0, -1, 1);
    }

    @Override
    public void display(GLAutoDrawable glAutoDrawable) {
        drawGraph(glAutoDrawable.getGL());
        task1(glAutoDrawable.getGL());
    }

    @Override
    public void reshape(GLAutoDrawable glAutoDrawable, int i, int i1, int i2, int i3) {

    }

    @Override
    public void displayChanged(GLAutoDrawable glAutoDrawable, boolean b, boolean b1) {

    }

    private void task1(GL gl){
        float red;
        float green;
        float blue;
        red = 0.2f;
        green = 0.2f;
        blue = 0.2f;
        //draw tree part 1
        gl.glColor3f(0.81f, 0.78f, 0.07f);
        gl.glBegin(GL.GL_POLYGON);
        // angle is
        // x = radius * (cosine of angle)
        // y = radius * (sine of angle)
        double radius = 80;
        double x, y;
        for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
          x = radius * (Math.cos(a));
          y = radius * (Math.sin(a)) + 50;
          gl.glVertex2d(x, y);
        }
        for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
          x = radius * (Math.cos(a)) - 50;
          y = radius * (Math.sin(a));
          gl.glVertex2d(x, y);
        }
        for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
          x = radius * (Math.cos(a)) + 50;
          y = radius * (Math.sin(a));
          gl.glVertex2d(x, y);
        }
        gl.glEnd();

        //draw tree part 2
        gl.glColor3f(0.66f, 0.69f, 0.25f);
        gl.glBegin(GL.GL_POLYGON);
        // angle is
        // x = radius * (cosine of angle)
        // y = radius * (sine of angle)
         radius = 50;
        for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
          x = radius * (Math.cos(a));
          y = radius * (Math.sin(a)) + 20;
          gl.glVertex2d(x, y);
        }
        for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
          x = radius * (Math.cos(a)) - 35;
          y = radius * (Math.sin(a)) - 24.5;
          gl.glVertex2d(x, y);
        }
        for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
          x = radius * (Math.cos(a)) + 35;
          y = radius * (Math.sin(a)) - 24.5;
          gl.glVertex2d(x, y);
        }
        gl.glEnd();

        //tree part 3
        gl.glBegin(GL.GL_TRIANGLES);
        gl.glColor3f(0.47f, 0.31f, 0.07f);
        gl.glVertex2d(-10, -125);
        gl.glVertex2d(10, -125);
        gl.glVertex2d(0, 20);

        gl.glVertex2d(-2.5, -40);
        gl.glVertex2d(-2.5, -30);
        gl.glVertex2d(-30, -10);

        gl.glVertex2d(2.5, -40);
        gl.glVertex2d(2.5, -30);
        gl.glVertex2d(30, -10);
        gl.glEnd();


    }
    private void drawGraph(GL gl) {
        float red;
        float green;
        float blue;
        gl.glClear(GL.GL_COLOR_BUFFER_BIT);
////////////////////
//drawing the grid
        red = 0.2f;
        green = 0.2f;
        blue = 0.2f;
        gl.glColor3f(red, green, blue);
//You may notice I'm using GL_LINES here.
//Details of glBegin() will be discussed latter.
        gl.glBegin(GL.GL_LINES);
//draw the vertical lines
        for (int x = -250; x <= 250; x += 10) {
            gl.glVertex2d(x, -150);
            gl.glVertex2d(x, 150);
        }
//draw the horizontal lines
        for (int y = -150; y <= 150; y += 10) {
            gl.glVertex2d(-250, y);
            gl.glVertex2d(250, y);
        }
        gl.glEnd();
//////////////////////////////
// draw the x-axis and y-axis
        red = 0.0f;
        green = 0.2f;
        blue = 0.4f;
        gl.glColor3f(red, green, blue);
        gl.glBegin(GL.GL_LINES);
//line for y-axis
        gl.glVertex2d(0, 140);
        gl.glVertex2d(0, -140);
//line for x-axis
        gl.glVertex2d(240, 0);
        gl.glVertex2d(-240, 0);
        gl.glEnd();
/////////////////////
// draw arrow heads
        gl.glBegin(GL.GL_TRIANGLES);
        gl.glVertex2d(0, 150);
        gl.glVertex2d(-5, 140);
        gl.glVertex2d(5, 140);
        gl.glVertex2d(0, -150);
        gl.glVertex2d(-5, -140);
        gl.glVertex2d(5, -140);
        gl.glVertex2d(250, 0);
        gl.glVertex2d(240, -5);
        gl.glVertex2d(240, 5);
        gl.glVertex2d(-250, 0);
        gl.glVertex2d(-240, -5);
        gl.glVertex2d(-240, 5);
        gl.glEnd();


//    //draw tree part 1
//    gl.glColor3f(1, 1, 0);
//    gl.glBegin(GL.GL_POLYGON);
//    // angle is
//    // x = radius * (cosine of angle)
//    // y = radius * (sine of angle)
//    double radius = 80;
//    double x, y;
//    for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
//      x = radius * (Math.cos(a));
//      y = radius * (Math.sin(a)) + 50;
//      gl.glVertex2d(x, y);
//    }
//    for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
//      x = radius * (Math.cos(a)) - 60;
//      y = radius * (Math.sin(a));
//      gl.glVertex2d(x, y);
//    }
//    for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
//      x = radius * (Math.cos(a)) + 60;
//      y = radius * (Math.sin(a));
//      gl.glVertex2d(x, y);
//    }
//    gl.glEnd();
//
//    //draw tree part 2
//    gl.glColor3f(0, 1, 0);
//    gl.glBegin(GL.GL_POLYGON);
//    // angle is
//    // x = radius * (cosine of angle)
//    // y = radius * (sine of angle)
//     radius = 50;
//    for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
//      x = radius * (Math.cos(a));
//      y = radius * (Math.sin(a)) + 25;
//      gl.glVertex2d(x, y);
//    }
//    for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
//      x = radius * (Math.cos(a)) - 40;
//      y = radius * (Math.sin(a)) - 20;
//      gl.glVertex2d(x, y);
//    }
//    for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
//      x = radius * (Math.cos(a)) + 40;
//      y = radius * (Math.sin(a)) - 20;
//      gl.glVertex2d(x, y);
//    }
//    gl.glEnd();
//
//    //tree part 3
//    gl.glBegin(GL.GL_TRIANGLES);
//    gl.glColor3f(green, green, 0);
//    gl.glVertex2d(-10, -125);
//    gl.glVertex2d(10, -125);
//    gl.glVertex2d(0, 25);
//
//    gl.glVertex2d(0, -40);
//    gl.glVertex2d(0, -30);
//    gl.glVertex2d(-30, -10);
//
//    gl.glVertex2d(0, -40);
//    gl.glVertex2d(0, -30);
//    gl.glVertex2d(30, -10);
//    gl.glEnd();

        //task 3
    }
}
