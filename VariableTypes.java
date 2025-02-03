class NumericOperation
{   
    int num1=20,num2=40; //instance variable
    static int num3=10; //static variable
    public void  add()
    {
        int a=4,b=5,c=6; //local variable
        int sum=a+b+c;
         System.out.println("sum"+sum);
    }

    public void sub()
    {   
        int num5=9;
        int num6=4;
        int sub=num5-num6;
        System.out.println("substraction is:"+sub);
    }

}
public class VariableTypes
{
    public static void main(String[] args)
    {
        NumericOperation operation=new NumericOperation();
        operation.add();
        operation.sub();
        System.out.println(NumericOperation.num3); //access static variable with class name
        
    }  
}