package id.pratama.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

// git config --global user.name "pratamawijaya"
// git config --global user.email "set.mnemonix@gmail.com"

// git init
// git add .
// git commit -m "first commit" # commit changes
// git push -u origin main  # push to remote