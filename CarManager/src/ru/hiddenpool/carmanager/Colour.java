package ru.hiddenpool.carmanager;

public enum Colour {
	
	WHITE, GREEEN, BLACK, BLUE;
	
	@Override
    public String toString() {
        return name().toLowerCase();
    }

}
