package fia.ues.sv.login;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class ActualizarUsuarioActivity extends Activity {

    String ID_;

    DataBaseHelper helper;
    //cuadros de texto
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

    Button actualizar_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualizar_usuario);

        ID_ = getIntent().getStringExtra("id");

        helper = new DataBaseHelper(this);

        editNombre = (EditText) findViewById(R.id.editText_nombre);
        editPass = (EditText) findViewById(R.id.editText_pass);

        actualizar_btn = (Button) findViewById(R.id.button_actualizar);

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


    public void consultarUsuario(View v){
        editPass.setText("");

        i_usuario.setChecked(false);
        a_usuario.setChecked(false);
        e_usuario.setChecked(false);
        c_usuario.setChecked(false);
        i_docente.setChecked(false);
        a_docente.setChecked(false);
        e_docente.setChecked(false);
        c_docente.setChecked(false);
        i_tipo_contratacion.setChecked(false);
        a_tipo_contratacion.setChecked(false);
        e_tipo_contratacion.setChecked(false);
        c_tipo_contratacion.setChecked(false);
        i_categoria.setChecked(false);
        a_categoria.setChecked(false);
        e_categoria.setChecked(false);
        c_categoria.setChecked(false);
        i_detalle_grado_acad.setChecked(false);
        a_detalle_grado_acad.setChecked(false);
        e_detalle_grado_acad.setChecked(false);
        c_detalle_grado_acad.setChecked(false);
        i_grado_acad.setChecked(false);
        a_grado_acad.setChecked(false);
        e_grado_acad.setChecked(false);
        c_grado_acad.setChecked(false);
        i_institucion_grado_acad.setChecked(false);
        a_institucion_grado_acad.setChecked(false);
        e_institucion_grado_acad.setChecked(false);
        c_institucion_grado_acad.setChecked(false);
        i_exp_lab.setChecked(false);
        a_exp_lab.setChecked(false);
        e_exp_lab.setChecked(false);
        c_exp_lab.setChecked(false);
        i_cargo.setChecked(false);
        a_cargo.setChecked(false);
        e_cargo.setChecked(false);
        c_cargo.setChecked(false);
        i_empresa.setChecked(false);
        a_empresa.setChecked(false);
        e_empresa.setChecked(false);
        c_empresa.setChecked(false);
        i_exp_acad.setChecked(false);
        a_exp_acad.setChecked(false);
        e_exp_acad.setChecked(false);
        c_exp_acad.setChecked(false);
        i_ciclo.setChecked(false);
        a_ciclo.setChecked(false);
        e_ciclo.setChecked(false);
        c_ciclo.setChecked(false);
        i_puesto.setChecked(false);
        a_puesto.setChecked(false);
        e_puesto.setChecked(false);
        c_puesto.setChecked(false);
        i_materia.setChecked(false);
        a_materia.setChecked(false);
        e_materia.setChecked(false);
        c_materia.setChecked(false);
        i_institucion_exp_acad.setChecked(false);
        a_institucion_exp_acad.setChecked(false);
        e_institucion_exp_acad.setChecked(false);
        c_institucion_exp_acad.setChecked(false);

        helper.abrir();
        Usuario usuario = helper.consultarUsuario(editNombre.getText().toString());
        helper.cerrar();
        if(usuario == null)
            Toast.makeText(this, "Usuario: " + editNombre.getText().toString() +
                    " no encontrado", Toast.LENGTH_LONG).show();
        else {

            actualizar_btn.setEnabled(true);

            editPass.setText(usuario.getClave());
            boolean condicion;
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "001");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + "-001**** " + condicion);
            if (condicion) {
                i_usuario.setChecked(true);
            }

            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "002");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                a_usuario.setChecked(true);
            }

            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "003");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                e_usuario.setChecked(true);
            }

            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "004");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                c_usuario.setChecked(true);
            }

            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "011");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                i_docente.setChecked(true);
            }

            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "012");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                a_docente.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "013");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                e_docente.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "014");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                c_docente.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "021");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                i_tipo_contratacion.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "022");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                a_tipo_contratacion.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "023");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                e_tipo_contratacion.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "024");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                c_tipo_contratacion.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "031");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                i_categoria.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "032");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                a_categoria.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "033");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                e_categoria.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "034");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                c_categoria.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "041");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                i_detalle_grado_acad.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "042");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                a_detalle_grado_acad.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "043");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                e_detalle_grado_acad.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "044");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                c_detalle_grado_acad.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "051");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                i_grado_acad.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "052");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                a_grado_acad.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "053");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                e_grado_acad.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "054");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                c_grado_acad.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "061");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                i_institucion_grado_acad.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "062");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                a_institucion_grado_acad.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "063");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                e_institucion_grado_acad.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "064");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                c_institucion_grado_acad.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "071");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                i_exp_lab.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "072");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                a_exp_lab.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "073");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                e_exp_lab.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "074");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                c_exp_lab.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "081");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                i_cargo.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "082");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                a_cargo.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "083");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                e_cargo.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "084");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                c_cargo.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "091");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                i_empresa.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "092");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                a_empresa.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "093");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                e_empresa.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "094");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                e_empresa.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "101");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                i_exp_acad.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "102");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                a_exp_acad.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "103");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                e_exp_acad.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "104");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                c_exp_acad.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "111");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                i_ciclo.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "112");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                a_ciclo.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "113");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                e_ciclo.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "114");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                c_ciclo.setChecked(true);
            }

            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "121");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                i_puesto.setChecked(true);
            }

            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "122");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                a_puesto.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "123");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                e_puesto.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "124");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                c_puesto.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "131");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                i_materia.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "132");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                a_materia.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "133");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                e_materia.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "134");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                c_materia.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "141");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                i_institucion_exp_acad.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "142");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                a_institucion_exp_acad.setChecked(true);
            }
            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "143");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                e_institucion_exp_acad.setChecked(true);
            }

            helper.abrir();
            condicion = helper.checkPermiso(usuario.getIdUsuario(), "144");
            helper.cerrar();
            System.out.println(usuario.getIdUsuario() + " **** " + condicion);
            if (condicion) {
                c_institucion_exp_acad.setChecked(true);
                //si condicion es TRUE lo deje pasar al siguiente activiti sino que le mande un mensaje
            }
        }
    }

    public void actualizarUsuario(View v){
        helper.abrir();
        Usuario usuario = helper.consultarUsuario(editNombre.getText().toString());
        helper.cerrar();


        String regInsertados=null;

        if(usuario == null){

        }else{
            String maximo = usuario.getIdUsuario();

            helper.abrir();
            String estado = helper.actualizar(usuario);
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
            Toast.makeText(this,"Se Actulizaron los permisos del usuario ",Toast.LENGTH_SHORT).show();
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
