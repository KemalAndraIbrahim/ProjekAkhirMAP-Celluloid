package com.example.projekmapnew

import android.annotation.SuppressLint
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView

class OjekPlayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_ojek_play)

        var simpleVideoView: VideoView? = null


        var mediaControls: MediaController? = null

        simpleVideoView = findViewById<View>(R.id.videoView) as VideoView

        if (mediaControls == null) {

            mediaControls = MediaController(this)


        }


        simpleVideoView!!.setMediaController(mediaControls)

        simpleVideoView!!.setVideoURI(Uri.parse("android.resource://"
                + packageName + "/" + R.raw.ojek))

        simpleVideoView!!.requestFocus()

        simpleVideoView!!.start()


    }
}

