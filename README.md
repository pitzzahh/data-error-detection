# Data Error Detection

[![GitHub license](https://img.shields.io/github/license/pitzzahh/data-error-detection)](https://github.com/pitzzahh/data-error-detection/blob/main/LICENSE)
[![GitHub stars](https://img.shields.io/github/stars/pitzzahh/data-error-detection)](https://github.com/pitzzahh/data-error-detection/stargazers)
[![GitHub issues](https://img.shields.io/github/issues/pitzzahh/data-error-detection)](https://github.com/pitzzahh/data-error-detection/issues)
[![GitHub pull requests](https://img.shields.io/github/issues-pr/pitzzahh/data-error-detection)](https://github.com/pitzzahh/data-error-detection/pulls)
[![GitHub version](https://img.shields.io/github/v/release/pitzzahh/data-error-detection)](https://github.com/pitzzahh/data-error-detection/releases)
[![Java CI](https://github.com/pitzzahh/data-error-detection/actions/workflows/maven-publish.yml/badge.svg)](https://github.com/pitzzahh/data-error-detection/actions/workflows/maven-publish.yml)
## Overview

This repository focuses on error detection mechanisms in the data link layer. Error detection is a crucial aspect of
reliable data transmission, ensuring the integrity of information during the communication process.

## Error Detection Methods

### Parity Check (Vertical Redundancy Check)

Parity check is a simple and widely-used error detection method. Redundant bits, known as parity bits, are added to each
character. This repository includes a class named `ParityCheck` that implements this error detection mechanism.

#### How Parity Check Works:

- Commonly used for ASCII characters with seven bits for encoding and the eighth bit for parity.
- Two basic forms: even parity and odd parity.
- Even parity ensures an even number of binary 1s, while odd parity ensures an odd number.

### Two-Dimensional Parity (Longitudinal Redundancy Check)

The `TwoDimensionalParity` class in this repository implements the two-dimensional parity check. Blocks of data are
organized as a two-dimensional array, enhancing the detection of burst errors.

#### Key Features:

- Each row of the array represents a data block to be transmitted.
- A parity bit is appended to each column based on whether even or odd parity is used.

### Arithmetic Checksum

The `ArithmeticChecksum` class provides functionality for error detection using an arithmetic checksum. A sequence of
numbers and letters is used to check data for errors, and this sum is added to the end of the message before
transmission.

#### Highlights:

- Commonly used in higher-level protocols such as TCP and IP.
- Involves checksum creation at the sender's side and checksum validation at the receiver's side.

## Helper Class

The `Helper` class offers useful utility methods for integer-based operations, including functions to check whether a
number is odd or even. Additionally, a method to obtain the ASCII binary equivalent of a character has been included.

### Helper Methods:

- `isOdd`: Determines if a parity is odd.
- `isEven`: Determines if a parity is even.
- `getAsciiBinary(char character)`: Retrieves the ASCII binary equivalent of a character.
- `bitCount(int binary)`: Retrieves the bit count in a binary

## Usage

Feel free to explore and integrate these error detection mechanisms into your projects. Each class comes with specific
methods and functionalities for their respective error detection techniques.

## Contribution

Contributions are welcome! If you have ideas for improvements, bug fixes, or additional error detection methods, feel
free to open an issue or submit a pull request.

## Author

Peter John Arao

## Version

1.0

## License

This project is licensed under the [MIT License](LICENSE).
