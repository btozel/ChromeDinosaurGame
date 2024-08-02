import javax.swing.*;

public class DinoApp {
    public static void main(String[] args) {
        int boardWidth = 750;
        int boardHeight = 250;

        JFrame frame = new JFrame("Chrome Dinosaur Game");

        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        ChromeDinosaur chromeDinosaur = new ChromeDinosaur(boardWidth, boardHeight);
        frame.add(chromeDinosaur);
        frame.pack();

        frame.setVisible(true);

    }
}
