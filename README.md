# TimesTables

## Description
`TimesTables` is a command-line interface (CLI) application written in Java that generates 5 random multiplication table questions. The questions cover times tables from 1 through 12. At the end of the test, the user receives a score and feedback on which questions were answered incorrectly.

## Features
- Generates 5 random multiplication questions.
- Accepts only integer answers.
- Provides feedback on the correctness of the answers.
- Displays the final score and lists the incorrect questions.

## Getting Started

### Prerequisites
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) (Version 8 or higher) installed on your machine.
- Make sure you have [Git](https://git-scm.com/) installed on your machine.
- A command-line interface to run the Java application.

### Installation

1. Clone the repository to your local machine:
    ```sh
    git clone https://github.com/jdrome/TimesTablesCLIApplication.git TimesTables
    ```

2. Navigate to the project directory:
    ```sh
    cd TimesTables
    ```

### Running the Program

1. Compile the `TimesTables.java` file:
    ```sh
    javac TimesTables.java
    ```

2. Run the compiled Java program:
    ```sh
    java TimesTables
    ```

### Usage
1. The program will prompt you for your name.
2. After entering your name, you will receive instructions on how to take the test.
3. You will be asked if you are ready to start the test. Type `Y` to begin or `N` to exit.
4. Answer each of the 5 randomly generated multiplication questions by typing integer values.
5. At the end of the test, you will see your score and a list of the questions you answered incorrectly.

### Example
Hello, my name is Robo-bert. I will be the proctor for your exam today.
What's your name?
John

---
Hello, John! It is nice to meet you!

Today we are going to do a mini math test.
I will ask you 5 math questions, and at the end,
I will tell you how you did.

For each question, you should only answer with integer values (1, 2, 3, etc.).

Decimal values, letters, spaces, and special characters will not be accepted

Are you ready to start your practice session? (Type Y for yes or N for no): Y

---
Great! Let's get started!

---
5 X 7 = 35

---
9 X 6 = 54

---
12 X 12 = 144

---
8 X 3 = 24

---
4 X 10 = 40

---
You got 5 questions correct out of 5.
Congratulations, you got 100%

## Contributing
1. Fork the repository.
2. Create a new branch: `git checkout -b feature-branch-name`.
3. Make your changes and commit them: `git commit -m 'Add some feature'`.
4. Push to the branch: `git push origin feature-branch-name`.
5. Open a pull request.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

## Acknowledgements
- Created by Jose Romero
- Date: Mar 23, 2024
