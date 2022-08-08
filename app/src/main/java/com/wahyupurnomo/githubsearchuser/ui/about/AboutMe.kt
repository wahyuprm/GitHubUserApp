package com.wahyupurnomo.githubsearchuser.ui.about

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wahyupurnomo.githubsearchuser.R

class AboutMe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me)

        supportActionBar?.title = "About"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}