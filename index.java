
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        if (CorrectWord(word)) {
            System.out.println("'" + word + "' is a correct word.");
        } else {
            System.out.println("'" + word + "' is an incorrect word.");
        }
    }

    public static boolean CorrectWord(String word) {
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            
            if (!Character.isLetterOrDigit(currentChar)) {
                return false;
            }
            
            if (i < word.length() - 1 && currentChar == word.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }   
}
// class Main{
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of elements in the array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.println("Enter the elements of the array");
        
//         for (int i = 0; i < n; i++) {
//             int num = sc.nextInt();
//             arr[i] = num;
//         }

//         boolean Valid = ArrayValid(arr);

//         if (Valid) {
//             System.out.println("The array is valid.");
//         } else {
//             System.out.println("The array is not valid.");
//         }
//     }

//     public static boolean ArrayValid(int[] arr) {
        
//         boolean[] array = new boolean[101]; 

       
//         for (int num : arr) {
            
//             if (num < 1 || num > 100 || array[num]) {
//                 return false;
//             }
            
//             array[num] = true;
//         }

//         return true;
//     }
// }


// Java program sort array in even and odd manner.
// The odd numbers are to be sorted in descending
// order and the even numbers in ascending order

// import java.util.Arrays;
// import java.util.Collections;

// class Main {
// 	// To do two way sort. First sort even numbers in
// 	// ascending order, then odd numbers in descending
// 	// order.
// 	static void twoWaySort(Integer arr[], int n)
// 	{
// 		// Current indexes from left and right
// 		int l = 0, r = n - 1;

// 		// Count of odd numbers
// 		int k = 0;

// 		while (l < r)
// 		{
		
// 			// Find first even number from left side.
// 			while (arr[l] % 2 != 0)
// 			{
// 				l++;
// 				k++;
// 			}

// 			// Find first odd number from right side.
// 			while (arr[r] % 2 == 0 && l < r)
// 				r--;

// 			// Swap even number present on left and odd
// 			// number right.
// 			if (l < r)
// 			{
			
// 				// swap arr[l] arr[r]
// 				int temp = arr[l];
// 				arr[l] = arr[r];
// 				arr[r] = temp;
// 			}
// 		}

// 		// Sort odd number in descending order
// 		Arrays.sort(arr, 0, k, Collections.
// 								reverseOrder());

// 		// Sort even number in ascending order
// 		Arrays.sort(arr, k, n);
// 	}

// 	// Driver Method
// 	public static void main(String[] args)
// 	{
// 		Integer arr[] = {56, 67, 24, 3, 88, 17, 55 };

// 		twoWaySort(arr, arr.length);

// 		System.out.println(Arrays.toString(arr));
// 	}
// }


// class OddEvenSort {
//     public static void main(String[] args) {
//         int[] arr = {56, 67, 24, 3, 88, 17, 55};

//         rearrangeOddEven(arr);

//         System.out.println("Rearranged Array:");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }

//     public static void rearrangeOddEven(int[] arr) {
//         int n = arr.length;

