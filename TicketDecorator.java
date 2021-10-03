public class TicketDecorator implements Ticket{

    private final Ticket ticket;

    public TicketDecorator(Ticket ticket){
        this.ticket = ticket;
    }

    @Override
    public int getCost() {
        return ticket.getCost();
    }

    @Override
    public String getDescription() {
        return ticket.getDescription();
    }
}
