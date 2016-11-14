package rueda.bici;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.text.SimpleDateFormat;

import rueda.bici.modelos.Ruta;

public class DetalleRutaActivity extends AppCompatActivity {
    
    private Ruta rutaSeleccionada;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_ruta);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        rutaSeleccionada = (Ruta) getIntent().getExtras().getSerializable("rutaSeleccionada");

        ImageView imagenDetalleRuta = (ImageView) findViewById(R.id.imagenDetalleRuta);
        TextView fechaDetalleRuta = (TextView) findViewById(R.id.fechaDetalleRuta);
        TextView nombreDetalleRuta = (TextView) findViewById(R.id.nombreDetalleRuta);
        TextView organizadorDetalleRuta = (TextView) findViewById(R.id.organizadorDetalleRuta);
        TextView descripcionDetalleRuta = (TextView) findViewById(R.id.descripcionDetalleRuta);
        TextView duracionDetalleRuta = (TextView) findViewById(R.id.duracionDetalleRuta);
        TextView puntoEncuentroDetalleRuta = (TextView) findViewById(R.id.puntoEncuentroDetalleRuta);
        TextView destinoDetalleRuta = (TextView) findViewById(R.id.destinoDetalleRuta);
        Button contactarOrganizador = (Button) findViewById(R.id.contactarOrganizador);
        Button invitarAmigo = (Button) findViewById(R.id.invitarAmigo);

        imagenDetalleRuta.setImageResource(rutaSeleccionada.getImagen());
        fechaDetalleRuta.setText(new SimpleDateFormat("yyyy-MM-dd").format(rutaSeleccionada.getFecha()));
        nombreDetalleRuta.setText(rutaSeleccionada.getNombre());
        organizadorDetalleRuta.setText(rutaSeleccionada.getOrganizador());
        descripcionDetalleRuta.setText(rutaSeleccionada.getDescripcion());
        duracionDetalleRuta.setText(rutaSeleccionada.getDuracion());
        puntoEncuentroDetalleRuta.setText(rutaSeleccionada.getPuntoEncuentro());
        destinoDetalleRuta.setText(rutaSeleccionada.getDestino());
        contactarOrganizador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DetalleRutaActivity.this, "Organizador",Toast.LENGTH_LONG).show();
            }
        });
        invitarAmigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DetalleRutaActivity.this, "Amigo",Toast.LENGTH_LONG).show();
            }
        });
    }

}
