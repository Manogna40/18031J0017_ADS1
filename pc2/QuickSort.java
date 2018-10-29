package pc3ads;

import java.util.ArrayList;
import java.util.Collections;

class QuickSort 
{ 

    int partition(ArrayList arr, int low, int high) 

    { 

       
  int i=low;
  int j=high+1;
  Student v=(Student) arr.get(low);
  while(true)
  {++i;
	 Student m=(Student) arr.get(i);
	  
	  while((comparable(m,v)))
	  {
		  if(i==high)break;;
		  ++i;
		  m=(Student) arr.get(i);
	  }
	  --j;
	  Student m1=(Student) arr.get(j);
	  while(((comparable(v,m1))))
	  {
		  if(j==low)break;
		  --j;
		  m1=(Student) arr.get(j);
	  }
	  if(i>=j)
	  {
		  break;
	  }
	  else
	  {
		  Collections.swap(arr, i, j);
		 

	  }
  }

  Collections.swap(arr, j, low);

  

        return j; 

    } 

    void sort(ArrayList arr, int low, int high) 

    { 

        if (low < high) 

        { 

            int pi = partition(arr, low, high); 

  
            sort(arr, low, pi-1); 

            sort(arr, pi+1, high); 

        } 
       

    } 
    public boolean comparable(Student a,Student b)
    {int a1=(int)Integer.parseInt(a.total);
    int b1=Integer.parseInt(b.total);
    int a11=Integer.parseInt(a.s3);
    int b11=Integer.parseInt(b.s3);
    int a111=Integer.parseInt(a.s2);
    int b111=Integer.parseInt(b.s2);
    	if(a1==b1)
		{
			if(a11==b11)
			{
				if(a111==b111)
				{
					if(dobcomparision(a.dob,b.dob)<0)
					{
						
						return false;
					}
					return true;
				}
				
				
				else if(a111<b111)
					return false;
					else
						return true;	
				}
			else if(a11<b11)
				return false;
			else
				return true;
				}
		else if(a1<b1)
			return false;
			else 
			return true;
			}
    	
    public int dobcomparision(String a,String b)
    {
    	String[] a1=a.split("-");
		String[] b1=b.split("-");
		if(Integer.parseInt(a1[2])==Integer.parseInt(b1[2]))
		{
			if(Integer.parseInt(a1[1])==Integer.parseInt(b1[1]))
			{
				if(Integer.parseInt(a1[0])>Integer.parseInt(b1[0]))
					return 1;
				else
					return -1;
			}
			if(Integer.parseInt(a1[1])>Integer.parseInt(b1[1]))
				return 1;
			else
				return -1;
		}
		if(Integer.parseInt(a1[2])>Integer.parseInt(b1[2]))
			return 1;
		else
			return -1;	
    }
    
}
