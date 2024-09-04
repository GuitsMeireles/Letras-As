package com.me1rel3s.letrasas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.me1rel3s.letrasas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Configurando a ação do botão "Verificar Letras"
        binding.btCalculate.setOnClickListener {
            val input = binding.tietFibonacci.text.toString()
            if (input.isNotEmpty()) {
                val result = checkForLetterA(input)
                binding.tvResult.text = result
            } else {
                binding.tvResult.text = "Por favor, insira uma string."
            }
        }
    }

    // Função para verificar a presença e contagem da letra 'a'
    private fun checkForLetterA(input: String): String {
        val count = input.count { it.equals('a', true) }
        return if (count > 0) {
            "A letra 'a' aparece $count vez(es) na string."
        } else {
            "A letra 'a' não foi encontrada na string."
        }
    }
}
