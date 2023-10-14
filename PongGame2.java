package prototipo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class PongGame2 extends JPanel implements ActionListener, KeyListener {
    private int ballX, ballY, ballVelX, ballVelY;
    private int paddleX, paddleVel; 
    private int score;
    private Timer timer;
    private int vida = 3;
    
    private Random random = new Random();
    
    private ImageIcon backgroundImage;
    
    private void resetGame() {
    	ballX = 400;
        ballY = 300;
        ballVelX = 5;
        ballVelY = 5;

        paddleX = 250;
        paddleVel = 0;
        
        score = score-20;
        
        backgroundImage = new ImageIcon(getClass().getResource("/img/fondoniveles.png"));

        // Reiniciar el temporizador
        timer.start();
    }


    public PongGame2() {
    	// Configuración del panel
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);
        
        backgroundImage = new ImageIcon(getClass().getResource("/img/fondoniveles.png"));

     // Inicialización de variables
        ballX = 400;
        ballY = 300;
        ballVelX = 5;
        ballVelY = 5;
        paddleVel = 0;
        score = 0;

     // Configuración del temporizador
        timer = new Timer(10, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
     // Dibujar la imagen de fondo que abarca todo el panel
        g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);

     // Dibujamos la pelota y las paletas
        g.setColor(Color.WHITE);
        g.fillRect(ballX - 10, ballY - 10, 20, 20);
        g.fillRect(50, paddleX - 40, 20, 80);
        
        g.setFont(new Font("Arial", Font.PLAIN, 30));
        g.drawString("Score: " + score, 50, 50);
    }

    ///COLISION Y POSICION DE LA BOLA  --REVISARRRRRRRR
    
    public void actionPerformed(ActionEvent e) {
    	 // Actualizamos la posición de la pelota
        ballX += ballVelX;
        ballY += ballVelY;

        if (ballX <= 60 && ballY >= paddleX - 40 && ballY <= paddleX + 40) {
            ballVelX = -ballVelX;
            
            score += 10;
        }
        
        // Verificar colisión con los bordes izquierdo y derecho
        if (ballX <= 0 || ballX >= getWidth()) {
            ballVelX = -ballVelX;
        }

        // Asegurar que la pelota no salga por arriba o abajo
        if (ballY <= 10) {
            ballY = 10;
            ballVelY = -ballVelY;
        }
        if (ballY >= getHeight() - 10) {
            ballY = getHeight() - 10;
            ballVelY = -ballVelY;
        }

        paddleX += paddleVel;
        if (paddleX < 40) {
            paddleX = 40;
        }
        if (paddleX > 560) {
            paddleX = 560;
        }


        // Verificar si el juego ha terminado
        if (ballX <= 0) {
        	
        	vida--;
            // La pelota ha salido del panel, terminar el juego
            timer.stop();
            if(vida == 0)
            {
            	score = score + (vida*20);
            	JOptionPane.showMessageDialog(this, "PERDISTE. Tenes "+score+"puntos");
            	System.exit(0);
            }
            JOptionPane.showMessageDialog(this, "Perdiste una vida. Te quedan "+vida);
            resetGame();
        }
        
        if(score==50) {
        	JOptionPane.showMessageDialog(this, "GANASTE");
        	System.exit(0);
        }
        
        repaint();
    }

  //poder presionar las teclas 
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_W) {
            paddleVel = -5;
        }
        if (key == KeyEvent.VK_S) {
            paddleVel = 5;
        }
    }

    //teclas a presionar para que se mueva
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_W || key == KeyEvent.VK_S) {
            paddleVel = 0;
        }
    }

    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pong Game");
        PongGame2 game = new PongGame2();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}