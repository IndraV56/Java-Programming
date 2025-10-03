//All the OOPS concepts are used in this program(both soft and hard ways)

import java.util.*;
public class OOPS{
    public static void main(String[] args){
        BankAccount account=new SavingsAccount("Indra",3614335,20.0);
        System.out.println(account);
    }
}

//abstract class (template for others)
abstract class BankAccount{
    
    //Encapsulation
    private String name;
    private int balance;
    public String getName(){
        return this.name;
    }
    public int getBalance(){
        return this.balance;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setBalance(int n){
        this.balance=n;
    }
    
    //Constructor
    BankAccount(String str,int n){
        this.name=str;
        this.balance=n;
    }
    
    //Method Overloading
    public void deposit(int n){
        balance+=n;
        System.out.println("Deposited "+n);
        System.out.println("Money Currently in Account: "+this.balance);
    }
    public void deposit(){
        balance+=1000;
        System.out.println("Deposited 1000");
        System.out.println("Money Currently in Account: "+this.balance);
    }
    public void withdraw(int n){
        balance-=n;
        System.out.println("Withdrawn "+n);
        System.out.println("Money Currently in Account: "+this.balance);
    }
    public void showBalance(){
        System.out.println("Balance: "+this.balance);
    }
    
    //Method Overriding
    public String toString(){
        return "Name: "+this.name+" Balance: "+this.balance;
    }
    //abstract method
    public abstract void addInterest(double n);
}

//Inheritance
class SavingsAccount extends BankAccount{
    private double interest;
    public double getInterest(){
        return this.interest;
    }
    SavingsAccount(String name, int money, double interest){
        super(name,money);
        this.interest=interest;
    }
    public void addInterest(double n){
        int interestAmount=(int)(getBalance()*n/100);
        deposit(interestAmount);
        System.out.println("Added Interest of: "+interestAmount);
    }
    public String toString(){
        return "Name: "+getName()+" Balance: "+getBalance()+" Interest: "+this.interest;
    }
}
