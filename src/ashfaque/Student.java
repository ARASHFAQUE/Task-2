package ashfaque;

public class Student {
    String name;
    int id;
    static String universityName;

    Student()
    {
        // This is a default constructor
        universityName = "Leading University";
    }

    Student(int id)
    {
        this.id = id;
        System.out.println("Student's ID is: " + id);
    }

    Student(String name)
    {
        this.name = name;
        System.out.println("Student's name is: " + name);
    }

    void display()
    {
        System.out.println("Name of the university is: " + universityName);
    }
}

/*
    Name: Md. Ashfaqur Rahman
    ID: 2012020129
    Section: C
    Email: cse_2012020129@lus.ac.bd
    Date: 06-08-2021
 */
