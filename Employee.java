package com.braindata.mode;

public class Employee
{
	int id;
	String ename;
	double salary;
	long mobileno;
	Address addr;


	public void setId(int id)
	{
	   this.id=id ;
	}
     
     public int getId()
     {
        return id;
     }


public void setEname(String ename)
	{
	   this.ename=ename; 
	}
     
     public String getEname(String ename)
     {
        return ename;
     }
   


public void setSalary(double salary)
	{
	   this.salary=salary; 
	}
     
     public double getSalary(double salary)
     {
        return salary;
     }
   

public void setMobileno(long mobileno)
	{
	   this.mobileno=mobileno; 
	}
     
     public long getMobileno(long mobileno)
     {
        return mobileno;
     }
   



public void setAddr(Address addr)
	{
	   this.addr=addr; 
	}
     
     public  Address getAddr(Address addr)
     {
        return addr;
     }
   

	
  


}