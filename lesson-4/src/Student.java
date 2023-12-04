public class Student {
    String name;
    int rollNumber;
     int grade;

    public Student(String name,int rollNumber,int grade){
        this.name= name;
        this.rollNumber = rollNumber;
        this.grade = grade;

    }

  public static void main(String[]args){
        Student student  = new Student("Elmin",3,5);
      System.out.println("Student's grade is: " +student.grade);

      ////

  }



    }

