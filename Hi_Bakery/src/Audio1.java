import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Audio1 extends Thread {
	
	// field
	File file1;
	Clip clip1;
	
	// method
	public void run() {
		try {
			file1 = new File("/Users/ihyein/Downloads/Mr.-Turtle-The-Green-Orbs.wav");
			clip1 = AudioSystem.getClip();
			clip1.open(AudioSystem.getAudioInputStream(file1));
			clip1.loop(Clip.LOOP_CONTINUOUSLY);
			clip1.start();
		} catch (Exception e) {
			System.err.println("Put the music.wav file in the sound folder");
		}
	}
	public synchronized void audio1Stop() {
		clip1.stop();
		clip1.close();
	}
}
