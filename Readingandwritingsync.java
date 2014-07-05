//Preference is given to the writing process
import java.io.*;
import java.util.*;

public class ReaderWriter4
{
	public static void main(String args[])throws IOException
	{
		Scanner reader=new Scanner (System.in);
		int value1;
		int value2;
		//int counter=1;
	    Database r = new Database();
		Writer F = new Writer(r,"F");
		Writer G = new Writer(r,"G");
		Reader A = new Reader(r, "A");
		Reader B = new Reader(r, "B");
		Writer H = new Writer(r, "H");
		Reader C = new Reader(r, "C");
		Writer I= new Writer(r, "I");
		Reader D= new Reader(r, "D");
		Writer J= new Writer(r, "J");
		Reader E= new Reader(r, "E");
		System.out.println("Starting...\n");
		System.out.println("Please input two integer variables, seperately spaced, making sure that the"
		+"Number is no higher than 5 for each");
		value1=reader.nextInt();
		value2=reader.nextInt();
		System.out.println("Value1 is read as " +value1);
		System.out.println("Value2 is read as "+value2);
		while(value1 <0 || value2 <0 || value1==0 && value2==0 || value1>5 || value2>5)
		{
		System.out.println("Invalid, please enter in numbers that are greater than 0 or enter in" +
				"at least one number that is one and the other being zero");
		value1=reader.nextInt();
		value2=reader.nextInt();
		}
		if (value1==0&&value2==1)
		{
		F.run();
		}
		if (value1==0&&value2==2)
		{
			F.run();
			G.run();
		}
		if (value1==0&&value2==3)
		{
			F.run();
			G.run();
			H.run();
		}
		if (value1==0&&value2==4)
		{
			F.run();
			G.run();
			H.run();
			I.run();	
		}
		if (value1==0&&value2==5)
		{
			F.run();
			G.run();
			H.run();
			I.run();
			J.run();	
		}
		if (value1==1&&value2==1)
		{
		F.run();
		A.start();
		}
		if (value1==1&&value2==2)
		{
		F.run();
		G.run();
		A.start();
		}
		if (value1==1&&value2==3)
		{
		F.run();
		G.run();
		H.run();
		A.start();
		}
		if (value1==1&&value2==4)
		{
		F.run();
		G.run();
		H.run();
		I.run();
		A.start();
		}
		if (value1==1&&value2==5)
		{
		F.run();
		G.run();
		H.run();
		I.run();
		J.run();
		A.start();
		}
		if(value1==2&&value2==1)
		{
		F.run();
		A.start();
		B.start();
		}
		if(value1==2&&value2==2)
		{
		F.run();
		G.run();
		A.start();
		B.start();
		}
		if(value1==2&&value2==3)
		{
		F.run();
		G.run();
		H.run();
		A.start();
		B.start();
		}
		if(value1==2&&value2==4)
		{
		F.run();
		G.run();
		H.run();
		I.run();
		A.start();
		B.start();
		}
		if(value1==2&&value2==5)
		{
		F.run();
		G.run();
		H.run();
		I.run();
		J.run();
		A.start();
		B.start();
		}
		if(value1==3&&value2==1)
		{
		F.run();
		A.start();
		B.start();
		C.start();
		}
		if(value1==3&&value2==2)
		{
		F.run();
		G.run();
		A.start();
		B.start();
		C.start();
		}
		if(value1==3&&value2==3)
		{
		F.run();
		G.run();
		H.run();
		A.start();
		B.start();
		C.start();
		}
		if(value1==3&&value2==4)
		{
		F.run();
		G.run();
		H.run();
		I.run();
		A.start();
		B.start();
		C.start();
		}
		if(value1==3&&value2==5)
		{
		F.run();
		G.run();
		H.run();
		I.run();
		J.run();
		A.start();
		B.start();
		C.start();
		}
		if(value1==4&&value2==1)
		{
		F.run();
		A.start();
		B.start();
		C.start();
		D.start();
		}
		if(value1==4&&value2==2)
		{
		F.run();
		G.run();
		A.start();
		B.start();
		C.start();
		D.start();
		}
		if(value1==4&&value2==3)
		{
		F.run();
		G.run();
		H.run();
		A.start();
		B.start();
		C.start();
		D.start();
		}
		if(value1==4&&value2==4)
		{
		F.run();
		G.run();
		H.run();
		I.run();
		A.start();
		B.start();
		C.start();
		D.start();
		}
		if(value1==4&&value2==5)
		{
		F.run();
		G.run();
		H.run();
		I.run();
		J.run();
		A.start();
		B.start();
		C.start();
		D.start();
		}
		if(value1==5&&value2==1)
		{
		F.run();
		A.start();
		B.start();
		C.start();
		D.start();
		E.start();
		}
		if(value1==5&&value2==2)
		{
		F.run();
		G.run();
		A.start();
		B.start();
		C.start();
		D.start();
		E.start();
		}
		if(value1==5&&value2==3)
		{
		F.run();
		G.run();
		H.run();
		A.start();
		B.start();
		C.start();
		D.start();
		E.start();
		}
		if(value1==5&&value2==4)
		{
		F.run();
		G.run();
		H.run();
		I.run();
		A.start();
		B.start();
		C.start();
		D.start();
		E.start();
		}
		if(value1==5&&value2==5)
		{
		F.run();
		G.run();
		H.run();
		I.run();
		J.run();
		A.start();
		B.start();
		C.start();
		D.start();
		E.start();
		}
		}
}
class Writer extends Thread
{
	private Database r;
	private String name;
	//constructor
	public Writer(Database r, String name) 
	{
      this.r = r;
		this.name = name;
	}
	//will produce integers from 0 to 9
	public void run()
	{
	Random randomNumbers = new Random();
	int i;	
		i= randomNumbers.nextInt(10);
			r.setBuf(i);
			System.out.println("Writer "+ name + " set buffer to "+i);
			//sleep for random amount of time
			try
			{
				sleep ((int)(Math.random()*1000));
			}
			catch(InterruptedException e){ }
	}//run
}
class Reader extends Thread
{
	private Database r;
	private String name;
	//constructor
	public Reader(Database r, String name)
	{
      this.r = r;
		this.name = name;
	}
	//will  retrieve integers from 0 to 9
	public void run()
	{
		int val = r.getBuf();
		val=r.getBuf();
		System.out.println("Reader " + name + " retrieved "+val);
		while (val != 9)
		{	
            //sleep for random amount of time
			try
			{
				sleep ((int)(Math.random()*1000));
			}
			catch(InterruptedException e){ }
			val = 9;
			//val = r.getBuf();
	    	//System.out.println("Reader " + name + " retrieved "+val);
		}//while
	}//run
}

