package id.pratama.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton: Button = findViewById(R.id.myButton)

        myButton.setOnClickListener {
            val result = 10000 / 10
        }

    }
}

// git config --global user.name "pratamawijaya"
// git config --global user.email "set.mnemonix@gmail.com"

// git init
// git add .
// git commit -m "first commit" # commit changes
// git push -u origin main  # push to remote
// test
