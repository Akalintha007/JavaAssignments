package assignment8;

public class New {
    public static void exception(String arg){
        int a= 5;
        int b = 2;
        
        try{
            if(arg.equals("Asish")){
                throw new NameException("Name should be Asish");
            }
            System.out.println("Hi "+arg);
            
            if(b==1){throw new DivideByOne();}
            System.out.println(a/b);

        }
        catch(NameException e){
            System.out.println(e.getMessage());
        }
        catch(DivideByOne e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer Exception");
        }
        finally{
            System.out.println("This will execute no matter what");
        }
    }
    public static void main(String[] args){
        exception(null);
    }
}
