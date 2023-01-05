package com.example.projekmapnew

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Video
import android.widget.MediaController
import android.widget.VideoView
import android.view.View
import android.widget.Toast




class KurirPlayActivity : AppCompatActivity() {


    var simpleVideoView: VideoView? = null
    var mediaControls: MediaController? = null

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kurir_play)


        simpleVideoView = findViewById<View>(R.id.videoView) as VideoView

        if (mediaControls == null) {

            mediaControls = MediaController(this)

        }


        simpleVideoView!!.setMediaController(mediaControls)

        simpleVideoView!!.setVideoURI(Uri.parse("android.resource://"
                + packageName + "/" + R.raw.kurir))

        simpleVideoView!!.requestFocus()


        simpleVideoView!!.start()



    }
}
