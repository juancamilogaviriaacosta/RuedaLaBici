package rueda.bici.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import rueda.bici.AsistenciaRutaActivity;
import rueda.bici.ExplorarRodadasActivity;
import rueda.bici.ExplorarRutaActivity;
import rueda.bici.MenuPrincipal;
import rueda.bici.MiPerfilActivity;
import rueda.bici.R;
import rueda.bici.modelos.Rodada;

/**
 * Created by juan on 9/11/16.
 */

public class Utilidades {

    private static Utilidades instance;
    private List<Rodada> rodadas;

    public Utilidades() {
        String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";
        rodadas = new ArrayList<>();
        rodadas.add(new Rodada(1, null, "Rodada entre museos", "Bike House", new Date(), "120", "240", loremIpsum, "1.5 horas", "Museo Nacional", "Museo del Oro"));
        rodadas.add(new Rodada(2, null, "Bici paseo nocturno", "Andres Vergara", new Date(), "230", "450", loremIpsum, "1 horas", "Parque Virrey", "Plaza de Bolivar"));
        rodadas.add(new Rodada(3, null, "Rodada entre arboles", "Mejor en Bici", new Date(), "340", "560", loremIpsum, "1.5 horas", "Calle 85 con 15", "Jardin Botánico"));
        rodadas.add(new Rodada(4, null, "Cicloruta por la séptima", "Alcaldia de Bogotá", new Date(), "670", "240", loremIpsum, "1.5 horas", "Parque Nacional", "Andino"));
        rodadas.add(new Rodada(5, null, "Recorrido luminoso", "Julián Ponce", new Date(), "450", "780", loremIpsum, "1 horas", "Andino", "Plaza de Bolivar"));
    }

    public static Utilidades getInstance() {
        if(instance == null) {
            instance = new Utilidades();
        }
        return instance;
    }

    public boolean onNavigationItemSelected(Activity actividad, MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.nav_menu) {
            Intent intent = new Intent(actividad, MenuPrincipal.class);
            actividad.startActivity(intent);
        } else if (id == R.id.nav_perfil) {
            Intent intent = new Intent(actividad, MiPerfilActivity.class);
            actividad.startActivity(intent);
        } else if (id == R.id.nav_rodadas) {
            Intent intent = new Intent(actividad, ExplorarRodadasActivity.class);
            actividad.startActivity(intent);
        } else if (id == R.id.nav_rutas) {
            Intent intent = new Intent(actividad, ExplorarRutaActivity.class);
            actividad.startActivity(intent);
        } else if (id == R.id.nav_asistencia) {
            Intent intent = new Intent(actividad, AsistenciaRutaActivity.class);
            actividad.startActivity(intent);
        }
        actividad.finish();
        DrawerLayout drawer = (DrawerLayout) actividad.findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    //Autogenerado
    public List<Rodada> getRodadas() {
        return rodadas;
    }

    public void setRodadas(List<Rodada> rodadas) {
        this.rodadas = rodadas;
    }
}
