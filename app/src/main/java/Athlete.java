import android.os.Bundle;

public class Athlete {

    private String athleteName;
    private char athleteGender;
    private int athleteAge;
    private String athleteEventGroup;

    public void setAthleteName(String name){
        athleteName=name;
    }
    public void setAthleteGender(char g){
        athleteGender=g;
    }
    public void setAthleteAge(int e){
        athleteAge=e;
    }
    public void setAthleteEventGroup(String eventGroup){
        athleteEventGroup=eventGroup;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public char getAthleteGender() {
        return athleteGender;
    }

    public int getAthleteAge() {
        return athleteAge;
    }

    public String getAthleteEventGroup() {
        return athleteEventGroup;
    }
    public Athlete(String athleteName, char athleteGender, int athleteAge, String athleteEventGroup){
        athleteName=athleteName;
        athleteGender=athleteGender;
        athleteAge=athleteAge;
        athleteEventGroup=athleteEventGroup;
    }
    public Athlete(String athleteName, char athleteGender, int athleteAge){
        athleteAge=athleteAge;
        athleteGender=athleteGender;
        athleteName=athleteName;
    }

    @Override
   /* protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_athlete);
    }
    */
}
