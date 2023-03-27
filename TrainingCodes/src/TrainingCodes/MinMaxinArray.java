package TrainingCodes;

public class MinMaxinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,24,10,36,9};
		int min=arr[0]; //12
		int max=arr[0]; //12
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Minimum="+min);
		System.out.println("Maxiimum="+max);
	}

}
