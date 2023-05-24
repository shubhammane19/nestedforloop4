class program1{
	
	public static void main(String []args){
		
		int rows = 4;
		int n = (rows*(rows+1))/2;
		for(int i = 1; i<=rows; i++){
			
			for(int j = 1; j<=i; j++){
				
			System.out.print("C2W"+ n + " ");
			n--;
			}
			System.out.println();
		}
	}
}