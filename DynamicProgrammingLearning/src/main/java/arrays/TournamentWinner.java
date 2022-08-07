package main.java.arrays;

import java.util.*;

public class TournamentWinner {

/*    Given an array of pairs representing the teams that have competed against each
    other and an array containing the results of each competition, write a
    function that returns the winner of the tournament. The input arrays are named competitions and results respectively
    The competition has it on the form [hometeam, awayTeam]... 0 means away team own and 1 means home team won*/
    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results){

        Map<String, Integer> teamScoreMap = new HashMap<>();
        for(int i=0; i<competitions.size();i++){
            if(results.get(i) == 0){
                if(teamScoreMap.containsKey(competitions.get(i).get(1))){
                    teamScoreMap.put(competitions.get(i).get(1), (teamScoreMap.get(competitions.get(i).get(1)) + 3));
                } else {
                    teamScoreMap.put(competitions.get(i).get(1),3);
                }

            } else {
                if(teamScoreMap.containsKey(competitions.get(i).get(0))){
                    teamScoreMap.put(competitions.get(i).get(0), (teamScoreMap.get(competitions.get(i).get(0)) + 3));
                } else {
                    teamScoreMap.put(competitions.get(i).get(0),3);
                }
            }
        }

        int maxVal =  Collections.max(teamScoreMap.values());
        String resultString = "";
        for(Map.Entry<String, Integer> entry: teamScoreMap.entrySet() ){

            if(entry.getValue() == maxVal){
                resultString = entry.getKey();
            }
        }
        return resultString;
    }


    public static void main(String[] args) {

        ArrayList<String> firstList = new ArrayList<String>(Arrays.asList("HTML","C#"));
        ArrayList<String> secondList = new ArrayList<String>(Arrays.asList("C#", "Python"));
        ArrayList<String> thirdList = new ArrayList<String>(Arrays.asList("Python","HTML"));
        ArrayList<ArrayList<String>>  competitions = new ArrayList<>(Arrays.asList(firstList, secondList, thirdList));
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(0, 0, 1));

        System.out.println(tournamentWinner(competitions, result));

    }
}
