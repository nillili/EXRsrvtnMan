import bean.NormalSeatMem;
import bean.StaticSeatMem;

public class School
{


    public void viewStaticMem()
    {
        String aa[] = (new StaticSeatMem()).getA();
        System.out.println("����S["+aa[0]+"]["+aa[1]+"]");
    }
    
    public void viewMem()
    {
        String aa[] = (new NormalSeatMem()).getA();
        System.out.println("����N["+aa[0]+"]");
    }
}
