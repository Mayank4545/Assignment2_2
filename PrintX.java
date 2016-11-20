
public class PrintX {
public static void main(String[] args) {
	
	int count; /*to stop printing "_' after last "*" */
	
	for (int h = 0; h < 5; h++) {
		count = 0;
		for (int w = 0; w < 5; w++) {
			if (h==w || h+w == 4) {
				System.out.print("*");
				count++;
			}else{
				if(h != 2 && count>1){
					System.out.print("");
				}
				else{
					System.out.print('_');
				}	}		
		}
		System.out.println();
	}
	
}
}
