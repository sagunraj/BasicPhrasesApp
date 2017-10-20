package np.com.sagunrajlage.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button welcome;
    Button doyouspeakenglish;
    Button goodevening;
    Button hello;
    Button howareyou;
    Button ilivein;
    Button mynameis;
    Button please;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome = (Button)findViewById(R.id.welcome);
        doyouspeakenglish = (Button)findViewById(R.id.doyouspeakenglish);
        goodevening = (Button)findViewById(R.id.goodevening);
        hello = (Button)findViewById(R.id.hello);
        howareyou = (Button)findViewById(R.id.howareyou);
        ilivein = (Button)findViewById(R.id.ilivein);
        mynameis = (Button)findViewById(R.id.mynameis);
        please = (Button)findViewById(R.id.please);


    }

    public void playtapped(View view){
       int id = view.getId();
       String ourid = "";

        ourid = view.getResources().getResourceEntryName(id); //Know the ID of the clicked button


        if("hello".equals(ourid)){
            mediaPlayer = MediaPlayer.create(this, R.raw.hello);
            mediaPlayer.start();
        }
        else if("welcome".equals(ourid)){
            mediaPlayer = MediaPlayer.create(this, R.raw.welcome);
            mediaPlayer.start();
        }
        else if("doyouspeakenglish".equals(ourid)){
            mediaPlayer = MediaPlayer.create(this, R.raw.doyouspeakenglish);
            mediaPlayer.start();
        }
        else if("goodevening".equals(ourid)){
            mediaPlayer = MediaPlayer.create(this, R.raw.goodevening);
            mediaPlayer.start();
        }
        else if("howareyou".equals(ourid)){
            mediaPlayer = MediaPlayer.create(this, R.raw.howareyou);
            mediaPlayer.start();
        }
        else if("ilivein".equals(ourid)){
            mediaPlayer = MediaPlayer.create(this, R.raw.ilivein);
            mediaPlayer.start();
        }
        else if("mynameis".equals(ourid)){
            mediaPlayer = MediaPlayer.create(this, R.raw.mynameis);
            mediaPlayer.start();
        }
        else if("please".equals(ourid)){
            mediaPlayer = MediaPlayer.create(this, R.raw.please);
            mediaPlayer.start();
        }

        Log.i("Button clicked is: ", ourid);
    }




}
