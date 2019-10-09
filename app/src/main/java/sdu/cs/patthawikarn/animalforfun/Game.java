package sdu.cs.patthawikarn.animalforfun;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Game extends AppCompatActivity {

    //Global

    ImageView questionImageView;
    ImageButton volumeImageButton;
    Button btn1,btn2,btn3,btn4;
    int questionCount = 1;
    ArrayList<Integer> qID=new ArrayList<Integer>();
    String answer;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        questionImageView = findViewById(R.id.imvQuestion);
        volumeImageButton =findViewById(R.id.imbVolume);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        //ผูกตัวแปร JAVA
        for(int i=1;i<=questionCount;i++){
            qID.add(i);
            Collections.shuffle(qID);
            setQuestion(qID.remove(0));
        }

    } //End onCreate Method

    private void setQuestion(Integer qID) {
        if (qID == 1){
            answer="นก";
            questionImageView.setImageResource(R.drawable.bird);
            mediaPlayer=MediaPlayer.create(this,R.raw.bird);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("แมว");
            choice.add("วัว");
            choice.add("หมา");
            Collections.shuffle(choice);
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
    } //End setQuestion Method
}//End class