//         // Rearrange the array using a custom sorting algorithm
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (isOdd(arr[j]) && !isOdd(arr[j + 1])) {
//                     // Swap the odd number with the even number
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     public static boolean isOdd(int num) {
//         return num % 2 != 0;
//     }
// }


// import java.util.HashMap;
// import java.util.Map;
// import java.util.Scanner;

// class ConvertValues {
//     public static void main(String[] args) {
//         // Define the arrays
//         int[] intArr = {2, 34, 1, 45};
//         String[] strArr = {"a", "f", "e", "v"};

//         // Create a map to store the mappings of integers to strings
//         Map<Integer, String> intToStrMap = new HashMap<>();
//         for (int i = 0; i < intArr.length; i++) {
//             intToStrMap.put(intArr[i], strArr[i]);
//         }

//         // Create a map to store the mappings of strings to integers
//         Map<String, Integer> strToIntMap = new HashMap<>();
//         for (int i = 0; i < strArr.length; i++) {
//             strToIntMap.put(strArr[i], intArr[i]);
//         }

//         // Create a Scanner for user input
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter an integer or a string: ");
//         String userInput = scanner.nextLine();

//         // Check if the input is an integer or a string and convert accordingly
//         if (userInput.matches("-?\\d+")) {
//             int inputInt = Integer.parseInt(userInput);
//             if (intToStrMap.containsKey(inputInt)) {
//                 System.out.println("Result: " + intToStrMap.get(inputInt));
//             } else {
//                 System.out.println("Not found");
//             }
//         } else {
//             if (strToIntMap.containsKey(userInput)) {
//                 System.out.println("Result: " + strToIntMap.get(userInput));
//             } else {
//                 System.out.println("Not found");
//             }
//         }

//         // Close the scanner
//         scanner.close();
//     }
// }


// import java.util.HashMap;
// import java.util.Map;
// import java.util.Scanner;

// class ConvertValues {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of the arrays: ");
//         int size = sc.nextInt();
//         sc.nextLine(); 
       
//         int[] intArr = new int[size];
//         String[] strArr = new String[size];

//         System.out.println("Enter the integer array elements:");
//         for (int i = 0; i < size; i++) {
//             System.out.print("Element " + (i + 1) + ": ");
//             intArr[i] = sc.nextInt();
//             sc.nextLine(); 
//         }


//         System.out.println("Enter the string array elements:");
//         for (int i = 0; i < size; i++) {
//             System.out.print("Element " + (i + 1) + ": ");
//             strArr[i] = sc.nextLine();
//         }

//         Map<Integer, String> intToStrMap = new HashMap<>();
//         for (int i = 0; i < size; i++) {
//             intToStrMap.put(intArr[i], strArr[i]);
//         }

        
//         Map<String, Integer> strToIntMap = new HashMap<>();
//         for (int i = 0; i < size; i++) {
//             strToIntMap.put(strArr[i], intArr[i]);
//         }

//         System.out.print("Enter an integer or a string: ");
//         String userInput = sc.nextLine();

//         if (userInput.matches("-?\\d+")) {
//             int inputInt = Integer.parseInt(userInput);
//             if (intToStrMap.containsKey(inputInt)) {
//                 System.out.println("Result: " + intToStrMap.get(inputInt));
//             } else {
//                 System.out.println("Not found");
//             }
//         } else {
//             if (strToIntMap.containsKey(userInput)) {
//                 System.out.println("Result: " + strToIntMap.get(userInput));
//             } else {
//                 System.out.println("Not found");
//             }
//         }
//         sc.close();
//     }
// }

// import java.util.Scanner;

// class Main{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your name: ");
//         String inputName = sc.nextLine();

//         String otherName = swapalphabets(inputName);
        
//         System.out.println("Your other name: " + otherName);
//         sc.close();
//     }

//     public static String swapalphabets(String input) {
//         StringBuilder result = new StringBuilder();

//         for (char c : input.toCharArray()) {
//             if (Character.isLetter(c)) {
//                 char swappedChar;
//                 if (Character.isLowerCase(c)) {
//                     swappedChar = (char) ('a' + 'z' - c);
//                 } else {
//                     swappedChar = (char) ('A' + 'Z' - c);
//                 }
//                 result.append(swappedChar);
//             } else {
//                 result.append(c);
//             }
//         }

//         return result.toString();
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         int[] numbers = {56, 67, 24, 3, 88, 17, 55};

//         rearrangeNumbers(numbers);

//         for (int number : numbers) {
//             System.out.print(number + " ");
//         }
//     }

//     public static void rearrangeNumbers(int[] arr) {
//         int n = arr.length;
//         int[] result = new int[n];
//         int oddIndex = 0;
//         int evenIndex = n - 1;

//         for (int num : arr) {
//             if (num % 2 != 0) {
//                 result[oddIndex++] = num;
//             }
//         }
//         sortArray(result, 0, oddIndex - 1);

//         for (int num : arr) {
//             if (num % 2 == 0) {
//                 result[evenIndex--] = num;
//             }
//         }
//         sortArray(result, oddIndex, n - 1);
//         System.arraycopy(result, 0, arr, 0, n);
//     }

//     public static void sortArray(int[] arr, int low, int high) {
//         if (low < high) {
//             int pivotIndex = partition(arr, low, high);
//             sortArray(arr, low, pivotIndex - 1);
//             sortArray(arr, pivotIndex + 1, high);
//         }
//     }

//     public static int partition(int[] arr, int low, int high) {
//         int pivot = arr[high];
//         int i = (low - 1);
//         for (int j = low; j < high; j++) {
//             if (arr[j] <= pivot) {
//                 i++;
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//         int temp = arr[i + 1];
//         arr[i + 1] = arr[high];
//         arr[high] = temp;
//         return i + 1;
//     }
// }


// import java.util.Arrays;
// class Main {
//     public static void main(String[] args) {
//         int[] numbers = {56, 67, 24, 3, 88, 17, 55};

//         Sort(numbers);

//         for (int number : numbers) {
//             System.out.print(number + " ");
//         }
//     }

//     public static void Sort(int[] arr) {
//         int n = arr.length;
//         int[] oddNumbers = new int[n];
//         int oddCount = 0;
//         int[] evenNumbers = new int[n];
//         int evenCount = 0;

//         for (int i = n; i < arr.length; i++) {
//             if (arr[i] % 2 != 0) {
//                 oddNumbers[oddCount++] = arr[i];
//             } else {
//                 evenNumbers[evenCount++] = arr[i];
//             }
//         }

//         for (int i = 0; i < oddCount - 1; i++) {
//             for (int j = 0; j < oddCount - i - 1; j++) {
//                 if (oddNumbers[j] > oddNumbers[j + 1]) {
//                     int temp = oddNumbers[j];
//                     oddNumbers[j] = oddNumbers[j + 1];
//                     oddNumbers[j + 1] = temp;
//                 }
//             }
//         }

//         for (int i = 0; i < evenCount - 1; i++) {
//             for (int j = 0; j < evenCount - i - 1; j++) {
//                 if (evenNumbers[j] > evenNumbers[j + 1]) {
//                     int temp = evenNumbers[j];
//                     evenNumbers[j] = evenNumbers[j + 1];
//                     evenNumbers[j + 1] = temp;
//                 }
//             }
//         }

//         System.arraycopy(oddNumbers, 0, arr, 0, oddCount);
//         System.arraycopy(evenNumbers, 0, arr, oddCount, evenCount);
//     }
// }
