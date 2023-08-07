public class genericClass {
    public class Student<T extends Number>
    {
        T arr[];
        Student(T arr[])
        {
            this.arr=arr;
        }
        
    }
    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,5};
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i].doubleValue());
        }
        Integer x=2; //not int x=2;
        System.out.println(x.doubleValue());
    }
}
