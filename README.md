# CSC320 Module 3: Average Withholding Calculator

## Course Information

- Course: CSC320 - Programming 1
- Module: Understanding the Decision Control Structure
- Assignment option: Option 1 - Calculate Average Withholding

## Project Purpose

This Java console program asks the user to enter weekly income. It uses an `if`, `else if`, and `else` decision structure to choose the correct tax rate and calculate weekly tax withholding.

## Tax Guidelines

- Income below $500: 10%
- Income from $500 through $1,499.99: 15%
- Income from $1,500 through $2,499.99: 20%
- Income of $2,500 or more: 30%

## Repository Structure

```text
CSC320-Module3-Average-Withholding/
├── src/
│   └── AverageWithholding.java
├── docs/
│   ├── pseudocode.txt
│   ├── test-plan.md
│   └── screenshots/
├── .gitignore
└── README.md
```

## Compile and Run in GitHub Codespaces

Open the Codespaces terminal from the repository root and run:

```bash
javac src/AverageWithholding.java
java -cp src AverageWithholding
```

Enter a weekly income when prompted.

## Sample Execution

```text
Enter weekly income: $1500

Weekly income: $1500.00
Tax rate: 20%
Average weekly tax withholding: $300.00
```

## Required Submission Evidence

The final Word document should contain:

1. Pseudocode.
2. Java source code.
3. Screenshots showing the application executing and displaying results.
4. The GitHub repository link.
