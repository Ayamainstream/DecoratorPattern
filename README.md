# Decorator Pattern
This is an example of booking a plane ticket. My example shows how a ticket can be decorated with a cost. 
For example, if a person needs a ticket with baggage and a VIP seat, then classes inside each other will be used. For this, the TicketDecorator class will be used.
## Code 
### Example 1
```java
Ticket ticket = new TicketWithBaggage(new SimpleTicket());
System.out.println("Your ticket is: " + ticket.getDescription());
System.out.println("Cost: " + ticket.getCost());
```
### Output
```bash
Your ticket is: Ticket with baggage
Cost: 25000
```
### Example 2
```java
Ticket ticket2 = new VipTicket(new SimpleTicket());
System.out.println("Your ticket is: " + ticket2.getDescription());
System.out.println("Cost: " + ticket2.getCost());
```
### Output
```bash
Your ticket is: Ticket all inclusive
Cost: 70000
```
