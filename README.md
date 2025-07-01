# ContactListRoom

A simple Android application for managing a contact list. This project demonstrates modern Android development practices using **Room** for local database storage and **Jetpack Compose** for building the UI.

## Features

- Add, view, and manage contacts
- Sort contacts by different criteria
- Modern, responsive UI with Jetpack Compose
- Persistent storage using Room Database

## Tech Stack

- **Kotlin**: Main programming language
- **Jetpack Compose**: Declarative UI framework for Android
- **Room**: SQLite object mapping library for local data persistence
- **MVVM Architecture**: Clean separation of concerns

## Getting Started

1. **Clone the repository:**
   ```sh
   git clone https://github.com/parjanya-rajput/ContactListRoom.git
   ```

2. **Open in Android Studio** and let Gradle sync.

3. **Build and run** the app on an emulator or physical device.

## How It Works

- **Room** is used to store contact information locally on the device. The `ContactDatabase`, `ContactsDAO`, and related classes handle all database operations.
- **Jetpack Compose** is used for all UI components, providing a modern and reactive user interface.
- The app follows the **MVVM** (Model-View-ViewModel) pattern for better code organization and testability.
