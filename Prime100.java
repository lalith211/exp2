package lalith;

public class Prime100 {

	public static void main(String[] args) {

		
		int i,j,k=0;
		for(i=2;k<=100;i++)
		{
			int c=0;
			for(j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					c=c+1;
				}
			}
			if(c<=2)
			{
				k=k+1;
			}
			if(k<=100 && c<=2)
			{
				System.out.println("sno:"+k);
				System.out.println("="+i);
			}
			
		}
	}

}
