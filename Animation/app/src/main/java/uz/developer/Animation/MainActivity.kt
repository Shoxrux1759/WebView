package uz.developer.Animation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var firstClickedImageView: ImageView? = null
    private var secondClickedImageView: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageIds = arrayOf(
            R.id.image_1, R.id.image_2, R.id.image_3,
            R.id.image_4, R.id.image_5, R.id.image_6
        )

        for (id in imageIds) {
            val imageView = findViewById<ImageView>(id)
            imageView.setImageResource(R.drawable.icon)
            imageView.setOnClickListener {
                onImageViewClicked(imageView)
            }
        }
    }

    private fun onImageViewClicked(imageView: ImageView) {
        if (firstClickedImageView == null) {
            firstClickedImageView = imageView
            showImage(imageView)
        } else if (firstClickedImageView != imageView && secondClickedImageView == null) {
            secondClickedImageView = imageView
            showImage(imageView)
            if (imagesMatch()) {
                firstClickedImageView?.visibility = ImageView.INVISIBLE
                secondClickedImageView?.visibility = ImageView.INVISIBLE
                checkGameFinished() // Check if all images are invisible
                firstClickedImageView = null
                secondClickedImageView = null
            } else {
                imageView.postDelayed({
                    resetImages()
                }, 1000)
            }
        }
    }


    private fun showImage(imageView: ImageView) {
        val anim = AnimationUtils.loadAnimation(this, R.anim.scale)
        imageView.startAnimation(anim)
        val resourceId = getImageResource(imageView.id)
        imageView.setImageResource(resourceId)
    }

    private fun getImageResource(id: Int): Int {
        return when (id) {
            R.id.image_1 -> R.drawable.c_pluss
            R.id.image_2 -> R.drawable.java
            R.id.image_3 -> R.drawable.kotlin
            R.id.image_4 -> R.drawable.c_pluss
            R.id.image_5 -> R.drawable.kotlin
            R.id.image_6 -> R.drawable.java
            else -> R.drawable.icon
        }
    }

    private fun imagesMatch(): Boolean {
        return firstClickedImageView?.drawable?.constantState == secondClickedImageView?.drawable?.constantState
    }

    private fun resetImages() {
        firstClickedImageView?.setImageResource(R.drawable.icon)
        secondClickedImageView?.setImageResource(R.drawable.icon)
        firstClickedImageView = null
        secondClickedImageView = null
    }

    private fun checkGameFinished() {
        var allImagesInvisible = true
        val imageIds = arrayOf(
            R.id.image_1, R.id.image_2, R.id.image_3,
            R.id.image_4, R.id.image_5, R.id.image_6
        )

        for (id in imageIds) {
            val imageView = findViewById<ImageView>(id)
            if (imageView.visibility != ImageView.INVISIBLE) {
                allImagesInvisible = false
                break
            }
        }

        if (allImagesInvisible) {
            Toast.makeText(this, "The game is over", Toast.LENGTH_SHORT).show()
        }
    }
}
