package rueda.bici;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.List;

import rueda.bici.modelos.Rodada;

/**
 * Created by juan on 7/11/16.
 */

public class ListaRodadasAdapter extends BaseAdapter {

    private Activity actividad;
    private List<Rodada> lista;
    private static LayoutInflater inflater;

    public ListaRodadasAdapter(Activity actividad, List<Rodada> lista) {
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

        final Rodada temp = lista.get(position);
        View row = convertView;
        if (row == null){
            row = inflater.inflate(R.layout.rodada_row, null);
            holder = new Holder();
            holder.imagen = (ImageView) row.findViewById(R.id.imagenRodada);
            holder.nombre = (TextView) row.findViewById(R.id.nombreRodada);
            holder.lugar = (TextView) row.findViewById(R.id.lugarRodada);
            holder.fecha = (TextView) row.findViewById(R.id.fechaRodada);
            row.setTag(holder);
        } else {
            holder = (Holder) row.getTag();
        }

        //holder.imagen = "";
        holder.nombre.setText(temp.getNombre());
        holder.lugar.setText(temp.getLugar());
        holder.fecha.setText(new SimpleDateFormat("yyyy-MM-dd").format(temp.getFecha()));
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
