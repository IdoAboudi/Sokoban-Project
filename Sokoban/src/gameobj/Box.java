package gameobj;

import levels.Point;
import levels.Point2D;

public class Box extends LevelObject implements Moveable {

	
	
	public Box(Point pos) {
		super(pos);
	}
	public Box()
	{
		super(new Point2D(0,0));
	}
	
	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		
	} 
	
	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		
	}
}