package fia.ues.sv.login;

import android.app.Activity;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EliminarUsuarioActivity extends Activity {
    EditText editNombre;
    DataBaseHelper helper;
    String ID_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminar_usuario);
        ID_ = getIntent().getStringExtra("id");
        helper = new DataBaseHelper(this);
        editNombre = (EditText) findViewById(R.id.editText_nombre);
    }

    public void eliminarUsuario(View v){
        String regEliminadas;
        helper.abrir();
        Usuario usuario = helper.consultarUsuario(editNombre.getText().toString());
        helper.cerrar();
        if(usuario == null){
            Toast.makeText(this,"El usuario: "+editNombre.getText().toString()+" no se encuentra registrado",Toast.LENGTH_SHORT).show();
        }else{
            helper.abrir();
            regEliminadas = helper.eliminar(usuario);
            helper.cerrar();
            Toast.makeText(this,"Usuario: "+editNombre.getText().toString()+" Eliminado",Toast.LENGTH_SHORT).show();

            try{
                Class<?> clase=Class.forName("fia.ues.sv.login.CrudUsuario");

                Intent inte = new Intent(this,clase);

                inte.putExtra("id",ID_);//devolver id
                this.startActivity(inte);

            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }
        }


    }

    public void regresar(View v){
        try{
            Class<?> clase=Class.forName("fia.ues.sv.login.CrudUsuario");

            Intent inte = new Intent(this,clase);

            inte.putExtra("id",ID_);//devolver id
            this.startActivity(inte);

        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public void onBackPressed() {
    }
}
