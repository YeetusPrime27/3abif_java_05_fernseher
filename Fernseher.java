public class Fernseher
{
    // attributes
    private String hersteller;
    private int zoll;
    private boolean smartTv;
    
    // constructor
    public Fernseher(String hersteller, int zoll, boolean smartTv)
    {
        setHersteller(hersteller);
        setZoll(zoll);
        setSmartTv(smartTv);
    }
    public Fernseher(String hersteller, int zoll)
    {
        setHersteller(hersteller);
        setZoll(zoll);
        setSmartTv(false);
    }
    public Fernseher(String hersteller)
    {
        setHersteller(hersteller);
        setZoll(0);
        setSmartTv(false);
    }
    public Fernseher()
    {
        setHersteller("UNKN");
        setZoll(0);
        setSmartTv(false);
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
    
    public String getLand()
    {
        int pos;
        
        pos = hersteller.indexOf(" ");
        return hersteller.substring(0,pos);
    }
    
    // setMethod
    public void setHersteller(String hersteller)
    {
        this.hersteller = hersteller;
    }
    public void setZoll(int zoll)
    {
        if ((zoll >= 20) && (zoll <= 120))
        {
            this.zoll = zoll;
        }
        else
        {
            System.out.println("Zoll Größe ungültig");
            this.zoll = 20;
        }
    }
    public void setSmartTv(boolean smartTv)
    {
        this.smartTv = smartTv;
    }
    
    // print method
    public void printFernseher()
    {
        System.out.println("Fernseher: Hersteller = " + hersteller + ", Zoll = " + zoll + ", SmartTV = " + smartTv);
    }
}