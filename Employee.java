public class Employee{
public int Eid;
public String Ename;
public int Salary;
public  Employee(int eid,String ename,int sal){
Eid=eid;
Ename=ename;
Salary=sal;
}
public static void main(String args[]){
Employee e=new Employee(100,"aswin",20000);
System.out.println("eid="+e.Eid+"name="+e.Ename+"salary="+e.Salary);
}
}