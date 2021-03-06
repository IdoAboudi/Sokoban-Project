package model.data.database;

import java.util.List;

import model.data.level.Level;

/**
 * This interface defines the behavior of a game database manager.
 * @author Or Priesender
 *
 */
public interface DataBaseManager {
	
	public List getGameSessionTableForLevel(String levelName);
	public List getGameSessionTableForUser(String username);
	public void saveUserAndLevel(User user, Level lvl);
	public void addUser(User u);
	public void addLevel(Level l);
	public void deleteUser(int userId);
	public void deleteLevel(String levelName);
	public String getSolution(Level lvl);
	public void closeDB();
	
	
	

}
