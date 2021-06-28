package _009_arrays_bidimensionales;

public class ArraysBidimensionales2_For_Each {

	public static void main(String[] args) {
		
		int[][]array= {
				{10,14,25,77,63},
				{45,78,32,74,99},
				{63,73,12,76,44},
				{45,65,83,44,56}
		};
		
	for(int[]row:array) {
		System.out.println();
		for(int z:row) {
			System.out.print("["+z+"] ");
		}
	}
		
	}

}
