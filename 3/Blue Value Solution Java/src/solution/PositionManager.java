package solution;

import java.util.ArrayList;

public class PositionManager {
	
	public ArrayList<Position> positions;
	
	public ArrayList<PositionsPerUnit> posPerUnit;
	
	public PositionManager() {
		positions = new ArrayList<Position>();
		posPerUnit = new ArrayList<PositionsPerUnit>();
	}
	
	public void addNewPosition(Unit unit, String nameOfPosition, int numberOfPositions) {
		for(Position p : positions) {
			if(p.name.equalsIgnoreCase(nameOfPosition.trim()) ) {
				PositionsPerUnit tmp = new PositionsPerUnit();
				tmp.unit = unit;
				tmp.position = p;
				tmp.number = numberOfPositions;
				
				posPerUnit.add(tmp);
				
				return;
			}
		}
		
		System.out.println("No position found with the name of: " + nameOfPosition);
	}
	
	public void addNewTypeOfPosition(String name, String description) {
		positions.add(new Position(name.trim(), description));
	}
}
