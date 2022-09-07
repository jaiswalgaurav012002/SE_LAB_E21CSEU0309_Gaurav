package java_sorting_e21cseu0309;

public class NEW_SORT_E21CSEU0309 {

	  
		    static void bubbleSort(int[] array2) {  
		        int array_length =  array2.length;  
		        int temporary_element = 0;  
		         for(int i=0; i < array_length ; i++){  
		                 for(int j=1; j < (array_length -i); j++){  
		                          if( array2[j-1] >  array2[j]){  
		                                
		                        	  temporary_element =  array2[j-1];  
		                                 array2[j-1] =  array2[j];  
		                                 array2[j] = temporary_element;  
		                 }  
		                          
		                 }  
		           	  }
		    }              
		    public static void main(String[] args) {  
		                int  array2[] ={99,999,35,69,45,2800,5};  
		                 
		                System.out.println("Array Before Bubble Sort");  
		                for(int i=0; i <  array2.length; i++){  
		                        System.out.print( array2[i] + " ");  
		                }  
		                System.out.println();  
		                  
		                bubbleSort( array2);
		                 
		                System.out.println("Array After Bubble Sort");  
		                for(int i=0; i <  array2.length; i++){  
		                        System.out.print( array2[i] + " ");  
		                }  
		   
		        }  
		}  

			
