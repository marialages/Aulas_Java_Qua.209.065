package entities;

public class CalcularTerreno {
	
	public double areaTotal;
	
	public void areaTerreno(double largura, double comprimento) {
		areaTotal = largura * comprimento;
		System.out.println("A área total é:" + areaTotal);
	}

}
