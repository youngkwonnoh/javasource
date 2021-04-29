package ch5;

public class Earth {
	
	static final double EARTH_RADUIS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADUIS * EARTH_RADUIS;
	}
	
}
