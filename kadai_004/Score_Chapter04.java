package kadai_004;

public class Score_Chapter04 {

	public static void main(String[] args) {
		
		String[] seito = {"Aさん","Bさん","Cさん","Dさん","Eさん","Fさん","Gさん","Hさん","Iさん","Jさん"};
		
			
			for (int i = 0 , j = 10 , k = 10; j <= 100; j += 10, i++ ,k += j){
				
				System.out.println(seito[i] + "の点数は" + j +'点');
				

				if ( j == 100) {
					k = k / (i +1);
					System.out.println("テストの平均点は" + k + '点');
					
				}
				
			}
	}
}
