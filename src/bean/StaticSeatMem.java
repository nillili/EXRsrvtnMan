package bean;

public class StaticSeatMem
{
    static String s[] = {"__","__","__","__","__","__","__","__","__","__"} ;
    static String a[] = {"__","__","__","__","__","__","__","__","__","__"} ;
    static String b[] = {"__","__","__","__","__","__","__","__","__","__"} ;
    
    public static String[] getS()
    {
        return s;
    }
    public static void setS(String[] s)
    {
        StaticSeatMem.s = s;
    }
    public static String[] getA()
    {
        return a;
    }
    public static void setA(String[] a)
    {
        StaticSeatMem.a = a;
    }
    public static String[] getB()
    {
        return b;
    }
    public static void setB(String[] b)
    {
        StaticSeatMem.b = b;
    }
    
    
}
