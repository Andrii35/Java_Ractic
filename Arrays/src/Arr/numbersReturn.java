package Arr;
import java.lang.Math;
public class numbersReturn {
public static int numbRet(int first, int second) {
	int rand=(int)(first+Math.random()*(second-first+1));
	return rand;
	
}
public static int Fibonachi(int n) {
	if(n==0) {
		return 0;
	}else if(n==1) {
		return 1;
	}
	else {
		return Fibonachi(n-1)+Fibonachi(n-2);
	}
}
}
