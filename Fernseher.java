public class Fernseher
{
    // attributes
    private String hersteller;
    private int zoll;
    private boolean smartTv;
    
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
        zoll = newZoll;
    }
    public void setSmartTv(boolean newSmartTv)
    {
        smartTv = newSmartTv;
    }
}