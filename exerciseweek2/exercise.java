package exerciseweek2;

public class exercise {

	//// ���������� ���������
//	public static void main(String[] args) {
//		int[] array = {30, 2, 10, 4, 6};
//		int length = array.length;
//
//
//		for (int i = 0; i < length; i++) {
//		        for (int j = length - 1; j > i; j--) {
//		            if (array [j] < array [j - 1]) {
//		                int bubble = array[j];
//		                array [j] = array [j - 1];
//		                array [j - 1] = bubble;
//		                        }
//		                    }
//		                }
//
//
//		for (int i = 0; i < length; i++) {
//		System.out.print(array[i] + " ");
//		}
//
//	}
	
////���������� �����
//	public static void main(String[] args) {
//		int[] array = {30, 2, 10, 4, 6};
//		int length = array.length;
//
//
//		for (int i = 0; i < length; i++) {
//	        for (int j = length - 1; j > i; j--) {
//	            if (array [j] < array [j - 1]) {
//	                int x = array[j];
//	                array [j] = array [j - 1];
//	                array [j - 1] = x;
//	                        }
//	                    }
//	                }
//
//
//		for (int i = 0; i < length; i++) {
//		System.out.print(array[i] + " ");
//		}
//
//	}
	/*
		public static void main(String[] args){

			int data[] = { 3, 6, 7, 10, 34, 56, 60 };
			int numberToFind = 10;

			int number = -1;
				
				  for (int i = 0; i < data.length; i++) {
			            if ( data[i] == numberToFind) {
			            	 number = i;
			                break;
			            }
			        }
			        System.out.println(number);
	}
	      
*/
	
	
	public static void main(String[] args){

		for (int j = 1; j <= 25; j++) {
			switch (j) {
				case 1:
				case 5:
				case 7:
				case 9:
				case 13:
				case 17:
				case 19:
				case 21:
				case 25:
					System.out.print(" * ");
					break;
				default: System.out.printf("%2d ", j);
			}
			if (( j % 5) == 0) {
				System.out.print("\n");
			}
		}
   }
}
