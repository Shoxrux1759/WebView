package com.example.kalkulyator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var ekran: EditText
    private var ekranText: StringBuilder = StringBuilder()
    private var isResultDisplayed: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ekran = findViewById(R.id.ekran)
    }

    override fun onClick(v: View?) {
        v ?: return

        when (v.id) {
            R.id.nol, R.id.bir, R.id.ikki, R.id.uch, R.id.turt, R.id.besh,
            R.id.olti, R.id.sakkiz, R.id.tuqqiz, R.id.yetti, R.id.vergul -> {
                if (isResultDisplayed) {
                    clearScreen()
                }
                ekranText.append((v as Button).text.toString())
                ekran.setText(ekranText.toString())
            }
            R.id.ac -> {
                clearScreen()
            }
            R.id.foiz -> {
                if (ekranText.isNotEmpty() && ekranText.toString().toDoubleOrNull() != null) {
                    val result = ekranText.toString().toDouble() / 100
                    ekranText.clear()
                    ekran.setText(result.toString())
                    isResultDisplayed = true
                }
            }
            R.id.bul, R.id.kup, R.id.ayir, R.id.qosh -> {
                val operator = (v as Button).text.toString()
                if (operator == "+" || operator == "-" || operator == "*" || operator == "/") {
                    if (ekranText.isNotEmpty()) {
                        if (endsWithOperator()) {
                            ekranText.deleteCharAt(ekranText.length - 1)
                        }
                        ekranText.append(operator)
                        ekran.setText(ekranText.toString())
                        isResultDisplayed = false
                    }
                } else if (operator == "x") {
                    if (ekranText.isNotEmpty()) {
                        if (endsWithOperator()) {
                            ekranText.deleteCharAt(ekranText.length - 1)
                        }
                        ekranText.append("*")
                        ekran.setText(ekranText.toString())
                        isResultDisplayed = false
                    }
                }
            }

            R.id.teng -> {
                if (ekranText.isNotEmpty()) {
                    if (endsWithOperator()) {
                        ekranText.deleteCharAt(ekranText.length - 1)
                    }
                    evaluateExpression()
                    isResultDisplayed = true
                }
            }

            R.id.pilu_minus -> {
                if (ekranText.isNotEmpty()) {
                    val number = ekranText.toString().toDouble()
                    ekranText.clear()
                    if (number != 0.0) {
                        val result = -number
                        ekranText.append(result.toString())
                        ekran.setText(ekranText.toString())
                        isResultDisplayed = false
                    }
                }
            }
        }
    }

    private fun endsWithOperator(): Boolean {
        return ekranText.endsWith("/") || ekranText.endsWith("*") ||
                ekranText.endsWith("-") || ekranText.endsWith("+")
    }

    private fun evaluateExpression() {
        val expression = ExpressionBuilder(ekranText.toString()).build()
        try {
            val result = expression.evaluate()
            if (result.isNaN() || result.isInfinite()) {
                ekran.setText("Sonni 0 ga bo'lish mumkin emas")
            } else {
                ekranText.clear()
                if (result % 1 == 0.0) {
                    ekran.setText(result.toInt().toString())
                } else {
                    ekran.setText(result.toString())
                }
            }
        } catch (e: ArithmeticException) {
            ekran.setText("Sonni 0 ga bo'lish mumkin emas")
        } catch (e: IllegalArgumentException) {
            ekran.setText("Sonni 0 ga bo'lish mumkin emas")
        }
    }



    private fun clearScreen() {
        ekranText.clear()
        ekran.setText("0")
        isResultDisplayed = false
    }


}
