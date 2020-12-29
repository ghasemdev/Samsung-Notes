package com.jakode.samsungnotes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class NoteFragment extends Fragment {

    @Override
    public View onCreateView
            (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_note, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        clickListener(view);
    }

//    private void clickListener(View view) {
//        Button button = view.findViewById(R.id.button);
//        button.setOnClickListener(v -> ((MainActivity) getActivity()).navController.navigate(R.id.action_noteFragment_to_blankFragment));
//    }
}