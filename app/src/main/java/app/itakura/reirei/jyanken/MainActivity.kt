package app.itakura.reirei.jyanken

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gooButton.setOnClickListener {
            playerText.text = "あなたの手はグーです"

            val number = Random.nextInt(2)

            when(number){
                0->{
                    cpuText.text = "相手の手はグーです"
                    katimakeText.text = "引き分けです"
                    katimakeText.setTextColor(Color.BLACK)
                }
                1->{
                    cpuText.text = "相手の手はチョキです"
                    katimakeText.text = "あなたの勝ちです"
                    katimakeText.setTextColor(Color.RED)
                }
                2->{
                    cpuText.text = "相手の手はパーです"
                    katimakeText.text = "あなたの負けです"
                    katimakeText.setTextColor(Color.BLACK)
                }

            }

        }

        chokiButton.setOnClickListener {
            playerText.text = "あなたの手はチョキです"

            val number = Random.nextInt(2)

            when (number) {
                0 -> {
                    cpuText.text = "相手の手はグーです"
                    katimakeText.text = "あなたの負けです"
                    katimakeText.setTextColor(Color.BLACK)
                }
                1 -> {
                    cpuText.text = "相手の手はチョキです"
                    katimakeText.text = "引き分けです"
                    katimakeText.setTextColor(Color.BLACK)
                }
                2 -> {
                    cpuText.text = "相手の手はパーです"
                    katimakeText.text = "あなたの勝ちです"
                    katimakeText.setTextColor(Color.RED)
                }

            }


        }

        paaButton.setOnClickListener {
            playerText.text = "あなたの手はパーです"

            val number = Random.nextInt(2)

            when (number) {
                0 -> {
                    cpuText.text = "相手の手はグーです"
                    katimakeText.text = "あなたの勝ちです"
                    katimakeText.setTextColor(Color.RED)
                }
                1 -> {
                    cpuText.text = "相手の手はチョキです"
                    katimakeText.text = "あなたの負けです"
                    katimakeText.setTextColor(Color.BLACK)
                }
                2 -> {
                    cpuText.text = "相手の手はパーです"
                    katimakeText.text = "引き分けです"
                    katimakeText.setTextColor(Color.BLACK)
                }

            }


        }


    }
}