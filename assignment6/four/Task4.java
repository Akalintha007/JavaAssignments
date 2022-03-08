package assignment6.four;

/*4. Complete the previous exercise by creating objects to attach to the array of references.*/
public class Task4 {
    Task4(String arg){
        System.out.println(arg);
    }
    public static void main(String[] args) {
        Task4 arr[] = new Task4[3];
        for(int i=0; i<3; i++){
            arr[i]=new Task4("argument "+i);
    
        }
    //Created array of reference type task3 but nothing is printed when prg is executed.
    //But if we put an object inside array it prints value from contructor.
}
}
