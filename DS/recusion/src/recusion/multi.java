package recusion;

public class multi {
    public static void main(String [] args) 
	{
    	int i=10;
        fun(i);
	}
    
    static void fun(int x)
    {
    	if(x>0)
    	{
    		x=x-1;
    		fun(x);
    		int multi=0;
    		int i=0;
    		for(i= x;i<11;i++)
    			{   multi= 2*i;
    			System.out.println("2 * "+i+"= "+multi);
    		    }
    	}
    }
}
