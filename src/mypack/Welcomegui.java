package mypack;

import java.awt.EventQueue;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import marytts.modules.synthesis.Voice;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Cursor;


public class Welcomegui {

	JFrame frame;
	private JButton btnNewButton;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcomegui window = new Welcomegui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Welcomegui() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(0, 0, 1800, 1200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("WELCOME TO VBATES");
		lblNewJgoodiesTitle.setBounds(395, 47, 686, 52);
		lblNewJgoodiesTitle.setForeground(new Color(255, 69, 0));
		lblNewJgoodiesTitle.setFont(new Font("Lucida Grande", Font.BOLD, 60));
		frame.getContentPane().add(lblNewJgoodiesTitle);
		
		btnNewButton = new JButton("ENQUIRE INFORMATION");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setRequestFocusEnabled(false);
		btnNewButton.setBounds(520, 210, 435, 75);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setOpaque(true);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 69, 0));
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextToSpeech tts = new TextToSpeech();
				tts.setVoice("cmu-rms-hsmm");
				tts.speak("you choosed enquire info", 1f, false, true);
				//EventQueue.invokeLater(new Runnable() {
					//public void run() {
						//try {
							Enqirygui window = new Enqirygui();
							window.frame.setVisible(true);
						//} catch (Exception e) {
							//e.printStackTrace();
						//}
					//}
				//});
				
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("LOGIN");
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(521, 374, 435, 75);
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(255, 69, 0));
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextToSpeech tts = new TextToSpeech();
				tts.setVoice("cmu-rms-hsmm");
				tts.speak("you choosed login", 1f, false, true);
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
		});
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("CREATE NEW ACCOUNT");
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBorder(UIManager.getBorder("RadioButton.border"));
		btnNewButton_2.setBounds(520, 541, 435, 75);
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(255, 69, 0));
		btnNewButton_2.setOpaque(true);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextToSpeech tts = new TextToSpeech();
				tts.setVoice("cmu-rms-hsmm");
				tts.speak("you chossed create new account", 1f, false, true);
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							CreateAccountgui window = new CreateAccountgui();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		frame.getContentPane().add(btnNewButton_2);
	}
}
