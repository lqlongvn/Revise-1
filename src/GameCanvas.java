import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;

public class GameCanvas extends JPanel {
    private Clip clip;
//    Mô tả đối tượng được vẽ lên Canvas

    public GameCanvas() {
        this.setSize(1024, 600);

//        load và play audio
        this.clip = Utils.loadAudio("resources/audio/shot.wav");
        this.clip.loop(1);
        this.clip.start();

//        load image của các đối tượng được vẽ

        this.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {

        ImageIcon icon = new ImageIcon("resources/images/nose.png");
//        public void paintComponent(Graphics g){
            Dimension d = getSize();
            g.drawImage(icon.getImage(), 0, 0, d.width, d.height/2, null);
            setOpaque(false);
            super.paintComponent(g);

//        g.setColor(Color.BLACK);
//        g.fillRect(0, 0, 1024, 600);
//  Vẽ các đối tượng
    }
}
