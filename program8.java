class program8{
	
	public static void main(String []args){
		
		int rows = 4;
		int n = 10;
		char ch = 'J';
		for(int i =1; i<=rows; i++){
			
			for(int j= 1;j<=i;j++){
				
				if(i%2 == 0){
					
					System.out.print(ch + " ");
				}else{
					
					System.out.print(n + " ");
				}
				ch--;
				n--;
			}
			System.out.println();
		}
	}
}