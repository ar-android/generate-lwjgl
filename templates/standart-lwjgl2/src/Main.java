
import org.lwjgl.opengl.Display;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Window window= new Window(600, 480, "Game");
        window.init();

        while (!window.isShoudClose()){
            Display.update();
            Display.sync(60);
        }
        Display.destroy();
    }
}
