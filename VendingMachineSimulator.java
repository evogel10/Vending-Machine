import java.util.Scanner;
import java.io.*;

public class VendingMachineSimulator
{
    private static Scanner input;
    
    public static void main( String [] args )
    {
        input = new Scanner ( System.in);
        boolean menu = true;
        
        while(menu)
        {
            System.out.println( "Welcome! Please select an option.\n"
                               + "'0' " + "Display Vending Machine Inventory\n"
                               + "'1' " + "Display Vending Machine Bank\n"
                               + "'2' " + "Purchase Item from Vending Machine\n"
                               + "'-1' " + "Exit" );
            System.out.print( "Command: " );
            int mainMenuChoice = input.nextInt();
            
            if ( mainMenuChoice == 0)
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

                    item = strArray[0];
                    price = Double.parseDouble(strArray[1]);
                    container = strArray[2];
                    unit = strArray[3];
                    size = Double.parseDouble(strArray[4]);
                    quantity = Integer.parseInt(strArray[5]);

                    Inventory inventory = new Inventory( item, price, container, unit, size, quantity );
                    
                    System.out.println( "Item: " +inventory.getItem() + "\n"
                                       + "  " + "Price: $" + inventory.getPrice() + "0" + "\n"
                                       + "  " + "Container: " + inventory.getContainer() + "\n"
                                       + "  " + "Unit: " + inventory.getUnit() + "\n"
                                       + "  " + "Size: " + inventory.getSize() + "\n"
                                       + "  " + "Quantity: " + inventory.getQuantity() );

                    }
                }
            catch (IOException e)
            {
                System.out.println( "I/O Error: " + e.getMessage() );
            }
            }
            else if ( mainMenuChoice == 1 )
            {
                MachineBank bank = new MachineBank( 1, 1, 5, 10, 20, 20, 15, 15, 15, 15 );
                
                System.out.println("Hundred Dollar Bills: " + bank.getHundredDollar() + "\n" +
                                   "Fifty Dollar Bills: " + bank.getFiftyDollar() + "\n" +
                                   "Twenty Dollar Bills: " + bank.getTwentyDollar() + "\n" +
                                   "Ten Dollar Bills: " + bank.getTenDollar() + "\n" +
                                   "Five Dollar Bills: " + bank.getFiveDollar() +  "\n"  +
                                   "One Dollar Bills: " + bank.getOneDollar() + "\n" +
                                   "Twenty Five Cent Coins: " + bank.getTwentyFiveCent() + "\n" +
                                   "Ten Cent Coins: " + bank.getTenCent() + "\n"  +
                                   "Five Cent Coins: " + bank.getFiveCent() +  "\n"  +
                                   "One Cent Coins: " + bank.getOneCent() );
            }
            else if ( mainMenuChoice == 2 )
            {
                input =  new Scanner (System.in);
                boolean itemMenu = true;
                
                while(itemMenu)
                {
                    System.out.println("Please select an item to purchase: \n" +
                                       "'0' Coke\n" + "'1' Sprite\n" + "'2' Gatorade\n" + "'3' Doritos\n" + "'4' Pretzels\n" + "'5' Snickers\n" + "'6' Butterfinger\n" );
                    System.out.println("Enter '-1' to exit." );
                    System.out.print("Command: " );
                    int itemChoice = input.nextInt();
                    
                    if( itemChoice == 0)
                    {
                        
                    }
                    else if ( itemChoice == -1)
                    {
                        itemMenu = false;
                    }
                }
            }
            else if ( mainMenuChoice == -1 )
            {
                System.out.print( "Goodbye. \n" );
                menu = false;
            }
        }
    }
}

