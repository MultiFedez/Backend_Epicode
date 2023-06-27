package it.epicode.be;

public class Ex2_g1 {
	static String[] arrFive = {"Ciao", "Epicode", "Java", "Luglio", "Lezioni"};
	
public static void main (String[] args)
		{
		// Stampa a console la frase
		System.out.println("This is my first Epicode Java Project!");
		System.out.println(moltiplica(10,20));
		System.out.println(concatena("Federico", 34));
		String[] resInserisciInArray = inserisciInArray(arrFive, "Test");
		
		for(int i =0; i < arrFive.length; i++) {
			System.out.println(resInserisciInArray[i]);
		}
		}

// Method Moltiplica
	int numb1 = 10;
	int numb2 = 20;
	public static int moltiplica(int numb1, int numb2) {
		int result = numb1 * numb2;
		return result;
	}
// Method Concatena
	public static String concatena (String x, int y) {
		String result = x + y;
		return result;
	}
// Method ArrayString
	public static String[] inserisciInArray(String[] x, String y) {
	String[] arr = new String[6];
	arr[0]= x[0];
	arr[1]= x[1];
	arr[2]= x[2];
	arr[3]= y;
	arr[4]= x[3];
	arr[5]= x[4];
	
	return arr;
	}
}



