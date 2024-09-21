https://leetcode.com/problems/add-binary/description/?envType=problem-list-v2&envId=math

Optimised:

class Solution {
    // Method to add two binary strings and return the sum as a binary string
    public String addBinary(String a, String b) {
        // Determine the maximum length of the two binary strings
        int maxLen = Math.max(a.length(), b.length());
        StringBuilder builder = new StringBuilder(); // To build the resulting binary string

        int carry = 0; // Initialize carry to 0
        // Loop through each bit from the least significant bit to the most significant bit
        for (int i = 0; i < maxLen; i++) {
            // Get the current bit from string 'a' or '0' if out of bounds
            int char1 = (i >= a.length() ? '0' : a.charAt(a.length() - i - 1)) - '0';
            // Get the current bit from string 'b' or '0' if out of bounds
            int char2 = (i >= b.length() ? '0' : b.charAt(b.length() - i - 1)) - '0';

            // Calculate the total for the current bit, including the carry
            int total = carry + char1 + char2;
            // Append the sum's last bit (total % 2) to the builder
            builder.append(total % 2);
            // Update the carry for the next higher bit (total / 2)
            carry = total / 2;
        }
        // If there's a carry left after the last addition, append it to the result
        if (carry == 1) {
            builder.append("1");
        }
        
        // Reverse the builder to get the correct binary string and convert to string
        return builder.reverse().toString();
    }
}




import java.util.*;
import java.math.BigInteger; // Import BigInteger class

class Solution {
    // Method to add two binary strings and return the sum as a binary string
    public String addBinary(String a, String b) {
        // Create BigInteger from binary strings
        BigInteger num1 = new BigInteger(a, 2); // Parse binary string 'a'
        BigInteger num2 = new BigInteger(b, 2); // Parse binary string 'b'
        
        // Add the two BigInteger values
        BigInteger sum = num1.add(num2);
        
        // Convert the sum back to a binary string
        return sum.toString(2); // Return the binary representation
    }

    public static void main(String[] args) {
        Solution s = new Solution(); // Create an instance of the Solution class
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input

        // Read binary strings from input
        String a = sc.nextLine(); // Read the first binary string
        String b = sc.nextLine(); // Read the second binary string

        // Output the result of adding the two binary strings
        System.out.println(s.addBinary(a, b)); // Print the binary sum
    }
}
