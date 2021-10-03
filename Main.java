public class Main {
    public static void main(String[] args) {
        Ticket ticket = new TicketDecorator((new TicketWithBaggage(new SimpleTicket())));
        System.out.println("Your ticket is: " + ticket.getDescription());
        System.out.println("Cost: " + ticket.getCost());

        Ticket ticket2 = new TicketDecorator((new VipTicket(new SimpleTicket())));

        System.out.println("Your ticket is: " + ticket2.getDescription());
        System.out.println("Cost: " + ticket2.getCost());
    }
}
