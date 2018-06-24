//import scene.GameOverScene;
import scene.GamePlayScene;
import scene.SceneManager;

import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;

public class GameCanvas extends JPanel {
    private Clip clip;
//    Mô tả đối tượng được vẽ lên Canvas

    public GameCanvas() {
//        this.setSize(1024, 600);
        SceneManager.instance.changeScene(new GamePlayScene());
//        SceneManager.instance.changeScene(new GameOverScene());


//        load và play audio
        this.clip = Utils.loadAudio("resources/audio/shot.wav");
        this.clip.loop(1);
        this.clip.start();

//        load image của các đối tượng được vẽ

        this.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
//  Vẽ các đối tượng
    }
}
