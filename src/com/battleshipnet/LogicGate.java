package com.battleshipnet;

/**
 * Created by m.zilenas on 2016-06-17.
 */
public class LogicGate
{
    public static boolean f(boolean... x)
    {
        return false;
    }

    public static boolean and(boolean... x)
    {
        return a(x)==t() ? b(x) : f();
    }

    public static boolean aandnotb(boolean... x)
    {
        return and( a(x), not(b(x)) );
    }

    private static boolean not(boolean x)
    {
        return x==t()?f():t();
    }

    public static boolean a(boolean... x)
    {
        return x[0];
    }

    public static boolean notaandb(boolean... x)
    {
        return and( not(a(x)), b(x));
    }

    public static boolean b(boolean... x)
    {
        return x[1];
    }

    public static boolean xor(boolean... x)
    {
        return and( or(x), not(and(x)) );
    }

    public static boolean or(boolean... x)
    {
        return not( and( not(a(x)), not(b(x))) );//see de morgan's law
    }

    public static boolean nor(boolean... x)
    {
        return not(or(x));
    }

    public static boolean xnor(boolean... x)//it is understandable when written nxor. See https://en.wikipedia.org/wiki/XNOR_gate
    {
        return not(xor(x));
    }

    public static boolean notb(boolean... x)
    {
        return not(b(x));
    }

    public static boolean bimpliesa(boolean... x) //A ⇒ B is true only in the case that either A is false o B is true.
    {
        return not(notaandb(x)) ;// == o( n(b(x)), a(x));
    }

    public static boolean nota(boolean... x)
    {
        return not(a(x));
    }

    public static boolean aimpliesb(boolean... x)
    {
        return not(aandnotb(x));
    }

    public static boolean nand(boolean... x)
    {
        return not( and(x) );
    }

    public static boolean t(boolean... x)
    {
        return !f();
    }
}
