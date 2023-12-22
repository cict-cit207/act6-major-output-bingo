//class for the numbers in Bingo Card
//chooses 5 integers per column randomly and eliminates the number once chosen to avoid repetitions

import java.util.ArrayList;
import java.util.Random;

public class CardNumbers {

    //gets 5 different random samples from the set of numbers.
    //eliminates the selected number for no repetition.
    private static ArrayList getNumList(ArrayList<Integer> arr){
        ArrayList newArray = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            Random rand = new Random();
            int element = rand.nextInt(0, arr.size() );
            newArray.add(arr.get(element));
            arr.remove(arr.get(element));
        }

        return newArray;
    }

    //returns ArrayList type - for easy implementation and allowing different Data Types to be stored together
    public static ArrayList getFinalList(){

        //list of all possible numbers for each bingo column
        ArrayList<Integer> BNums = new ArrayList<>();
        for(int i = 1; i <= 15; i++){
            BNums.add(i);
        }

        ArrayList<Integer> INums = new ArrayList<>();
        for(int i = 16; i <= 30; i++){
            INums.add(i);
        }

        ArrayList<Integer> NNums = new ArrayList<>();
        for(int i = 31; i <= 45; i++){
            NNums.add(i);
        }

        ArrayList<Integer> GNums = new ArrayList<>();
        for(int i = 46; i <= 60; i++){
            GNums.add(i);
        }

        ArrayList<Integer> ONums = new ArrayList<>();
        for(int i = 61; i <= 75; i++){
            ONums.add(i);
        }

        //create new arraylist for merging numbers
        ArrayList mergedList = new ArrayList<>();

        //get 5 items from each set
        ArrayList BSet = getNumList(BNums);
        ArrayList ISet = getNumList(INums);
        ArrayList NSet = getNumList(NNums);
        NSet.set(2, "Free"); //changed because the 3rd element in column N is free or already given
        ArrayList GSet = getNumList(GNums);
        ArrayList OSet = getNumList(ONums);

        //merging the items in left-right manner for the gridLayout later
        for (int i = 0; i < 5; i++){
            mergedList.add(BSet.get(i));
            mergedList.add(ISet.get(i));
            mergedList.add(NSet.get(i));
            mergedList.add(GSet.get(i));
            mergedList.add(OSet.get(i));
        }
        return mergedList;
}
}