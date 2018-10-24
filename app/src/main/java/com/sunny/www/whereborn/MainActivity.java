package com.sunny.www.whereborn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView02);
    }

    public void onClickWidget(View view){
        int id = view.getId();
        String text = ((Button)view).getText().toString();
        /*switch (id){
            case R.id.button1:
                text=text+"="+((Button)view).isClickable(); break;
            case R.id.button2:
                text=text+"="+((Button)view).isClickable(); break;
            case R.id.button3:
                text=text+"="+((Button)view).isClickable(); break;
            case R.id.button4:
                text=text+"="+((Button)view).isClickable(); break;
            case R.id.button5:
                text=text+"="+((Button)view).isClickable(); break;
            case R.id.button6:
                text=text+"="+((Button)view).isClickable(); break;

        }*/
        text="내 고향은"+text+"랍니다~.";
        textView.setText(text);

    }


}
