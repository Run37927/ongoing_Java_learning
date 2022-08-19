import java.util.ArrayList;

public class SimpleGame {
    private ArrayList<String> locationCells;
    private int numOfHits = 0;

    public void setLocationCells(ArrayList<String> locs){
        this.locationCells = locs;
    }

    public String checkYourself(int userGuess) {
        String result = "miss";

        int index = locationCells.indexOf(userGuess);
        if (index >=0) {
            locationCells.remove(index);

            if (locationCells.isEmpty())
                result = "kill";
            else
                result = "hit";
        }
        return result;
    }


}
