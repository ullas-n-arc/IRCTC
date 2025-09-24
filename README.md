# IRCTC Train Booking System (Java, Console)

A simple console-based train ticket booking system inspired by IRCTC, built with Java. This project demonstrates user authentication, train search, seat booking, and ticket management using file-based persistence (JSON).

## Features

- **User Signup & Login**: Secure user registration and authentication with password hashing.
- **Train Search**: Search for trains between stations (case-insensitive).
- **Seat Booking**: View available seats and book a seat on a selected train.
- **Ticket Management**: View all your bookings, cancel tickets, and see ticket details (including Ticket ID).
- **Data Persistence**: All data (users, trains, tickets) is stored in JSON files for easy inspection and modification.

## Project Structure

```
app/
  src/main/java/ticket/booking/
    App.java                # Main entry point (console UI)
    entities/
      User.java             # User model
      Train.java            # Train model
      Ticket.java           # Ticket model
    services/
      UserBookingService.java # User and booking logic
      TrainService.java       # Train search and management
    util/
      UserServiceUtil.java    # Password hashing utilities
    localDb/
      users.json            # User data
      trains.json           # Train data
```

## How to Run

1. **Clone the repository**
   ```
   git clone https://github.com/ullas-n-arc/IRCTC
   cd IRCTC
   ```
2. **Build the project**
   ```
   ./gradlew build
   ```
3. **Run the application**
   ```
   ./gradlew run --args=''
   ```
   Or, if using an IDE, run `App.java` directly.

## Usage

- **Sign up**: Register a new user with a username and password.
- **Login**: Authenticate with your credentials.
- **Search Trains**: Enter source and destination to find available trains.
- **Book a Seat**: Select a train, view available seats, and book one. You will receive a Ticket ID.
- **Fetch Bookings**: View all your booked tickets.
- **Cancel Booking**: Cancel a ticket using its Ticket ID.

## Data Format

- **users.json**: Stores user info and their booked tickets.
- **trains.json**: Stores train info, seat availability, and station details.

## Customization
- You can add more trains or users by editing the respective JSON files in `app/src/main/java/ticket/booking/localDb/`.
- Extend the models or services to add more features (e.g., admin panel, train addition, etc).

## Dependencies
- Java 8 or higher
- Gradle
- [Jackson](https://github.com/FasterXML/jackson) for JSON serialization/deserialization

## License

This project is for educational/demo purposes. Feel free to fork and modify!

---

**Author:** Ullas N



