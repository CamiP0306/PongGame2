package posta;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		JPanel contentPane = new JPanel() {
			@Override
			           protected void paintComponent(Graphics g) { // Funcion para establecer imagen de fondo de la ventana
			           ImageIcon imgfondo = new ImageIcon(Pong.class.getResource("/img/fondomenu.png"));
			               g.drawImage(imgfondo.getImage(), 0, 0, getWidth(), getHeight(), this);
			               g.setColor(new Color(255, 255, 255, 0));
			               g.fillRect(0, 0, getWidth(), getHeight());
			           }
			       };
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("");
		btn1.setIcon(new ImageIcon(Menu.class.getResource("/img/nivel1.PNG")));
		btn1.setBounds(55, 128, 156, 67);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.setIcon(new ImageIcon(Menu.class.getResource("/img/nivel2.PNG")));
		btn2.setBounds(221, 128, 156, 67);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.setIcon(new ImageIcon(Menu.class.getResource("/img/nivel3.PNG")));
		btn3.setBounds(387, 128, 165, 67);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("");
		btn4.setIcon(new ImageIcon(Menu.class.getResource("/img/nivel4.PNG")));
		btn4.setBounds(562, 128, 156, 67);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("");
		btn5.setIcon(new ImageIcon(Menu.class.getResource("/img/nivel5.PNG")));
		btn5.setBounds(55, 226, 156, 69);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("");
		btn6.setIcon(new ImageIcon(Menu.class.getResource("/img/nivel6.PNG")));
		btn6.setBounds(221, 226, 156, 69);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("");
		btn7.setIcon(new ImageIcon(Menu.class.getResource("/img/nivel7.PNG")));
		btn7.setBounds(387, 226, 165, 69);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("");
		btn8.setIcon(new ImageIcon(Menu.class.getResource("/img/nivel8.PNG")));
		btn8.setBounds(562, 226, 156, 69);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("");
		btn9.setIcon(new ImageIcon(Menu.class.getResource("/img/nivel9.PNG")));
		btn9.setBounds(55, 323, 156, 67);
		contentPane.add(btn9);
		
		JButton btn10 = new JButton("");
		btn10.setIcon(new ImageIcon(Menu.class.getResource("/img/nivel10.PNG")));
		btn10.setBounds(221, 330, 156, 60);
		contentPane.add(btn10);
		
		JButton btn11 = new JButton("");
		btn11.setIcon(new ImageIcon(Menu.class.getResource("/img/nivel11.PNG")));
		btn11.setBounds(387, 323, 156, 67);
		contentPane.add(btn11);
		
		JButton btn12 = new JButton("");
		btn12.setIcon(new ImageIcon(Menu.class.getResource("/img/nivel12.PNG")));
		btn12.setBounds(562, 330, 156, 60);
		contentPane.add(btn12);
		
		JButton btn13 = new JButton("");
		btn13.setIcon(new ImageIcon(Menu.class.getResource("/img/nivel13.PNG")));
		btn13.setBounds(55, 418, 156, 67);
		contentPane.add(btn13);
		
		JButton btn14 = new JButton("");
		btn14.setIcon(new ImageIcon(Menu.class.getResource("/img/nivel14.PNG")));
		btn14.setBounds(221, 425, 156, 60);
		contentPane.add(btn14);
		
		JButton btn15 = new JButton("");
		btn15.setIcon(new ImageIcon(Menu.class.getResource("/img/nivel15.PNG")));
		btn15.setBounds(387, 418, 165, 67);
		contentPane.add(btn15);
		
		JButton btn16 = new JButton("");
		btn16.setIcon(new ImageIcon(Menu.class.getResource("/img/nivel16.PNG")));
		btn16.setBounds(562, 418, 156, 67);
		contentPane.add(btn16);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pong.main( new String[]{});
				Menu.this.setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon(Menu.class.getResource("/img/volver.PNG")));
		btnNewButton.setBounds(10, 11, 85, 36);
		contentPane.add(btnNewButton);
	}
}
