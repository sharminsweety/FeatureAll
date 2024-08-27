package Class3;

public class Student {
    String name;
    int id;
    float height;

   public  Student()
    {

    }
    public  Student(String name, int id,   float height)
    {
        this.name=name;
        this.id=id;
        this.height=height;

    }

    void studentName (){
    System.out.println("student name is -"+name);
}

public void studentInfo (){
    System.out.println("\nid-"+id+"\nheight-"+ height);


}


        }
