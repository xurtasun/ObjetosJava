package edu.upc.eetac.dsa.xurtasun.ObjetosJava;

public class Arbol {
	
	public Arbol ()
	{
		System.out.println("Un arbol generico");
	}
	
	public Arbol (int num)
	{
		System.out.println("Un arbol de "+ num + " metros");
	}
	
	public Arbol (String nombre)
	{
		System.out.println("Un "+nombre);
	}
	
	public Arbol (int num, String nombre)
	{
		System.out.println("Un "+nombre+" de "+ num + " metros");
	}
	
}
