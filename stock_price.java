import java.util.*;



//compare stock price problem:



public class stock_price {
	static int []A = {16,15,13,16,18,19,2}; //test case: each number denotes the price bought in/out
	static int max2 = 0;
	
	
	//none recusive method
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
	
	
	
	//recusive method
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
		

	
	int count = stock(A.length);
	
	int count2 = recur_stock(A.length);
	
	System.out.print(count2);
	
	
	}
	
}
