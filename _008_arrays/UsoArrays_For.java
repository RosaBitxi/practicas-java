package _008_arrays;

public class UsoArrays_For {

	public static void main(String[] args) {
	
//		int [] myArray= new int[5];
		
int[] myArray= {5,38,-15,92,71,85,65,14,78,12,5,95,23}; 
		
		// Esto puede ser útil para modificar un valor
// de un índice en particular:
		
//		myArray[0]=5;
//		myArray[1]=38;
//		myArray[2]=-15;
//		myArray[3]=92;
//		myArray[4]=71;
		
// 	Esto es fácil pero no práctico:
		
//		System.out.println(myArray[0]);
//		System.out.println(myArray[1]);
//		System.out.println(myArray[2]);
//		System.out.println(myArray[3]);
//		System.out.println(myArray[4]);
		
// Mejor un bucle for:		
		
		for (int i = 0; i < myArray.length; i++) {
			
			System.out.println("Valor del índice "+i +" = "+myArray[i]);
			
		}
				
	}

	}

