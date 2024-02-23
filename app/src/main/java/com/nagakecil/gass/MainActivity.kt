package com.nagakecil.gass

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginactivity)

        // Initialize UI elements
        // Set a click listener for the login button
        findViewById<Button>(R.id.buttonLogin).setOnClickListener(View.OnClickListener {
            // Retrieve entered username and password
            // Implement authentication logic here
            if (findViewById<EditText>(R.id.nomorHP).getText().toString() == "12345" ) {
                // Successful login
                Toast.makeText(this@MainActivity, "Login successful", Toast.LENGTH_SHORT).show()
            } else {
                // Failed login
                Toast.makeText(
                    this@MainActivity,
                    "Invalid username or password",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
    }
}