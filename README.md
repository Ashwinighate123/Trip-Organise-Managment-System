# TripOrganizer

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 17.0.6.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The application will automatically reload if you change any of the source files.

# Back-End Architecture:

# POJO (Plain Old Java Object): 

 Defines the attributes related to user details, trips, and bookings.

# Repository:

Extends JpaRepository and manages database interaction with the necessary annotations like @Repository.

# Service: 

Contains business logic and uses the @Service annotation to perform operations by autowiring the repository.

# Controller: 

Uses @RestController to define endpoints for front-end interaction. It has methods for:

# GET: Retrieve all information (e.g., trip details).
# POST: Save new records (e.g., new bookings).
# PUT: Update existing records (e.g., edit bookings).
# DELETE: Delete records (e.g., cancel bookings).

# Frond End are in this link

https://github.com/Ashwinighate123/Trip-Organise-Managment-System-FrontEnd.git

![project1](https://github.com/user-attachments/assets/5a38c328-169c-4fea-b3d1-1a2cb9a43d7a)
