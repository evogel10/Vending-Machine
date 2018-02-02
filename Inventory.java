public class Inventory
{
    private String item;
    private double price;
    private String container;
    private String unit;
    private double size;
    private int quantity;
    
    public Inventory()
    {
        item = "none";
        price = 0.0;
        String container = "none";
        String unit = "none";
        size = 0.0;
        quantity = 0;
    }
    
    public Inventory( String item, double price, String container, String unit, double size, int quantity )
    {
        this.item = item;
        this.price = price;
        this.container = container;
        this.unit = unit;
        this.size = size;
        this.quantity = quantity;
    }
    
    public void setItem( String item )
    {
        this.item = item;
    }
    
    public String getItem()
    {
        return item;
    }
    public void setPrice( double price )
    {
        this.price = price;
    }
    
    public double getPrice()
    {
        return price;
    }
    public void setContainer( String container )
    {
        this.container = container;
    }
    
    public String getContainer()
    {
        return container;
    }
    public void setUnit( String unit )
    {
        this.unit = unit;
    }
    
    public String getUnit()
    {
        return unit;
    }
    public void setSize( double size )
    {
        this.size = size;
    }
    
    public double getSize()
    {
        return size;
    }
    public void setQuantity( int quantity )
    {
        this.quantity = quantity;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
}