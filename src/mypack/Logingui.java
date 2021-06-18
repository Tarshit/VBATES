package mypack;

import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import marytts.modules.synthesis.Voice;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;

public class Logingui {
	

	JFrame frame;
	private JTextField username;
	private JPasswordField password;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logingui window = new Logingui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Logingui() {
		initialize();
	}

	
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.getContentPane().setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		frame.setBounds(0, 0, 1800, 1200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		username = new JTextField();
		username.setBounds(738, 176, 277, 57);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Username");
		lblNewJgoodiesLabel.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		lblNewJgoodiesLabel.setBounds(352, 160, 242, 60);
		frame.getContentPane().add(lblNewJgoodiesLabel);
		
		JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance().createLabel("Password");
		lblNewJgoodiesLabel_1.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		lblNewJgoodiesLabel_1.setBounds(358, 283, 269, 60);
		frame.getContentPane().add(lblNewJgoodiesLabel_1);
		
		TextToSpeech tts = new TextToSpeech();
		tts.setVoice("cmu-rms-hsmm");
		tts.speak("Enter your credentials", 2f, false, true);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setOpaque(true);
		btnNewButton.setBackground(new Color(255, 69, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		btnNewButton.setBounds(683, 499, 233, 65);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Verifypassword v1 = new Verifypassword();
					ResultSet myRs=v1.verify(username.getText());
					if(password.getText().equals(myRs.getString("password"))) {
						System.out.println("success");
						//JOptionPane.showMessageDialog(null, "successful");
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									Profile window = new Profile(username.getText());
									window.frame.setVisible(true);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});
					}
					else {
						JOptionPane.showMessageDialog(null, "Wrong password");
					}
					
		         
				}
				catch(Exception exc){
					System.out.println(exc);
					JOptionPane.showMessageDialog(null, "invalid user name");
					
					
				}
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		password = new JPasswordField();
		password.setBounds(738, 286, 277, 57);
		frame.getContentPane().add(password);
	}
	
	String username() {
		String usr=username.getText();
		return usr;
	}
}
