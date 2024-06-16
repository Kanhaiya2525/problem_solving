package DSA;
import java.util.Arrays;
public class Array {
	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6,7,8,9};
		Array a=new Array();
		a.addFirst(arr, 0);
		a.addLast(arr,10);
		a.deleteFirst(arr);
		a.deleteLast(arr);
		a.addpos(arr, 100,2);
		a.deletepos(arr,1);
	}
	public void addFirst(int[]arr,int x) {
		int []newarray=new int[arr.length+1];
		newarray[0]=x;
		for(int i=0;i<arr.length;i++) {
			newarray[i+1]=arr[i];	
		}
	    System.out.print(Arrays.toString(newarray));
	    System.out.println();	
	}
	public void addLast(int[]arr,int x) {
		int []newarray=new int[arr.length+1];
		newarray[arr.length]=x;
		for(int i=0;i<arr.length;i++) {
			newarray[i]=arr[i];
		}
	    System.out.print(Arrays.toString(newarray));
	    System.out.println();	
	}
	public void deleteFirst(int []arr) {
		int []newarray=new int[arr.length-1];
		for(int i=1;i<arr.length;i++)
		{
			newarray[i-1]=arr[i];
		}
	    System.out.print(Arrays.toString(newarray));
	    System.out.println();	
	}
	public void deleteLast(int[]arr) {
		int []newarray=new int[arr.length-1];
		for(int i=0;i<arr.length-1;i++) {
			newarray[i]=arr[i];
		}
	    System.out.print(Arrays.toString(newarray));
	    System.out.println();	
	}
	public void addpos(int[]arr,int x,int pos) {
		int []newarray=new int[arr.length+1];
		newarray[pos]=x;
		 for (int i = 0; i < pos; i++) {
	            newarray[i] = arr[i];
	        }
		for(int i=pos;i<arr.length;i++) {
			newarray[i+1]=arr[i];	
		}
	    System.out.print(Arrays.toString(newarray));
	    System.out.println();	
	}
	public void deletepos(int[] arr, int pos) {
	    int[] newarray = new int[arr.length - 1];
	    int newIndex = 0;
	    for (int i = 0; i < arr.length; i++) {
	        if (i != pos) {
	            newarray[newIndex] = arr[i];
	            newIndex++;
	        }
	    }
	    System.out.println(Arrays.toString(newarray));
	}
}
