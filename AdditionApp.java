class Addition{
	
	/**/
	 
	public int add(int num1,int num2){
		
		int result=num1+num2;
		
		System.out.println("The Addition of the numbers is:"+result);
		
		return result;
} 
}
 
 class AdditionApp{
	 public static void main(String args[]){
		 
		 Addition addition=new Addition();
		       addition.add(10,20);
 }
 }
 