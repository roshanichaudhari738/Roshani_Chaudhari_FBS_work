/**
 * 
 */
package assignment6;

/**
 * 
 */
public class Question13 {

	/**
	 * @param args
	 */
	public static void main(String args[]){
		int val=perfect();
		System.out.printf("%d\n",val);
	}

	static int perfect()
	{
		int no=24;
		int i=1,sum=0;
		while(i<(no/2)){
			if(no%i==0){
				
			//System.out.printf("%d\n",no);
			
			sum=sum+i;
//			System.out.printf("%d",sum);
				
			}
			i++;
		}
		return sum;
	}

}
