package ASSIGNMENTS;


import java.io.*;


import java.util.Arrays;
import java.util.Scanner;
public class Grading
{
	
	public static void main(String arg[]) throws Exception
	{
		File file=new File("C:\\Users\\parmar\\Documents\\HW1-data.txt");                 //reading input file
		Scanner sc=new Scanner(file);
		FileWriter fw=new FileWriter("C:\\Users\\parmar\\Output.txt");                    //creating output file
		fw.write("Stdnt_Id Ex ------- Assignments --------- Tot Mi Fin CL Pts Pct Gr");
		fw.write("\r\n");
		fw.write("-------- -- ----------------------------- --- -- --- -- --- --- --");
		fw.write("\r\n");
		student s=new student();                                                          //creating object of student class
		Arrays.fill(s.ar, 0);
	while(sc.hasNextLine())
	{
		
		String str=sc.nextLine();
	String k = str.replaceAll("( )+", " ");
		 String p[]=k.split(" ");       //space acts as a seperator
		 fw.write(p[0]);
		 fw.write(' ');
		 fw.write(p[1]);
		
		s.initialize();                //writing various parameters to file
		fw.write(' ');
		int i=2;
		int l=p.length;
		s.calc_total(p,l);
		while(i<=11)
		{
			p[i]=String.format("%2s",p[i]);
			fw.write(p[i]);
			fw.write(' ');
			i++;
		}
	String a=Integer.toString(s.tot);            //integer to string conversion
    a=String.format("%3s", a);
    fw.write(a);
		while(i<(p.length))
		{
			fw.write(' ');
			if(i==13) {                            
			a=String.format("%3s",p[i]);
			fw.write(a);}
			else
			{
				a=String.format("%2s",p[i]);
				fw.write(a);	
			}
			i++;
		}
		fw.write(' ');
		a=Integer.toString(s.pts);
		a=String.format("%3s",s.pts);
		fw.write(a);
		char b=s.cal_grade();    //grade function in student class
		  fw.write(' ');
	  
	    a=Integer.toString(s.pct);
	    a=String.format("%3s",a);
        fw.write(a);
	    fw.write(' ');
	    fw.write(b);
	    fw.write("\r\n");
	}
	     s.avg=((s.avg)/50);
	    fw.write("Average total point percent of all students:"+s.avg+"\r\n" );           //displaying  averages
	    fw.write("Number of A's="+s.ar[0]+"\r\n");
	    fw.write("Number of B's="+s.ar[1]+"\r\n");
	    fw.write("Number of C's="+s.ar[2]+"\r\n");
	    fw.write("Number of D's="+s.ar[3]+"\r\n");
	    fw.write("Number of F's="+s.ar[4]+"\r\n");
	    fw.write("\r\n"+"Maximum points="+s.max);
	    sc.close();
		fw.close();
		System.out.println("File Created....!!!");
	
	}

	}

