# Rectangles That Intersect

## About the Problem

Considering two rectangles in a discrete grid (like pixels in a display), each defined by two points, return true if they intersect, false otherwise.

**Note**: the points are included in the rectangle and have a dimension of 1 unit, the rectangle (0,0;1,1) have an area of 4 units.

## How to run this Code

> **Note:** All commands are considering this folder as a reference

> **Dependencies:** To run this code you will need a JDK or a JRE installed.

The binaries files are already compiled for you. So you just need to run the following command on your terminal:

```bash
    cd bin/ && java App
```

This will open the binaries folder and execute the app.

As an extra you can run the tests in this project by running the following command:

**TODO: Add Test class here**

```bash
    cd bin/ && java -jar ../lib/junit-platform-console-standalone-1.7.0-all.jar -cp "." --select-class
```

## About my solution

This seems like a math / logic kind of problem. Once again, this is a scenario where I like to use the Test Driven Design approach. For the following reasons:

- TDD cycle helps me separate "problem-solving" moments from "refactoring" moments, which helps me focus on one thing at a time;
- Tests helps you see what is the desired output given an input. Which forces you to think about the solution before implementing any code;
- Code gets really messy when you are solving hard problems, so you really need to refactor and tests give you the confidence to do so;
- TDD also help me break a hard problem into an easier one.

### Expected Input

Once again, I will consider the app running in a Command Line Interface. This will be a simpler implementation which will allow me to focus on the core problem. Maybe later I can implement a GUI using some lib if time permits.

> **Therefore, the expected input are two rectangles provided by the user in a specific notation given by the software**

### Expected Output

> **I expect the program to be able to tell the user if the rectangles intersect or not, in a user-friendly text message**

## About the Stack Used

Once again, this is the kind of problem that I would use python to solve. However, since I want to use the provided stack and I don't want to mix to many languages in this repo, I will stick with java.

And I've already assembled all the necessaries dependencies for JUnit in the previous exercise, so I would have a more fluid start by going with java.

## The To-do List

When working, especially with TDD, I like to set some milestones and follow them during development. This helps me keep organized and set a "Done" definition to the project as well as keep my progress in a visual way which kind of motivates me through the end.

So there will be an extra todo.md file in the project where you can find my milestones and thoughts during the project

## Images and Videos

Here are some prints of the working software:

**TODO: Add images here**
