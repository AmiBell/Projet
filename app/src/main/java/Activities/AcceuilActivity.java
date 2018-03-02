package Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.aspirev.selki.R;

/**
 * Created by lenovo on 26/02/2018.
 */

public class AcceuilActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);
        Intent intent=getIntent();
    }
}
