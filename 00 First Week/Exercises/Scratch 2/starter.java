class starter {
	public static void main(String args[]) {
	int[] joe = new int[10];
	int counter = 0;
	while(counter < joe.length){
	if(joe[counter] == 0){
	joe[counter] = 5;	
	}	
	else{
		joe[counter] = 10;
	}
	counter ++;
	}
	System.out.println(joe[9]);	
	}
}
