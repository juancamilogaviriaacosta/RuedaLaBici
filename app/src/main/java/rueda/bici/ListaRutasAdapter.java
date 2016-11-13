package rueda.bici;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.List;

import rueda.bici.DetalleRutaActivity;
import rueda.bici.R;
import rueda.bici.modelos.Ruta;
import rueda.bici.modelos.Ruta;

/**
 * Created by juan on 7/11/16.
 */

public class ListaRutasAdapter extends BaseAdapter {

    private Activity actividad;
    private List<Ruta> lista;
    private static LayoutInflater inflater;

    public ListaRutasAdapter(Activity actividad, List<Ruta> lista) {
        this.actividad = actividad;
        this.lista = lista;
        inflater = (LayoutInflater) actividad.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return Long.valueOf(lista.get(position).getId());
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Holder holder;

        final Ruta temp = lista.get(position);
        View row = convertView;
        if (row == null){
            row = inflater.inflate(R.layout.ruta_row, null);
            holder = new Holder();
            holder.imagen = (ImageView) row.findViewById(R.id.imagenRuta);
            holder.nombre = (TextView) row.findViewById(R.id.nombreRuta);
            holder.lugar = (TextView) row.findViewById(R.id.lugarRuta);
            holder.fecha = (TextView) row.findViewById(R.id.fechaRuta);
            row.setTag(holder);
        } else {
            holder = (Holder) row.getTag();
        }

        //holder.imagen = "";
        holder.nombre.setText(temp.getNombre());
        holder.lugar.setText(temp.getPuntoEncuentro());
        holder.fecha.setText(new SimpleDateFormat("yyyy-MM-dd").format(temp.getFecha()));

        row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(actividad, DetalleRutaActivity.class);
                intent.putExtra("rutaSeleccionada", temp);
                actividad.startActivity(intent);
            }
        });
        return row;
    }

    public class Holder
    {
        ImageView imagen;
        TextView nombre;
        TextView lugar;
        TextView fecha;
    }
}