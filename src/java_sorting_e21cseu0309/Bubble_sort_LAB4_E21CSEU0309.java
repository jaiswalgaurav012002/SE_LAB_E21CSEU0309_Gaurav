package java_sorting_e21cseu0309;

public class Bubble_sort_LAB4_E21CSEU0309 {
	
		// TODO Auto-generated method stub
    
	    static void bubbleSort(int[] AR) {  
	    	
	        int num_elements = AR.length;  
	        int temp_VAL = 0;  
	        
	         for(int i=0; i < num_elements; i++){  
	        	 
	                 for(int j=1; j < (num_elements-i); j++){ 
	                	 
	                          if(AR[j-1] > AR[j]){  
	                        	 
	                        	  temp_VAL  = AR[j-1];  
	                                 AR[j-1] = AR[j]; 
	                                AR [j] = temp_VAL ; 
	                                 
	                         }  
	                         
	                         
	                 }  
	         } 
	         
	  
	    }  
	    public static void main(String[] args) {  
	                int AR[] ={3,60,35,2,45,320,5};  
	                 
	                System.out.println("Array Before Bubble Sort");  
	                for(int i=0; i < AR.length; i++){  
	                        System.out.print(AR[i] + " ");  
	                }  
	                System.out.println();  
	                  
	                bubbleSort(AR);//sorting array elements using bubble sort  
	                 
	                System.out.println("Array After Bubble Sort");  
	                for(int i=0; i < AR.length; i++){  
	                        System.out.print(AR[i] + " ");  
	                }  
	   
	        }  
	
   
	}


