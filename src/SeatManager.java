import bean.StaticSeatMem;

public class SeatManager
{
    /**
     * ÁÂ¼® ÁöÁ¤
     * @param grade
     * @param loc
     * @param name
     */
    public void setSeat(int grade, int loc, String name)
    {
        // grade 1:S, 2:A, 3:C
        String seat[] = null;
        StaticSeatMem ssm = new StaticSeatMem();

        switch (grade)
        {
            case 1:
                seat = ssm.getS(); 
                break;
            case 2:
                seat = ssm.getA();
                break;
            case 3:
                seat = ssm.getB();
                break;
        }
        seat[loc -1] = name;
        switch (grade)
        {
            case 1:
                ssm.setS(seat); 
                break;
            case 2:
                ssm.setA(seat);
                break;
            case 3:
                ssm.setB(seat);
                break;
        }
    }

    /**
     * ÁÂ¼® Ãë¼Ò
     * @param grade
     * @param loc
     * @param name
     */
    public void delSeat(int grade, int loc, String name)
    {

    }
    
    /**
     * ÁÂ¼® ¼öÁ¤
     * @param grade
     * @param loc
     * @param name
     */
    public void updateSet(int grade, int loc, String name)
    {

    }
}
