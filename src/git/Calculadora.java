package git;
import java.util.Scanner;
public class Calculadora {
	
	
	public static void main(String[] args) {
	 Integer a;
	 Integer b;
	 Integer opcion;
	 Integer resultado;
	 Scanner teclado = new Scanner(System.in);
	 
	 
	 do{
	 System.out.println("Ingrese su operación /n 1 para sumar /n 2 para restar /n 3 para multiplicar /n 4 para dividir");
	 opcion = teclado.nextInt();
	 }
	 while(opcion < 1 && opcion > 4);
	 System.out.println("Ingrese el primer numero");
	 a = teclado.nextInt();
	 System.out.println("Ingrese el segundo numero");
	 a = teclado.nextInt();
	 
	 //System.out.println("El resultado es " + a );
	}

	public Integer metodoQueMultiplicaDosNumeros(Integer a, Integer b) {
		  Integer resultado = a * b;
		 
		 return	resultado ;
	 }
		
	 public Integer metodoQueDivideDosNumeros(Integer a, Integer b) {
		 
		    Integer resultado = a / b;
		    
			 return resultado;
		
	 }	
	 public Integer metodoQueSumaDosNumeros(Integer a, Integer b) {
		  Integer resultado = a + b;
		  
		 return	resultado ;
	 }
	 public Integer metodoQueRestaDosNumeros(Integer a, Integer b) {
		  Integer resultado = a - b;
		  
		 return	resultado ;
	 }
	 
	 
		
	
	 
	 }

