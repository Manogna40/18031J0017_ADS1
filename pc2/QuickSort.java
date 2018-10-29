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
	  
	  while((comparable(m,v))>0)
	  {
		  if(i==high)break;;
		  ++i;
		  m=(Student) arr.get(i);
	  }
	  --j;
	  Student m1=(Student) arr.get(j);
	  while(((comparable(v,m1)))>0)
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
    public int comparable(Student a,Student b)
    {
    	if((a.total).equals(b.total))
    	{
    		if(a.s3.equals(b.s3)) {
    			if(a.s2.equals(b.s3))
    			{String[] s1=new String[3];
    			String[] s2=new String[3];
    			s1=a.dob.split("-");
    			s2=b.dob.split("-");
    			
    				if(s1[2].compareTo(s2[2])==0)
    				{
    					if(s1[1].compareTo(s2[1])==0)
    							{
    						if(s1[0].compareTo(s2[0])==0)
    						{
    							return -1;
    						}
    						else
    						{
    							return 0;
    						}
    							}
    					else if(s1[1].compareTo(s2[1])>0)
    					{
    						
    						return -1;
						}
						else
						{
							return 0;
						}
    				}
    				else if(s1[2].compareTo(s2[2])>0)
					{
						
						return -1;
					}
					else
					{
						return 0;
					}
    			}
    			else if(a.s2.compareTo(b.s2)>0) {
    				return -1;
					
				}
				else
				{
					return 1;
				}
    			
    		}
    		else if(a.s3.compareTo(b.s3)>0)
    		{
    			
    			return -1;
				
			}
			else
			{
				return 1;
			}
    	}
    	else if(a.total.compareTo(b.total)>0)
		{
			
			return -1;
			
		}
		else
		{
			return 1;
		}
    	
    }
    
}
