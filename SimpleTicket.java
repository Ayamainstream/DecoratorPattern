public class SimpleTicket implements Ticket{
    @Override
    public int getCost() {
        return 20000;
    }

    @Override
    public String getDescription() {
        return "Ticket";
    }
}
