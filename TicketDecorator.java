public abstract class TicketDecorator implements Ticket{
    Ticket ticket;

    public TicketDecorator(Ticket ticket){
        this.ticket = ticket;
    }

    public abstract int getCost();

    public abstract String getDescription();
}
