package com.example.game

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.*


class MainActivity : AppCompatActivity() {
    lateinit var radioGroup: RadioGroup
    lateinit var selectedRadioButton: RadioButton
    lateinit var buttonSubmit: Button
    lateinit var user:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSubmit = findViewById(R.id.Button)
        radioGroup = findViewById(R.id.radioGroup)


        var cb1: CheckBox
        var cb2: CheckBox
        var cb3: CheckBox
        var cb4: CheckBox
        cb1 =  findViewById<CheckBox>(R.id.cb1)
        cb2 =  findViewById<CheckBox>(R.id.cb2)
        cb3 =  findViewById<CheckBox>(R.id.cb3)
        cb4 =  findViewById<CheckBox>(R.id.cb4)

        buttonSubmit.setOnClickListener(View.OnClickListener {
            user=findViewById(R.id.name)
            val Name=user.text.toString()
            selectedRadioButton =
                findViewById<View>(radioGroup.getCheckedRadioButtonId()) as RadioButton
            // get RadioButton text

            val yourVote = selectedRadioButton.text.toString()
            var checkBoxChoices = ""
            if (cb1.isChecked()) {
                checkBoxChoices += cb1.getText().toString().toString() +"\n"
            }
            if (cb2.isChecked()) {
                checkBoxChoices += cb2.getText().toString().toString() + "\n"
            }
            if (cb3.isChecked()) {
                checkBoxChoices += cb3.getText().toString().toString() + "\n"
            }
            if (cb4.isChecked()) {
                checkBoxChoices += cb4.getText().toString().toString() + "\n"
            }
            // display it as Toast to the user
            Toast.makeText(
                this@MainActivity,
                "Name is :$Name\n Gender is:$yourVote\n Games did they like: \n $checkBoxChoices",
                Toast.LENGTH_LONG
            ).show()
        })
    }

}