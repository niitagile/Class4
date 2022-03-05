package GarbageCollectorExamples;
class Student{
    // method of object class. it invokes by GC before releasing the memory of an object
    protected void finalize(){
        System.out.println("object is garbage collected");
    }
}
public class Example1 {

    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student();
        s=null;
        s1=null;
        System.gc();

    }
}
