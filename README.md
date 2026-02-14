# Ticket Management System – Spring Boot REST API

## About the Project
This project is a simple backend application built using Spring Boot to manage support tickets.  
It allows users to create tickets, view all tickets, and update the ticket status through REST APIs.

The main goal of this project was to understand how real-world backend systems are structured and how APIs are designed and tested.

## Technologies Used
- Java
- Spring Boot
- Spring Web (REST APIs)
- H2 In-Memory Database
- Maven

## What This Application Does
- Create a new support ticket
- Fetch all existing tickets
- Update the status of a ticket (OPEN or CLOSED)
- Follows a clean Controller–Service structure

## API Endpoints

POST `/api/tickets`  
Creates a new ticket

GET `/api/tickets`  
Returns all tickets

PUT `/api/tickets/{id}/status?status=CLOSED`  
Updates the status of a ticket

## Example Request (Create Ticket)
```json
{
  "title": "Login Issue",
  "description": "User unable to login"
}
