package it.epicode.be;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console la frase
		System.out.println("This is my first Epicode Java Project!");
		System.out.println(moltiplica(10,20));
		System.out.println(concatena("Federico", 34));
		}

	int numb1 = 10;
	int numb2 = 20;
	public static int moltiplica(int numb1, int numb2) {
		int result = numb1 * numb2;
		return result;
	}
	
	public static String concatena (String x, int y) {
		String result = x + y;
		return result;
	}
}



