package controller.commands;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import model.Model;
import model.data.files.LevelSaver;
import model.data.files.LevelSaverCreator;
import model.data.files.ObjectLevelSaverCreator;
import model.data.files.TextLevelSaverCreator;
import model.data.files.XMLLevelSaverCreator;
import model.data.level.Level;

public class SaveFileCommand extends CommonModelCommand {

	HashMap<String,LevelSaverCreator> map;
	FileOutputStream out;
	LevelSaver saver;
	
	
	
	public SaveFileCommand(Model model) throws FileNotFoundException
	{
		this.model = model;
		map = new HashMap<String,LevelSaverCreator>();
		
		//configuration of the map, can add more in the future
		map.put("obj", new ObjectLevelSaverCreator());
		map.put("xml", new XMLLevelSaverCreator());
		map.put("txt", new TextLevelSaverCreator());
		
		
		
		
	}
	
	@Override
	public void execute() throws IOException {
		
		String filename = params.removeFirst();
		out = new FileOutputStream(filename);
		LevelSaverCreator c = map.get(filename.substring(filename.length()-3));
		
		if(c!=null){
			saver = c.create();
			if(saver!=null)
				model.saveLevel(out, saver);
		}
	}

}