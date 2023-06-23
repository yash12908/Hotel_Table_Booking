import java.util.ArrayList;
import java.util.Scanner;

public class Hotel
{
    table u;
    table[]t=new table[5];
   ArrayList<table>A=new ArrayList<>();

    Scanner sc=new Scanner(System.in);
    int count=1;
    public void BookTable()
    {
        System.out.println("for how many people you want table");
        System.out.println("1:-person 2:-person ");
        switch(sc.nextInt())
        {
            case 1: {
                System.out.println("Enter the name");
                String name=sc.next();
                u= new table(name);//the data is referenece for u
               for(int i=0;i<t.length;i++)
               {
                   if(t[i]==null)
                   {
                       System.out.print("Table No :-"+i+" ");
                   }
               }
                System.out.println();
                int num=sc.nextInt();
                for(int i=0;i<t.length;i++)
                {
                    if(num==i) {
                        if (t[i] == null) {
                            t[i] = u;//the object is store in the arrayList
                            System.out.println("table is booked");
                            return;
                        }
                    else {
                        //if (t[i] != null)
                        {
                            System.out.println("table is Booked Do you want to wait");
                            System.out.println(" 1:- Yes 2:- No");
                            switch (sc.nextInt()) {
                                case 1 -> {
                                    u = new table(name);///object is store in the reference
                                    System.out.println("wait for some time");
                                    A.add(u);//which is added in the arrayList
                                    return;
                                }
                                case 2 -> {
                                    System.out.println("Sorry !");
                                    return;
                                }
                            }
                            }
                        }
                    }
                }
                break;
            }
            case 2: {
                System.out.println("Enter the name");
                String name=sc.next();
                System.out.println("Enter second person Name");
                String name1=sc.next();
                u= new table(name,name1);
                System.out.println("which table you want");
                System.out.println("Table:-0 Table:-1 Table:-2 Table:-3 Table:-4");
                int num=sc.nextInt();
                for(int i=0;i<t.length;i++)
                {
                    if(num==i)
                    {
                        if(t[i]==null)
                        {
                            t[i]=u;
                            System.out.println("table is booked");
                            return;
                        }
                        else
                        {
                            if(t[i]!=null) {
                                System.out.println("table is Booked Do you want to wait");
                                System.out.println(" 1:- Yes 2:- No");
                                switch (sc.nextInt())
                                {
                                    case 1:
                                        u=new table(name);
                                        System.out.println("wait for some time");
                                        count++;
                                        A.add(u);
                                        break;
                                    case 2:
                                        System.out.println("Sorry !");
                                        return;
                                }
                            }
                        }
                    }
                }
                break;
            }
        }

    }

    //pay bill for table
    public void payBill()
    {
        System.out.println("which table did you book");
        System.out.println("table:-0 table:-1 table:-2 table:-3  table:-4 ");
        int a=sc.nextInt();
        for(int i=0;i<t.length;i++)
        {
            if(t[i]!=null)
            {
                if(a==i)//i start from zero
                {
                    t[i]=null;//table become null
                    System.out.println("thank you for coming");
                    if(t[i]==null)
                    {
                        t[i] =A.get(i);//if any any of table is null the object is store on it..waiting guy wil be allocated with table
                        A.remove(i);//it will get removed from arraylist(waiting list)
                        break;
                    }
                }
            }

        }
//        for(int i=0;i<A.size();i++)
//        {
//            if(t[i]==null)
//            {
//                t[i]=A.get(i);//problem is is is taking from first index when it get-null
//                A.remove(i);
//            }
//        }

    }
    public void Wating_List()
    {
        for (int i=0;i<A.size();i++)
        {
            System.out.println(A.get(i).toString() + "  Token :- " + count++);
        }
        count=1;
    }
    public void table_booked_person()
    {
        int c=1;
        for(int i=0;i<t.length;i++)
        {
            if(t[i]!=null) {
                System.out.println("Table " + c + ":- " + t[i].toString());
                System.out.println("------------------------------------");
            }
            c++;
        }

    }
    public void Table_Availability()
    {
        int c=1;
        for(int i=0;i<t.length;i++)
        {
            if(t[i]==null)
            {
                System.out.println("Table :- "+c);
            }
            c++;
        }
    }
}
