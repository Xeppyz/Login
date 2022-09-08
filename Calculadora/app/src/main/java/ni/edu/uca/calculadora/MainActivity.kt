package ni.edu.uca.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ni.edu.uca.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        iniciar()
    }

    private fun iniciar() {
       binding.btnSumar.setOnClickListener {
           var n1 = binding.etNum1.text.toString().toInt()
           var n2 = binding.etNum2.text.toString().toInt()

           val op = Operacion(n1, n2)
           val suma = op.sumar()

           binding.tvResultado.text = suma.toString()



           binding.btnRestar.setOnClickListener {
               var n1 = binding.etNum1.text.toString().toInt()
               var n2 = binding.etNum2.text.toString().toInt()

               val op = Operacion(n1, n2)
               val resta = op.restar()

               binding.tvResultado.text = suma.toString()
           }
       }
    }
}