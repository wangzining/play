package hello_world;
import java.util.*;

//help yangwenjing do cs323 stock problem:
public class hello {
	static int []A = {16,15,13,16,18,19,2};
	static int max2 = 0;
	
	static int stock(int n){
		int max = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<i;j++){
				if(A[i]-A[j]>max){
					max = A[i]-A[j];
				}
			}
		}
		return max;
	}
	
	
	
	
	static int recur_stock(int day){
		day = day-1;
		
		if(day == 0){
			return Math.max(max2, 0);
		}
		else {
			for(int i=0;i<day;i++){
				if(A[day]-A[i]>max2){
					max2 = A[day]-A[i];
				}
			}
		}
		return recur_stock(day);
		
	}
	
	
	
	
	
	public static void main(String []args){
		
	System.out.println("Hello!\n");
	
	int count = stock(A.length);
	
	int count2 = recur_stock(A.length);
	
	System.out.print(count2);
	
	
	}
	
}
