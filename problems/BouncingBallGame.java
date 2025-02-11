package februalry2025;

import javax.swing.*;
import java.awt.*;

public class BouncingBallGame extends JPanel {
    private int ballX = 50, ballY = 50; // Начални координати на топката
    private int ballDiameter = 30;
    private int ballSpeedX = 3, ballSpeedY = 3;

    public BouncingBallGame() {
        Timer timer = new Timer(10, e -> moveBall()); // Анимация с 10ms обновяване
        timer.start();
    }

    private void moveBall() {
        ballX += ballSpeedX;
        ballY += ballSpeedY;

        // Отскачане от ръбовете
        if (ballX <= 0 || ballX + ballDiameter >= getWidth()) {
            ballSpeedX = -ballSpeedX;
        }
        if (ballY <= 0 || ballY + ballDiameter >= getHeight()) {
            ballSpeedY = -ballSpeedY;
        }

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(ballX, ballY, ballDiameter, ballDiameter);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Ball");
        BouncingBallGame game = new BouncingBallGame();
        frame.add(game);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
