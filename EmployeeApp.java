/*
* Program 4
*/
class Employee{
String employeeId;
String name;
long mobileNumber;
int age;
public void displayEmployeeDetails(){
System.out.println("Employee Id:"+employeeId);
System.out.println("Name:"+name);
System.out.println("Mobile Number:"+mobileNumber);
System.out.println("Age:"+age);
}
}
class EmployeeApp{
public static void main(String args[]){
 Employee employee=new Employee();
         employee.employeeId="A11221";
         employee.name="kumar";
         employee.mobileNumber=7864789649L;
         employee.age=25;
          employee.displayEmployeeDetails();
}
}     