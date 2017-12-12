package adamchibe.com.adamchibecodelab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    protected static Course course = new Course(true);
    Button addCategoryButton;
    TextView categoryTitleTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        categoryTitleTextView=(TextView)findViewById(R.id.categoryNameEditTextID);
        addCategoryButton = (Button)findViewById(R.id.addCategoryButtonID);
        addCategoryButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), addCategoryDisplay.class);
                startActivity(intent);
            }
        });
    }
}
