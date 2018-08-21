package guilherme.cardoso.customviewlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import guilherme.cardoso.swipeprofilecard.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Logger().error("Teste");
    }
}
