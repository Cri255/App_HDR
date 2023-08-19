package com.example.app_hdr.Adaptador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app_hdr.R;

import java.util.List;

import java.util.List;

public class Adaptador  extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    private List<String> datos; // Lista de datos que se mostrarán

    // Constructor del adaptador
    public Adaptador(List<String> datos) {
        this.datos = datos;
    }

    // Métodos obligatorios para RecyclerView.Adapter
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desing, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String dato = datos.get(position);
        holder.bind(dato);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    // ViewHolder interno
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.texto); // Reemplaza con la vista correcta
        }

        public void bind(String dato) {
            textView.setText(dato);
        }
    }
}