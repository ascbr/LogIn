package fia.ues.sv.login;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainMenuActivity extends ListActivity {

    String[] menu={"Usuarios","Docentes","Grados Academicos", "Experiencia laboral","Experiencia Academica","Salir"};
    String[] activities ={"MenuUsuarioActivity"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /** String userName = getIntent().getStringExtra("userName");
        TextView tv = (TextView) findViewById(R.id.textWusuario);
        tv.setText(userName);*///No se porque no agarra esto
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu));


    }
    @Override
    public void onBackPressed() {
    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        if(position!=5){
           String nombreValue=activities[position];
            try{
                Class<?> clase=Class.forName("fia.ues.sv.login."+nombreValue);
                Intent inte = new Intent(this,clase);
                this.startActivity(inte);

            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }
        }else{
            try{
                Class<?> clase=Class.forName("fia.ues.sv.login.LogInActivity");

                Intent inte = new Intent(this,clase);

               // inte.putExtra("userName",usuario.getText().toString());
                this.startActivity(inte);

            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }
        }
    }
}
