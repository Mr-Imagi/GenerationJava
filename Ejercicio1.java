package com.generation.f20220523;

public class Ejercicio1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 // calculo area y calculo del perimetro
		
		variables estaticas
		formula area triangulo
		impresion
		
		formula perimetro circulo
		impresion*/
		
		
		float areaTrianguloAB, alturaTriangulo, baseTriangulo;
		
		alturaTriangulo = 3;
		baseTriangulo = 1;
		
		areaTrianguloAB = (alturaTriangulo * baseTriangulo)/2;
		
		//2pi*r
		
		float radioCirculo = 15f;
		float diametroCirculo = 30f;
		float diametroARadio = diametroCirculo/2;
		float PI = 3.1416f;
		
		float perimetroCirculoConR = (2*PI)*radioCirculo;
		float perimetroCirculoConD = (2*PI)*diametroARadio;
		
		
		System.out.println("*********************************************");
		System.out.println("**********Cálculo de area triángulo**********");
		System.out.println("*********************************************");
		System.out.println("");
		System.out.println("El área de un triángulo de base: " + baseTriangulo + ", y de altura: " + alturaTriangulo + ", es: " + areaTrianguloAB);
		System.out.println("");
		System.out.println("*********************************************");
		System.out.println("*");
		System.out.println("El perímetro de un círculo de radio: " + radioCirculo + ", es: " + perimetroCirculoConR);
		System.out.println("El perímetro de un círculo de diametro: " + diametroCirculo + ", es: " + perimetroCirculoConD);
		System.out.println("*********************************************");
		System.out.println("*********************************************");
  
	}

}
