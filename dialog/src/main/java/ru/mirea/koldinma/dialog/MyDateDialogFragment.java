package ru.mirea.koldinma.dialog;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class MyDateDialogFragment extends DialogFragment {


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return  new DatePickerDialog(getActivity(),
                ((view, year, month, dayOfMonth) ->
                        ((MainActivity)getActivity()).onDateGet(year, month, dayOfMonth)),
                2023,2,4);

        }


}
