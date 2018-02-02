import java.io.*;

public class VendingMachine
{
    public static void main( String [] args ) throws IOException
    {
        try ( Reader reader = new FileReader(args[0]); BufferedReader br = new BufferedReader(reader))
        {
            String venMachInv;
            String item = "";
            double price = 0.0;
            String container = "";
            String unit = "";
            double size = 0.0;
            int quantity = 0;
            for ( int i = 0 ; i < 7 ; i++ )
            {
                venMachInv = br.readLine();
                String[] strArray = venMachInv.split(",");
                if( item.equals(strArray[0]) )
                {
                    price = Double.parseDouble(strArray[1]);
                    container = strArray[2];
                    unit = strArray[3];
                    size = Double.parseDouble(strArray[4]);
                    quantity = Integer.parseInt(strArray[5]);
                }
                else
                {
                    if( !item.equals(""))
                    {
                        System.out.println( item + "    " +
                                           price + "    " +
                                           container + "    " +
                                           unit + "    " +
                                           size + "    " +
                                           quantity );
                        
                    }
                    item = strArray[0];
                    price = Double.parseDouble(strArray[1]);
                    container = strArray[2];
                    unit = strArray[3];
                    size = Double.parseDouble(strArray[4]);
                    quantity = Integer.parseInt(strArray[5]);
                }
            }
            System.out.println( item + "    " +
                               price + "    " +
                               container + "    " +
                               unit + "    " +
                               size + "    " +
                               quantity );
            
        }
        catch (FileNotFoundException e)
        {
            System.out.println( "I/O Error: " + e.getMessage() );
        }
    }
}