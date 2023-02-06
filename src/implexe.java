import java.util.Scanner;

class implexe extends Exception {
     public implexe (String str){
        super("Exception Constructor: "+str);
    }
    static void check(int age)throws implexe {
        if(age<18)
            throw new implexe("Not Eligible to vote");
        else
            System.out.println("Eligible to vote");
    }
    
    public static void main(String [] args){
    	System.out.println("Enter the age to check: ");
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        try{
            check(n);
        }
        catch(implexe ex){
            System.out.println("catch function  " + ex);
        }
        sc.close();
    }
}