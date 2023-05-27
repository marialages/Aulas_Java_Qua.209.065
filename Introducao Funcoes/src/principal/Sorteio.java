package principal;

import java.util.Random;

public class Sorteio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(ganhador());
	}

	static String ganhador() {
		Random random = new Random();
		int numeroSorteado = random.nextInt(11);
		String[]nomes = { "Jose Luis",
						"Luan Muruk",
						"Claudia",
						"Matheus",
						"Leone",
						"Andre",
						"Fernanda",
						"Elson",
						"Guilherme",
						"Kamylla",
		};
		return "O ganhador foi:"+ nomes[numeroSorteado];
	}
}
