package fia.ues.sv.login;

import android.app.ListActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainMenuActivity extends ListActivity {

    String[] menu={"Usuarios","Docentes","Grados Academicos", "Experiencia laboral","Experiencia Academica","Salir"};
    String[] activities ={"","MenuUsuarioActivity"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /** String userName = getIntent().getStringExtra("userName");
        TextView tv = (TextView) findViewById(R.id.textWusuario);
        tv.setText(userName);*///No se porque no agarra esto

        ;
        setContentView(R.layout.activity_main_menu);

        View header = getLayoutInflater().inflate(R.layout.header_view_mp, null);
        ListView listView = getListView();
        listView.addHeaderView(header);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.menu_row,R.id.label,menu);
        setListAdapter(adapter);


    }
    @Override
    public void onBackPressed() {
    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        if(position!=6){
           String nombreValue=activities[position];
            System.out.println("------------------------------>"+nombreValue+" "+position);

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
