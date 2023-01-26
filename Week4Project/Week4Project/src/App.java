public class App {
    public static void main(String[] args) throws Exception {
        
        //Step One
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        int agesLast = ages.length - 1;
        System.out.println(ages[agesLast] - ages[0]);
        int[] agesNew = new int[ages.length + 1];
        agesLast = agesNew.length - 1;
        for(int i = 0; i < agesLast; i ++){
            agesNew[i] = ages[i];
        }
        agesNew[agesLast] = 44;
        System.out.println(agesNew[agesLast] - agesNew[0]);
        int ageAvg = 0;
        int ageSum = 0;
        for(int i = 0; i <= agesLast; i++)
        {
            ageSum += agesNew[i];
        }        
        ageAvg = ageSum / agesNew.length;
        System.out.println(ageAvg);

        //Step Two
        String[] names = new String[] {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        String name;
        int lettersSum = 0;
        int lettersAvg = 0;
        for(int i = 0; i < 6; i++) {
            name = names[i];
            lettersSum += name.length();
        }
        lettersAvg = lettersSum / 6;
        System.out.println(lettersAvg);
        String allNames = "";
        for(int i = 0; i < 6; i++) {
            name = names[i];
            allNames = allNames.concat(name);
        }
        System.out.println(allNames);

        /*Step Three
         * To access the last element of an array, you can find the length
         *  of the array and then subtract one to find the last location of
         *  memory and find the value in the array there.
         */

         /*Step Four
          * To access the first element of an array, you can use the value of
          *  zero to find the first value in the array.
          */

        //Step Five
        int[] nameLengths = new int[6];
        for(int i = 0; i < 6; i++) {
            name = names[i];
            nameLengths[i] = name.length();
        }

        //Step Six
        int nameSum = 0;
        for(int i = 0; i < 6; i++) {
            nameSum += nameLengths[i];
        }
        System.out.println(nameSum);
    }

    //Step Seven
    public static String wordConcat (String word, int n) {
        String newWord = "";
        for(int i = 0; i < n; i++) {
            newWord = newWord.concat(word);
        }
        return newWord;
    }

    //Step Eight
    public static String fullNameStr (String firstName, String lastName) {
        String fullName = firstName;
        fullName = fullName.concat(" ");
        fullName = fullName.concat(lastName);
        return fullName;
    }

    //Step Nine
    public static boolean sum100 (int[] intArr) {
        int sum = 0;
        for(int i = 0; i < intArr.length; i++) {
            sum += intArr[i];
        }
        if(sum > 100) {
            return true;
        }
        else {
            return false;
        }
    }

    //Step Ten
    public static double dblAvg (double[] dblArr) {
        double dblSum = 0;
        double dblAvg = 0;
        for(int i = 0; i < dblArr.length; i++) {
            dblSum += dblArr[i];
        }
        dblAvg = dblSum / dblArr.length;
        return dblAvg;
    }

    //Step Eleven
    public static boolean grtrArr (double[] firstArr, double[] secondArr) {
        double firstSum = 0;
        double secondSum = 0;
        double firstAvg = 0;
        double secondAvg = 0;
        for(int i = 0; i < firstArr.length; i++) {
            firstSum += firstArr[i];
        }
        for(int i = 0; i < secondArr.length; i++) {
            secondSum += secondArr[i];
        }
        firstAvg = firstSum / firstArr.length;
        secondAvg = secondSum / secondArr.length;
        if(firstAvg > secondAvg) {
            return true;
        }
        else {
            return false;
        }
    }

    //Step Twelve
    public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
        if(isHotOutside == true && moneyInPocket > 10.5) {
            return true;
        }
        else {
            return false;
        }
    }

    //Step Thirteen
    //This method takes two integer arrays and compares them to see if they are
    //the same length, returning true if so and false if not
    public static boolean longerArray (int[] arrOne, int[] arrTwo) {
        if(arrOne.length == arrTwo.length) {
            return true;
        }
        else {
            return false;
        }
    }

}
