package ASSIGNMENTS;

public class student {

    public static int ar[]=new int[5];
	public int tot,pts,lab_exc,i,pct;
	public static int max=0,avg=0;
	public void initialize()
	{
	
		tot=0;
		pts=0;
	}public void calc_total(String[] s,int k) throws Exception
	{
		lab_exc=Integer.parseInt(s[1]);   //convert string to integer
	   for(i=2;i<=11;i++)
	   {
		   tot=tot+Integer.parseInt(s[i]);
	   }
	   pts=tot+lab_exc;
	   while(i<k)
	   {
		   pts+=Integer.parseInt(s[i]);
		   i++;
	   }
	   avg+=pts;                         //calculate average and maximum points
	   if(max<pts)
		   max=pts;
	}
	public char cal_grade()             //function to claculate grade
	{
		double r=((double)pts*100)/420;
		r=Math.rint(r);
		 pct=(int)r;
		if(pct>=90){
			ar[0]++;
			return 'A';
		}
		else if(pct>=78&&pct<=89)
		{
			ar[1]++;
			return 'B';
		}
		else if(pct>=62&&pct<=77)
		{
			ar[2]++;
			return 'C';
		}
		else if(pct>=46&&pct<=61)
		{
			ar[3]++;
			return 'D';
		}
		else
		{
			ar[4]++;
			return 'F';
		}
	}	


}
