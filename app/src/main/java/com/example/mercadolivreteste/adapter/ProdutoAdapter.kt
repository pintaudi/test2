package com.example.mercadolivreteste.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mercadolivreteste.databinding.ProdutoItemBinding
import com.example.mercadolivreteste.model.Produto

    class ProdutoAdapter (private val context: Context, val listaProdutos: MutableList<Produto> ):
        RecyclerView.Adapter<ProdutoAdapter.ProdutoViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
            val itemLista = ProdutoItemBinding.inflate(LayoutInflater.from(context),parent,false)
            return ProdutoViewHolder(itemLista)
        }

        override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
            holder.imgProduto.setImageResource(listaProdutos[position].img!!)
            holder.precoProduto.text = listaProdutos[position].preco
            holder.descricaoProduto.text = listaProdutos[position].descricao
            holder.frete.text = listaProdutos[position].frete
        }

        override fun getItemCount() = listaProdutos.size

        inner class ProdutoViewHolder(Binding: ProdutoItemBinding): RecyclerView.ViewHolder(Binding.root){
            val  imgProduto = Binding.img
            val  precoProduto = Binding.txtPreco
            val descricaoProduto = Binding.txtDescricao
            val frete = Binding.txtFrete
        }
    }


