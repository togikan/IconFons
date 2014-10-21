package com.example.kayat.fontello;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Author: Togay Han Kaya <togay.kaya@monitise.com>
 * Created: 18/09/14
 */
public class IconTextView extends LinearLayout {

    TextView icon;
    TextView text;
    LayoutInflater inflater;

    public IconTextView(Context context) {
        super(context);
    }

    public IconTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.IconTextView);

        if (a.getInt(R.styleable.IconTextView_alignment, 0) == 0) {

            inflater.inflate(R.layout.custom_icontext, this);

        } else {

            inflater.inflate(R.layout.custom_icontext_horizontal, this);

        }


        icon = (TextView) findViewById(R.id.textView1);
        text = (TextView) findViewById(R.id.textView2);

        Typeface font = Typeface.createFromAsset(context.getAssets(), "icomoon.ttf");
        icon.setTypeface(font);


        String iconStr = a.getString(R.styleable.IconTextView_iconText);
        String textStr = a.getString(R.styleable.IconTextView_text);

        icon.setTextSize(TypedValue.COMPLEX_UNIT_SP, a.getFloat(R.styleable.IconTextView_iconSize, 0.0f));
        text.setTextSize(TypedValue.COMPLEX_UNIT_SP, a.getFloat(R.styleable.IconTextView_textSize, 0.0f));

        icon.setText(iconStr);
        text.setText(textStr);

    }

    public IconTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

    }

    public void setText(String text){
        this.text.setText(text);
    }


}
