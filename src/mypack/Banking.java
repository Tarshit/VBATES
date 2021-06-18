package mypack;

import java.awt.EventQueue;
import java.net.*;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import marytts.modules.synthesis.Voice;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Desktop;

public class Banking {

	JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Banking window = new Banking();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Banking() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(0, 0, 1800, 1200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JOptionPane.showMessageDialog(null, "ticket will be sent to your Phone");
		
		TextToSpeech tts = new TextToSpeech();
		tts.setVoice("cmu-rms-hsmm");
		tts.speak("select a bank which you would prefer to make a transaction ", 2f, false, true);
		
		JButton btnNewButton = new JButton("SBI");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setOpaque(true);
		btnNewButton.setBackground(new Color(255, 69, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://retail.onlinesbi.com/retail/login.htm").toURI());
					
				}
				catch(Exception exc){
					TextToSpeech tts = new TextToSpeech();
					tts.setVoice("cmu-rms-hsmm");
					tts.speak("Sorry could not find server try again later", 2f, false, true);
					JOptionPane.showMessageDialog(null, "Sorry could not find server try again later");
				}
			}
		});
		btnNewButton.setBounds(508, 195, 383, 56);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("SELECT A BANK THAT YOU WOULD PREFER TO MAKE A TRANSACTION");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		lblNewLabel.setBounds(27, 67, 1355, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("IDBI");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://inet.idbibank.co.in/ret/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&__FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=IBKL").toURI());
					
				}
				catch(Exception exc){
					TextToSpeech tts = new TextToSpeech();
					tts.setVoice("cmu-rms-hsmm");
					tts.speak("Sorry could not find server try again later", 2f, false, true);
					JOptionPane.showMessageDialog(null, "Sorry could not find server try again later");
				}
			}
			
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(255, 69, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setBounds(508, 317, 383, 56);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DHANALAKSHMI");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URL("https://netbank.dhanbank.in/DBRetailBank/").toURI());
					
				}
				catch(Exception exc){
					TextToSpeech tts = new TextToSpeech();
					tts.setVoice("cmu-rms-hsmm");
					tts.speak("Sorry could not find server try again later", 2f, false, true);
					JOptionPane.showMessageDialog(null, "Sorry could not find server try again later");
				}
			}
		});
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		btnNewButton_2.setOpaque(true);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(255, 69, 0));
		btnNewButton_2.setBounds(515, 434, 376, 56);
		frame.getContentPane().add(btnNewButton_2);
	}
}
