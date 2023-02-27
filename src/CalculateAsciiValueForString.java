public class CalculateAsciiValueForString {
    public static void main(String[] args) {

                String inputString = "hodgepodge";
                int totalAsciiValue=0;
                for (int i = 0; i < inputString.length(); i++) {
                    char currentChar = inputString.charAt(i);
                    int asciiValue = (int) currentChar;
                    System.out.println("The ASCII value of " + currentChar + " is " + asciiValue);
                     totalAsciiValue=totalAsciiValue+asciiValue;


                }
        System.out.println("Total ASCII value of " + inputString + " is " + totalAsciiValue);
            }
        }


