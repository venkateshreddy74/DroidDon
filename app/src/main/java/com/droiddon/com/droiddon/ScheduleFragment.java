package com.droiddon.com.droiddon;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.droiddon.com.droiddon.cards.SessionCardsView;

/**
 * Created by Ben10 on 11/3/17.
 */

public class ScheduleFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.schedule_view, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LinearLayout linearLayout = view.findViewById(R.id.schedule_layout);
        linearLayout.addView(new SessionCardsView(getActivity(),1));
        linearLayout.addView(new SessionCardsView(getActivity(),2));
        linearLayout.addView(new SessionCardsView(getActivity(),3));
    }
}
