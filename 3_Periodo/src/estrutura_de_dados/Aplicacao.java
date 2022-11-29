package estrutura_de_dados;



public class Aplicacao {

	public static void main(String[] args) {
		Ponto p1,p2;
		p1 = new Ponto(); // construtor padrao
		System.out.println("Total de ponto: "+ p1.cont);
		p1.setX(1);
		p1.setY(2);
;
		
		p2= new Ponto();
		System.out.println("Total de ponto: "+ p2.cont);
		
		p2.setX(4);
		p2.setY(5);
		System.out.println("Ponto p1: ("+ p1.getX()+ "," + p1.getY() + ")");
		System.out.println("Ponto p2: (" + p2.getX()+ "," + p2.getY() + ")");
		
		Ponto p3 = new Ponto(6,7);
		System.out.println("Ponto p3: (" + p3.getX()+ "," + p3.getY() + ") e cont: " + p3.cont);
		
		Ponto p4 = new Ponto (5,8);
		System.out.println("Ponto p4: (" + p4.getX()+ "," + p4.getY() + ") e cont: " + p4.cont);

		Ponto p5 =  new Ponto (0,7);
		System.out.println("Ponto p4: (" + p5.getX()+ "," + p5.getY() + ") e cont: " + p5.cont);


	}

}
