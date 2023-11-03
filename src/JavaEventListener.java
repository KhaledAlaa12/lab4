import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLEventListener;


public class JavaEventListener implements GLEventListener {

    @Override
    public void init(GLAutoDrawable glAutoDrawable) {
        GL gl = glAutoDrawable.getGL();
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glLineWidth(2.0f);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        gl.glOrtho(-500.0, 500.0, -300.0, 300.0, -1, 1);
    }

    @Override
    public void display(GLAutoDrawable glAutoDrawable) {
        drawGraph(glAutoDrawable.getGL());
        drawSky(glAutoDrawable.getGL());
        drawDesert(glAutoDrawable.getGL());
        drawSun(glAutoDrawable.getGL());
        drawCloud(glAutoDrawable.getGL());
        drawPyramids(glAutoDrawable.getGL());
        drawTree(glAutoDrawable.getGL());
    }

    @Override
    public void reshape(GLAutoDrawable glAutoDrawable, int i, int i1, int i2, int i3) {

    }

    @Override
    public void displayChanged(GLAutoDrawable glAutoDrawable, boolean b, boolean b1) {

    }

    private void drawSky(GL gl){
        float red;
        float green;
        float blue;
        red = 0.2f;
        green = 0.2f;
        blue = 0.2f;
        gl.glColor3f(0.0f, 0.64f, 0.91f);
        gl.glBegin(GL.GL_QUADS);
        gl.glVertex2d(-500,300);
        gl.glVertex2d(500,300);
        gl.glVertex2d(500,0);
        gl.glVertex2d(-500,0);
        gl.glEnd();
    }

    private void drawDesert(GL gl){
        gl.glColor3f(1f, 1f, 0f);
        gl.glBegin(GL.GL_QUADS);
        gl.glVertex2d(-500,0);
        gl.glVertex2d(500,0);
        gl.glVertex2d(500,-300);
        gl.glVertex2d(-500,-300);
        gl.glEnd();
    }

    private void drawSun(GL gl){
        double radius = 80;
        double x, y;
        gl.glColor3f(1f, 1f, 0f);
        gl.glBegin(GL.GL_POLYGON);
        for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
            x = radius * (Math.cos(a)) + 250;
            y = radius * (Math.sin(a)) + 200;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();
    }

    private void drawCloud(GL gl){
        float red;
        float green;
        float blue;
        red = 0.2f;
        green = 0.2f;
        blue = 0.2f;
        gl.glColor3f(0.9f, 0.9f, 0.9f);
        gl.glBegin(GL.GL_POLYGON);
        // angle is
        // x = radius * (cosine of angle)
        // y = radius * (sine of angle)
        double radius = 80;
        double x, y;
        for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
            x = radius * (Math.cos(a)) - 200;
            y = radius * (Math.sin(a)) + 215;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();


        gl.glBegin(GL.GL_POLYGON);
        radius = 60;
        for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
            x = radius * (Math.cos(a)) - 100;
            y = radius * (Math.sin(a)) + 215;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
        for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
            x = radius * (Math.cos(a)) - 300;
            y = radius * (Math.sin(a)) + 215;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
        for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
            x = radius * (Math.cos(a)) - 160;
            y = radius * (Math.sin(a)) + 175;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
        for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
            x = radius * (Math.cos(a)) - 240;
            y = radius * (Math.sin(a)) + 175;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
        for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
            x = radius * (Math.cos(a)) - 110;
            y = radius * (Math.sin(a)) + 175;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
        for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
            x = radius * (Math.cos(a)) - 290;
            y = radius * (Math.sin(a)) + 175;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
        radius = 50;
        for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
            x = radius * (Math.cos(a)) - 60;
            y = radius * (Math.sin(a)) + 175;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
        for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
            x = radius * (Math.cos(a)) - 340;
            y = radius * (Math.sin(a)) + 175;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();
    }

    private void drawPyramids(GL gl){
            gl.glBegin(GL.GL_TRIANGLES);
            gl.glColor3f(1, 0.8f, 0);
            gl.glVertex2d(290, 0);
            gl.glVertex2d(240, -100);
            gl.glColor3f(1, 0.9f, 0);
            gl.glVertex2d(340, -100);
            gl.glEnd();

            gl.glBegin(GL.GL_TRIANGLES);
            gl.glColor3f(1, 0.8f, 0);
            gl.glVertex2d(200, 10);
            gl.glVertex2d(140, -110);
            gl.glColor3f(1, 0.9f, 0);
            gl.glVertex2d(260, -110);
            gl.glEnd();

            gl.glBegin(GL.GL_TRIANGLES);
            gl.glColor3f(1, 0.8f, 0);
            gl.glVertex2d(100, 20);
            gl.glVertex2d(30, -120);
            gl.glColor3f(1, 0.9f, 0);
            gl.glVertex2d(170, -120);
            gl.glEnd();
    }

    private void drawTree(GL gl){
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
            x = radius * (Math.cos(a)) - 200;
            y = radius * (Math.sin(a));
            gl.glVertex2d(x, y);
        }
        for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
            x = radius * (Math.cos(a)) - 250;
            y = radius * (Math.sin(a)) - 50;
            gl.glVertex2d(x, y);
        }
        for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
            x = radius * (Math.cos(a)) - 150;
            y = radius * (Math.sin(a)) - 50;
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
            x = radius * (Math.cos(a)) - 200;
            y = radius * (Math.sin(a)) - 30;
            gl.glVertex2d(x, y);
        }
        for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
            x = radius * (Math.cos(a)) - 235;
            y = radius * (Math.sin(a)) - 74.5;
            gl.glVertex2d(x, y);
        }
        for (double a = 0; a < Math.toRadians(360); a += Math.toRadians(1)) {
            x = radius * (Math.cos(a)) - 165;
            y = radius * (Math.sin(a)) - 74.5;
            gl.glVertex2d(x, y);
        }
        gl.glEnd();

        //tree part 3
        gl.glBegin(GL.GL_TRIANGLES);
        gl.glColor3f(0.47f, 0.31f, 0.07f);
        gl.glVertex2d(-210, -175);
        gl.glVertex2d(-190, -175);
        gl.glVertex2d(-200, -30);

        gl.glVertex2d(-202.5, -90);
        gl.glVertex2d(-202.5, -80);
        gl.glVertex2d(-230, -60);

        gl.glVertex2d(-197.5, -90);
        gl.glVertex2d(-197.5, -80);
        gl.glVertex2d(-170, -60);
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
