/**
 * Package containing classes related to error detection in the data link layer.
 *
 * <p>
 * Error detection in the data link layer involves the insertion of error detection codes into frames of data. When a device
 * creates a data frame at the data link layer, it includes error detection codes. Upon receiving the frame, the next device
 * in the transmission sequence extracts the error-detection code, applies it to the data frame, reconstructs the data frame,
 * and forwards it to the subsequent device in the transmission sequence.
 * </p>
 *
 * <p>
 * The error detection process enhances the reliability of data transmission in the data link layer. Various methods are used
 * for error detection, including but not limited to:
 * </p>
 *
 * <ul>
 *     <li>{@link tech.araopj.errorDetection.ParityCheck Parity Check} - A simple method of error detection by adding
 *         redundant bits, called parity bits, to each character.</li>
 *     <li>{@link tech.araopj.errorDetection.TwoDimensionalParity Two-Dimensional Parity} (Longitudinal Redundancy Check) -
 *         Blocks of data organized as a two-dimensional array to increase the likelihood of detecting burst errors.</li>
 *     <li>{@link tech.araopj.errorDetection.ArithmeticChecksum Arithmetic Checksum} - A sequence of numbers and letters
 *         used to check data for errors. This sum is added to the end of the message before transmission to the receiving end.</li>
 * </ul>
 *
 * <p>
 * This package may include classes and functionalities related to these error detection mechanisms.
 * </p>
 *
 * @author Peter John Arao
 * @version 1.0
 * @since 1.0
 */
package tech.araopj.errorDetection;
