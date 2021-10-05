public class TicketWithBaggage extends TicketDecorator{
    public TicketWithBaggage(Ticket ticket) {
        super(ticket);
    }

    String baggage(){
        return " with baggage";
    }

    int baggageCost(){
        return 5000;
    }

    @Override
    public int getCost() {
        return ticket.getCost() + baggageCost();
    }

    @Override
    public String getDescription() {
        return ticket.getDescription() + baggage();
    }
}
