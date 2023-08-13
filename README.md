# Java Quiz Application

The Java Quiz Application is a console-based quiz game where users can answer multiple-choice questions and receive a score based on their answers.

## Features

- Allows the user to answer a set of multiple-choice questions.
- Provides feedback on whether the user's answer is correct or incorrect.
- Displays the final score after completing all the questions.

## Getting Started

1. Clone this repository to your local machine.
2. Open the project in your preferred Java development environment.

## Adding Questions

To add more questions to the quiz, you can follow these steps:

1. Open the `QuizApplication.java` file.
2. In the `main` method, locate the section labeled "Add questions to the quiz (10 to 15 questions)".
3. Create a new `ArrayList` of options for the question.
4. Add the possible options to the `ArrayList`.
5. Create a new `Question` object with the question text, options `ArrayList`, and the index of the correct option.
6. Add the newly created question to the `quiz` object using the `addQuestion` method.

```java
ArrayList<String> options = new ArrayList<>();
options.add("Option A");
options.add("Option B");
options.add("Option C");
options.add("Option D");
Question question = new Question("What is your question?", options, 2); // Correct option index is 2
quiz.addQuestion(question);
