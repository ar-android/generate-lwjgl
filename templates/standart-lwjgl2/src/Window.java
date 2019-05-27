
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11.GL_MODELVIEW;

public class Window {
    private int width;
    private int height;
    private String title;

    public Window(int width, int height, String title) {
        this.width = width;
        this.height = height;
        this.title = title;
    }

    public void create() {
        try{
            Display.setDisplayMode(new DisplayMode(width, height));
            Display.setTitle(title);
            Display.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
        }
    }

    public void init() {
        create();
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0, getWidth(), getHeight(), 0, 1, -1);
        glMatrixMode(GL_MODELVIEW);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void clearBufferBit() {
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
    }

    public boolean isShoudClose() {
        return Display.isCloseRequested();
    }
}
