package git;

public class Calculadora {

	
	public static void main(String[] args) {
	 Integer a;
	 Integer b;
	 Integer opcion;
	 Integer resultado;
	 
	 
	 do{
	 System.out.println("Ingrese su operación /n 1 para sumar /n 2 para restar /n 3 para multiplicar /n 4 para dividir");
	 opcion = teclado.next();
	 }
	 while(opcion < 1 && opcion > 4);
	 System.out.println("Ingrese el primer numero");
	 a = teclado.next();
	 System.out.println("Ingrese el segundo numero");
	 a = teclado.next();
	 
	 public Integer metodoQueMultiplicaDosNumeros(Integer a, Integer b) {
		  Integer resultado = a * b;
		 System.out.println("El resultado es"+resultado);
		 return	resultado ;
	 }
		
	 public Integer metodoQueDivideDosNumeros(Integer a, Integer b) {
		 
		    Integer resultado = a / b;
			 System.out.println("El resultado es"+resultado);
			 return	resultado ;
		
	 }	
		
		case 3:
			System.out.println("Elegiste la opcion resta");
			resultado = a - b;
			break;
		case 4:
			System.out.println("Elegiste la opcion suma");
			resultado = a + b;
			break;
		}
	 System.out.println("El resultado es " + resultado.toString());
	 }
}
