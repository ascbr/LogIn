package fia.ues.sv.login;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MenuUsuarioActivity extends ListActivity {

    String[] menu={"Usuarios","Acceso de Usuario","Opciones de CRUD" };
    String[] activities ={"","CrudUsuario","CrudAccesoUsuario","CrudOpcionCrud"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_usuario);

        View header = getLayoutInflater().inflate(R.layout.header_usuario, null);
        ListView listView = getListView();
        listView.addHeaderView(header);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.menu_row,R.id.label,menu);
        setListAdapter(adapter);

    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);

            String nombreValue=activities[position];
            System.out.println("------------------------------>"+nombreValue+" "+position);

            try{
                Class<?> clase=Class.forName("fia.ues.sv.login."+nombreValue);
                Intent inte = new Intent(this,clase);
                this.startActivity(inte);

            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }

    }


}
