import java.lang.String;
import java.lang.System;
class MyArray{
	
    int [] arr;
    String [] strg;
    MyArray()
    {}
    
    MyArray(int arr[])
    {this.arr=arr;
    }
    
  MyArray(String strg[])
   {this.strg=strg;
    }

    public int arrLength(int a[])
    {
    	int count=0;
    	
    for(int i:a)
    {count++;
    }
    return count;
    }

    public void printArray(int[] ar)
   {
    int c= arrLength(ar);
 for(int i=0; i<c; i++)
 {
    System.out.println(ar[i]);

 }
}
 public void addNewItem(int pos, int x)
 {
    int size=arrLength(arr);
    int[] newarr= new int[size+1];
    
    for (int i=0; i<size+1; i++)
    {
        if(i<pos-1)
        newarr[i]=arr[i];
       
        else if(i==pos-1)
         newarr[i]=x;

         else 
         newarr[i]=arr[i-1];
         }
         System.out.println("The array after adding new item is:");
    printArray(newarr);
    }

    public void removeItem(int pos){
        int size= arrLength(arr);
        int [] newarr= new int [size-1];
         for (int i=0; i<size-1; i++)
    {
        if(i<pos-1)
        newarr[i]=arr[i];

         else 
         newarr[i]=arr[i+1];
         }
         System.out.println("The array after removing an item is:");
    printArray(newarr);   
    }
    
    public void filterArray(int v)
    {
        int size= arrLength(arr);
         
         for (int i=0; i<size; i++)
         {
            if (arr[i]>v)
            	System.out.println(arr[i]);
           
         }
    }

    public void sortArray()
    { 
        int size=arrLength(arr);
        int temp=0;
        for (int i=0; i<size; i++)
        {
            for(int j=i+1; j<size; j++)
            {
                if (arr[j]>arr[i])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
            }
            System.out.println("The sorted Array in descending  is:");
            printArray(arr);
        
    }
    
    // String Method Starts

    public int strLength(String [] s)
  {int count=0;
    for (String i: s)
    {count++;
    }
    return count;
    }
 
    public void printStr(String [] st)
    {
     int c= strLength(st);
  for(int i=0; i<c; i++)
  {
     System.out.println(st[i]);

  }
 }
  
    public void addNewString(int pos, String x)
    {
       int size=strLength(strg);
       String[] newarr= new String[size+1];
       
       for (int i=0; i<size+1; i++)
       {
           if(i<pos-1)
           newarr[i]=strg[i];
          
           else if(i==pos-1)
            newarr[i]=x;

            else 
            newarr[i]=strg[i-1];
            }
            System.out.println("The String after adding new item is:");
       printStr(newarr);
       }
    
    public void removeString(int pos){
        int size= strLength(strg);
        String [] newarr= new String [size-1];
         for (int i=0; i<size-1; i++)
    {
        if(i< pos-1)
        newarr[i]=strg[i];

         else 
         newarr[i]=strg[i+1];	
         }
         System.out.println("The String after removing an item is:");
    printStr(newarr);   
    }
    
    public void sortString()
    {
    	int size= strLength(strg);
    	String temp;
        for (int i=0; i<size; i++)
        {
            for(int j=i+1; j<size; j++)
            {
                if (strg[j].compareTo(strg[i])>0)
                {
                    temp= strg[j];
                    strg[j]=strg[i];
                    strg[i]=temp;
                }
            }
            }
            System.out.println("The sorted string Array in descending is:");
            printStr(strg);
    	 
    }
    
    public void filterString(String s)
    {
    	int size= strLength(strg);
    	
    	for (int i=0;i<size; i++)
    	{
    		if(strg[i].endsWith(s)==true)
    			System.out.println(strg[i]);
    				
    	}
    }
 }



public class ArrayWork {
	

	public static void main(String[] args){

        int [] array= new int[] {1,25,3,4,5,66,7,52,43,12};
        String[] str= new String[] {"Kerla", "Gujrat", "Maharastra","Uttar Pradesh", "Uttarakhand",
        		"Madhya Pradesh", "Assam", "Sikkhim", "Manipur", "Nagaland"};
        MyArray obj= new MyArray(array);
        System.out.println("The original array is:");
        obj.printArray(array);
        obj.addNewItem(6,20);
        obj.removeItem(3);
        System.out.println("The values greater than 10 are:");
       obj.filterArray(10);
        obj.sortArray();
       MyArray obj2= new MyArray(str);
          System.out.println("The original String array is:");
          obj2.printStr(str);
          obj2.addNewString(6, "Mizoram");
          obj2.removeString(3);
          obj2.sortString();
          System.out.println("The States ending with 'Pradesh' are:");
          obj2.filterString("Pradesh");
        
}

}
