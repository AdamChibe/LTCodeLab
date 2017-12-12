package adamchibe.com.adamchibecodelab;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Scanner;
public class Category  extends AppCompatActivity
{
    private ArrayList<Assignment> assignments = new ArrayList<Assignment>();
    private double gradeWeight;
    private double average;
    private boolean weighted;
    private String categoryName;

    public Category()
    {
        gradeWeight = 0.0;
        weighted = true;
        categoryName = "default";
    }
    public Category(double weight, boolean isWeighted, String name)
    {
        gradeWeight = weight;
        weighted = isWeighted;
        categoryName = name;
    }
    public void setCategoryName(String name)
    {
        categoryName = name;
    }
    public void setCategoryGradeWeight(double weight)
    {
        gradeWeight = weight;
    }
    public void setCategoryWeighted(boolean isWeighted)
    {
        weighted = isWeighted;
    }

    public void addAssignment(double earned, double potential)//a manual method for me to test with
    {
        if(weighted)
        {
            assignments.add(new Assignment(earned, potential));
        }
        else
        {
            assignments.add(new Assignment(earned, 100.0));
        }
    }
    public double getCredit()//credit is the average * the weight; the part that is added to your final grade
    {
        double totalEarned = 0;
        double totalPossible = 0;
        for(int i = 0; i < assignments.size();i++)
        {
            totalEarned+=assignments.get(i).pointsEarned;
            totalPossible+=assignments.get(i).pointsPossible;
        }
        return totalEarned/totalPossible * gradeWeight;
    }
}

