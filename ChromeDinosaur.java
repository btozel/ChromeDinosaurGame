import javax.swing.*;
import java.awt.*;

public class ChromeDinosaur extends JPanel {
    int boardWidth, boardHeight;

    // Images for the game
    Image dinosaurImg;
    Image disosaurDeadImg;
    Image dinosaurJumpImg;
    Image cactus1Img;
    Image cactus2Img;
    Image cactus3Img;


    public ChromeDinosaur(int width, int height){
        this.boardWidth = width;
        this.boardHeight = height;

        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.BLUE);

    }


}
