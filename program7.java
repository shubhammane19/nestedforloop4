class program7{
	
	public static void main(String []args){
		
		int rows = 6;
		char ch = 'F';
		int n = 1;
		for(int i = 1; i<=rows; i++){
			
			char temp = ch;
			for(int j = 1; j<= i; j++){
				
				if(j%2 != 0){
					
					System.out.print(temp + " ");
					temp++;
				}else{
					
					System.out.print(n + "  ");
					n++;
				}
			}
			ch--;
			System.out.println();
		}
	}
}