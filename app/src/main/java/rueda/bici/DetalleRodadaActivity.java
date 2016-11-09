package rueda.bici;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;

import rueda.bici.modelos.Rodada;

public class DetalleRodadaActivity extends AppCompatActivity {

    private Rodada rodadaSeleccionada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_rodada);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        rodadaSeleccionada = (Rodada) getIntent().getExtras().getSerializable("rodadaSeleccionada");

        ImageView imagenDetalleRodada = (ImageView) findViewById(R.id.imagenDetalleRodada);
        TextView fechaDetalleRodada = (TextView) findViewById(R.id.fechaDetalleRodada);
        TextView nombreDetalleRodada = (TextView) findViewById(R.id.nombreDetalleRodada);
        TextView organizadorDetalleRodada = (TextView) findViewById(R.id.organizadorDetalleRodada);
        TextView descripcionDetalleRodada = (TextView) findViewById(R.id.descripcionDetalleRodada);
        TextView duracionDetalleRodada = (TextView) findViewById(R.id.duracionDetalleRodada);
        TextView puntoEncuentroDetalleRodada = (TextView) findViewById(R.id.puntoEncuentroDetalleRodada);
        TextView destinoDetalleRodada = (TextView) findViewById(R.id.destinoDetalleRodada);
        Button contactarOrganizador = (Button) findViewById(R.id.contactarOrganizador);
        Button invitarAmigo = (Button) findViewById(R.id.invitarAmigo);

        imagenDetalleRodada = rodadaSeleccionada.getImagen();
        fechaDetalleRodada.setText(new SimpleDateFormat("yyyy-MM-dd").format(rodadaSeleccionada.getFecha()));
        nombreDetalleRodada.setText(rodadaSeleccionada.getNombre());
        organizadorDetalleRodada.setText(rodadaSeleccionada.getOrganizador());
        descripcionDetalleRodada.setText(rodadaSeleccionada.getDescripcion());
        duracionDetalleRodada.setText(rodadaSeleccionada.getDuracion());
        puntoEncuentroDetalleRodada.setText(rodadaSeleccionada.getPuntoEncuentro());
        destinoDetalleRodada.setText(rodadaSeleccionada.getDestino());
        contactarOrganizador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DetalleRodadaActivity.this, "Organizador",Toast.LENGTH_LONG).show();
            }
        });
        invitarAmigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DetalleRodadaActivity.this, "Amigo",Toast.LENGTH_LONG).show();
            }
        });
    }
}