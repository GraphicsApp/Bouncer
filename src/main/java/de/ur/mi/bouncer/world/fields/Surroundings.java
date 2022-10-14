package de.ur.mi.bouncer.world.fields;

import de.ur.mi.bouncer.Direction;

import java.util.HashMap;

public class Surroundings {
	private HashMap<Direction, Field> neighbours;

	public Surroundings() {
		neighbours = new HashMap<Direction, Field>();
	}

	public Field neighbourInDirection(Direction direction) {
		return neighbours.get(direction);
	}

	public void setNeighbourInDirection(Field field, Direction direction) {
		neighbours.put(direction, field);
	}
	
	public boolean haveField(Field field) {
		return neighbours.entrySet().contains(field);
	}
}
