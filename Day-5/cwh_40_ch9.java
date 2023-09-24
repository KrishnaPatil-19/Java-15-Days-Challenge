package com.company;

class MyEmployee
{
    private int id;
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        this.name = n;
    }

    public void setId(int i)
    {
        this.id = i;
    }
    public int getId()
    {
        return id;
    }
}

public class cwh_40_ch9 {
    public static void main(String[] args) {
        MyEmployee ksp = new MyEmployee();
//        ksp.id = 19;
//        ksp.name = "Krishna"; ---> Throws error due to pvt access modifiers
        ksp.setName("Krishna");
        System.out.println(ksp.getName());
        ksp.setId(19);
        System.out.println(ksp.getId());
    }
}
