package nyc.c4q.wesniemarcelin.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
public final static String EXTRA_MESSAGE = "nyc.c4q.wesniemarcelin.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Called when the activity is first made at least partially visible to the user.

    @Override
    protected void onStart()
    {
        super.onStart();
    }

    //Called when the activity  is made completely visible to the user.

    @Override
    protected void onResume()
    {
        super.onResume();
    }

    //Called when the activity is made only partially visible to the user.
    @Override
    protected void onPause()
    {
        super.onPause();
    }

    //Called when an activity is no longer visible to the user - can be followed by either onRestart or onDestroy.
    @Override
    protected void onStop()
    {
        super.onStop();
    }

    //Called when a stopped activity becomes active again.

    @Override
    protected void onRestart()
    {
        super.onRestart();
    }


     // Called when an activity is destroyed, possibly by the user or by the system.

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
    }


    public void sendMessage(View view){
        //What happens when user clicks the send button on the Android application
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.enter_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
}
