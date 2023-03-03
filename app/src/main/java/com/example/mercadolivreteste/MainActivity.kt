package com.example.mercadolivreteste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mercadolivreteste.adapter.AnuncioApter
import com.example.mercadolivreteste.adapter.ProdutoAdapter
import com.example.mercadolivreteste.databinding.ActivityMainBinding
import com.example.mercadolivreteste.databinding.AnuncioItemBinding
import com.example.mercadolivreteste.model.Anuncio
import com.example.mercadolivreteste.model.Produto

class MainActivity : AppCompatActivity() {

    private lateinit var Binding: ActivityMainBinding
    private lateinit var anuncioAdapter: AnuncioApter
    private lateinit var produtoAdapter: ProdutoAdapter
    private val listaAnuncio: MutableList<Anuncio> = mutableListOf()
    private val listaProduto:MutableList<Produto> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(Binding.root)

        val recyclerViewAnuncios = Binding.recyclerViewAnuncios
        recyclerViewAnuncios.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        recyclerViewAnuncios.setHasFixedSize(true)
        anuncioAdapter = AnuncioApter(this,listaAnuncio)
        recyclerViewAnuncios.adapter = anuncioAdapter
        getAnuncios()

        val recyclerViewProdutos = Binding.recyclerViewProdutos
        recyclerViewProdutos.layoutManager = GridLayoutManager(this,2 )
        recyclerViewProdutos.setHasFixedSize(true)
        produtoAdapter = ProdutoAdapter(this,listaProduto)
        recyclerViewProdutos.adapter = produtoAdapter
        getProdutos()
    }

    private fun getAnuncios() {
        val anuncio2 = Anuncio(R.drawable.anuncio2)
        listaAnuncio.add(anuncio2)

        val anuncio1 = Anuncio(R.drawable.anuncio1)
        listaAnuncio.add(anuncio1)

        val anuncio3 = Anuncio(R.drawable.anuncio3)
        listaAnuncio.add(anuncio3)

        val anuncio4 = Anuncio(R.drawable.anuncio4)
        listaAnuncio.add(anuncio4)
    }

    private fun getProdutos(){
        val produto1 = Produto(R.drawable.produto1,"R$ 1.200,00","Jordan","Frete grátis")
        listaProduto.add(produto1)

        val produto2 = Produto(R.drawable.produto2,"R$ 600,00","Controle de Xbox da cor verde musgo","Frete grátis")
        listaProduto.add(produto2)

        val produto3 = Produto(R.drawable.produto3,"R$ 3.900,00","Pc Gamer","Frete grátis")
        listaProduto.add(produto3)

        val produto4 = Produto(R.drawable.produto4,"R$ 5.000,00","S22, S22 Ultra nova geração","Frete grátis")
        listaProduto.add(produto4)

    }

}