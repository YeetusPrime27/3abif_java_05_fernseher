public class Fernseher
{
    // attributes
    private String hersteller;
    private int zoll;
    private boolean smartTv;
    
    // constructor
    public Fernseher()
    {
        setHersteller("UNKN");
        setZoll(0);
        setSmartTv(false);
    }
    public Fernseher(String newHersteller, int newZoll, boolean newSmartTv)
    {
        setHersteller(newHersteller);
        setZoll(newZoll);
        setSmartTv(newSmartTv);
    }
    
    // getMethod
    public String getHersteller()
    {
        return hersteller;
    }
    public int getZoll()
    {
        return zoll;
    }
    public boolean getSmartTv()
    {
        return smartTv;
    }
    
    // setMethod
    public void setHersteller(String newHersteller)
    {
        hersteller = newHersteller;
    }
    public void setZoll(int newZoll)
    {
        if ((newZoll >= 20) && (newZoll <= 120))
        {
            zoll = newZoll;
        }
        else
        {
            System.out.println("Zoll Größe ungültig");
            zoll = 20;
        }
    }
    public void setSmartTv(boolean newSmartTv)
    {
        smartTv = newSmartTv;
    }
    
    // print method
    public void printFernseher()
    {
        System.out.println("Fernseher: Hersteller = " + hersteller + ", Zoll = " + zoll + ", SmartTV = " + smartTv);
    }
}