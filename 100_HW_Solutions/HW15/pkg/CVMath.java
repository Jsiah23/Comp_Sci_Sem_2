package pkg;

public class CVMath {		
	
	public static boolean specialSquare(double a){
	int count = 0;
	int count2 = 1;
	double sq = Math.sqrt(a);
	if ((sq - Math.floor(sq)) == 0){
	while (true){
		if (count == a){
		break;	
		}
	count = count + count2;
	count2++;
	System.out.println(count);
	}

	}
	return true;
		
}
// public static int findMid(int one, int two, int three)
	// {
	// 	return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	// }
}