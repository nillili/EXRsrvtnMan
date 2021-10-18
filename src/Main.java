import java.util.ArrayList;
import java.util.Iterator;

import bean.NormalSeatMem;
import bean.StaticSeatMem;

public class Main
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {

    }
    
    public void diffMem()
    {
        String aa[] = {"1","2"};
        School schl = new School();
        
        StaticSeatMem ssm = new StaticSeatMem();
        ssm.setA(aa);
        
        schl.viewStaticMem();
        
        
        NormalSeatMem nsm = new NormalSeatMem();
        nsm.setA(aa);
        
        schl.viewMem();
        
    }

}
