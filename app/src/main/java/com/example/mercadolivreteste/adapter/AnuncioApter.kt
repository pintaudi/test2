package com.example.mercadolivreteste.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mercadolivreteste.databinding.AnuncioItemBinding
import com.example.mercadolivreteste.model.Anuncio

 class AnuncioApter (private val context: Context, val listaAnuncios: MutableList<Anuncio> ): RecyclerView.Adapter<AnuncioApter.AnuncioViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnuncioViewHolder {
        val itemLista = AnuncioItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return AnuncioViewHolder(itemLista)
    }

    override fun onBindViewHolder(holder: AnuncioViewHolder, position: Int) {
        holder.imgAnuncio.setImageResource(listaAnuncios[position].img!!)
    }

     override fun getItemCount() = listaAnuncios.size

     inner class AnuncioViewHolder(Binding:AnuncioItemBinding): RecyclerView.ViewHolder(Binding.root){
         val imgAnuncio = Binding.anuncio

     }
}