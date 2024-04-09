
public class Patrat implements FormaGeometrica{
	private int latura=0;
	public Patrat() {
		
	}
	public Patrat(int latura) {
		this.latura=latura;
	}
    public static double Aria(int latura) {
    	double aria=latura*latura;
    	return aria;
    }
    public static double Perimetru(int latura) {
    	double perimetru=4*latura;
    	return perimetru;
    }
}
