class program10{
	
	public static void main(String []args){
		
		int rows = 4;
		for(int i =1; i<=rows; i++){
			
			int temp =i;
			for(int j =1; j<=i; j++){
				
				if(i%2 != 0){
					if(j%2 == 0){
						System.out.print(temp*temp*temp + "\t");
					}else{
						System.out.print(temp*temp + "\t");
					}
				}else{
					if(i%2 != 0){
						System.out.print(temp*temp*temp+ "\t");
					}else{
						System.out.print(temp*temp+ "\t");
					}
				}
				temp++;
			}
			System.out.println();
		}
	}
}