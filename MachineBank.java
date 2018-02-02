public class MachineBank
{
    private int hundredDollar;
    private int fiftyDollar;
    private int twentyDollar;
    private int tenDollar;
    private int fiveDollar;
    private int oneDollar;
    private int twentyFiveCent;
    private int tenCent;
    private int fiveCent;
    private int oneCent;
    
    public MachineBank()
    {
        hundredDollar = 0;
        fiftyDollar = 0;
        twentyDollar = 0;
        tenDollar = 0;
        fiveDollar = 0;
        oneDollar = 0;
        twentyFiveCent = 0;
        tenCent = 0;
        fiveCent = 0;
        oneCent = 0;
    }
    
    public MachineBank(int hundredDollar, int fiftyDollar,
                       int twentyDollar, int tenDollar,
                       int fiveDollar, int oneDollar,
                       int twentyFiveCent, int tenCent,
                       int fiveCent, int oneCent )
    {
        this.hundredDollar = hundredDollar;
        this.twentyDollar = twentyDollar;
        this.fiftyDollar = fiftyDollar;
        this.tenDollar = tenDollar;
        this.fiveDollar = fiveDollar;
        this.oneDollar = oneDollar;
        this.twentyFiveCent = twentyFiveCent;
        this.tenCent = tenCent;
        this.fiveCent = fiveCent;
        this.oneCent = oneCent;
    }
    public void setHundredDollar( int hundredDollar )
    {
        this.hundredDollar = hundredDollar;
    }
    
    public int getHundredDollar()
    {
        return hundredDollar;
    }
    
    public void setFiftyDollar( int fiftyDollar )
    {
        this.fiftyDollar = fiftyDollar;
    }
    
    public int getFiftyDollar()
    {
        return fiftyDollar;
    }
    
    public void setTwentyDollar( int twentyDollar )
    {
        this.twentyDollar = twentyDollar;
    }
    
    public int getTwentyDollar()
    {
        return twentyDollar;
    }
    
    public void setTenDollar( int tenDollar )
    {
        this.tenDollar = tenDollar;
    }
    
    public int getTenDollar()
    {
        return tenDollar;
    }
    
    public void setFiveDollar( int fiveDollar )
    {
        this.fiveDollar = fiveDollar;
    }
    
    public int getFiveDollar()
    {
        return fiveDollar;
    }
    
    public void setOneDollar( int oneDollar )
    {
        this.oneDollar = oneDollar;
    }
    
    public int getOneDollar()
    {
        return oneDollar;
    }
    
    public void setTwentyFiveCent( int twentyFiveCent )
    {
        this.twentyFiveCent = twentyFiveCent;
    }
    
    public int getTwentyFiveCent()
    {
        return twentyFiveCent;
    }
    
    public void setTenCent( int tenCent )
    {
        this.tenCent = tenCent;
    }
    
    public int getTenCent()
    {
        return tenCent;
    }
    
    public void setFiveCent( int fiveCent )
    {
        this.fiveCent = fiveCent;
    }
    
    public int getFiveCent()
    {
        return fiveCent;
    }
    
    public void setOneCent( int oneCent )
    {
        this.oneCent = oneCent;
    }
    
    public int getOneCent()
    {
        return oneCent;
    }
}