import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class volume{
	Clip clip;
	float previousVolume = 0;
	float currentVolume = 0;
	FloatControl fc;
	boolean mute = false;
	
	public void setFile(Clip Zero) {
		try {		
			fc = (FloatControl)Zero.getControl(FloatControl.Type.MASTER_GAIN);
			fc.setValue(-40);
		}
		catch(Exception e){
			
		}
		
	}
	public void play(Clip Zero) {
		Zero.setFramePosition(0);
		Zero.start();
	}
	public void loop(Clip Zero) {
		Zero.loop(Clip.LOOP_CONTINUOUSLY);
	}
	public void stop(Clip Zero)
	{
		Zero.stop();
	}
	public void volumeUp() {
		
		currentVolume += 1.0f;
		if (currentVolume > 6.0f)
		{
			currentVolume = 6.0f;
		}
		fc.setValue(currentVolume);
		System.out.println(currentVolume);
	}
	public void volumeDown() {
		currentVolume -= 1.0f;
		if (currentVolume < -80.0f)
		{
			currentVolume = -80.0f;
		}
		fc.setValue(currentVolume);
		System.out.println(currentVolume);
	}
}
