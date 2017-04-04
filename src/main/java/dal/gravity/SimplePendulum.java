package dal.gravity;

/**
 * Represents pendulums exhibiting (approximately) simple harmonic motion
 */
public class SimplePendulum extends AbstractEarthPendulum implements GravityModel {

   
    /**
     * Creates a new Pendulum instance using
     * inLength: the string length (>0)
     * inMass: the point mass (>0)
     * inTheta0: angular displacement at t=0 (0<=theta0<=pi/6)
     */
    public SimplePendulum (double inLength, double inMass, double inTheta0, double grav) {
	super (inLength, inMass, inTheta0);
	angularFrequency = Math.sqrt (this.getGravitationalField () / this.getStringLength ());
	periodOfMotion = 2 * Math.PI 
	    * Math.sqrt (this.getStringLength () / this.getGravitationalField ());
    }

	@Override
	public void setGravitationalField(double g) {
		this.g = g;
		
	}




    
    
    
    
}
