package com.code.calculator;

public class Operators {
    public static void main(String[] args) {

        int a= 45+34;

        int b=45;
        int c= b%4; //not 11 ans 1
        int d= b/4;

        System.out.println(c);
        System.out.println(d);

        boolean e= a >b;
        System.out.println(e);

        int f= 4;
        int g= 4;

        boolean h= f<= g;
        System.out.println(h);

        int x=10;
        int y=9;
        int z=8;
        boolean t= x>y && y>z;
        boolean i= x==y || x>=z;
        System.out.println(t);
        System.out.println(i);

        boolean k= 3>4 && 4>3;
        System.out.println(k);
        boolean u= 3>4 & 4==4;
        System.out.println(u);

        boolean hi= true^false;
        System.out.println(hi);
        boolean hh=false^false;
        System.out.println(hh);
        boolean hhh= true^true;
        System.out.println(hhh);

        boolean o= false|true;
        System.out.println(o);
        boolean oo= false|false;
        System.out.println(oo);
        boolean ooo= true|true;
        System.out.println(ooo);

        int sh = 10<<2;
        System.out.println(sh);

        int hw= 20<<2;
        System.out.println(hw);
        int jj= 15<<4;
        System.out.println(jj);

        int rs = 10>>3;
        System.out.println(rs);
        int rs1 = 20>>2;
        System.out.println(rs1);
        int rs2= 20>>3;
        System.out.println(rs2);

        //Urnary
        int v= 45;
        v=v++; //postifx
        v--;
        --v;
        ++v; //prefix

        System.out.println(v);

        //Ternary Operators
        // condition ()? true or false

        int p =23;
        int q =78;
        int r= (p>q)? p:q;
        System.out.println(r);






    }
}

//Operators  = ;
//Operant

//Precedence  * / % + -  Arithmetic operator

//relational  or comparsion operator  < > <= >=
//instance of operator  == !=

//logical operator && ||  And Or

//Bitwise operator & Bitwise AND   ^  bitwise exclusive or
// | bitwise inclusive or
// Shift operators << left shift   >> right  >>> right shift 0 fill


//Urnary Operator
//Binary Operator
//Ternary Operator