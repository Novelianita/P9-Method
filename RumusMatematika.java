public class RumusMatematika {
	
	double a, t; //deklarasi variable
	double l_segitiga;
	
	public static void main(String arg[]){	//method main
		RumusMatematika rm = new RumusMatematika(); //deklarasi object dengan nama rm
		rm.luasSegitiga(); //pemanggilan method luasSegitiga
	}
	
	void luasSegitiga(){
		a = 7;
		t = 10;
		l_segitiga = 0.5 * 1 * t;
		System.out.println("Luas Segitiga = "+l_segitiga);
	}
	
}

/**
*Pemanggilan method luasSegitiga harus diddeklarasikan object class nya terlebih dahulu
*Karena method luasSegitiga tergolong method bukan static
*/