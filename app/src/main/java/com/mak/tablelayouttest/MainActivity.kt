package com.mak.tablelayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun funAdd(view: View) {
        val txtVersion = findViewById<EditText>(R.id.txtAndroidVersion)
        val txtCodeName = findViewById<EditText>(R.id.txtAndroidCodeName)

        val tableLayout = findViewById<TableLayout>(R.id.tblLayout)
        val tableRow = TableRow(applicationContext)
        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        tableRow.layoutParams = layoutParams
        tableRow.setBackgroundResource(R.drawable.table_row_background)

        val textView = TextView(applicationContext)
        textView.text = txtVersion.text.trim()
        textView.setBackgroundResource(R.drawable.bordered_textview)
        tableRow.addView(textView, 0)

        val textView2 = TextView(applicationContext)
        textView2.text = txtCodeName.text.trim()
        textView2.setBackgroundResource(R.drawable.bordered_textview)
        tableRow.addView(textView2, 1)

        tableLayout.addView(tableRow)

        //Clear
        txtVersion.text.clear()
        txtCodeName.text.clear()

    }
}