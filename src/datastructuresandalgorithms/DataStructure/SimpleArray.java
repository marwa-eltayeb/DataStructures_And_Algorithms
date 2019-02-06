package datastructuresandalgorithms.DataStructure;

public class SimpleArray {
    
    public static void main(String[] args) {
       
        //One Dimension Array
        int[] number = new int[5];
        number[0]=11;
        number[1]=2;
        number[2]=4;
        number[3]=42;
        number[4]=12;
        System.out.println("One Dimension Array");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + "\t");
        }
        
        System.out.println();
        
        //Array of Objects
        System.out.println("\nObject Array");
        Student[] students = new Student[3];
        students[0]= new Student("Ali",1);
        students[1]= new Student("Mona",2);
        students[2]= new Student("Hala",3);
        for (Student student : students) {
            System.out.println("name: " + student.name + " ,id: " + student.id);
        }
        
        System.out.println();
        
        //Two Dimension Array
        System.out.println("Two Dimension Array");
        int[][] data  = new int[3][3];
        data[0][0] = 14;
        data[0][1] = 1;
        data[0][2] = 5;
        data[1][0] = 8;
        data[1][1] = 34;
        data[1][2] = 23;
        data[2][0] = 7;
        data[2][1] = 55;
        data[2][2] = 98;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i==j)
                System.out.print(data[i][j] + "\t");  
            }
            System.out.print("\n");  
        }
    }
     
}
