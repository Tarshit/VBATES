package mypack;

import java.awt.EventQueue;

import marytts.modules.*;
import marytts.modules.synthesis.Voice;

public class Main{
	
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcomegui window = new Welcomegui();
					window.frame.setVisible(true);
					TextToSpeech tts = new TextToSpeech();
					Voice.getAvailableVoices().stream().forEach(System.out::println);
					tts.setVoice("cmu-rms-hsmm");
					tts.speak("Welcome to V BATES the voice based automated transport enquery system ", 2f, false, true);
					tts.speak("choose any one option among the displayed ones", 2f,false, true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	
	}
}
