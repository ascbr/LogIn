package fia.ues.sv.login;

import android.app.ListActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CrudUsuario extends ListActivity {
    String[] menu={"Nuevo Usuario","Actualizar Usuario","Eliminar Usuario", "Consultar Usuario" , "REGRESAR"};
    String[] activities ={"","CrearUsuarioActivity","ActualizarUsuarioActivity","EliminarUsuarioActivity","ConsultarUsuarioActivity"};
    String ID_;
    DataBaseHelper helper;

   String[] permisos ={"","001","002","003","004"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crud_usuario);
        helper = new DataBaseHelper(this);

        ID_ = getIntent().getStringExtra("id");
        System.out.println("------------> ID capturado crud:"+ID_);
        View header = getLayoutInflater().inflate(R.layout.header_usuario, null);
        ListView listView = getListView();
        listView.addHeaderView(header);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.menu_row,R.id.label,menu);
        setListAdapter(adapter);
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if (position != 5 ) {


            String nombreValue = activities[position];
            System.out.println("------------------------------>" + nombreValue + " " + position);
            if(helper.checkPermiso(ID_,permisos[position])){
                try {
                    Class<?> clase = Class.forName("fia.ues.sv.login." + nombreValue);

                    Intent inte = new Intent(this, clase);
                    inte.putExtra("id",ID_);
                    this.startActivity(inte);

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }else{
                Toast.makeText(this,"No tiene pemiso para "+menu[position-1],Toast.LENGTH_SHORT).show();
            }


        }else{
            try{
                Class<?> clase=Class.forName("fia.ues.sv.login.MainMenuActivity");

                Intent inte = new Intent(this,clase);
                inte.putExtra("id",ID_);
                this.startActivity(inte);

            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }
        }
    }
    @Override
    public void onBackPressed() {
    }
}
