package com.copy;

/**
 * Created by sande on 26-11-2022.
 */
public class ObjectCopy {
    public static void main(String[] args) {
        Arg arg=new Arg(10,"arg");
        A a=new A(1,2,"ex",arg);
        A a2=new A();
        a2=a;

        System.out.println(a2.i+" "+a2.j+" "+a2.str+" "+a2.arg);
    }
}

class A{
    int i;
    int j;
    String str;
    Arg arg;

    public A() {
    }

    public A(int i, int j, String str,Arg arg) {
        this.i = i;
        this.j = j;
        this.str = str;
        this.arg=arg;
    }
}

class Arg{
    int h;
    String msg;

    public Arg(int h,String msg) {
        this.h=h;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Arg{" +
                "h=" + h +
                ", msg='" + msg + '\'' +
                '}';
    }
}