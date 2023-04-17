package com.example.myappmixer

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.fragment.app.DialogFragment
import com.example.myappmixer.R.id.progressBar
import com.example.myappmixer.R as R1

class CustomDialogFragment: DialogFragment(R1.layout.fragment_custom_dialog)

{

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val cancelbt : Button = view.findViewById(R1.id.cancelBT);
        val submitbt : Button = view.findViewById(R1.id.submitBT);


        val radioGroup = view.findViewById<RadioGroup>(R1.id.RatingRadioGroup)


        cancelbt.setOnClickListener{
            dismiss()
        }
        submitbt.setOnClickListener {

            val selectedOption: Int = radioGroup.checkedRadioButtonId
            val radioButton = view.findViewById<RadioButton>(selectedOption)
            Toast.makeText(context,radioButton.text, Toast.LENGTH_SHORT).show()
            val m1:MainActivity = getActivity() as MainActivity;
           // m1.receiveFeedback(radioButton.text.toString())
            dismiss()
        }

    }

}