public class Employee{

    private int employeeId;
    private String employeeName;

    /**
    * Employee constructor with no parameter
    */
    public Employee(){
        this.employeeId = 1;
        this.employeeName = "Default";
    }

    public Employee(int employeeId, String employeeName){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }
    
    public int getEmloyeeId(){
        return this.employeeId;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    
    public String getemployeeName(){
        return this.employeeName;
    }

    @Override
    public String toString(){
        return "Name: " + this.employeeName + "\nID: " + this.employeeId;
    }
}