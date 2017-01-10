package levelLoadersAndSavers;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

import levels.Level;

public class MyObjectLevelLoader implements LevelLoader {

	@Override
	public Level loadLevel(InputStream in) throws IOException, ClassNotFoundException {
		Level newLevel = new Level();
		ObjectInputStream oi = new ObjectInputStream(in);
		newLevel = (Level) oi.readObject();
		
		oi.close();
		return newLevel;
	}

}