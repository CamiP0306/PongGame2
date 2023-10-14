package posta;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import prototipo.PongGame2;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pong extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pong frame = new Pong();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public Pong() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		JPanel contentPane = new JPanel() {
			@Override
			           protected void paintComponent(Graphics g) { // Funcion para establecer imagen de fondo de la ventana
			           ImageIcon imgfondo = new ImageIcon(Pong.class.getResource("/img/inicio.png"));
			               g.drawImage(imgfondo.getImage(), 0, 0, getWidth(), getHeight(), this);
			               g.setColor(new Color(255, 255, 255, 0));
			               g.fillRect(0, 0, getWidth(), getHeight());
			           }
			       };
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.main(new String[]{});
		        Pong.this.setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon(Pong.class.getResource("/img/menu.PNG")));
		btnNewButton.setBounds(208, 352, 89, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PongGame2.main(new String[]{});
				Pong.this.setVisible(false);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Pong.class.getResource("/img/start.PNG")));
		btnNewButton_1.setBounds(457, 352, 89, 40);
		contentPane.add(btnNewButton_1);
		
		
	}
}