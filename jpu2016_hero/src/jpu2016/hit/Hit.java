package jpu2016.hit;

public class Hit {
	private  int strength;
	private  int range;
	private  TypeHit	typeHit;
	
	
	private  int MAX_STRENGTH=100 ;
	private int MIN_STRENGTH = 0; 
	private  int MAX_RANGE=10 ;
	private int MIN_RANGE=0;


	public Hit(final int strength, final int range, final TypeHit typeHit) {
		this.setStrength(strength);
		this.setRange(range);
		this.setTypeHit(typeHit);		
	}//hit

	public int getStrength() throws Exception {
		if ((strength < MIN_STRENGTH) || (strength > MAX_STRENGTH)) {
			throw new Exception("Strength out of range");
			}
		return this.strength;
	}

	public int getRange() throws Exception {

		if ((range < MIN_RANGE) || (range > MAX_RANGE)) {
			throw new Exception("Range out of range");
			}
		return this.range;
		
	}

	public TypeHit getTypeHit() {
		return this.typeHit;
	}
	
	/**
	 * @return the mAX_STRENGTH
	 * @throws Exception 
	 */
	public int getMAX_STRENGTH() throws Exception {
		return MAX_STRENGTH ;

	}

	/**
	 * @return the mAX_RANGE
	 * @throws Exception 
	 */
	public int getMAX_RANGE() throws Exception {
		return MAX_RANGE;		

	}
	
	/**
	 * @param strength the strength to set
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}

	/**
	 * @param range the range to set
	 */
	public void setRange(int range) {
		this.range = range;
	}

	/**
	 * @param typeHit the typeHit to set
	 */
	public void setTypeHit(TypeHit typeHit) {
		this.typeHit = typeHit;
	}

	

	
	
}//hit
