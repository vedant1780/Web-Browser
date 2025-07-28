# Java Socket Communication Demo 🚀

A lightweight client-server application built in Java to demonstrate socket-based communication using multithreading. This project provides a simple framework for sending and receiving messages across a local network using TCP sockets.

## 📌 Features

- Multithreaded server implementation for handling concurrent clients
- Clean and readable code structure with modular design
- Proper resource handling and timeout configuration
- Example of `Runnable` and `Consumer` usage with threads
- Bi-directional message exchange (Hello handshake)

## 🧠 Technologies Used

- Java 8+
- TCP Sockets (`java.net.Socket`, `java.net.ServerSocket`)
- I/O Streams (`BufferedReader`, `PrintWriter`)
- Functional interfaces (`Runnable`, `Consumer`)
- Threads and basic concurrency concepts

## 💡 How It Works

1. **Server** listens on port `8010` and handles each client in a new thread.
2. **Client** connects to `localhost:8010`, sends a greeting message, and awaits a response.
3. Upon successful connection, both sides exchange messages and terminate gracefully.

## 📂 Project Structure
  Web Browser/
      Single Threaded/
          Client.java
          Server.java
      Multi Threaded/
          Client.java
          Server.java

## 🚦 Getting Started

### Run the Server

```bash
javac Server.java
java Server
javac Client.java
java Client
