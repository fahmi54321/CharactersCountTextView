package com.android.a86characterscounttextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.wafflecopter.charcounttextview.CharCountTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CharCountTextView charCountTextView = (CharCountTextView) findViewById(R.id.tvTextCounter);
        EditText editText = (EditText) findViewById(R.id.edtTextView);

        charCountTextView.setEditText(editText);
        charCountTextView.setCharCountChangedListener(new CharCountTextView.CharCountChangedListener() {
            @Override
            public void onCountChanged(int i, boolean b) {
                
            }
        });

    }
}