import java.util.Scanner;
 
class Employee {
    String name;
    float sal;
    int joinYear;
    String address;
    
}
 
class Main1 {
    public static void main(String args[]) {
 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter How many employee:");
        int k = sc.nextInt();
 
        Employee emp[] = new Employee[k];
 
        for (int i = 0; i < k; i++) {
            emp[i] = new Employee();
 
            System.out.println("Enter " + (i + 1) + " Employee data :");
 
            System.out.print("Enter employee Name :");
            emp[i].name = sc.next();
            System.out.print("Enter employee year of joining :");
            emp[i].joinYear = sc.nextInt();
            System.out.print("Enter employee salary :");
            emp[i].sal = sc.nextFloat();
            System.out.print("Enter employee address :");
            emp[i].address = sc.next();
 
 
        }
 
        System.out.println("\n\n_____________All employee details___________\n");
        System.out.println("Name     Year of joining     Address\n");
        for (int i = 0; i < k; i++) {
            System.out.println(emp[0].name + "       " + emp[i].joinYear + "                  " + emp[i].address);
 
        }
    }
 
}