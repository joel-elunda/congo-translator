package translator.congotranslation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    sleep(2000);
                }catch (InterruptedException e){

                }finally {
                    Intent intent = new Intent("translator.congotranslation.MAINACTIVITY");
                    startActivity(intent);
                }
            }
        };

        thread.start();
    }


    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
