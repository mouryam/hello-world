import java.util.Scanner;
public class Hello {
public static void main(String[] args){     
    Scanner input = new Scanner(System.in); 
    
     int count;
        for (count =1; count >= 1;count++){

System.out.print("Please enter your name");
String name = input.next();
System.out.print("Please enter your gender (M/F)");
char gender = input.next().charAt(0);
System.out.print("Please enter your marital status (S/M/D/W)");
char marital_status = input.next().charAt(0);
System.out.print("Please enter your age");
int age = input.nextInt();
System.out.print("Please enter your taxable income");
double income = input.nextDouble();

String name_prefix;
double tax_amount;

if (gender == 'M'){
    name_prefix = age <= 18 ? "Master." : "Mr.";
}
else {
    name_prefix = marital_status == 'M' ? "Mrs." : "Ms.";
}
switch (marital_status)
{
case 'M':
    if (income <= 8500)
    {
        tax_amount = 0;
        System.out.println(name_prefix + " " + name + ", based on the income you provided, you owe no tax for the fiscal year 2016.");
    }
    else 
    {
        if (income < 24000){
            tax_amount = .01 * income;}
        else{
            tax_amount = .025 * income;}
        System.out.println(name_prefix + " " + name + ", based on the income you provided, you owe a tax amount of $" + tax_amount + "for the fiscal year 2016");
        }
    break;
case 'S':
    if (income <= 8500){
        tax_amount = 0;
        System.out.println(name_prefix + " " + name + ", based on the income you provided, you owe no tax for the fiscal year 2016");
    }
    else {
        if (income < 24000){
            tax_amount = .015 * income;}
        else{
            tax_amount = .034 * income;}
        System.out.println(name_prefix + " " + name + ", based on the income you provided, you owe a tax amount of $" + tax_amount + "for the fiscal year 2016");
    }
    break;
case 'D':
    if (income <=8500){
        tax_amount = 0;
        System.out.println(name_prefix + " " + name + ", based on the income you provided, you owe no tax for the fiscal year 2016");
    }
    else { 
        if (income < 24000){
            tax_amount = .01 * income;}
        else{
            tax_amount = .025 * income;}
        System.out.println(name_prefix + " " + name + ", based on the income you provided, you owe a tax amount of $" + tax_amount + "for the fiscal year 2016");
        }
    break;
case 'W':
    if (income <=8500){
        tax_amount = 0;
        System.out.println(name_prefix + " " + name + ", based on the income you provided, you owe no tax for the fiscal year 2016");
    }
    else {
        if (income < 24000){
            tax_amount = .015 * income;}
        else{
            tax_amount = .034 * income;}
        System.out.println(name_prefix + " " + name + ", based on the income you provided, you owe a tax amount of $" + tax_amount + "for the fiscal year 2016");
        }
    default: System.out.print("Sorry, our systems are unable to calculate your tax at this time.");
    }
System.out.println("Thank you! Please enter 'again' if you would like to start again");
        
    } 
        input.close();
    }
}