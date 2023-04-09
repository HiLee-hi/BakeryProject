import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Audio2 extends Thread {
	
	// field
	File file2;
	Clip clip2;
	
	// method
	public void run() {
		try {
			file2 = new File("/Users/ihyein/Downloads/Birthday-Cake-Reed-Mathis.wav");
			clip2 = AudioSystem.getClip();
			clip2.open(AudioSystem.getAudioInputStream(file2));
//			clip2.loop(Clip.LOOP_CONTINUOUSLY);
			clip2.start();
			
		} catch (Exception e) {
			System.err.println("Put the music.wav file in the sound folder");
		}
	}
	public synchronized void audio2Stop() {
		if(clip2 != null) {
			clip2.stop();
			clip2.close();
		}
	}
}
