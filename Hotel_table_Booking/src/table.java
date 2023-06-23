public class table
{
    String user1;
    String user2;

    public table(String user1 ) {
        this.user1 = user1;

    }
    public table(String user1, String user2) {
        this.user1 = user1;
        this.user2 = user2;
    }
    public String toString()
    {

        return user1+" ";
    }
}
