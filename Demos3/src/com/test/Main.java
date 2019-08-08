package com.test;

class Demo{   
    int count = 0;
void Second() throws Exception
{
try
{
count++;

try
{
    count++;

    try
    {
        count++;
        throw new Exception();

    }
    
    catch(Exception ex)
    {
        count++;
        throw new Exception();
    }
}

catch(Exception ex)
{
    count++;
}
}

catch(Exception ex)
{
count++;
}

}

void display()
{
System.out.println(count);
}
}
public class Main {
public static void main(String[] args) throws Exception
{
Demo obj = new Demo();
obj.Second();
obj.display();
}
}