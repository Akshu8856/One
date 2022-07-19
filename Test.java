public class Test
{
	public static void main(String args[])
	{

        Address a = new Address();
        a.setAreanme("Shankhar nagar");
        a.setCityname("Nagpur");

        Employee e = new Employee();
        e.setID(1);
        e.setEname("Saurabh");
        e.setSalary(12000);
        e.Mobileno(93590);
        e.setAddr(a);

        System.out.println(e.getId());
        System.out.println(e.getEname());
        System.out.println(e.Salary());
        System.out.println(e.getMobileno());
        System.out.println(e.getAddress().getAreaname());
        System.out.println(e.getAddress().getCityname());





	}


}