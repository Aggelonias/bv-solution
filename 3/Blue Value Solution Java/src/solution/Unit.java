package solution;

import java.util.ArrayList;

public class Unit {
	
	public String name;
	public Unit parent;
	public ArrayList<Unit> childs;
	
	private PositionManager positionManager;
	
	public Unit(PositionManager positionManager, String name) {
		this(positionManager, name, null);
	}
	
	public Unit(PositionManager positionManager, String name, Unit parent) {
		this.positionManager = positionManager;
		this.name = name;
		this.parent = parent;
		
		childs = new ArrayList<Unit>();
		
		if(parent != null) parent.addChildUnit(this);
	}
	
	public void addPositions(String nameOfPosition, int numberOfPositions) {
		positionManager.addNewPosition(this, nameOfPosition, numberOfPositions);
	}
	
	public void addChildUnit(Unit childUnit) {
		childs.add(childUnit);
	}
	
}
