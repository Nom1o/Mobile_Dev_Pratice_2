package ru.mirea.koldinma.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;

import android.os.Bundle;


import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;


public class MyTimeDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return  new TimePickerDialog(getActivity(), (TimePicker,hour, minute)->
                ((MainActivity)getActivity()).onTimeGet(hour,minute),
                0,0,true);
    }


}
