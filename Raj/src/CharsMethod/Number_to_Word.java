package CharsMethod;

public class Number_to_Word {
    public static void main(String[] args) {
        int number = 180;
        String text = convertNumberToText(number);
        System.out.println(text);
    }

    public static String convertNumberToText(int number) {
        String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
        };

        String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
        };

        String text = "";

        if (number == 0) {
            return "zero";
        }

        if (number < 0) {
            text = "Minus ";
            number = -number;
        }

        if ((number / 100) > 0) {  //  (180/100)==1.8->true
            text =text +units[number / 100] + " hundred";   // units[1]="One"  so o/p-->One Hundred 
            number =number% 100;    // 180%100-->0
        }

        if (number > 0) {    // 8>0-->true
            if (!text.isEmpty()) {  // true because  text = One Hundred 
                text =text+ " and ";  // so o/p---> One Hundred and
            }

            if (number < 20) {   
                text =text+ units[number]; 
                
            }
            else {
                text =text+ tens[number /10];
                
                if ((number % 10) > 0) {
                    text =text+ "-" + units[number % 10];
                }
            }
        }

        return text;
    }
}

