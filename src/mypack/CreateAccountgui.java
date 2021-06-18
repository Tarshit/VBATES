package mypack;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import marytts.modules.synthesis.Voice;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.util.*;
import java.sql.*;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
public class CreateAccountgui {

	JFrame frame;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField age;
	private JTextField phone;
	private JTextField username;
	private JTextField door;
	private JTextField street;
	private JTextField city;
	private JTextField state;
	private JTextField zipcode;
	private JPasswordField password;

	public static void main(String[] args) {
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

	public CreateAccountgui() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(0, 0, 1800, 1200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		firstname = new JTextField();
		firstname.setForeground(new Color(0, 0, 0));
		firstname.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		firstname.setBounds(291, 25, 184, 35);
		frame.getContentPane().add(firstname);
		firstname.setColumns(10);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("First Name");
		lblNewJgoodiesLabel.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewJgoodiesLabel.setBounds(119, 26, 221, 28);
		frame.getContentPane().add(lblNewJgoodiesLabel);
		
		JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance().createLabel("Last Name");
		lblNewJgoodiesLabel_1.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewJgoodiesLabel_1.setBounds(120, 87, 238, 28);
		frame.getContentPane().add(lblNewJgoodiesLabel_1);
		
		lastname = new JTextField();
		lastname.setForeground(new Color(0, 0, 0));
		lastname.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lastname.setBounds(291, 89, 184, 29);
		frame.getContentPane().add(lastname);
		lastname.setColumns(10);
		
		JLabel lblNewJgoodiesLabel_2 = DefaultComponentFactory.getInstance().createLabel("Age");
		lblNewJgoodiesLabel_2.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewJgoodiesLabel_2.setBounds(125, 147, 120, 33);
		frame.getContentPane().add(lblNewJgoodiesLabel_2);
		
		age = new JTextField();
		age.setForeground(new Color(0, 0, 0));
		age.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		age.setBounds(291, 148, 184, 35);
		frame.getContentPane().add(age);
		age.setColumns(10);
		
		JLabel lblNewJgoodiesLabel_3 = DefaultComponentFactory.getInstance().createLabel("Phone No.");
		lblNewJgoodiesLabel_3.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewJgoodiesLabel_3.setBounds(119, 207, 169, 28);
		frame.getContentPane().add(lblNewJgoodiesLabel_3);
		
		phone = new JTextField();
		phone.setForeground(new Color(0, 0, 0));
		phone.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		phone.setBounds(291, 206, 184, 35);
		frame.getContentPane().add(phone);
		phone.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(0, 0, 0));
		comboBox.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Others"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(691, 30, 169, 27);
		frame.getContentPane().add(comboBox);
		
		TextToSpeech tts = new TextToSpeech();
		tts.setVoice("cmu-rms-hsmm");
		tts.speak("Fill the your details and click submit", 2f, false, true);
		
		JLabel lblNewJgoodiesLabel_4 = DefaultComponentFactory.getInstance().createLabel("Gender");
		lblNewJgoodiesLabel_4.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewJgoodiesLabel_4.setBounds(575, 18, 120, 48);
		frame.getContentPane().add(lblNewJgoodiesLabel_4);
		
		JLabel lblNewJgoodiesLabel_5 = DefaultComponentFactory.getInstance().createLabel("User name");
		lblNewJgoodiesLabel_5.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewJgoodiesLabel_5.setBounds(1014, 25, 120, 35);
		frame.getContentPane().add(lblNewJgoodiesLabel_5);
		
		username = new JTextField();
		username.setForeground(new Color(0, 0, 0));
		username.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		username.setBounds(1190, 29, 184, 26);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		JLabel lblNewJgoodiesLabel_6 = DefaultComponentFactory.getInstance().createLabel("Pasword");
		lblNewJgoodiesLabel_6.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesLabel_6.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewJgoodiesLabel_6.setBounds(1014, 84, 120, 35);
		frame.getContentPane().add(lblNewJgoodiesLabel_6);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(255, 69, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstname.setText(null);
				lastname.setText(null);
				age.setText(null);
				password.setText(null);
				username.setText(null);
				phone.setText(null);
				door.setText(null);
				street.setText(null);
				city.setText(null);
				state.setText(null);
				zipcode.setText(null);
				
			}
		});
		btnNewButton_1.setBounds(1014, 355, 169, 48);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setOpaque(true);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(255, 69, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				Random rand = new Random();
				int x=rand.nextInt(10000);
				try {
				Insert i1 = new Insert();
				i1.insert(x, firstname.getText(), lastname.getText(),Integer.parseInt(age.getText()), Long.parseLong(phone.getText()), door.getText(), street.getText(), city.getText(), zipcode.getText(), state.getText(), comboBox.getSelectedItem().toString(), username.getText(), password.getText());
				TextToSpeech tts = new TextToSpeech();
				Voice.getAvailableVoices().stream().forEach(System.out::println);
				tts.setVoice("cmu-rms-hsmm");
				tts.speak("Your account is successfully created", 2f, false, true);
				JOptionPane.showMessageDialog(null, " Account created");
				}
				catch(Exception exc) {
					TextToSpeech tts = new TextToSpeech();
					tts.setVoice("cmu-rms-hsmm");
					tts.speak("you left a mandatory feild empty", 2f, false, true);
					JOptionPane.showMessageDialog(null, "you left a mandatory feild empty");
				}
				}
		});
		btnNewButton.setBounds(1205, 355, 159, 48);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Address:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(119, 257, 145, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DOOR No.");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(158, 286, 130, 40);
		frame.getContentPane().add(lblNewLabel_1);
		
		door = new JTextField();
		door.setForeground(new Color(0, 0, 0));
		door.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		door.setBounds(291, 287, 184, 35);
		frame.getContentPane().add(door);
		door.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("STREET");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(160, 355, 61, 24);
		frame.getContentPane().add(lblNewLabel_2);
		
		street = new JTextField();
		street.setForeground(new Color(0, 0, 0));
		street.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		street.setBounds(291, 344, 184, 35);
		frame.getContentPane().add(street);
		street.setColumns(10);
		
		city = new JTextField();
		city.setForeground(new Color(0, 0, 0));
		city.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		city.setBounds(291, 413, 184, 35);
		frame.getContentPane().add(city);
		city.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("CITY");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(158, 419, 61, 19);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("STATE");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(158, 493, 61, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		state = new JTextField();
		state.setForeground(new Color(0, 0, 0));
		state.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		state.setBounds(291, 477, 184, 35);
		frame.getContentPane().add(state);
		state.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("ZIPCODE");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(158, 559, 120, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		zipcode = new JTextField();
		zipcode.setForeground(new Color(0, 0, 0));
		zipcode.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		zipcode.setBounds(291, 552, 184, 26);
		frame.getContentPane().add(zipcode);
		zipcode.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("*make sure you remember your password");
		lblNewLabel_6.setForeground(new Color(255, 0, 0));
		lblNewLabel_6.setBounds(1014, 139, 350, 16);
		frame.getContentPane().add(lblNewLabel_6);
		
		password = new JPasswordField();
		password.setForeground(new Color(0, 0, 0));
		password.setBounds(1190, 87, 184, 30);
		frame.getContentPane().add(password);
		
		JButton btnNewButton_2 = new JButton("BACK");
		btnNewButton_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
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
				});
		btnNewButton_2.setOpaque(true);
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(255, 69, 0));
		btnNewButton_2.setBounds(1140, 470, 117, 48);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_7 = new JLabel("*");
		lblNewLabel_7.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_7.setForeground(new Color(255, 0, 0));
		lblNewLabel_7.setBounds(227, 37, 61, 16);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("*");
		lblNewLabel_8.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_8.setForeground(new Color(255, 0, 0));
		lblNewLabel_8.setBounds(218, 216, 61, 16);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("*");
		lblNewLabel_9.setForeground(new Color(255, 0, 0));
		lblNewLabel_9.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_9.setBounds(1117, 37, 61, 16);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("*");
		lblNewLabel_10.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_10.setForeground(new Color(255, 0, 0));
		lblNewLabel_10.setBounds(1104, 96, 61, 16);
		frame.getContentPane().add(lblNewLabel_10);
	}
}
