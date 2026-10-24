# STEP Week 02: String Processing and Validation

My solutions to the Week 2 practice problems and coding assignment of the **STEP Java Programming** track.

## Topics covered

- `String` methods (`substring`, `split`, `trim`, `toUpperCase`)
- Input validation
- `StringBuilder`
- CSV splitting
- Word-frequency maps

## Practice

| Program | What it does | Input |
|---------|--------------|-------|
| [`BankTransactionReferenceValidator`](Practice/BankTransactionReferenceValidator.java) | Validates a bank transaction reference and splits it into bank code, date and sequence number | Built-in example |
| [`CsvStudentRecordParser`](Practice/CsvStudentRecordParser.java) | Parses comma-separated student records and rejects invalid ones | Built-in example |
| [`FileExtensionValidator`](Practice/FileExtensionValidator.java) | Accepts or rejects a file based on its extension | Built-in example |
| [`MaskedPhoneNumberFormatter`](Practice/MaskedPhoneNumberFormatter.java) | Masks all but the last four digits of a phone number | Built-in example |
| [`VowelConsonantCounter`](Practice/VowelConsonantCounter.java) | Counts the vowels and consonants in a string | Built-in example |

## Assignment

| Program | What it does | Input |
|---------|--------------|-------|
| [`AtmPinLengthValidator`](Assignment/AtmPinLengthValidator.java) | Checks that an ATM PIN is exactly four digits | Built-in example |
| [`LibraryIsbnNormalizerValidator`](Assignment/LibraryIsbnNormalizerValidator.java) | Normalizes a library catalogue code and validates its publisher, year and catalogue parts | Built-in example |
| [`ProductInventoryCsvParser`](Assignment/ProductInventoryCsvParser.java) | Parses product inventory CSV lines and flags invalid records | Built-in example |
| [`StopWordFilteredWordFrequencyReport`](Assignment/StopWordFilteredWordFrequencyReport.java) | Counts how often each word appears while ignoring common stop words | Built-in example |
| [`WordReversalEncoder`](Assignment/WordReversalEncoder.java) | Reverses every word in a sentence while keeping the word order | Built-in example |

## Project structure

```
.
├── Practice/
│   ├── BankTransactionReferenceValidator.java
│   ├── CsvStudentRecordParser.java
│   ├── FileExtensionValidator.java
│   ├── MaskedPhoneNumberFormatter.java
│   ├── VowelConsonantCounter.java
│   └── README.md
├── Assignment/
│   ├── AtmPinLengthValidator.java
│   ├── LibraryIsbnNormalizerValidator.java
│   ├── ProductInventoryCsvParser.java
│   ├── StopWordFilteredWordFrequencyReport.java
│   ├── WordReversalEncoder.java
│   └── README.md
└── README.md
```

## How to run

You need JDK 8 or later.

```bash
cd Practice      # or: cd Assignment
javac FileName.java
java FileName
```

Replace `FileName` with the program name. Programs marked **Interactive** read input from the terminal; the rest run a built-in example straight away. Each file is self-contained, so you can also open it in VS Code or IntelliJ and press **Run**.

## All STEP weeks

| Week | Topic |
|------|-------|
| [Week 1](https://github.com/adityashukla44/STEP-Week-01) | Java Basics: Strings, Loops and Arrays |
| **Week 2** | **String Processing and Validation** (this repo) |
| [Week 3](https://github.com/adityashukla44/STEP-Week-03) | Classes, Objects and Constructors |
| [Week 4](https://github.com/adityashukla44/STEP-Week-04) | Array Algorithms |
| [Week 5](https://github.com/adityashukla44/STEP-Week-05) | Arrays and Methods |
| [Week 6](https://github.com/adityashukla44/STEP-Week-06) | Object-Oriented Programming Revision |
| [Week 7](https://github.com/adityashukla44/STEP-Week-07) | Encapsulation |
| [Week 8](https://github.com/adityashukla44/STEP-Week-08) | Inheritance and Polymorphism |
| [Week 9](https://github.com/adityashukla44/STEP-Week-09) | Abstraction and Interfaces |
| [Week 10](https://github.com/adityashukla44/STEP-Week-10) | Coding Practice Set |

## Author

**Aditya Shukla** · [@adityashukla44](https://github.com/adityashukla44)
