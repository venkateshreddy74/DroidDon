package com.droiddon.com.droiddon.cards;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.droiddon.com.droiddon.R;

/**
 * Created by Ben10 on 11/4/17.
 */

public class SessionCardsView extends CardView {

    TextView title;
    TextView content;
    ImageView imageView;

    public SessionCardsView(Context context,int position) {
        super(context);
        init(context,position);
    }

    public SessionCardsView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SessionCardsView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void init(Context context,int position) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.session_card_view, this);
        title = (TextView) view.findViewById(R.id.card_title);
        imageView = (ImageView) view.findViewById(R.id.card_image);
        content = (TextView) view.findViewById(R.id.card_desc);

        switch (position) {
            case 1 :
                title.setText("KOLTIN BASICS");
                imageView.setImageDrawable(context.getDrawable(R.drawable.ty_sf));
                break;
            case 2 :
                title.setText("GRADLE BASICS");
                imageView.setImageDrawable(context.getDrawable(R.drawable.christina_sf));
                break;
            case 3 :
                title.setText("ANDROID BASICS");
                imageView.setImageDrawable(context.getDrawable(R.drawable.andrea_sf));
                break;

        }

    }
}
