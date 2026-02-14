package com.bhasker.ticketmanagementsystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bhasker.ticketmanagementsystem.model.Ticket;

@Service
public class TicketService {

    private List<Ticket> tickets = new ArrayList<>();
    private Long counter = 1L;

    public Ticket createTicket(Ticket ticket) {
        ticket.setId(counter++);
        ticket.setStatus("OPEN");
        tickets.add(ticket);
        return ticket;
    }

    public List<Ticket> getAllTickets() {
        return tickets;
    }
    public Ticket updateStatus(Long id, String status) {
        for (Ticket ticket : tickets) {
            if (ticket.getId().equals(id)) {
                ticket.setStatus(status);
                return ticket;
            }
        }
        return null;
    }

}
