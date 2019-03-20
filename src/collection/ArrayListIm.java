package collection;

import java.util.ArrayList;

/**
 *
 * @author Marwa
 */
public class ArrayListIm {

    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<String>();
        al.add("Apple");
        al.add("Strawberry");
        al.add("Banana");
        
        System.out.println(al.get(0));
        
        al.remove(0);
        
        for(String fruit : al){
            System.out.println(fruit);
        }
        
        // Array of Objects
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Reem", 34));
        employees.add(new Employee("Shereen", 25));
        employees.add(new Employee("Rana", 40));
        for(Employee em : employees){
            System.out.println("Name: " + em.name + "Age: " + em.age);
        }
        
    }
    
    
    static class Employee{
        String name;
        int age;
        
        public Employee(String name,int age){
            this.name = name;
            this.age = age;
        }
    }

}
