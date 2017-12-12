package adamchibe.com.adamchibecodelab;


import android.support.v7.app.AppCompatActivity;

public class Assignment extends AppCompatActivity
{
    public double pointsEarned;
    public double pointsPossible;
    //public String name;
    //teacher, date, etc, can continue if desired

    public Assignment() {}
    public Assignment(double earned, double possible)
    {
        pointsEarned = earned;
        pointsPossible = possible;
    }
}

