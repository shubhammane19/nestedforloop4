class program6{
	
	public static void main(String []args){
		
		int rows = 4;
		for(int i = 1; i<=rows; i++){
			
			int temp = i;
			for(int j= 1; j<=i; j++){
				
				System.out.print(temp + " ");
				temp++;
			}
			System.out.println();
		}
	}
}