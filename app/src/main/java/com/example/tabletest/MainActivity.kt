package com.example.tabletest

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tableLayout = TableLayout(this)
        tableLayout.layoutParams = TableLayout.LayoutParams(
            TableLayout.LayoutParams.MATCH_PARENT,
            TableLayout.LayoutParams.WRAP_CONTENT
        )

        val tableRow1 = TableRow(this)
        val column1 = TextView(this)
        column1.text = "Column 1"
        column1.gravity = Gravity.CENTER
        column1.layoutParams = TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 1f)
        tableRow1.addView(column1)

        val column2 = TextView(this)
        column2.text = "Column 2"
        column2.gravity = Gravity.CENTER
        column2.layoutParams = TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 1f)
        tableRow1.addView(column2)

        tableLayout.addView(tableRow1)

        val tableRow2 = TableRow(this)
        val column3 = TextView(this)
        column3.text = "Row 1, Column 1"
        column3.gravity = Gravity.CENTER
        column3.layoutParams = TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 1f)
        tableRow2.addView(column3)

        val column4 = TextView(this)
        column4.text = "Row 1, Column 2"
        column4.gravity = Gravity.CENTER
        column4.layoutParams = TableRow.LayoutParams(0, TableRow.LayoutParams.WRAP_CONTENT, 1f)
        tableRow2.addView(column4)

        tableLayout.addView(tableRow2)

        /////////////////////////////////////////////////////////

        // Define the columns
//        val column1 = TextView(this)
//        column1.text = "Name"
//        column1.gravity = Gravity.START
//        column1.setPadding(16, 16, 16, 16)
//        column1.setTypeface(null, Typeface.BOLD)
//        column1.setTextColor(Color.WHITE)
//        column1.textSize = 20f
//        column1.setBackgroundColor(Color.DKGRAY)
//
//        val column2 = TextView(this)
//        column2.text = "Last name"
//        column2.textSize = 20f
//        column2.gravity = Gravity.START
//        column2.setPadding(16, 16, 16, 16)
//        column2.setTypeface(null, Typeface.BOLD)
//        column2.setBackgroundColor(Color.DKGRAY)
//        column2.setTextColor(Color.WHITE)

// Create the header row
        val headerRow = TableRow(this)
        headerRow.addView(column1)
        headerRow.addView(column2)
        tableLayout.addView(headerRow)

// Add some sample data rows
        val sampleData = arrayOf(
            arrayOf("Kennedy", "Linzie"),
            arrayOf("Clause", "Chiwala"),
            arrayOf("Lola", "Paloosa"),
            arrayOf("Lola", "Paloosa"),
            arrayOf("Lola", "Paloosa")

        )

        for (dataRow in sampleData) {
            val row = TableRow(this)
            for (data in dataRow) {
                val cell = TextView(this)
                cell.text = data
                cell.gravity = Gravity.START
                cell.textSize = 16f
                cell.setPadding(16, 16, 16, 16)
                row.addView(cell)
            }
            tableLayout.addView(row)
        }

// Finally, add the table to your layout
        setContentView(tableLayout)

    }
}