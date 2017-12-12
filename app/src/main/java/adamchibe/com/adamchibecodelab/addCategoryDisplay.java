package adamchibe.com.adamchibecodelab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by adamc on 12/2/2017.
 */

public class addCategoryDisplay extends AppCompatActivity
{
    Button submitCategoryButton;
    EditText gradeWeightEditText;
    EditText weightedEditText;
    EditText categoryNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_category_display);
        gradeWeightEditText = (EditText)findViewById(R.id.gradeWeightEditTextID);
        weightedEditText = (EditText)findViewById(R.id.weightedEditTextID);
        categoryNameEditText = (EditText)findViewById(R.id.categoryNameEditTextID);
        submitCategoryButton = (Button)findViewById(R.id.submitCategoryButtonID);
        submitCategoryButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                MainActivity.course.addCateGory(Double.parseDouble(gradeWeightEditText.getText().toString()),
                        Boolean.parseBoolean(weightedEditText.getText().toString()),
                        categoryNameEditText.getText().toString());
                finish();
            }
        });
    }
}
