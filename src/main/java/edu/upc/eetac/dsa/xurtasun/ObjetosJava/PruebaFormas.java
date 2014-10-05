package edu.upc.eetac.dsa.xurtasun.ObjetosJava;

public class PruebaFormas{
	
		public static void main(String[] args) {
			
			class Forma{
				
				public void queEs()
				{
					System.out.println("Un objeto de forma Generica");
				}
				
			}
			
			class Circulo extends Forma {
				
				public void queEs()
				{
					System.out.println("Un objeto de forma redonda");
				}
				
			}
			
			class Cuadrado extends Forma {
				
				public void queEs()
				{
					System.out.println("Un objeto de forma Cuadrado");
				}
			}
		
			Forma[] s = new Forma[3];
			
			s[0] = new Forma();
			// Circulo es tambien una Forma
			s[1] = new Circulo();
			// Cuadrado es tambien una Forma
			s[2] = new Cuadrado();
			
				for(int i = 0; i < s.length; i++)
				{
						s[i].queEs();
				}		
			
	}
}
