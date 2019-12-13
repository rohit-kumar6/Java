package Class_Constrcutor;

public class Main {
    public static void main(String[] args){
        // Class file and main file is on same package we don't have to import anything here
        Bank obj = new Bank();
        obj.setBalance(0);
        obj.deposit(100);
        obj.withdraw(100);

        Bank constructor = new Bank(1234,0,"Jon","Jon@gmail.com",123);
    }
}
