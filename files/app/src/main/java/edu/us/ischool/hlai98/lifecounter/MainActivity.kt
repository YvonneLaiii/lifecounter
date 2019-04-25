package edu.us.ischool.hlai98.lifecounter

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mes = findViewById<TextView>(R.id.message)
        var p1 = findViewById<TextView>(R.id.play1life)
        p1.text = "10"
        var p2 = findViewById<TextView>(R.id.play2life)
        p2.text = "10"
        var p3 = findViewById<TextView>(R.id.play3life)
        p3.text = "10"
        var p4 = findViewById<TextView>(R.id.player4life)
        p4.text = "10"

        val p1m1 = findViewById<Button>(R.id.btn1m1)
        p1m1.setOnClickListener() {
            var result = lifeChange("m1",1,p1.text.toString().toInt(), mes)
            p1.text = result
        }
        val p1p1 = findViewById<Button>(R.id.btn1p1)
        p1p1.setOnClickListener() {
            var result = lifeChange("p1",1,p1.text.toString().toInt(), mes)
            p1.text = result
        }
        val p1m5 = findViewById<Button>(R.id.btn1m5)
        p1m5.setOnClickListener() {
            var result = lifeChange("m5",1,p1.text.toString().toInt(), mes)
            p1.text = result
        }
        val p1p5 = findViewById<Button>(R.id.btn1p5)
        p1p5.setOnClickListener() {
            var result = lifeChange("p5",1,p1.text.toString().toInt(), mes)
            p1.text = result
        }

        val p2m1 = findViewById<Button>(R.id.btn2m1)
        p2m1.setOnClickListener() {
            var result = lifeChange("m1",2,p2.text.toString().toInt(),mes)
            p2.text = result
        }
        val p2p1 = findViewById<Button>(R.id.btn2p1)
        p2p1.setOnClickListener() {
            var result = lifeChange("p1",2,p2.text.toString().toInt(),mes)
            p2.text = result
        }
        val p2m5 = findViewById<Button>(R.id.btn2m5)
        p2m5.setOnClickListener() {
            var result = lifeChange("m5",2,p2.text.toString().toInt(),mes)
            p2.text = result
        }
        val p2p5 = findViewById<Button>(R.id.btn2p5)
        p2p5.setOnClickListener() {
            var result = lifeChange("p5",2,p2.text.toString().toInt(),mes)
            p2.text = result
        }

        val p3m1 = findViewById<Button>(R.id.btn3m1)
        p3m1.setOnClickListener() {
            var result = lifeChange("m1",3,p3.text.toString().toInt(),mes)
            p3.text = result
        }
        val p3p1 = findViewById<Button>(R.id.btn3p1)
        p3p1.setOnClickListener() {
            var result = lifeChange("m1",3,p3.text.toString().toInt(),mes)
            p3.text = result
        }
        val p3m5 = findViewById<Button>(R.id.btn3m5)
        p3m5.setOnClickListener() {
            var result = lifeChange("m5",3,p3.text.toString().toInt(),mes)
            p3.text = result
        }
        val p3p5 = findViewById<Button>(R.id.btn3p5)
        p3p5.setOnClickListener() {
            var result = lifeChange("p5",3,p3.text.toString().toInt(),mes)
            p3.text = result
        }

        val p4m1 = findViewById<Button>(R.id.btn4m1)
        p4m1.setOnClickListener() {
            var result = lifeChange("m1",4,p4.text.toString().toInt(),mes)
            p4.text = result
        }
        val p4p1 = findViewById<Button>(R.id.btn4p1)
        p4p1.setOnClickListener() {
            var result = lifeChange("p1",4,p4.text.toString().toInt(),mes)
            p4.text = result
        }
        val p4m5 = findViewById<Button>(R.id.btn4m5)
        p4m5.setOnClickListener() {
            var result = lifeChange("m5",4,p4.text.toString().toInt(),mes)
            p4.text = result
        }
        val p4p5 = findViewById<Button>(R.id.btn4p5)
        p4p5.setOnClickListener() {
            var result = lifeChange("p5",4,p4.text.toString().toInt(),mes)
            p4.text = result
        }

    }
    private fun lifeChange(calculate: String, player: Int, current: Int, mes: TextView) : String {
        var cur = current
        if (calculate == "m1") {
            cur -= 1
        } else if (calculate == "p1") {
            cur += 1
        } else if (calculate == "m5") {
            cur -= 5
        } else {
            cur += 5
        }
        if (cur <= 0) {
            var temp = "Player " + player + " LOSES!"
            mes.setText(temp)
        }
        return cur.toString()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
