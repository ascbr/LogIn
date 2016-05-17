package fia.ues.sv.login;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IntegerRes;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class CrearUsuarioActivity extends Activity {

    String ID_;

//helper DB
    DataBaseHelper helper;
//Cuadros de texto
    EditText editNombre;
    EditText editPass;

//cuadros de verificacion
    CheckBox i_usuario;
    CheckBox a_usuario;
    CheckBox e_usuario;
    CheckBox c_usuario;
    CheckBox i_docente;
    CheckBox a_docente;
    CheckBox e_docente;
    CheckBox c_docente;
    CheckBox i_tipo_contratacion;
    CheckBox a_tipo_contratacion;
    CheckBox e_tipo_contratacion;
    CheckBox c_tipo_contratacion;
    CheckBox i_categoria;
    CheckBox a_categoria;
    CheckBox e_categoria;
    CheckBox c_categoria;
    CheckBox i_detalle_grado_acad;
    CheckBox a_detalle_grado_acad;
    CheckBox e_detalle_grado_acad;
    CheckBox c_detalle_grado_acad;
    CheckBox i_grado_acad;
    CheckBox a_grado_acad;
    CheckBox e_grado_acad;
    CheckBox c_grado_acad;
    CheckBox i_institucion_grado_acad;
    CheckBox a_institucion_grado_acad;
    CheckBox e_institucion_grado_acad;
    CheckBox c_institucion_grado_acad;
    CheckBox i_exp_lab;
    CheckBox a_exp_lab;
    CheckBox e_exp_lab;
    CheckBox c_exp_lab;
    CheckBox i_cargo;
    CheckBox a_cargo;
    CheckBox e_cargo;
    CheckBox c_cargo;
    CheckBox i_empresa;
    CheckBox a_empresa;
    CheckBox e_empresa;
    CheckBox c_empresa;
    CheckBox i_exp_acad;
    CheckBox a_exp_acad;
    CheckBox e_exp_acad;
    CheckBox c_exp_acad;
    CheckBox i_ciclo;
    CheckBox a_ciclo;
    CheckBox e_ciclo;
    CheckBox c_ciclo;
    CheckBox i_puesto;
    CheckBox a_puesto;
    CheckBox e_puesto;
    CheckBox c_puesto;
    CheckBox i_materia;
    CheckBox a_materia;
    CheckBox e_materia;
    CheckBox c_materia;
    CheckBox i_institucion_exp_acad;
    CheckBox a_institucion_exp_acad;
    CheckBox e_institucion_exp_acad;
    CheckBox c_institucion_exp_acad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_usuario);
        ID_ = getIntent().getStringExtra("id");

        helper = new DataBaseHelper(this);

        //cuadros de texto
        editNombre = (EditText) findViewById(R.id.editText_nombre);
        editPass = (EditText) findViewById(R.id.editText_pass);

        //cuadros de verificacion
       i_usuario = (CheckBox) findViewById(R.id.usuario_insertatCheck);
        a_usuario = (CheckBox) findViewById(R.id.usuario_actualizarCheck);
        e_usuario = (CheckBox) findViewById(R.id.usuario_eliminarCheck);
        c_usuario = (CheckBox) findViewById(R.id.usuario_consultarCheck);
        i_docente = (CheckBox) findViewById(R.id.docente_insertarCheck);
        a_docente = (CheckBox) findViewById(R.id.docente_actualizarCheck);
        e_docente = (CheckBox) findViewById(R.id.docente_eliminarCheck);
        c_docente = (CheckBox) findViewById(R.id.docente_consultarCheck);
        i_tipo_contratacion = (CheckBox) findViewById(R.id.contratacion_insertarCheck);
        a_tipo_contratacion = (CheckBox) findViewById(R.id.contratacion_actualizarCheck);
        e_tipo_contratacion = (CheckBox) findViewById(R.id.contratacion_eliminarCheck);
        c_tipo_contratacion = (CheckBox) findViewById(R.id.contratacion_consultarCheck);
        i_categoria = (CheckBox) findViewById(R.id.categoria_insertarCheck);
        a_categoria = (CheckBox) findViewById(R.id.categoria_actualizarCheck);
        e_categoria = (CheckBox) findViewById(R.id.categoria_eliminarCheck);
        c_categoria = (CheckBox) findViewById(R.id.categoria_consultarCheck);
        i_detalle_grado_acad = (CheckBox) findViewById(R.id.detalleGAcad_insertarCheck);
        a_detalle_grado_acad = (CheckBox) findViewById(R.id.detalleGAcad_actualizarCheck);
        e_detalle_grado_acad = (CheckBox) findViewById(R.id.detalleGAcad_eliminarCheck);
        c_detalle_grado_acad = (CheckBox) findViewById(R.id.detalleGAcad_consultarCheck);
        i_grado_acad = (CheckBox) findViewById(R.id.gradoAcad_insertarCheck);
        a_grado_acad = (CheckBox) findViewById(R.id.gradoAcad_actualizarCheck);
        e_grado_acad = (CheckBox) findViewById(R.id.gradoAcad_eliminarCheck);
        c_grado_acad = (CheckBox) findViewById(R.id.gradoAcad_consultarCheck);
        i_institucion_grado_acad = (CheckBox) findViewById(R.id.institucionAcad_insertarCheck);
        a_institucion_grado_acad = (CheckBox) findViewById(R.id.institucionAcad_actualizarCheck);
        e_institucion_grado_acad = (CheckBox) findViewById(R.id.institucionAcad_eliminarCheck);
        c_institucion_grado_acad = (CheckBox) findViewById(R.id.institucionAcad_consultarCheck);
        i_exp_lab = (CheckBox) findViewById(R.id.expLab_insertarCheck);
        a_exp_lab = (CheckBox) findViewById(R.id.expLab_actualizarCheck);
        e_exp_lab = (CheckBox) findViewById(R.id.expLab_eliminarCheck);
        c_exp_lab = (CheckBox) findViewById(R.id.expLab_consultarCheck);
        i_cargo= (CheckBox) findViewById(R.id.cargo_insertarCheck);
        a_cargo= (CheckBox) findViewById(R.id.cargo_actualizarCheck);
        e_cargo= (CheckBox) findViewById(R.id.cargo_eliminarCheck);
        c_cargo= (CheckBox) findViewById(R.id.cargo_consultarCheck);
        i_empresa= (CheckBox) findViewById(R.id.empresa_insertarCheck);
        a_empresa= (CheckBox) findViewById(R.id.empresa_actualizarCheck);
        e_empresa= (CheckBox) findViewById(R.id.empresa_eliminarCheck);
        c_empresa= (CheckBox) findViewById(R.id.empresa_consultarCheck);
        i_exp_acad= (CheckBox) findViewById(R.id.expAcad_insertarCheck);
        a_exp_acad= (CheckBox) findViewById(R.id.expAcad_actualizarheck);
        e_exp_acad= (CheckBox) findViewById(R.id.expAcad_eliminarCheck);
        c_exp_acad= (CheckBox) findViewById(R.id.expAcad_consultarCheck);
        i_ciclo= (CheckBox) findViewById(R.id.ciclo_insertarCheck);
        a_ciclo= (CheckBox) findViewById(R.id.ciclo_actualizarCheck);
        e_ciclo= (CheckBox) findViewById(R.id.ciclo_eliminarCheck);
        c_ciclo= (CheckBox) findViewById(R.id.ciclo_consultarCheck);
        i_puesto= (CheckBox) findViewById(R.id.puesto_insertarCheck);
        a_puesto= (CheckBox) findViewById(R.id.puesto_actualizarCheck);
        e_puesto= (CheckBox) findViewById(R.id.puesto_eliminarCheck);
        c_puesto= (CheckBox) findViewById(R.id.puesto_consultarCheck);
        i_materia= (CheckBox) findViewById(R.id.materia_insertarCheck);
        a_materia= (CheckBox) findViewById(R.id.materia_actualizarCheck);
        e_materia= (CheckBox) findViewById(R.id.materia_eliminarCheck);
        c_materia= (CheckBox) findViewById(R.id.materia_consultarCheck);
        i_institucion_exp_acad= (CheckBox) findViewById(R.id.institucionAcad_insertarCheck);
        a_institucion_exp_acad= (CheckBox) findViewById(R.id.institucionAcad_actualizarCheck);
        e_institucion_exp_acad= (CheckBox) findViewById(R.id.institucionAcad_eliminarCheck);
        c_institucion_exp_acad= (CheckBox) findViewById(R.id.institucionAcad_consultarCheck);



    }

    public void insertarUsuario(View v){
        String nombre = editNombre.getText().toString();
        String pass = editPass.getText().toString();

        String max = null;
        max=helper.getMaxIdUsuario();
        helper.cerrar();
        String maximo = null;
        System.out.println(max);
        String regInsertados;

        //Insertar en tabla usuario
        int max_id = Integer.parseInt(max);
        max_id+=1;

        if(max_id <= 9){
            maximo = "0"+String.valueOf(max_id);
        }
        else{
            maximo = String.valueOf(max_id);
        }

        Usuario usuario = new Usuario(maximo,nombre,pass);
        boolean encontrado=false;
        encontrado = helper.verificarIntegridad(usuario,1);
        if(!encontrado) {

            helper.abrir();
            regInsertados = helper.insertar(usuario);
            helper.cerrar();


            //permisos
            AccesoUsuario au = new AccesoUsuario();
            if (i_usuario.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("001");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (a_usuario.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("002");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (e_usuario.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("003");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (c_usuario.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("004");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (i_docente.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("011");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }

            if (a_docente.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("012");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (e_docente.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("013");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (c_docente.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("014");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (i_tipo_contratacion.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("021");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (a_tipo_contratacion.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("022");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (e_tipo_contratacion.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("023");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (c_tipo_contratacion.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("024");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (i_categoria.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("031");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (a_categoria.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("032");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (e_categoria.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("033");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (c_categoria.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("034");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (i_detalle_grado_acad.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("041");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (a_detalle_grado_acad.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("042");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (e_detalle_grado_acad.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("043");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (c_detalle_grado_acad.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("044");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (i_grado_acad.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("051");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (i_grado_acad.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("052");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (i_grado_acad.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("053");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (i_grado_acad.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("054");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (i_institucion_grado_acad.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("061");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (a_institucion_grado_acad.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("062");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (e_institucion_grado_acad.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("063");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (c_institucion_grado_acad.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("064");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (i_exp_lab.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("071");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (a_exp_lab.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("072");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (e_exp_lab.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("073");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (c_exp_lab.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("074");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (i_cargo.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("081");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (a_cargo.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("082");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (e_cargo.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("083");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (c_cargo.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("084");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (i_empresa.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("091");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (a_empresa.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("092");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (e_empresa.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("093");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (c_empresa.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("094");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (i_exp_acad.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("101");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (a_exp_acad.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("102");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (e_exp_acad.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("103");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (c_exp_acad.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("104");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (i_ciclo.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("111");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (a_ciclo.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("112");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (e_ciclo.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("113");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (c_ciclo.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("114");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (i_puesto.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("121");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (a_puesto.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("122");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (e_puesto.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("123");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (c_puesto.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("124");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (i_materia.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("131");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (a_materia.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("132");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (e_materia.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("133");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (c_materia.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("134");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (i_institucion_exp_acad.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("141");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (a_institucion_exp_acad.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("142");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (e_institucion_exp_acad.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("143");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }
            if (c_institucion_exp_acad.isChecked()) {
                au.setIdUsuario(maximo);
                au.setIdOpcion("144");
                helper.abrir();
                regInsertados = helper.insertar(au);
                helper.cerrar();
            }

            Toast.makeText(this,"Se creo nuevo usuario con sus respectivos permisos registros: "+regInsertados,Toast.LENGTH_SHORT).show();
            try{
                Class<?> clase=Class.forName("fia.ues.sv.login.CrudUsuario");

                Intent inte = new Intent(this,clase);
                inte.putExtra("id",ID_);
                this.startActivity(inte);

            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }

        }else{
            Toast.makeText(this,"Ya existe un usuario con ese nombre",Toast.LENGTH_SHORT).show();
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
