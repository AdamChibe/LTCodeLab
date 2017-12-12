package adamchibe.com.adamchibecodelab;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
public class Course  extends AppCompatActivity
{
    private ArrayList<Category> categories = new ArrayList<Category>();
    private double average;
    boolean weighted;
    //other strings adn things for teachers name, class name, letter grade etc;

    public Course() {}
    public Course(boolean isWeighted)
    {
        weighted = isWeighted;
    }
    public void addCateGory(double weight, boolean isWeighted, String name)
    {
        categories.add(new Category(weight, isWeighted, name));
    }
    public void addAssignment(int index, double earned, double possible)
    {
        categories.get(index).addAssignment(earned, possible);
    }
    public void getClassCredit()
    {
        int credit = 0;
        for(int i = 0; i < categories.size();i++)
        {
            credit+=categories.get(i).getCredit();
        }
        System.out.println(credit);
    }
}

