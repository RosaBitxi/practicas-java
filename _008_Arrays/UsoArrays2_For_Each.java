package _008_Arrays;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class UsoArrays2_For_Each {

	public static void main(String[] args) {

		String[] countries = new String[8];
		
for (int i = 0; i < 8; i++) {
	countries[i]=JOptionPane.showInputDialog("Introduce país "+(i+1));
	
}

		// Bucle for each
		
		for(String element:countries) {
		
			System.out.println(element);
		}
		
	}

}
