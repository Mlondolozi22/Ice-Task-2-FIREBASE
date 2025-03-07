package vcmsa.projects.firebase1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewWelcome = findViewById<TextView>(R.id.textViewWelcome)
        val btnLogout = findViewById<Button>(R.id.btnLogout)

        // You can customize the welcome message with the user's email if needed.
        textViewWelcome.text = "Welcome to the App!"

        btnLogout.setOnClickListener {
            // Logout and go back to LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // Close this activity
        }
    }
}
