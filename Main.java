import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList<>();

        Employee e1 = new Employee();
        Employee e2 = new Employee(2, "Sajid");
        Employee e3 = new Employee(3, "Tom");

        //out("Size of the list is now " + employees.size());
        
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        //out("Size of the list is now " + employees.size());

        
        for(Employee e: employees){
            System.out.println(e);
        }

        //out("get method");
        //ArrayList get method
        //out(employees.get(1));

        //ArrayList remove
        employees.remove(2);

        //out("index 2 is removed");

        //out("Size of the list is now " + employees.size());

        //out("updating a value");


        //method chaining
        employees.get(1).setEmployeeName("Hasan");

        
        out(employees.get(1));
            
    }


    

    public static void out(Object o){
        System.out.println(o);
    }
    
}