class Database
{	private int val=0;
	Monitor m = new Monitor();			
		 
	  
	public void setBuf(int val)
	{
	   m.startWrite();
		this.val=val;
		m.stopWrite();
	}
	
	public Integer getBuf()
	{
	   int x;
		
	   m.startRead();
		 x = val;
		m.stopRead();
		
		return x;
	}
	
}
//  a monitor class for Reader/Writer problem
class Monitor
{	
	private boolean writing = false;
	private int readers = 0; //#of reader threads currently reading
	private int waitingWriters = 0;//#of writing threads currently waiting.
	
   synchronized void startWrite()
	{ // Preference is given to waiting writers
	  // Wait unti it is ok to write
	  
	  try {
	        while ( readers > 0 || writing)
	        {
	         waitingWriters++;
		      wait();
		      waitingWriters--;
           }//while
	        writing = true;
		  }catch (InterruptedException ie)
		   {
			  waitingWriters--;
			}
		   
	 }
	 
	 synchronized void stopWrite()
	 {
	   writing = false;
		notifyAll();
	 }
	 
	 synchronized void startRead() 
	 {
	 
	   try {

	       //Wait unti it is ok to read
		     while ( writing ||  waitingWriters > 0)
		       wait();
			
		     readers++;
			 }
			 catch (InterruptedException ie){ }
		    
	  }

	  synchronized void stopRead()
	  {
	    readers--;
		 if ( readers == 0) 
		   notifyAll();
	  }
			
}
