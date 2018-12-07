package presentation;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class HiloMusica extends Thread{

	private File file;
	
	public HiloMusica(File file) {
		super();
		this.file = file;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	try {
		AudioInputStream audioIn = AudioSystem.getAudioInputStream(file.toURI().toURL());  
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        //clip.loop(Clip.LOOP_CONTINUOUSLY);
        clip.start();
		} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
}
	}

}
