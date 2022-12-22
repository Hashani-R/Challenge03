package challenge03;
public class Challenge03 {

    public static void main(String[] args) {
         
        int[] dataSet = {47,84,75,21,14,14,79};
        
    
        /* Sorting the list */
        int[] dataSet2 = new int[dataSet.length];
        
        System.out.print("Sorted dataset: [ ");
        
         for(int i=0; i< dataSet.length; i++)
        {
            for(int j=i+1; j< dataSet.length; j++)
            {
                int tmp = 0;
                if(dataSet[i] > dataSet[j])
                {
                    tmp = dataSet[i];
                    dataSet[i] = dataSet[j];
                    dataSet[j] = tmp;
                }
            }
            dataSet2[i] = dataSet[i];
            System.out.print(dataSet[i] +" ");
            
        }
        System.out.println("]");
        
        
        /* Find median of the list */
       int median = dataSet2[dataSet2.length/2];
       
       if(dataSet2.length % 2 !=0){
           System.out.println("Median = " + median);    
       }
       else{
           System.out.println("Median = " + (median + dataSet[dataSet2.length/2-1])/2.0);
       }
       
       
       /* Find highest value of the list */
       int maxValue = dataSet2[0];  
  
        for (int i = 0; i < dataSet2.length; i++) {  
             
           if(dataSet2[i] > maxValue)  
               maxValue = dataSet2[i];  
        }  
        System.out.println("Highest value = " + maxValue);  
        
        
        /* Find mode of the list */
       int maxNumber = 0;
       int maxCount = 0;
        
        for(int i = 0; i < dataSet2.length; i++){
            int count = 0;
            
            for(int j =0; j < dataSet2.length; j++){
                
                if (dataSet2[i] == dataSet2[j])
                    count++;   
            }
            
            if(count > maxCount){
                
                maxNumber = dataSet2[i];
                maxCount = count;
            }
        }
       
       System.out.println("Mode = " + maxNumber);
       
       
        /* Filtering prime numbers of the list */
       System.out.print("Prime Numbers = [ ");
       
        for(int i = 0; i < dataSet2.length; i++) {
            
            int num = dataSet2[i];
            boolean non_prime = false;
            
            for (int j = 2; j <= num / 2; j++) {
              // condition for nonprime number
              if (num % j == 0) {
                non_prime = true;
                break;
              }
            }
        
            if (!non_prime){
              System.out.print(num + " ");
            }
        }
        System.out.println("]");
    }
    
}
