package main.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidateSubSequence {

    //this only passes 16/24 test cases.
    public static Boolean isSubSequence(List<Integer> array, List<Integer> sequence){
        List<Integer> indexOfEachVal = new ArrayList<>();

        for(int i=0; i<sequence.size(); i++){
            if(array.indexOf(sequence.get(i)) < 0){
                return false;
            }
            indexOfEachVal.add(array.indexOf(sequence.get(i)));
        }

        if(indexOfEachVal.size() == 1){
            return true;
        }
        for(int i=0; i<indexOfEachVal.size()-1;i++){
            int nextItem = i + 1;
            if(indexOfEachVal.get(i) > indexOfEachVal.get(nextItem)){
                return false;
            }
        }

        return true;
    }


    public static Boolean isSubSequence1(List<Integer> array, List<Integer> sequence){

        int arrayIdx = 0;
        int seqIdx = 0;
        while(seqIdx < sequence.size() && arrayIdx < array.size()){
            if(sequence.get(seqIdx).equals(array.get(arrayIdx))){
                seqIdx++;
            }
            arrayIdx++;
        }

        return seqIdx == sequence.size();
    }

    public static Boolean isSubSequence2(List<Integer> array, List<Integer> sequence){

        int seqIdx = 0;
        for(Integer arr: array){
            if(sequence.get(seqIdx).equals(arr)){
                seqIdx++;
            }
            if(seqIdx == sequence.size()){
                break;
            }
        }
        return seqIdx == sequence.size();
    }


    public static void main(String[] args) {
        //arr1={5,1,22,25,6,-1,8,10}
        //seq={1,6,-1,10}
        List<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(5,1,22,25,6,-1,8,10));
        List<Integer> seq = new ArrayList<>(Arrays.asList(1,6,-1,10));
        System.out.println(isSubSequence(arr1, seq));
    }
}
