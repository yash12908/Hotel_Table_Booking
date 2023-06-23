
public class DriveHotel
{
    public static void main(String[]args)
    {
        Hotel h=new Hotel();
        for(;;)
        {
            System.out.println("1 :- Book Hotel  2:- Payment 3:- Wating List 4:- Booked table 5:- Table_Availability() 6:-exit");
            switch (h.sc.nextInt())
            {
                case 1:
                    h.BookTable();
                    break;
                case 2:
                    h.payBill();
                    break;
                case 3:
                    h.Wating_List();
                    break;
                case 4:
                    h.table_booked_person();
                   break;
                case 5:
                    h.Table_Availability();
                    break;
                case 6:
                    return;
            }
        }
    }
}
