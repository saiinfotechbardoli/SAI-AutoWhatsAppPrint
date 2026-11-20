package com.saiinfotech.autowhatsappprint

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)
        text.text = """
            SAI INFOTECH

            AUTO WHATSAPP PRINT

            Initial Android printer project.

            Printer capture engine is under development.
        """.trimIndent()

        text.textSize = 22f
        text.setPadding(40, 60, 40, 40)

        setContentView(text)
    }
}
