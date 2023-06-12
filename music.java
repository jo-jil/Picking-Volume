import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class music {
   AudioInputStream audioInput;
   Clip clip;
	Clip playMusic (String musicLocation)
	{
		try {
			File musicPath = new File(musicLocation);		
			if(musicPath.exists())
			{
				audioInput = AudioSystem.getAudioInputStream(musicPath);
				clip = AudioSystem.getClip();
				clip.open(audioInput);			
			}
			else
			{
				System.out.println("Cant find file");
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return clip;	
	}  
}
