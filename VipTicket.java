public class VipTicket extends TicketDecorator{
    public VipTicket(Ticket ticket) {
        super(ticket);
    }

    String vip(){
        return " all inclusive";
    }

    int vipCost(){
        return 50000;
    }

    @Override
    public int getCost() {
        return super.getCost() + vipCost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + vip();
    }
}
