package fia.ues.sv.login;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ESCOBAR on 6/5/2016.
 */
public class DataBaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "PREFIL_DOCENTES.s3db";
    SQLiteDatabase db;


    private static final String CREATE_TABLE_USUARIO ="CREATE TABLE Usuario (" +
            "IdUsuario VARCHAR(2) PRIMARY KEY NOT NULL," +
            "NombreUsuario VARCHAR(30) NOT NULL," +
            "Clave VARCHAR(5) NOT NULL" +
            "); ";
    private static final String CREATE_TABLE_ACCESO ="CREATE TABLE AccesoUsuario(" +
            "IdOpcion VARCHAR(3) NOT NULL," +
            "IdUsuario VARCHAR(2) NOT NULL," +
            "PRIMARY KEY (IdOpcion, IdUsuario)" +
            "); ";
    private static final String CREATE_TABLE_OPCIONCRUD ="CREATE TABLE OpcionCrud(" +
            "IdOpcion CHAR(3) PRIMARY KEY NOT NULL," +
            "DesOpcion VARCHAR(30)," +
            "NumCrud INTEGER" +
            ");";

    private static final String CREATE_TABLE_DOCENTE="CREATE TABLE docente(" +
            "id_docente VARHCHAR(7) NOT NULL PRIMARY KEY," +
            "id_categoria INTEGER NOT NULL," +
            "id_tipo_Contrtacion INTEGER NOT NULL," +
            "nombre VARCHAR(50) NOT NULL," +
            "apellido VARCHAR(50) NOT NULL," +
            "edad INTEGER " +
            ");";

    private static final String CREATE_TABLE_TIPO_CONTRATACION="CREATE TABLE tipo_contratacion(" +
            "id_tipo_contratacion INTEGER NOT NULL PRIMARY KEY," +
            "desc_tipo_contratacion VARCHAR(256)," +
            "tipo_contrato VARCHAR(4)" +
            ");";

    private static final String CREATE_TABLE_CATEGORIA="CREATE TABLE categoria(" +
            "id_categoria INTEGER NOT NULL PRIMARY KEY," +
            "nombre_categoria VARCHAR(60) NOT NULL," +
            "descripcion_cat VARCHAR(250) NOT NULL" +
            ");";

    private static final String CREATE_TABLE_DETALLE_GRADO_ACAD="CREATE TABLE detalle_grado_academico(" +
            "id_detalle_grado INTEGER NOT NULL PRIMARY KEY," +
            "id_grado_acad INTEGER NOT NULL" +
            ");";
    private static final String CREATE_TABLE_GRADO_ACAD="CREATE TABLE grado_academico(" +
            "id_grado_acad INTEGER NOT NULL PRIMARY KEY," +
            "nombre_grado_acad VARCHAR(60)," +
            "desc_tipo_grado_acad VARCHAR(250)" +
            ");";
    private static final String CREATE_TABLE_INSTITUCION="CREATE TABLE institucion(" +
            "id_institucion INTEGER NOT NULL PRIMARY KEY," +
            "nombre_institucion VARCHAR(100) NOT NULL," +
            "direccion_institucion VARCHAR(100)," +
            "pais VARCHAR(60) " +
            ");";

    private static final String CREATE_TABLE_EXP_LAB="CREATE TABLE experiencia_laboral(" +
            "id_experiencia_lab INTEGER NOT NULL PRIMARY KEY," +
            "id_cargo INTEGER NOT NULL," +
            "id_docente VARHCHAR(7) NOT NULL, " +
            "id_empresa INTEGER NOT NULL," +
            "fecha_inicio_lab DATE NOT NULL," +
            "fecha_fin_lab DATE NOT NULL" +
            ");";

    private static final String CREATE_TABLE_CARGO ="CREATE TABLE cargo(" +
            "id_cargo INTEGER NOT NULL PRIMARY KEY," +
            "nombre_cargo VARCHAR(100), " +
            "descripcion_cargo VARCHAR (250)" +
            ");";
    private static final String CREATE_TABLE_EMPRESA="CREATE TABLE empresa(" +
            "id_empresa INTEGER NOT NULL PRIMARY KEY," +
            "nombre_empresa VARCHAR(60) NOT NULL," +
            "direccion_empresa VARCHAR(100)," +
            "rubro_empresa VARCHAR(60) " +
            ");";

    private static final String CREATE_TABLE_EXP_ACAD="CREATE TABLE experiencia_academica(" +
            "id_experiencia_acad INTEGER NOT NULL PRIMARY KEY," +
            "id_materia INTEGER NOT NULL," +
            "id_docente VARHCHAR(7) NOT NULL," +
            "id_ciclo INTEGER NOT NULL," +
            "fecha_inicio_acad DATE," +
            "fecha_fin_acad DATE," +
            "detalles VARCHAR(100)" +
            ");";

    private static final String CREATE_TABLE_CICLO="CREATE TABLE ciclo(" +
            "id_ciclo INTEGER NOT NULL PRIMARY KEY," +
            "anio_ciclo VARCHAR(4) NOT NULL," +
            "num_ciclo INTEGER" +
            ");";
    private static final String CREATE_TABLE_PUESTO="CREATE TABLE puesto(" +
            "id_puesto INTEGER NOT NULL PRIMARY KEY," +
            "nombre_puesto VARCHAR(100) NOT NULL," +
            "descripcion_puesto VARCHAR(200)" +
            ");";

    private static final String CREATE_TABLE_MATERIA="CREATE TABLE materia(" +
            "id_materia INTEGER NOT NULL PRIMARY KEY," +
            "nombre_materia VARCHAR(30) NOT NULL," +
            "descripcion_materia VARCHAR(200) " +
            ");";

    private static final String CREATE_TABLE_INSTITUCION_LAB="CREATE TABLE institucion_lab(" +
            "id_institucion_lab INTEGER NOT NULL PRIMARY KEY," +
            "nombre_institucion_lab VARCHAR(100) NOT NULL," +
            "direccion_institucion_lab VARCHAR(100)," +
            "pais_lab VARCHAR(60) " +
            ");";







    public DataBaseHelper(Context context){
        super(context, DATABASE_NAME,null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_TABLE_USUARIO);
        db.execSQL(CREATE_TABLE_ACCESO);
        db.execSQL(CREATE_TABLE_OPCIONCRUD);
        db.execSQL(CREATE_TABLE_DOCENTE);
        db.execSQL(CREATE_TABLE_TIPO_CONTRATACION);
        db.execSQL(CREATE_TABLE_CATEGORIA);
        db.execSQL(CREATE_TABLE_DETALLE_GRADO_ACAD );
        db.execSQL(CREATE_TABLE_GRADO_ACAD);
        db.execSQL(CREATE_TABLE_INSTITUCION);
        db.execSQL(CREATE_TABLE_EXP_LAB);
        db.execSQL(CREATE_TABLE_CARGO);
        db.execSQL(CREATE_TABLE_EMPRESA);
        db.execSQL(CREATE_TABLE_EXP_ACAD);
        db.execSQL(CREATE_TABLE_CICLO);
        db.execSQL(CREATE_TABLE_PUESTO);
        db.execSQL(CREATE_TABLE_MATERIA);
        db.execSQL(CREATE_TABLE_INSTITUCION_LAB);



        this.db = db;

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void abrir() throws SQLException {
        db = this.getWritableDatabase();
        return;
    }

    public void cerrar(){
        this.close();
    }


    public boolean checkUsuario(String usuario, String password){
        String[] ids ={usuario, password};
        abrir();
        Cursor c = db.query("Usuario", null, "NombreUsuario = ? AND Clave = ? ", ids, null, null, null);
        if(c.moveToFirst()){
            return true;
        }
        else{
            return false;
        }

    }


    public String insertar(Usuario usuario){

        String regInsertados ="Registro Insertado N° =";
        long contador = 0;
        ContentValues user = new ContentValues();
        user.put("IdUsuario",usuario.getIdUsuario());
        user.put("NombreUsuario",usuario.getNombreUsuario());
        user.put("Clave",usuario.getClave());
        contador = db.insert("Usuario",null,user);

        if(contador == -1 || contador == 0){
            regInsertados ="Error al insertar el registro, " +
                    "registro duplicado.";
        }
        else{
            regInsertados+=contador;
        }

        return regInsertados;
    }
    public String insertar(OpcionCrud opcion){
        String regInsertados ="Registro Insertado N° =";
        long contador = 0;
        ContentValues op = new ContentValues();

        op.put("IdOpcion",opcion.getIdOpcion());
        op.put("DesOpcion",opcion.getDesOpcion());
        op.put("NumCrud",opcion.getNumCrud());
        contador = db.insert("OpcionCrud",null,op);

        if(contador == -1 || contador == 0){
            regInsertados ="Error al insertar el registro, " +
                    "registro duplicado.";
        }
        else{
            regInsertados+=contador;
        }

        return regInsertados;
    }

    public String insertar(AccesoUsuario acceso){
        String regInsertados ="Registro Insertado N° =";
        long contador = 0;
        ContentValues acc = new ContentValues();
        acc.put("IdOpcion",acceso.getIdOpcion());
        acc.put("IdUsuario",acceso.getIdUsuario());
        contador = db.insert("AccesoUsuario",null,acc);
        if(contador == -1 || contador == 0){
            regInsertados ="Error al insertar el registro, " +
                    "registro duplicado.";
        }
        else{
            regInsertados+=contador;
        }

        return regInsertados;
    }

    public String llenarDatosPrueba(){
        //datos para Usuario
        final String[] nombres = {"Carlos","Alberto","Hernan"};
        final String[] id = {"01","02","03"};
        final String[] claves = {"Ch1q2","jA3f2","gD21d"};

        //datos para AccesoUsuario


        //datos para OpcionCrud
        final int[] numOp = {0,1,2,3,4,
                0,1,2,3,4,
                0,1,2,3,4,
                0,1,2,3,4,
                0,1,2,3,4,
                0,1,2,3,4,
                0,1,2,3,4,
                0,1,2,3,4,
                0,1,2,3,4,
                0,1,2,3,4,
                0,1,2,3,4,
                0,1,2,3,4,
                0,1,2,3,4,
                0,1,2,3,4};

        final String[] idOpcion = {"010","011","012","013","014",
                "020","021","022","023","024",
                "030","031","032","033","034",
                "040","041","042","043","044",
                "050","051","052","053","054",
                "060","061","062","063","064",
                "070","071","072","073","074",
                "080","081","082","083","084",
                "090","091","092","093","094",
                "100","101","102","103","104",
                "110","111","112","113","114",
                "120","121","122","123","124",
                "130","131","132","133","134",
                "140","141","142","143","144"};
        final String[] desOpcion ={"Menu Docente","Insertar Docente","Actualizar Docente","Eliminar Docente","Consultar Docente",
                "Menu Tipo_contratacion","Insertar Tipo_contratacion","Actualizar Tipo_contratacion","Eliminar Tipo_contratacion","Consultar Tipo_contratacion",
                "Menu Categoria","Insertar Categoria","Actualizar Categoria","Eliminar Categoria","Consultar Categoria",
                "Menu Detalle_grado_acad","Insertar Detalle_grado_acad","Actualizar Detalle_grado_acad","Eliminar Detalle_grado_acad","Consultar Detalle_grado_acad",
                "Menu Grado_acad","Insertar Grado_acad","Actualizar Grado_acad","Eliminar Grado_acad","Consultar Grado_acad",
                "Menu Institucion","Insertar Institucion","Actualizar Institucion","Eliminar Institucion","Consultar Institucion",
                "Menu Experiencia_lab","Insertar Experiencia_lab","Actualizar Experiencia_lab","Eliminar Experiencia_lab","Consultar Experiencia_lab",
                "Menu Cargo","Insertar Cargo","Actualizar Cargo","Eliminar Cargo","Consultar Cargo",
                "Menu Empresa","Insertar Empresa","Actualizar Empresa","Eliminar Empresa","Consultar Empresa",
                "Menu Experiencia_acad","Insertar Experiencia_acad","Actualizar Experiencia_acad","Eliminar Experiencia_acad","Consultar Experiencia_acad",
                "Menu ciclo","Insertar ciclo","Actualizar ciclo","Eliminar ciclo","Consultar ciclo",
                "Menu puesto","Insertar puesto","Actualizar puesto","Eliminar puesto","Consultar puesto",
                "Menu materia","Insertar materia","Actualizar materia","Eliminar materia","Consultar materia",
                "Menu Institucion_exp_lab","Insertar Institucion_exp_lab","Actualizar Institucion_exp_lab","Eliminar Institucion_exp_lab","Consultar Institucion_exp_lab"};

        Usuario user = new Usuario();
        OpcionCrud opcion = new OpcionCrud();
        AccesoUsuario acceso = new AccesoUsuario();

        abrir();
        //Tabla Usuarios
        for(int i=0; i<3; i++){
            user.setIdUsuario(id[i]);
            user.setNombreUsuario(nombres[i]);
            user.setClave(claves[i]);
            insertar(user);
        }

        // Tabla OpcionCrud
        for(int i=0; i<70; i++){
            opcion.setIdOpcion(idOpcion[i]);
            opcion.setDesOpcion(desOpcion[i]);
            opcion.setNumCrud(numOp[i]);
            insertar(opcion);

        }

        return "Guardado correctamente";
    }


}
