import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameWindow extends JFrame {

    GameCanvas gameCanvas;
    long lastTime = 0;

    public GameWindow() {
        this.setSize(1024, 600); // set size window


        this.gameCanvas = new GameCanvas();
        this.add(this.gameCanvas);

        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
 //              Xử lý đối tượng khi bấm mũi tên sang trái;
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
 //              Xử lý đối tượng khi bấm mũi tên sang phải
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });


        this.setVisible(true);
    }

    public void gameLoop() {
//        Vẽ đi vẽ lại Canvas

    }

}
