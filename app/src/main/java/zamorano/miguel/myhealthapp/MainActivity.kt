package zamorano.miguel.myhealthapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val peso: EditText = findViewById(R.id.peso)
        val altura: EditText = findViewById(R.id.altura)
        val resultado: TextView = findViewById(R.id.resultado)
        val calcular: Button = findViewById(R.id.calcular)
        val rango: TextView = findViewById(R.id.rango)
        calcular.setOnClickListener(View.OnClickListener{
            var valorPeso: Double =  peso.text.toString().toDouble()
            var valorAltura: Double = altura.text.toString().toDouble()
            var imc: Double = valorPeso / (valorAltura*valorAltura)
            resultado.setText("Su IMC es: $imc")

            if(imc < 18.5) {
                rango.setText("Por debajo de tu peso");
                rango.setBackgroundResource(R.color.colorVerde)
            } else if (imc >=18.5 && imc < 25.0){
                rango.setBackgroundResource(R.color.colorVerdeAmarillo)
                rango.setText("Normal");

            } else if (imc >=25.0 && imc < 30.0){
                rango.setBackgroundResource(R.color.colorYellow)
                rango.setText("Sobrepeso");

            } else if (imc >=30.0 && imc < 40){
                rango.setBackgroundResource(R.color.colorOrange)
                rango.setText("Obesidad");

            } else if (imc >=40 ){
                rango.setBackgroundResource(R.color.colorRed)
                rango.setText("Obesidad nivel Dios");

            }


        })




    }
}
