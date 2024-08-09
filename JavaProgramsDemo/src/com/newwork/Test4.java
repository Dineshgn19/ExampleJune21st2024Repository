package com.newwork;
class Encanp
{
    private int empid;

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getEmpid() {
        return empid;
    }

}

public class Test4
{
    public static void main(String[] args)
    {
        Encanp obj=new Encanp();
        obj.setEmpid(100);
        System.out.println(obj.getEmpid());

    }
}
