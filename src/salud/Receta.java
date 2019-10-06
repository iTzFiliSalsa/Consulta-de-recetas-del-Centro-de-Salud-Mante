/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salud;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author iTzFiliSalsa
 */
public class Receta extends javax.swing.JFrame {
public static String nombre="";
public static String me="";
public static String di="";
public static String añ="";
public static String numeroafiliacio="";
public static String diagnostic="";
public static String unida="";
public static String sex="";
public static int numenf=0,numenf2=0,numenf3=0;
public static boolean uno=false;
public static boolean dos=false;
    /**
     * Creates new form Receta
     */
    public Receta(String nombre, String di, String me, String añ, String numeroafiliacio,String diagnostic,String unida,String sex) {
        initComponents();
        /*this.nombr=nombre;
        this.mes=mes;
        this.dia=dia;
        this.año=año;
        this.numeroafiliacion=numeroafiliacion;*/
        this.nombre=nombre;
        this.di=di;
        this.me=me;
        this.añ=añ;
        this.numeroafiliacio=numeroafiliacio;
        this.diagnostic=diagnostic;
        this.unida=unida;
        this.sex=sex;
        setSize(1040,720);
        carga();
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close();
            }
        });
    }
    public void close(){
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir del sistema? Perdera todos los datos",
                "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
            System.exit(0);
    }
    public void carga(){
        System.out.println(nombre);
        System.out.println(di);
        nombr.setText(nombre);
        fecha.setText(di+"/"+me+"/"+añ);
        afiliacion.setText(numeroafiliacio);
        diagnostico.setText(diagnostic);
        unidad.setText(unida);
        sexo.setText(sex);
        if(diagnostic=="PREVENCIÓN DE CARIES DENTAL"){
            uno=true;
            nombre1.addItem("");
            nombre1.addItem("FLUORURO DE SODIO");
            med2.addItem("");
            med2.addItem("FLUORURO DE SODIO");
            med3.addItem("");
            med3.addItem("FLUORURO DE SODIO");
            subdiagnostico.addItem("NINGUNO");
        }
        if(diagnostic=="DIAGNÓSTICO Y TRATAMIENTO DE SARAMPIÓN, RUBÉOLA Y PAROTIDITIS"){
            dos=true;
            nombre1.addItem("");
            nombre1.addItem("NAPROXENO");
            nombre1.addItem("PARACETAMOL");
            nombre1.addItem("VITAMINAS A, C, D"); 
            med2.addItem("");
            med2.addItem("NAPROXENO");
            med2.addItem("PARACETAMOL");
            med2.addItem("VITAMINAS A, C, D"); 
             med3.addItem("");
            med3.addItem("NAPROXENO");
            med3.addItem("PARACETAMOL");
            med3.addItem("VITAMINAS A, C, D"); 
            subdiagnostico.addItem("SARAMPIÓN SIN COMPLICACIONES");
            subdiagnostico.addItem("RUBÉOLA SIN COMPLICACIONES");
            subdiagnostico.addItem("PAROTIDIS, SIN COMPLICACIONES");
        }
        if(diagnostic=="DIAGNÓSTICO Y TRATAMIENTO DEL DENGUE NO GRAVE (Y OTRAS FIEBRES PRODUCIDAS POR FLAVIVIRUS Y ARBOVIRUS)"){
            subdiagnostico.addItem("ENFERMEDAD POR VIRUS CHIKUNGUNYA");
            subdiagnostico.addItem("DENGUE SIN DATOS DE ALARMA");
            subdiagnostico.addItem("ENFERMEDAD DEL VIRUS ZIKA");
            nombre1.addItem("");
            nombre1.addItem("ELECTROLITOS");
            nombre1.addItem("PARACETAMOL");
            med2.addItem("");
            med2.addItem("ELECTROLITOS");
            med2.addItem("PARACETAMOL");
             med3.addItem("");
            med3.addItem("ELECTROLITOS");
             med3.addItem("PARACETAMOL");
        }
        if(diagnostic=="DIAGNÓSTICO Y TRATAMIENTO DE INFLUENZA"){subdiagnostico.addItem("SARAMPIÓN SIN COMPLICACIONES");
            subdiagnostico.addItem("Influenza debida a ciertos virus de la influenza identificados");
            subdiagnostico.addItem(" Influenza con neumonía, debida a otro virus de la influenza estacional identificado");
            subdiagnostico.addItem("Influenza con otras manifestaciones respiratorias, debida a otro virus de la influenza estacional identificado");
            subdiagnostico.addItem("Influenza, con otras manifestaciones, debida a otro virus de la influenza estacional identificado");
            subdiagnostico.addItem("Influenza con neumonía, virus no identificado");
            subdiagnostico.addItem("Influenza con otras manifestaciones respiratorias, virus no identificado");
            subdiagnostico.addItem("Influenza con otras manifestaciones, virus no identificado");
            nombre1.addItem("");
            nombre1.addItem("METAMIZOL SÓDICO");
            nombre1.addItem("OSELTAMIVIR");
            nombre1.addItem("PARACETAMOL");
            med2.addItem("");
            med2.addItem("METAMIZOL SÓDICO");
            med2.addItem("OSELTAMIVIR");
            med2.addItem("PARACETAMOL");
            med3.addItem("");
            med3.addItem("METAMIZOL SÓDICO");
            med3.addItem("OSELTAMIVIR");
            med3.addItem("PARACETAMOL");
        }
        if(diagnostic=="DIAGNÓSTICO Y TRATAMIENTO DE FARINGOAMIGDALITIS AGUDA"){
            subdiagnostico.addItem("Influenza con otras manifestaciones, virus no identificado");
            nombre1.addItem("");
            nombre1.addItem("AMOXICILINA ÁCIDO CLAVULÁNICO");
            nombre1.addItem("AMPICILINA");
            nombre1.addItem("BENCILPENICILINA BENZATICA COMPUESTA");
            nombre1.addItem("BENCILPENICILINA PROCAINICA CON CRISTALINA");
            nombre1.addItem("BENZATINA BENCILPENICILINA");
            nombre1.addItem("ERITROMICINA");
            nombre1.addItem("TRIMETOPRIMASULFAMETOXAZOL");
            nombre1.addItem("NAPROXENO");
            nombre1.addItem("PARACETAMOL");
            //
            med2.addItem("");
            med2.addItem("AMOXICILINA ÁCIDO CLAVULÁNICO");
            med2.addItem("AMPICILINA");
            med2.addItem("BENCILPENICILINA BENZATICA COMPUESTA");
            med2.addItem("BENCILPENICILINA PROCAINICA CON CRISTALINA");
            med2.addItem("BENZATINA BENCILPENICILINA");
            med2.addItem("ERITROMICINA");
            med2.addItem("TRIMETOPRIMASULFAMETOXAZOL");
            med2.addItem("NAPROXENO");
            med2.addItem("PARACETAMOL");
            //
            med3.addItem("");
            med3.addItem("AMOXICILINA ÁCIDO CLAVULÁNICO");
            med3.addItem("AMPICILINA");
            med3.addItem("BENCILPENICILINA BENZATICA COMPUESTA");
            med3.addItem("BENCILPENICILINA PROCAINICA CON CRISTALINA");
            med3.addItem("BENZATINA BENCILPENICILINA");
            med3.addItem("ERITROMICINA");
            med3.addItem("TRIMETOPRIMASULFAMETOXAZOL");
            med3.addItem("NAPROXENO");
            med3.addItem("PARACETAMOL");
            //
        }
        if(diagnostic=="DIAGNÓSTICO Y TRATAMIENTO DE TOS FERINA"){
            nombre1.addItem("");
            nombre1.addItem("ERITROMICINA");
            nombre1.addItem("NAPROXENO");
            nombre1.addItem("PARACETAMOL");
            med2.addItem("");
            med2.addItem("ERITROMICINA");
            med2.addItem("NAPROXENO");
            med2.addItem("PARACETAMOL");
            med3.addItem("");
            med3.addItem("ERITROMICINA");
            med3.addItem("NAPROXENO");
            med3.addItem("PARACETAMOL");
        }
        if(diagnostic=="DIAGNÓSTICO Y TRATAMIENTO DE TOS FERINA"){
            nombre1.addItem("");
            nombre1.addItem("ERITROMICINA");
            nombre1.addItem("NAPROXENO");
            nombre1.addItem("PARACETAMOL");
            med2.addItem("");
            med2.addItem("ERITROMICINA");
            med2.addItem("NAPROXENO");
            med2.addItem("PARACETAMOL");
            med3.addItem("");
            med3.addItem("ERITROMICINA");
            med3.addItem("NAPROXENO");
            med3.addItem("PARACETAMOL");
        }
        if(diagnostic=="DIAGNÓSTICO Y TRATAMIENTO DE RINOFARINGITIS AGUDA"){
            nombre1.addItem("");
            nombre1.addItem("CLORFENAMINA");
            nombre1.addItem("LORATADINA");
            nombre1.addItem("METAMIZOL SÓDICO");
            nombre1.addItem("PARACETAMOL");
            med2.addItem("");
            med2.addItem("CLORFENAMINA");
            med2.addItem("LORATADINA");
            med2.addItem("METAMIZOL SÓDICO");
            med2.addItem("PARACETAMOL");
            med3.addItem("");
            med3.addItem("CLORFENAMINA");
            med3.addItem("LORATADINA");
            med3.addItem("METAMIZOL SÓDICO");
            med3.addItem("PARACETAMOL");
        }
        if(diagnostic=="DIAGNÓSTICO Y TRATAMIENTO DE LARINGOTRAQUEITIS AGUDA"){
            nombre1.addItem("");
            nombre1.addItem("METAMIZOL SÓDICO ");
            nombre1.addItem("NAPROXENO ");
            nombre1.addItem("PARACETAMOL");
            med2.addItem("");
            med2.addItem("METAMIZOL SÓDICO ");
            med2.addItem("NAPROXENO ");
            med2.addItem("PARACETAMOL");
            med3.addItem("");
            med3.addItem("METAMIZOL SÓDICO ");
            med3.addItem("NAPROXENO ");
            med3.addItem("PARACETAMOL");
        }
        if(diagnostic=="DIAGNÓSTICO Y TRATAMIENTO DE SINUSITIS AGUDA"){
            nombre1.addItem("");
            nombre1.addItem("AMOXICILINA ÁCIDO CLAVULÁNICO");
            nombre1.addItem("AMOXICILINA");
            nombre1.addItem("CEFALEXINA");
            nombre1.addItem("CIPROFLOXACINO");
            nombre1.addItem("DICLOFENACO");
            nombre1.addItem("ERITROMICINA");
            nombre1.addItem("LORATADINA");
            nombre1.addItem("METAMIZOL SÓDICO");
            nombre1.addItem("NAPROXENO");
            nombre1.addItem("PARACETAMOL");
            nombre1.addItem("TRIMETOPRIMASULFAMETOXAZOL");
            med2.addItem("");
            med2.addItem("AMOXICILINA ÁCIDO CLAVULÁNICO");
            med2.addItem("AMOXICILINA");
            med2.addItem("CEFALEXINA");
            med2.addItem("CIPROFLOXACINO");
            med2.addItem("DICLOFENACO");
            med2.addItem("ERITROMICINA");
            med2.addItem("LORATADINA");
            med2.addItem("METAMIZOL SÓDICO");
            med2.addItem("NAPROXENO");
            med2.addItem("PARACETAMOL");
            med2.addItem("TRIMETOPRIMASULFAMETOXAZOL");
            med3.addItem("");
            med3.addItem("AMOXICILINA ÁCIDO CLAVULÁNICO");
            med3.addItem("AMOXICILINA");
            med3.addItem("CEFALEXINA");
            med3.addItem("CIPROFLOXACINO");
            med3.addItem("DICLOFENACO");
            med3.addItem("ERITROMICINA");
            med3.addItem("LORATADINA");
            med3.addItem("METAMIZOL SÓDICO");
            med3.addItem("NAPROXENO");
            med3.addItem("PARACETAMOL");
            med3.addItem("TRIMETOPRIMASULFAMETOXAZOL");
        }
        if(diagnostic=="DIAGNÓSTICO Y TRATAMIENTO DE CONJUNTIVITIS"){
            nombre1.addItem("");
            nombre1.addItem("ACICLOVIR");
            nombre1.addItem("CLORANFENICOL");
            nombre1.addItem("CLORURO DE SODIO");
            nombre1.addItem("NAFAZOLINA");
            nombre1.addItem("NEOMICINA, POLIMIXINA B Y GRAMICIDINA");
            nombre1.addItem("PREDNISOLONA");
            nombre1.addItem("PREDNISOLONA-SULFACETAMIDA");
            nombre1.addItem("SULFACETAMIDA");
            nombre1.addItem("TETRACAÍNA");
            nombre1.addItem("TOBRAMICINA");
            med2.addItem("");
            med2.addItem("ACICLOVIR");
            med2.addItem("CLORANFENICOL");
            med2.addItem("CLORURO DE SODIO");
            med2.addItem("NAFAZOLINA");
            med2.addItem("NEOMICINA, POLIMIXINA B Y GRAMICIDINA");
            med2.addItem("PREDNISOLONA");
            med2.addItem("PREDNISOLONA-SULFACETAMIDA");
            med2.addItem("SULFACETAMIDA");
            med2.addItem("TETRACAÍNA");
            med2.addItem("TOBRAMICINA");
            med3.addItem("");
            med3.addItem("ACICLOVIR");
            med3.addItem("CLORANFENICOL");
            med3.addItem("CLORURO DE SODIO");
            med3.addItem("NAFAZOLINA");
            med3.addItem("NEOMICINA, POLIMIXINA B Y GRAMICIDINA");
            med3.addItem("PREDNISOLONA");
            med3.addItem("PREDNISOLONA-SULFACETAMIDA");
            med3.addItem("SULFACETAMIDA");
            med3.addItem("TETRACAÍNA");
            med3.addItem("TOBRAMICINA");
        }
        if(diagnostic=="DIAGNÓSTICO Y TRATAMIENTO DEL SÍNDROME DIARREICO AGUDO"){
            nombre1.addItem("");
            nombre1.addItem("BUTILHIOSCINA");
            nombre1.addItem("BUTILHIOSCINA-METAMIZOL");
            nombre1.addItem("DOXICICLINA");
            nombre1.addItem("ELECTROLITOS");
            nombre1.addItem("ERITROMICINA ");
            nombre1.addItem("FOSFATO DE POTASIO");
            nombre1.addItem("METAMIZOL SÓDICO ");
            nombre1.addItem("METRONIDAZOL");
            nombre1.addItem("NITAZOXANIDA");
            nombre1.addItem("PARACETAMOL");
            nombre1.addItem("TETRACICLINA");
            nombre1.addItem("TRIMETOPRIMASULFAMETOXAZOL");
            med2.addItem("");
            med2.addItem("BUTILHIOSCINA");
            med2.addItem("BUTILHIOSCINA-METAMIZOL");
            med2.addItem("DOXICICLINA");
            med2.addItem("ELECTROLITOS");
            med2.addItem("ERITROMICINA ");
            med2.addItem("FOSFATO DE POTASIO");
            med2.addItem("METAMIZOL SÓDICO ");
            med2.addItem("METRONIDAZOL");
            med2.addItem("NITAZOXANIDA");
            med2.addItem("PARACETAMOL");
            med2.addItem("TETRACICLINA");
            med2.addItem("TRIMETOPRIMASULFAMETOXAZOL");
            med3.addItem("");
            med3.addItem("BUTILHIOSCINA");
            med3.addItem("BUTILHIOSCINA-METAMIZOL");
            med3.addItem("DOXICICLINA");
            med3.addItem("ELECTROLITOS");
            med3.addItem("ERITROMICINA ");
            med3.addItem("FOSFATO DE POTASIO");
            med3.addItem("METAMIZOL SÓDICO ");
            med3.addItem("METRONIDAZOL");
            med3.addItem("NITAZOXANIDA");
            med3.addItem("PARACETAMOL");
            med3.addItem("TETRACICLINA");
            med3.addItem("TRIMETOPRIMASULFAMETOXAZOL");
        }
        if(diagnostic=="DIAGNÓSTICO Y TRATAMIENTO DE FIEBRE PARATIFOIDEA Y OTRAS SALMONELOSIS"){
            nombre1.addItem("");
            nombre1.addItem("AMOXICILINA");
            nombre1.addItem("BUTILHIOSCINA ");
            nombre1.addItem("CIPROFLOXACINO");
            nombre1.addItem("CLORANFENICOL ");
            nombre1.addItem("ELECTROLITOS");
            nombre1.addItem("METAMIZOL SÓDICO");
            nombre1.addItem("PARACETAMOL");
            nombre1.addItem("TRIMETOPRIMASULFAMETOXAZOL");
            med2.addItem("");
            med2.addItem("AMOXICILINA");
            med2.addItem("BUTILHIOSCINA ");
            med2.addItem("CIPROFLOXACINO");
            med2.addItem("CLORANFENICOL ");
            med2.addItem("ELECTROLITOS");
            med2.addItem("METAMIZOL SÓDICO");
            med2.addItem("PARACETAMOL");
            med2.addItem("TRIMETOPRIMASULFAMETOXAZOL");
            med3.addItem("");
            med3.addItem("AMOXICILINA");
            med3.addItem("BUTILHIOSCINA ");
            med3.addItem("CIPROFLOXACINO");
            med3.addItem("CLORANFENICOL ");
            med3.addItem("ELECTROLITOS");
            med3.addItem("METAMIZOL SÓDICO");
            med3.addItem("PARACETAMOL");
            med3.addItem("TRIMETOPRIMASULFAMETOXAZOL");
        }
        if(diagnostic=="DIAGNÓSTICO Y TRATAMIENTO DE DIABETES MELLITUS TIPO 1"){
            nombre1.addItem("");
            nombre1.addItem("INSULINA ASPARTICA");
            nombre1.addItem("INSULINA DEMETIR");
            nombre1.addItem("INSULINA GLARGINA");
            nombre1.addItem("INSULINA HUMANA");
            nombre1.addItem("INSULINA LISPRO");
            nombre1.addItem("INSULINA LISPRO PROTAMINA");
            med2.addItem("");
            med2.addItem("INSULINA ASPARTICA");
            med2.addItem("INSULINA DEMETIR");
            med2.addItem("INSULINA GLARGINA");
            med2.addItem("INSULINA HUMANA");
            med2.addItem("INSULINA LISPRO");
            med2.addItem("INSULINA LISPRO PROTAMINA");
            med3.addItem("");
            med3.addItem("INSULINA ASPARTICA");
            med3.addItem("INSULINA DEMETIR");
            med3.addItem("INSULINA GLARGINA");
            med3.addItem("INSULINA HUMANA");
            med3.addItem("INSULINA LISPRO");
            med3.addItem("INSULINA LISPRO PROTAMINA");
        }
        if(diagnostic=="DIAGNÓSTICO Y TRATAMIENTO DE DIABETES MELLITUS TIPO 2"){
            nombre1.addItem("");
            nombre1.addItem("GLIBENCLAMIDA");
            nombre1.addItem("INSULINA ASPARTICA");
            nombre1.addItem("INSULINA DEMETIR");
            nombre1.addItem("INSULINA GLARGINA");
            nombre1.addItem("INSULINA HUMANA");
            nombre1.addItem("INSULINA LISPRO");
            nombre1.addItem("INSULINA LISPRO PROTAMINA");
            nombre1.addItem("LINAGLIPTINA");
            nombre1.addItem("METFORMINA");
            nombre1.addItem("SITAGLIPTINA");
            nombre1.addItem("VILDAGLIPTINA");
            med2.addItem("");
            med2.addItem("GLIBENCLAMIDA");
            med2.addItem("INSULINA ASPARTICA");
            med2.addItem("INSULINA DEMETIR");
            med2.addItem("INSULINA GLARGINA");
            med2.addItem("INSULINA HUMANA");
            med2.addItem("INSULINA LISPRO");
            med2.addItem("INSULINA LISPRO PROTAMINA");
            med2.addItem("LINAGLIPTINA");
            med2.addItem("METFORMINA");
            med2.addItem("SITAGLIPTINA");
            med2.addItem("VILDAGLIPTINA");
            med3.addItem("");
            med3.addItem("GLIBENCLAMIDA");
            med3.addItem("INSULINA ASPARTICA");
            med3.addItem("INSULINA DEMETIR");
            med3.addItem("INSULINA GLARGINA");
            med3.addItem("INSULINA HUMANA");
            med3.addItem("INSULINA LISPRO");
            med3.addItem("INSULINA LISPRO PROTAMINA");
            med3.addItem("LINAGLIPTINA");
            med3.addItem("METFORMINA");
            med3.addItem("SITAGLIPTINA");
            med3.addItem("VILDAGLIPTINA");
        }
        if(diagnostic=="DIAGNÓSTICO Y TRATAMIENTO INTEGRAL DE HIPERTENSIÓN ARTERIAL"){
            nombre1.addItem("");
            nombre1.addItem("ÁCIDO ACETILSALICÍLICO");
            nombre1.addItem("AMLODIPINO");
            nombre1.addItem("CANDESARTÁN CILEXETILO HIDROCLOROTIAZIDA");
            nombre1.addItem("CAPTOPRIL");
            nombre1.addItem("CLORTALIDONA");
            nombre1.addItem("ENALAPRIL O LISINOPRIL O RAMIPRIL");
            nombre1.addItem("ESMOLOL");
            nombre1.addItem("FUROSEMIDA");
            nombre1.addItem("HIDROCLOROTIAZIDA");
            nombre1.addItem("IRBESARTÁN");
            nombre1.addItem("ISOSORBIDA");
            nombre1.addItem("LOSARTÁN");
            nombre1.addItem("METOPROLOL");
            nombre1.addItem("NIFEDIPINO");
            nombre1.addItem("NITROPRUSIATO");
            nombre1.addItem("PROPRANOLOL");
            nombre1.addItem("TELMISARTÁN");
            nombre1.addItem("TELMISARTÁN HIDROCLOROTIAZIDA");
            nombre1.addItem("TRINITRATO DE GLICERILO");
            nombre1.addItem("VERAPAMILO");
            med2.addItem("");
            med2.addItem("ÁCIDO ACETILSALICÍLICO");
            med2.addItem("AMLODIPINO");
            med2.addItem("CANDESARTÁN CILEXETILO HIDROCLOROTIAZIDA");
            med2.addItem("CAPTOPRIL");
            med2.addItem("CLORTALIDONA");
            med2.addItem("ENALAPRIL O LISINOPRIL O RAMIPRIL");
            med2.addItem("ESMOLOL");
            med2.addItem("FUROSEMIDA");
            med2.addItem("HIDROCLOROTIAZIDA");
            med2.addItem("IRBESARTÁN");
            med2.addItem("ISOSORBIDA");
            med2.addItem("LOSARTÁN");
            med2.addItem("METOPROLOL");
            med2.addItem("NIFEDIPINO");
            med2.addItem("NITROPRUSIATO");
            med2.addItem("PROPRANOLOL");
            med2.addItem("TELMISARTÁN");
            med2.addItem("TELMISARTÁN HIDROCLOROTIAZIDA");
            med2.addItem("TRINITRATO DE GLICERILO");
            med2.addItem("VERAPAMILO");
            med3.addItem("");
            med3.addItem("ÁCIDO ACETILSALICÍLICO");
            med3.addItem("AMLODIPINO");
            med3.addItem("CANDESARTÁN CILEXETILO HIDROCLOROTIAZIDA");
            med3.addItem("CAPTOPRIL");
            med3.addItem("CLORTALIDONA");
            med3.addItem("ENALAPRIL O LISINOPRIL O RAMIPRIL");
            med3.addItem("ESMOLOL");
            med3.addItem("FUROSEMIDA");
            med3.addItem("HIDROCLOROTIAZIDA");
            med3.addItem("IRBESARTÁN");
            med3.addItem("ISOSORBIDA");
            med3.addItem("LOSARTÁN");
            med3.addItem("METOPROLOL");
            med3.addItem("NIFEDIPINO");
            med3.addItem("NITROPRUSIATO");
            med3.addItem("PROPRANOLOL");
            med3.addItem("TELMISARTÁN");
            med3.addItem("TELMISARTÁN HIDROCLOROTIAZIDA");
            med3.addItem("TRINITRATO DE GLICERILO");
            med3.addItem("VERAPAMILO");
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        folio = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        nombr = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        edad = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        seguro = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        afiliacion = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        otros = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        unidad = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        diagnostico = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JComboBox();
        med2 = new javax.swing.JComboBox();
        med3 = new javax.swing.JComboBox();
        jPanel14 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        nombre2 = new javax.swing.JComboBox();
        nombre3 = new javax.swing.JComboBox();
        nombre4 = new javax.swing.JComboBox();
        jPanel15 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        default1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        subdiagnostico = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        fin = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        inventario = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Receta Medica");
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Secre.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(33, 20, 202, 61);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("RECETA MEDICA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(450, 20, 193, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_seguro_popular.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(860, 20, 117, 70);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Fecha");

        fecha.setText("00/00/2018");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fecha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(33, 99, 154, 40);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Expediente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(465, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(205, 99, 550, 40);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Folio N°");

        folio.setText("0000000000001");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(folio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(folio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(760, 100, 229, 40);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Nombre del Paciente");

        nombr.setText("NOMBRE DEL PACIENTE");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(nombr, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nombr))
                .addContainerGap())
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(33, 150, 650, 40);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Edad");

        edad.setText("18");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(edad))
                .addContainerGap())
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(690, 150, 97, 40);

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Sexo");

        sexo.setText("Masculino");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(39, 39, 39)
                .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(sexo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(800, 150, 192, 40);

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Seguro Popular");

        seguro.setText("si");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seguro)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(seguro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7);
        jPanel7.setBounds(33, 201, 260, 40);

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Número de Afiliación");

        afiliacion.setText("afiliacion");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(afiliacion, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(afiliacion))
                .addContainerGap())
        );

        getContentPane().add(jPanel8);
        jPanel8.setBounds(300, 200, 694, 40);

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Otros");

        otros.setText("otros");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(otros, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(otros))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel10);
        jPanel10.setBounds(33, 247, 960, 30);

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Unidad");

        unidad.setText("unidad");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(unidad, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(unidad))
                .addContainerGap())
        );

        getContentPane().add(jPanel11);
        jPanel11.setBounds(33, 283, 400, 40);

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Diagnostico");

        diagnostico.setText("diagnostico");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(diagnostico, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(diagnostico))
                .addContainerGap())
        );

        getContentPane().add(jPanel12);
        jPanel12.setBounds(440, 280, 550, 40);

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setText("Nombre Generico");

        nombre1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre1ActionPerformed(evt);
            }
        });

        med2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                med2ActionPerformed(evt);
            }
        });

        med3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                med3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel12)
                        .addGap(0, 170, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(med2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombre1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(med3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(med2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(med3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel13);
        jPanel13.setBounds(30, 330, 320, 261);

        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setText("Presentaciòn");

        nombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre2ActionPerformed(evt);
            }
        });

        nombre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre3ActionPerformed(evt);
            }
        });

        nombre4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel16)
                        .addGap(0, 48, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre3, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombre2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nombre4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(nombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel14);
        jPanel14.setBounds(360, 330, 190, 261);

        jPanel15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel18.setText("Duracion");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(53, 53, 53))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel15);
        jPanel15.setBounds(830, 330, 161, 261);

        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel16.setAutoscrolls(true);

        jLabel17.setText("Dosis y Vìa de Administraciòn");

        default1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        default1.setToolTipText("");
        default1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        default1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jTextArea1.setOpaque(false);
        jTextArea1.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setFocusable(false);
        jTextArea2.setOpaque(false);
        jTextArea2.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setFocusable(false);
        jTextArea3.setOpaque(false);
        jTextArea3.setRequestFocusEnabled(false);
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(default1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel17)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(default1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                    .addContainerGap(112, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(85, 85, 85)))
        );

        getContentPane().add(jPanel16);
        jPanel16.setBounds(560, 330, 260, 261);

        getContentPane().add(subdiagnostico);
        subdiagnostico.setBounds(150, 610, 490, 30);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Subdiagnostico");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(40, 620, 100, 14);

        fin.setText("jButton1");
        fin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finActionPerformed(evt);
            }
        });
        getContentPane().add(fin);
        fin.setBounds(660, 610, 73, 23);

        inventario.setText("Configurar");
        inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Inventario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        inventario.add(jMenuItem1);

        jMenuBar1.add(inventario);

        jMenu2.setText("Salir");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre1ActionPerformed
       
        if(nombre1.getSelectedItem()=="DICLOFENACO"){
            nombre2.removeAllItems();
            nombre2.addItem("CAPSULA DICLOFENACO");
            nombre2.addItem("INYECTABLE DICLOFENACO");
        }
        if(nombre1.getSelectedItem()=="CIPROFLOXACINO"){
            nombre2.removeAllItems();
            nombre2.addItem("TABLETA CIPROFLOXACINO");
        }
        if(nombre1.getSelectedItem()=="CEFALEXINA"){
            nombre2.removeAllItems();
            nombre2.addItem("TABLETA CEFALEXINA");
        }
        if(nombre1.getSelectedItem()=="AMOXICILINA"){
            nombre2.removeAllItems();
            nombre2.addItem("12 CAPSULAS AMOXICILINA");
            nombre2.addItem("15 CAPSULAS AMOXICILINA");
            nombre2.addItem("AMOXICILINA SUSPENSION ORAL");
        }
        if(nombre1.getSelectedItem()=="NAPROXENO "){
            nombre2.removeAllItems();
            nombre2.addItem("SUSPENSION ORAL NAPROXENO");
            nombre2.addItem("INYECTABLE NAPROXENO");
        }
        if(nombre1.getSelectedItem()=="METAMIZOL SÓDICO "){
            nombre2.removeAllItems();
            nombre2.addItem("METAMIZOL COMPRIMIDO");
            nombre2.addItem("METAMIZOL INYECTABLE");
        }
        if(nombre1.getSelectedItem()=="CLORFENAMINA"){
            nombre2.removeAllItems();
            nombre2.addItem("JARABE CLORFENAMINA");
            nombre2.addItem("TABLETA CLORFENAMINA");
        }
        if(nombre1.getSelectedItem()=="LORATADINA"){
            nombre2.removeAllItems();
            nombre2.addItem("JARABE LORATADINA");
            nombre2.addItem("TABLETA LORATADINA");
        }
        if(nombre1.getSelectedItem()=="FLUORURO DE SODIO"){
            nombre2.addItem("FLUORURO DE SODIO");
            jTextArea1.setText("acidulado al 2%. En gel de sabor. Envase Z01.2 Examen odontológico con 480 mL.");
        }
        if(nombre1.getSelectedItem()=="NAPROXENO"){
            nombre2.removeAllItems();
            nombre2.addItem("SUSPENSION ORAL NAPROXENO");
            nombre2.addItem("NAPROXENO TABLETA");
        }
        if(nombre1.getSelectedItem()=="PARACETAMOL"){
            nombre2.removeAllItems();
            nombre2.addItem("PARACETAMOL TABLETA");
             nombre2.addItem("SOLUCION ORAL PARACETAMOL");
            nombre2.addItem("3 SUPOSITORIOS 300 mg");
            nombre2.addItem("3 SUPOSITORIOS 100 mg");
            nombre2.addItem("6 SUPOSITORIOS 100 mg");
            nombre2.addItem("10 SUPOSITORIOS 100 mg");
        }
        if(nombre1.getSelectedItem()=="VITAMINAS A, C, D"){
            nombre2.removeAllItems();
            nombre2.addItem("VITAMINAS A, C, D");
        }
        if(nombre1.getSelectedItem()=="ELECTROLITOS"){
            nombre2.removeAllItems();
            nombre2.addItem("ELECTROLITOS ORALES");
        }
        if(nombre1.getSelectedItem()=="METAMIZOL SÓDICO"){
            nombre2.removeAllItems();
            nombre2.addItem("METAMIZOL COMPRIMIDO");
        }
        if(nombre1.getSelectedItem()=="OSELTAMIVIR"){
            nombre2.removeAllItems();
            nombre2.addItem("OSELTAMIVIR CAPSULA");
        }
        if(nombre1.getSelectedItem()=="AMOXICILINA ÁCIDO CLAVULÁNICO"){
            nombre2.removeAllItems();
            nombre2.addItem("SUSPENSIÓN ORAL AMOXICILINA");
            nombre2.addItem("TABLETA AMOXICILINA");
        }
        if(nombre1.getSelectedItem()=="AMPICILINA"){
            nombre2.removeAllItems();
            nombre2.addItem("SUSPENSIÓN ORAL AMPICILINA");
        }
        if(nombre1.getSelectedItem()=="BENCILPENICILINA BENZATICA COMPUESTA"){
            nombre2.removeAllItems();
            nombre2.addItem("SUSPENSIÓN INYECTABLE BENCILPENICILINA");
        }
        if(nombre1.getSelectedItem()=="BENCILPENICILINA PROCAINICA CON CRISTALINA"){
            nombre2.removeAllItems();
            nombre2.addItem("3ml INYECTABLE");
            nombre2.addItem("2ml INYECTABLE");
        }
        if(nombre1.getSelectedItem()=="BENZATINA BENCILPENICILINA"){
            nombre2.removeAllItems();
            nombre2.addItem("BENZATINA INYECTABLE");
        }
        if(nombre1.getSelectedItem()=="ERITROMICINA "){
            nombre2.removeAllItems();
            nombre2.addItem("ERITROMICINA ORAL");
        }
        if(nombre1.getSelectedItem()=="ERITROMICINA"){
            nombre2.removeAllItems();
            nombre2.addItem("ERITROMICINA CAPSULA");
            nombre2.addItem("ERITROMICINA ORAL");
        }
        if(nombre1.getSelectedItem()=="TRIMETOPRIMASULFAMETOXAZOL"){
            nombre2.removeAllItems();
            nombre2.addItem("TABLETA TRIME");
            nombre2.addItem("ORAL TRIME");
        }
        if(nombre1.getSelectedItem()=="TOBRAMICINA"){
            nombre2.removeAllItems();
            nombre2.addItem("SOLUCION OFTAMOLICA TOBRAMICINA");
        }
        if(nombre1.getSelectedItem()=="TETRACAÍNA"){
            nombre2.removeAllItems();
            nombre2.addItem("SOLUCION OFTAMOLICA TETRACAÍNA");
        }
        if(nombre1.getSelectedItem()=="SULFACETAMIDA"){
            nombre2.removeAllItems();
            nombre2.addItem("SOLUCION OFTAMOLICA SULFACETAMIDA");
        }
        if(nombre1.getSelectedItem()=="PREDNISOLONA-SULFACETAMIDA"){
            nombre2.removeAllItems();
            nombre2.addItem("SUSPENSION OFTAMOLICA PREDNISOLONA");
        }
        if(nombre1.getSelectedItem()=="PREDNISOLONA"){
            nombre2.removeAllItems();
            nombre2.addItem("SOLUCION OFTAMOLICA PREDNISOLONA");
            nombre2.addItem("UNGUENTO OFTAMOLICO PREDNISOLONA");
        }
        if(nombre1.getSelectedItem()=="NEOMICINA, POLIMIXINA B Y GRAMICIDINA"){
            nombre2.removeAllItems();
            nombre2.addItem("SOLUCION OFTAMOLICA NEOMICINA");
        }
        if(nombre1.getSelectedItem()=="NAFAZOLINA"){
            nombre2.removeAllItems();
            nombre2.addItem("SOLUCION OFTAMOLICA NAFAZOLINA");
        }
        if(nombre1.getSelectedItem()=="CLORURO DE SODIO"){
            nombre2.removeAllItems();
            nombre2.addItem("POMADA CLORURO DE SODIO");
        }
        if(nombre1.getSelectedItem()=="CLORANFENICOL "){
            nombre2.removeAllItems();
            nombre2.addItem("CAPSULA CLORANFENICOL");
        }
        if(nombre1.getSelectedItem()=="CLORANFENICOL"){
            nombre2.removeAllItems();
            nombre2.addItem("SOLUCIÓN OFTAMOLICA CLORANFENICOL");
        }
        if(nombre1.getSelectedItem()=="ACICLOVIR"){
            nombre2.removeAllItems();
            nombre2.addItem("UNGUENTO OFTAMOLICO ACICLOVIR");
        }
        if(nombre1.getSelectedItem()=="TETRACICLINA"){
            nombre2.removeAllItems();
            nombre2.addItem("TABLETA TETRACICLINA");
        }
        if(nombre1.getSelectedItem()=="NITAZOXANIDA"){
            nombre2.removeAllItems();
            nombre2.addItem("SUSPENSION ORAL NITAZOXANIDA");
            nombre2.addItem("TABLETA NITAZOXANIDA");
        }
        if(nombre1.getSelectedItem()=="METRONIDAZOL"){
            nombre2.removeAllItems();
            nombre2.addItem("SUSPENSION ORAL METRONIDAZOL");
            nombre2.addItem("20 TABLETAS METRONIDAZOL");
            nombre2.addItem("30 TABLETAS METRONIDAZOL");
        }
        if(nombre1.getSelectedItem()=="ELECTROLITOS"){
            nombre2.removeAllItems();
            nombre2.addItem("POLVO ELECTROLITOS ORALES");
            nombre2.addItem("SOLUCION ELECTROLITOS ORALES");
        }
        if(nombre1.getSelectedItem()=="DOXICILINA"){
            nombre2.removeAllItems();
            nombre2.addItem("CAPSULA O TABLETA DOXICILINA");
        }
        if(nombre1.getSelectedItem()=="BUTILHIOSCINA-METAMIZOL"){
            nombre2.removeAllItems();
            nombre2.addItem("SOLUCION INYECTABLE BM");
        }
        if(nombre1.getSelectedItem()=="BUTILHIOSCINA "){
            nombre2.removeAllItems();
            nombre2.addItem("GRAGEA O TABLETA BUTILHIOSCINA");
        }
        if(nombre1.getSelectedItem()=="BUTILHIOSCINA"){
            nombre2.removeAllItems();
            nombre2.addItem("GRAGEA O TABLETA BUTILHIOSCINA");
            nombre2.addItem("SOLUCION INYECTABLE BUTILHIOSCINA");
        }
        if(nombre1.getSelectedItem()=="FOSFATO DE POTASIO"){
            nombre2.removeAllItems();
            nombre2.addItem("SOLUCION INYECTABLE FOSFATO");
        }
        if(nombre1.getSelectedItem()=="DOXICICLINA"){
            nombre2.removeAllItems();
            nombre2.addItem("CAPSULA O TABLETA DOXICILINA");
        }
        if(nombre1.getSelectedItem()=="INSULINA LISPRO PROTAMINA"){
            nombre2.removeAllItems();
            nombre2.addItem("INYECTABLE LISPRO PROTAMINA");
        }
        if(nombre1.getSelectedItem()=="INSULINA LISPRO"){
            nombre2.removeAllItems();
            nombre2.addItem("INYECTABLE LISPRO");
        }
        if(nombre1.getSelectedItem()=="INSULINA HUMANA"){
            nombre2.removeAllItems();
            nombre2.addItem("5ml INYECTABLE ACCION RAPIDA");
            nombre2.addItem("10ml INYECTABLE ACCION RAPIDA");
            nombre2.addItem("10ml INYECTABLE ACCION LENTA");
            nombre2.addItem("5ml INYECTABLE ACCION INTERMEDIA");
            nombre2.addItem("10ml INYECTABLE ACCION INTERMEDIA");
        }
        if(nombre1.getSelectedItem()=="INSULINA GLARGINA"){
            nombre2.removeAllItems();
            nombre2.addItem("10ml INYECTABLE GLARGINA");
            nombre2.addItem("3ml INYECTABLE GLARGINA");
        }
        if(nombre1.getSelectedItem()=="INSULINA DEMETIR"){
            nombre2.removeAllItems();
            nombre2.addItem("1 PLUMA INYECTABLE");
            nombre2.addItem("5 PLUMAS INYECTABLES");
        }
        if(nombre1.getSelectedItem()=="INSULINA ASPARTICA"){
            nombre2.removeAllItems();
            nombre2.addItem("INYECTABLE INSULINA*");
            nombre2.addItem("INYECTABLE INSULINA");
        }
        if(nombre1.getSelectedItem()=="VILDAGLIPTINA"){
            nombre2.removeAllItems();
            nombre2.addItem("VILDAGLIPTINA COMPRIMIDO");
        }
        if(nombre1.getSelectedItem()=="SITAGLIPTINA"){
            nombre2.removeAllItems();
            nombre2.addItem("14 COMPRIMIDOS SITAGLIPTINA");
            nombre2.addItem("28 COMPRIMIDOS SITAGLIPTINA");
        }
        if(nombre1.getSelectedItem()=="METFORMINA"){
            nombre2.removeAllItems();
            nombre2.addItem("TABLETA METFORMINA");
        }
        if(nombre1.getSelectedItem()=="LINAGLIPTINA"){
            nombre2.removeAllItems();
            nombre2.addItem("TABLETA LINAGLIPTINA");
        }
        if(nombre1.getSelectedItem()=="GLIBENCLAMIDA"){
            nombre2.removeAllItems();
            nombre2.addItem("TABLETA GLIBENCLAMIDA");
        }
         if(nombre1.getSelectedItem()=="VERAPAMILO"){
            nombre2.removeAllItems();
            nombre2.addItem("GRAGEA O TABLETA RECUBIERTA VERAPAMILO");
            nombre2.addItem("SOLUCION INYECTABLE VERAPAMILO");
        }
        if(nombre1.getSelectedItem()=="TRINITRATO DE GLICERILO"){
            nombre2.removeAllItems();
            nombre2.addItem("PARCHE TRINITRATO DE GLICERILO");
        }
        if(nombre1.getSelectedItem()=="TELMISARTÁN"){
            nombre2.removeAllItems();
            nombre2.addItem("TABLETA TELMISARTAN");
        }
        if(nombre1.getSelectedItem()=="TELMISARTÁN HIDROCLOROTIAZIDA"){
            nombre2.removeAllItems();
            nombre2.addItem("TABLETA TELMISARTANH");
        }
        if(nombre1.getSelectedItem()=="PROPRANOLOL"){
            nombre2.removeAllItems();
            nombre2.addItem("40mg TABLETA PROPRANOLOL");
            nombre2.addItem("10mg TABLETA PROPRANOLOL");
        }
        if(nombre1.getSelectedItem()=="NITROPRUSIATO"){
            nombre2.removeAllItems();
            nombre2.addItem("SOLUCION INYECTABLE NITROPRUSIATO");
        }
        if(nombre1.getSelectedItem()=="NIFEDIPINO"){
            nombre2.removeAllItems();
            nombre2.addItem("CAPSULA DE GELATINA BLANDA");
            nombre2.addItem("COMPRIMIDO DE LIBERACION PROLONGADA");
        }
        if(nombre1.getSelectedItem()=="METOPROLOL"){
            nombre2.removeAllItems();
            nombre2.addItem("TABLETA METOPROLOL");
        }
        if(nombre1.getSelectedItem()=="LOSARTÁN"){
            nombre2.removeAllItems();
            nombre2.addItem("GRAGEA LOSARTÁN");
        }
        if(nombre1.getSelectedItem()=="ISOSORBIDA"){
            nombre2.removeAllItems();
            nombre2.addItem("TABLETA ISOSORBIDA");
            nombre2.addItem("TABLETA SUBLINGUAL ISOSORBIDA");
        }
        if(nombre1.getSelectedItem()=="IRBESARTÁN"){
            nombre2.removeAllItems();
            nombre2.addItem("150mg TABLETA IRBESARTÁN");
            nombre2.addItem("300mg TABLETA IRBESARTÁN");
        }
        if(nombre1.getSelectedItem()=="HIDROCLOROTIAZIDA"){
            nombre2.removeAllItems();
            nombre2.addItem("TABLETA HIDROCLOROTIAZIDA");
        }
        if(nombre1.getSelectedItem()=="FUROSEMIDA"){
            nombre2.removeAllItems();
            nombre2.addItem("INYECTABLE FUROSEMIDA");
            nombre2.addItem("TABLETA FIROSEMIDA");
        }
        if(nombre1.getSelectedItem()=="ESMOLOL"){
            nombre2.removeAllItems();
            nombre2.addItem("INYECTABLE ESMOLOL");
        }
        if(nombre1.getSelectedItem()=="ENALAPRIL O LISINOPRIL O RAMIPRIL"){
            nombre2.removeAllItems();
            nombre2.addItem("TABLETA ENALAPRIL");
        }
        if(nombre1.getSelectedItem()=="CLORTALIDONA"){
            nombre2.removeAllItems();
            nombre2.addItem("TABLETA CLORTALIDONA");
        }
        if(nombre1.getSelectedItem()=="CAPTOPRIL"){
            nombre2.removeAllItems();
            nombre2.addItem("TABLETA CAPTOPRIL");
        }
        if(nombre1.getSelectedItem()=="CANDESARTÁN CILEXETILO HIDROCLOROTIAZIDA"){
            nombre2.removeAllItems();
            nombre2.addItem("TABLETA CANDESARTAN");
        }
        if(nombre1.getSelectedItem()=="AMLODIPINO"){
            nombre2.removeAllItems();
            nombre2.addItem("TABLETA O CAPSULA AMLODIPINO");
        }
        if(nombre1.getSelectedItem()=="ÁCIDO ACETILSALICÍLICO"){
            nombre2.removeAllItems();
            nombre2.addItem("TABLETA SOLUBLE ACELTILSALICILICO");
        }
    }//GEN-LAST:event_nombre1ActionPerformed

    private void nombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre2ActionPerformed
        if(nombre2.getSelectedItem()=="GRAGEA O TABLETA RECUBIERTA VERAPAMILO"){
            jTextArea1.setText("Cada gragea o tableta recubierta contiene: Clorhidrato de verapamilo 80 mg. Envase con 20 grageas o tabletas recubiertas");
        }
        if(nombre2.getSelectedItem()=="SOLUCION INYECTABLE VERAPAMILO"){
            jTextArea1.setText("Cada ampolleta contiene: Clorhidrato de verapamilo 5 mg. Envase con 2 ml (2.5 mg/ ml).");
        }
        if(nombre2.getSelectedItem()=="PARCHE TRINITRATO DE GLICERILO"){
            jTextArea1.setText("Cada parche libera: Trinitrato de glicerilo 5 mg/día. Envase con 7 parches");
        }
        if(nombre2.getSelectedItem()=="TABLETA TELMISARTAN"){
            jTextArea1.setText("Cada tableta contiene: Telmisartán 40 mg. Envase con 30 tabletas");
        }
        if(nombre2.getSelectedItem()=="TABLETA TELMISARTANH"){
            jTextArea1.setText("Cada tableta contiene: Telmisartán 80.0 mg. Hidroclorotiazida 12.5 mg. Envase con 14 tabletas.");
        }
        if(nombre2.getSelectedItem()=="40mg TABLETA PROPRANOLOL"){
            jTextArea1.setText("Cada tableta contiene: Clorhidrato de propranolol 40 mg. Envase con 30 tabletas.");
        }
        if(nombre2.getSelectedItem()=="10mg TABLETA PROPRANOLOL"){
            jTextArea1.setText("Cada tableta contiene: Clorhidrato de propranolol 10 mg. Envase con 30 tabletas");
        }
        if(nombre2.getSelectedItem()=="SOLUCION INYECTABLE NITROPRUSIATO"){
            jTextArea1.setText("Cada frasco ámpula con polvo o solución contiene: Nitroprusiato de sodio 50 mg. Envase con un frasco ámpula con o sin diluyente");
        }
        if(nombre2.getSelectedItem()=="CAPSULA DE GELATINA BLANDA"){
            jTextArea1.setText("Cada cápsula contiene: Nifedipino 10 mg. Envase con 20 cápsulas");
        }
        if(nombre2.getSelectedItem()=="COMPRIMIDO DE LIBERACION PROLONGADA"){
            jTextArea1.setText("Cada comprimido contiene: Nifedipino 30 mg. Envase con 30 comprimidos.");
        }
        if(nombre2.getSelectedItem()=="TABLETA METOPROLOL"){
            jTextArea1.setText("Cada tableta contiene: Tartrato de metoprolol 100 mg. Envase con 20 tabletas");
        }
        if(nombre2.getSelectedItem()=="GRAGEA LOSARTÁN"){
            jTextArea1.setText("Cada gragea o comprimido recubierto contiene: Losartán potásico 50 mg. Envase con 30 grageas o comprimidos recubiertos");
        }
        if(nombre2.getSelectedItem()=="TABLETA ISOSORBIDA"){
            jTextArea1.setText("Cada tableta contiene: Dinitrato de isosorbida 10 mg. Envase con 20 tabletas");
        }
        if(nombre2.getSelectedItem()=="TABLETA SUBLINGUAL ISOSORBIDA"){
            jTextArea1.setText("Cada tableta contiene: Dinitrato de isosorbida 5 mg. Envase con 20 tabletas sublinguales");
        }
        if(nombre2.getSelectedItem()=="150mg TABLETA IRBESARTÁN"){
            jTextArea1.setText("Cada tableta contiene: Irbesartán 150 mg. Envase con 28 tabletas.");
        }
        if(nombre2.getSelectedItem()=="300mg TABLETA IRBESARTÁN"){
            jTextArea1.setText("Cada tableta contiene: Irbesartán 300 mg. Envase con 28 tabletas");
        }
        if(nombre2.getSelectedItem()=="TABLETA HIDROCLOROTIAZIDA"){
            jTextArea1.setText("Cada tableta contiene: Hidroclorotiazida 25 mg. Envase con 20 tabletas.");
        }
        if(nombre2.getSelectedItem()=="INYECTABLE FUROSEMIDA"){
            jTextArea1.setText("Cada ampolleta contiene: Furosemida 20 mg. Envase con 5 ampolletas de 2 mL");
        }
        if(nombre2.getSelectedItem()=="TABLETA FIROSEMIDA"){
            jTextArea1.setText("Cada tableta contiene: Furosemida 40 mg. Envase con 20 tabletas.");
        }
        if(nombre2.getSelectedItem()=="INYECTABLE ESMOLOL"){
            jTextArea1.setText("Cada frasco ámpula contiene: Clorhidrato de esmolol 100 mg. Envase con un frasco ámpula con 10 mL (10 mg/ mL).");
        }
        if(nombre2.getSelectedItem()=="TABLETA ENALAPRIL"){
            jTextArea1.setText("Cada cápsula o tableta contiene: Maleato de enalapril 10 mg o lisinopril 10 mg o ramipril 10 mg. Envase con 30 cápsulas o tabletas");
        }
        if(nombre2.getSelectedItem()=="TABLETA CLORTALIDONA"){
            jTextArea1.setText("Cada tableta contiene: Clortalidona 50 mg. Envase con 20 tabletas");
        }
        if(nombre2.getSelectedItem()=="TABLETA CAPTOPRIL"){
            jTextArea1.setText("Cada tableta contiene: Captopril 25 mg");
        }
        if(nombre2.getSelectedItem()=="TABLETA CANDESARTAN"){
            jTextArea1.setText("Cada tableta contiene: Candesartán cilexetilo 16.0 mg. Hidroclorotiazida 12.5 mg. Envase con 28 tabletas");
        }
        if(nombre2.getSelectedItem()=="TABLETA O CAPSULA AMLODIPINO"){
            jTextArea1.setText("Cada tableta o cápsula contiene: Besilato o maleato de amlodipino equivalente a 5 mg de amlodipino. Envase con 30 tabletas o cápsulas.");
        }
        if(nombre2.getSelectedItem()=="TABLETA SOLUBLE ACELTILSALICILICO"){
            jTextArea1.setText("Cada comprimido contiene: Vildagliptina 50 mg. Envase con 28 comprimidos");
        }
        if(nombre2.getSelectedItem()=="VILDAGLIPTINA COMPRIMIDO"){
            jTextArea1.setText("Cada comprimido contiene: Vildagliptina 50 mg. Envase con 28 comprimidos");
        }
        if(nombre2.getSelectedItem()=="14 COMPRIMIDOS SITAGLIPTINA"){
            jTextArea1.setText("Cada comprimido contiene: Sitagliptina monohidratada, fosfato de 100 mg. Envase con 14 comprimidos");
        }
        if(nombre2.getSelectedItem()=="28 COMPRIMIDOS SITAGLIPTINA"){
            jTextArea1.setText("Cada comprimido contiene: Sitagliptina monohidratada, fosfato de 100 mg. Envase con 28 comprimidos");
        }
        if(nombre2.getSelectedItem()=="TABLETA METFORMINA"){
            jTextArea1.setText("Cada tableta contiene: Clorhidrato de metformina 850 mg. Envase con 30 tabletas.");
        }
        if(nombre2.getSelectedItem()=="TABLETA LINAGLIPTINA"){
            jTextArea1.setText("Cada tableta contiene: Linagliptina de 5 mg. Envase con 30 tabletas. ");
        }
        if(nombre2.getSelectedItem()=="TABLETA GLIBENCLAMIDA"){
            jTextArea1.setText("Cada tableta contiene: Glibenclamida 5 mg. Envase con 50 tabletas.");
        }
        if(nombre2.getSelectedItem()=="10ml INYECTABLE GLARGINA"){
            jTextArea1.setText("Cada mL de solución contiene: Insulina glargina 3.64 mg equivalente a 100.0 UI de insulina humana. Envase con un frasco ámpula con 10 mL.");
        }
        if(nombre2.getSelectedItem()=="3ml INYECTABLE GLARGINA"){
            jTextArea1.setText("Envase con 5 cartuchos de vidrio con 3 mL en dispositivo");
        }
        if(nombre2.getSelectedItem()=="INYECTABLE LISPRO PROTAMINA"){
            jTextArea1.setText("INYECTABLE LISPRO PROTAMINA");
        }
        if(nombre2.getSelectedItem()=="INYECTABLE LISPRO"){
            jTextArea1.setText("Cada mL contiene: Insulina lispro (origen ADN recombinante) 100 UI. Envase con un frasco ámpula con 10 mL");
        }
        if(nombre2.getSelectedItem()=="10ml INYECTABLE ACCION INTERMEDIA"){
            jTextArea1.setText("Cada mL contiene: Insulina humana isófana (origen ADN recombinante) 100 UI o Insulina zinc isófana humana (origen ADN recombinante) 100 UI Envase con un frasco ámpula con 10 mL");
        }
        if(nombre2.getSelectedItem()=="5ml INYECTABLE ACCION INTERMEDIA"){
            jTextArea1.setText("Cada mL contiene: Insulina humana isófana (origen ADN recombinante) 100 UI o Insulina zinc isófana humana (origen ADN recombinante) 100 UI Envase con un frasco ámpula con 5 mL.");
        }
        if(nombre2.getSelectedItem()=="10ml INYECTABLE ACCION LENTA"){
            jTextArea1.setText("Cada mL contiene: Insulina zinc compuesta humana (origen ADN recombinante) 100 UI. Envase con un frasco ámpula con 10 mL");
        }
        if(nombre2.getSelectedItem()=="10ml INYECTABLE ACCION RAPIDA"){
            jTextArea1.setText("Cada mL contiene: Insulina humana (origen ADN recombinante) 100 UI o Insulina zinc isófana humana (origen ADN recombinante) 100 UI. Envase con un frasco ámpula con 10mL");
        }
        if(nombre2.getSelectedItem()=="5ml INYECTABLE ACCION RAPIDA"){
            jTextArea1.setText("Cada mL contiene: Insulina humana (origen ADN recombinante) 100 UI o Insulina zinc isófana humana (origen ADN recombinante) 100 UI Envase con un frasco ámpula con 5 mL.");
        }
        if(nombre2.getSelectedItem()=="5 PLUMA INYECTABLE"){
            jTextArea1.setText("Envase con 5 plumas prellenadas con 3 mL (100 U/mL).");
        }
        if(nombre2.getSelectedItem()=="1 PLUMA INYECTABLE"){
            jTextArea1.setText("Envase con 1 pluma prellenada de 3 mL (100 U/mL).");
        }
        if(nombre2.getSelectedItem()=="INYECTABLE INSULINA"){
            jTextArea1.setText("Cada cápsula contiene: Cloranfenicol 500 mg. Envase con 20 cápsulas");
        }
        if(nombre2.getSelectedItem()=="INYECTABLE INSULINA*"){
            jTextArea1.setText("Envase con un frasco ámpula con 10 mL.");
        }
        if(nombre2.getSelectedItem()=="CAPSULA CLORANFENICOL"){
            jTextArea1.setText("Cada cápsula contiene: Cloranfenicol 500 mg. Envase con 20 cápsulas");
        }
        if(nombre2.getSelectedItem()=="CAPSULA O TABLETA DOXICILINA"){
            jTextArea1.setText("Cada cápsula o tableta contiene: Hiclato de doxiciclina equivalente a 100 mg de doxiciclina. Envase con 10 cápsulas o tabletas");
        }
        if(nombre2.getSelectedItem()=="SOLUCION INYECTABLE FOSFATO"){
            jTextArea1.setText("Cada ampolleta contiene: Fosfato de potasio dibásico 1.550 g. Fosfato de potasio monobásico 0.300 g. (Potasio 20 mEq) (Fosfato 20 mEq). Envase con 50 ampolletas con 10 mL");
        }
        if(nombre2.getSelectedItem()=="TABLETA TETRACICLINA"){
            jTextArea1.setText("Cada tableta o cápsula contiene: Clorhidrato de tetraciclina 250 mg. Envase con 10 tabletas o cápsulas");
        }
        if(nombre2.getSelectedItem()=="SUSPENSION ORAL NITAZOXANIDA"){
            jTextArea1.setText("Cada 5 mL contienen: Nitazoxanida 100 mg. Envase con 30 mL.");
        }
        if(nombre2.getSelectedItem()=="TABLETA NITAZOXANIDA"){
            jTextArea1.setText("Cada tableta contiene: Nitazoxanida 200 mg. Envase con 6 tabletas");
        }
        if(nombre2.getSelectedItem()=="SUSPENSION ORAL METRONIDAZOL"){
            jTextArea1.setText("Cada 5 mL contienen: Benzoilo de metronidazol equivalente a 250 mg de metronidazol. Envase con 120 mL y dosificador");
        }
        if(nombre2.getSelectedItem()=="20 TABLETAS METRONIDAZOL"){
            jTextArea1.setText("Cada tableta contiene: Metronidazol 500 mg. Envase con 20 tabletas");
        }
        if(nombre2.getSelectedItem()=="30 TABLETAS METRONIDAZOL"){
            jTextArea1.setText("Cada tableta contiene: Metronidazol 500 mg. Envase con 30 tabletas.");
        }
        if(nombre2.getSelectedItem()=="POLVO ELECTROLITOS ORALES"){
            jTextArea1.setText("(Fórmula de Osmolaridad Baja) Cada sobre con polvo contiene: Glucosa anhidra 13.5 g. Cloruro de potasio 1.5 g. Cloruro de sodio 2.6 g. Citrato trisódico dihidratado 2.9 g. Envase con 20.5 g");
        }
        if(nombre2.getSelectedItem()=="SOLUCION ELECTROLITOS ORALES"){
            jTextArea1.setText("Cada sobre con polvo contiene: Glucosa 20.0 g. Cloruro de potasio 1.5 Cloruro de sodio 3.5 g. Citrato trisódico dihidratado 2.9 g. Envase con 27.9 g.");
        }
        if(nombre2.getSelectedItem()=="CAPSULA O TABLETA DOXICILINA"){
            jTextArea1.setText("Cada cápsula o tableta contiene: Hiclato de doxiciclina equivalente a 100 mg de doxiciclina. Envase con 10 cápsulas o tabletas");
        }
        if(nombre2.getSelectedItem()=="SOLUCION INYECTABLE BM"){
            jTextArea1.setText("Cada ampolleta contiene: N-butilbromuro de hioscina 20 mg. Metamizol 2.5 g. Envase con 5 ampolletas de 5 mL");
        }
        if(nombre2.getSelectedItem()=="GRAGEA O TABLETA BUTILHIOSCINA"){
            jTextArea1.setText("Cada gragea o tableta contiene: Bromuro de butilhioscina 10 mg. Envase con 10 grageas o tabletas.");
        }
        if(nombre2.getSelectedItem()=="SOLUCION INYECTABLE BUTILHIOSCINA"){
            jTextArea1.setText("Cada ampolleta contiene: Bromuro de butilhioscina 20 mg. Envase con 3 ampolletas de 1 mL");
        }
        if(nombre2.getSelectedItem()=="SOLUCION OFTAMOLICA TOBRAMICINA"){
            jTextArea1.setText("Cada mL contiene: Sulfato de tobramicina equivalente a 3.0 mg. De tobramicina o tobramicina 3.0 mg. Envase con gotero integral con 5 mL");
        }
        if(nombre2.getSelectedItem()=="SOLUCION OFTAMOLICA TETRACAÍNA"){
            jTextArea1.setText("Cada mL contiene: Clorhidrato de tetracaína 5.0 mg. Envase con gotero integral con 10 mL.");
        }
        if(nombre2.getSelectedItem()=="SOLUCION OFTAMOLICA SULFACETAMIDA"){
            jTextArea1.setText("Cada mL contiene: Sulfacetamida sódica 0.1 g. Envase con gotero integral con 15 mL..");
        }
        if(nombre2.getSelectedItem()=="SUSPENSION OFTAMOLICA PREDNISOLONA"){
            jTextArea1.setText("Cada mL contiene: Acetato de prednisolona 5 mg. Sulfacetamida sódica 100 mg. Envase con gotero integrado con 5 mL.");
        }
        if(nombre2.getSelectedItem()=="SOLUCION OFTAMOLICA PREDNISOLONA"){
            jTextArea1.setText("Cada mL contiene: Fosfato sódico de prednisolona equivalente a 5 mg de fosfato de prednisolona. Envase con gotero integral con 5 mL");
        }
        if(nombre2.getSelectedItem()=="UNGUENTO OFTAMOLICO PREDNISOLONA"){
            jTextArea1.setText("Cada g contiene: Acetato de prednisolona equivalente a 5 mg de prednisolona. Envase con 3 g.");
        }
        if(nombre2.getSelectedItem()=="SOLUCION OFTAMOLICA NEOMICINA"){
            jTextArea1.setText("Cada mL contiene: Sulfato de neomicina equivalente a 1.75 mg de neomicina. Sulfato de polimixina B equivalente a 5 000 U de Polimixina B. Gramicidina 25 μg. Envase con gotero integral con 15 mL");
        }
        if(nombre2.getSelectedItem()=="SOLUCION OFTAMOLICA NAFAZOLINA"){
            jTextArea1.setText("Cada mL contiene: Clorhidrato de nafazolina 1 mg. Envase con gotero integral con 15 mL");
        }
        if(nombre2.getSelectedItem()=="POMADA CLORURO DE SODIO"){
            jTextArea1.setText("Cada g o mL contiene: Cloruro de sodio 50 mg. Envase con 7 g o con gotero integral con 10 mL.");
        }
        if(nombre2.getSelectedItem()=="SOLUCIÓN OFTAMOLICA CLORANFENICOL"){
            jTextArea1.setText("Cada mL contiene: Cloranfenicol levógiro 5 mg. Envase con gotero integral con 15 mL");
        }
        if(nombre2.getSelectedItem()=="UNGUENTO OFTAMOLICO ACICLOVIR"){
            jTextArea1.setText("Cada 100 g contienen: Aciclovir 3 g. Envase con 4.5 g.");
        }
        if(nombre2.getSelectedItem()=="CAPSULA DICLOFENACO"){
            jTextArea1.setText("Cada gragea contiene: Diclofenaco sódico 100 mg. Envase con 20 cápsulas o grageas.");
        }
        if(nombre2.getSelectedItem()=="INYECTABLE DICLOFENACO"){
            jTextArea1.setText("Cada ampolleta contiene: Diclofenaco sódico 75 mg. Envase con 2 ampolletas con 3 mL");
        }
        if(nombre2.getSelectedItem()=="TABLETA CIPROFLOXACINO"){
            jTextArea1.setText("Cada cápsula o tableta contiene: Clorhidrato de ciprofloxacino monohidratado equivalente a 250 mg de ciprofloxacino. Envase con 8 cápsulas o tabletas");
        }
        if(nombre2.getSelectedItem()=="TABLETA CEFALEXINA"){
            jTextArea1.setText("Cada tableta o cápsula contiene: Cefalexina monohidratada equivalente a 500 mg de cefalexina. Envase con 20 tabletas o cápsulas");
        }
        if(nombre2.getSelectedItem()=="AMOXICILINA SUSPENSION ORAL"){
            jTextArea1.setText("Cada frasco con polvo contiene: Amoxicilina trihidratada equivalente a 7.5 g de amoxicilina. Envase con polvo para 75 mL (500 mg/5 mL).");
        }
        if(nombre2.getSelectedItem()=="12 CAPSULAS AMOXICILINA"){
            jTextArea1.setText("Cada cápsula contiene: Amoxicilina trihidratada equivalente a 500 mg de amoxicilina. Envase con 12 cápsulas");
        }
        if(nombre2.getSelectedItem()=="15 CAPSULAS AMOXICILINA"){
            jTextArea1.setText("Cada cápsula contiene: Amoxicilina trihidratada equivalente a 500 mg de amoxicilina. Envase con 15 cápsulas");
        }
        if(nombre2.getSelectedItem()=="INYECTABLE NAPROXENO"){
            jTextArea1.setText("Cada ampolleta contiene: Metamizol sódico 1 g. Envase con 3 ampolletas con 2 mL.");
        }
        if(nombre2.getSelectedItem()=="METAMIZOL INYECTABLE"){
            jTextArea1.setText("Cada frasco ámpula o ampolleta contiene: Fosfato sódico de dexametasona equivalente a 8 mg de fosfato de dexametasona. Envase con un frasco ámpula o ampolleta con 2 mL.");
        }
        if(nombre2.getSelectedItem()=="JARABE CLORFENAMINA"){
            jTextArea1.setText("Cada mL contiene: Maleato de clorfenamina 0.5 mg. Envase con 60 mL.");
        }
        if(nombre2.getSelectedItem()=="TABLETA CLORFENAMINA"){
            jTextArea1.setText("Cada tableta contiene: Maleato de clorfenamina 4.0 mg. Envase con 20 tabletas");
        }
        if(nombre2.getSelectedItem()=="JARABE LORATADINA"){
            jTextArea1.setText("Cada 100 mL contienen: Loratadina 100 mg. Envase con 60 mL y dosificador.");
        }
        if(nombre2.getSelectedItem()=="TABLETA LORATADINA"){
            jTextArea1.setText("Cada tableta o gragea contiene: Loratadina 10 mg. Envase con 20 tabletas o grageas");
        }
        if(nombre2.getSelectedItem()=="SUSPENSIÓN ORAL AMOXICILINA"){
            jTextArea1.setText("Cada 5 mL contienen: Ampicilina trihidratada equivalente a 250 mg de ampicilina. Envase con polvo para 60 mL y dosificador.");
        }
        if(nombre2.getSelectedItem()=="TABLETA AMOXICILINA"){
            jTextArea1.setText("Cada frasco con polvo contiene: Amoxicilina trihidratada equivalente a 1.5 g de amoxicilina. Clavulanato de potasio equivalente a 375 mg de ácido clavulánico. Envase con 60 mL. Cada 5 mL con 125 mg de amoxicilina y 31.25 mg de ácido clavulánico");
        }
        if(nombre2.getSelectedItem()=="SUSPENSIÓN ORAL AMPICILINA"){
            jTextArea1.setText("Cada 5 mL contienen: Ampicilina trihidratada equivalente a 250 mg de ampicilina. Envase con polvo para 60 mL y dosificador.");
        }
        if(nombre2.getSelectedItem()=="SUSPENSIÓN INYECTABLE BENCILPENICILINA"){
            jTextArea1.setText("Cada frasco ámpula con polvo contiene: Benzatina bencilpenicilina equivalente a 600 000 UI de bencilpenicilina procaínica equivalente a 300 000 UI de bencilpenicilina a cristalina equivalente a 300 000 UI de bencilpenicilina Envase con un frasco ámpula y diluyente con 3 mL.");
        }
        if(nombre2.getSelectedItem()=="3ml INYECTABLE"){
            jTextArea1.setText("Cada frasco ámpula con polvo contiene: Benzatina bencilpenicilina equivalente a 600 000 UI de bencilpenicilina procaínica equivalente a 300 000 UI de bencilpenicilina a cristalina equivalente a 300 000 UI de bencilpenicilina Envase con un frasco ámpula y diluyente con 3 mL.");
        }
        if(nombre2.getSelectedItem()=="2ml INYECTABLE"){
            jTextArea1.setText("Cada frasco ámpula con polvo contiene: Bencilpenicilina procaínica equivalente a 300 000 UI de bencilpenicilina cristalina equivalente a 100 000 UI de bencilpenicilina. Envase con un frasco ámpula y 2 mL de diluyente.");
        }
        if(nombre2.getSelectedItem()=="BENZATINA INYECTABLE"){
            jTextArea1.setText("Cada frasco ámpula con polvo contiene: Benzatina bencilpenicilina equivalente a 1 200 000 UI de bencilpenicilina. Envase con un frasco ámpula y 5 mL de diluyente.");
        }
        if(nombre2.getSelectedItem()=="ERITROMICINA CAPSULA"){
            jTextArea1.setText("Cada cápsula o tableta contiene: Estearato de eritromicina equivalente a 500 mg de eritromicina. Envase con 20 cápsulas o tabletas.");
        }
        if(nombre2.getSelectedItem()=="ERITROMICINA ORAL"){
            jTextArea1.setText("Cada 5 mL contienen: Estearato o etilsuccinato o estolato de eritromicina equivalente a 250 mg de eritromicina. Envase con polvo para 100 mL y dosificador.");
        }
        if(nombre2.getSelectedItem()=="TABLETA TRIME"){
            jTextArea1.setText("Cada comprimido o tableta contiene: Trimetoprima 80 mg y Sulfametoxazol 400 mg. Envase con 20 comprimidos o tabletas.");
        }
        if(nombre2.getSelectedItem()=="ORAL TRIME"){
            jTextArea1.setText("Cada 5 mL contienen: Trimetoprima 40 mg. Sulfametoxazol 200 mg. Envase con 120");
        }
        if(nombre2.getSelectedItem()=="NAPROXENO TABLETA"){
            jTextArea1.setText("Cada tableta contiene: Naproxeno 250 mg. Envase con 30 tabletas.");
        }
        if(nombre2.getSelectedItem()=="SUSPENSION ORAL NAPROXENO"){
            jTextArea1.setText("Cada 5 mL contienen: Naproxeno 125 mg. Envase con 100 mL.");
        }
        if(nombre2.getSelectedItem()=="SOLUCION ORAL PARACETAMOL"){
            jTextArea1.setText("Cada mL contiene: Paracetamol 100 mg. Envase con 15 mL, gotero calibrado a 0.5 y 1 mL, integrado o adjunto al envase que sirve de tapa.");
        }
        if(nombre2.getSelectedItem()=="3 SUPOSITORIOS 300 mg"){
            jTextArea1.setText("Cada supositorio contiene: Paracetamol 300 mg. Envase con 3 supositorios");
        }
        if(nombre2.getSelectedItem()=="3 SUPOSITORIOS 100 mg"){
            jTextArea1.setText("Cada supositorio contiene: Paracetamol 100 mg. Envase con 3 supositorios");
        }
        if(nombre2.getSelectedItem()=="6 SUPOSITORIOS 100 mg"){
            jTextArea1.setText("Cada supositorio contiene: Paracetamol 100 mg. Envase con 6 supositorios");
        }
        if(nombre2.getSelectedItem()=="10 SUPOSITORIOS 100 mg"){
            jTextArea1.setText("Cada supositorio contiene: Paracetamol 100 mg. Envase con 10 supositorios.");
        }
        if(nombre2.getSelectedItem()=="PARACETAMOL TABLETA"){
            jTextArea1.setText("Cada tableta contiene: Paracetamol 500 mg. Envase con 10 tabletas.");
        }
        if(nombre2.getSelectedItem()=="VITAMINAS A, C, D"){
            jTextArea1.setText("Cada mL contiene: Palmitato de Retinol 7000 a 9000 UI. Ácido ascórbico 80 a 125 mg. Colecalciferol 1400 a 1800 UI. Envase con 15 mL.");
        }
        if(nombre2.getSelectedItem()=="ELECTROLITOS ORALES"){
            jTextArea1.setText("Cada sobre con polvo contiene: Glucosa 20.0 g. Cloruro de potasio 1.5 Cloruro de sodio 3.5 g. Citrato trisódico dihidratado 2.9 g. Envase con 27.9 g.");
        }
        if(nombre2.getSelectedItem()=="METAMIZOL COMPRIMIDO"){
            jTextArea1.setText("Cada comprimido contiene: Metamizol sódico 500 mg. Envase con 10 comprimidos.");
        }
        if(nombre2.getSelectedItem()=="OSELTAMIVIR CAPSULA"){
            jTextArea1.setText("Cada cápsula contiene: Oseltamivir 75.0 mg. Envase con 10 cápsulas.");
        }
        
    }//GEN-LAST:event_nombre2ActionPerformed

    private void med2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_med2ActionPerformed
        // TODO add your handling code here:
        if(med2.getSelectedItem()=="BUTILHIOSCINA "){
            nombre3.removeAllItems();
            nombre3.addItem("GRAGEA O TABLETA BUTILHIOSCINA");
        }
        if(med2.getSelectedItem()=="CLORANFENICOL "){
            nombre3.removeAllItems();
            nombre3.addItem("CAPSULA CLORANFENICOL");
        }
        if(med2.getSelectedItem()=="FLUORURO DE SODIO"){
            nombre3.addItem("FLUORURO DE SODIO");
            jTextArea3.setText("acidulado al 2%. En gel de sabor. Envase Z01.2 Examen odontológico con 480 mL.");
        }
        if(med2.getSelectedItem()=="NAPROXENO"){
            nombre3.removeAllItems();
            nombre3.addItem("SUSPENSION ORAL");
            nombre3.addItem("NAPROXENO TABLETA");
        }
        if(med2.getSelectedItem()=="PARACETAMOL"){
            nombre3.removeAllItems();
            nombre3.addItem("PARACETAMOL TABLETA");
             nombre3.addItem("SOLUCION ORAL");
            nombre3.addItem("3 SUPOSITORIOS 300 mg");
            nombre3.addItem("3 SUPOSITORIOS 100 mg");
            nombre3.addItem("6 SUPOSITORIOS 100 mg");
            nombre3.addItem("10 SUPOSITORIOS 100 mg");
        }
        if(med2.getSelectedItem()=="VITAMINAS A, C, D"){
            nombre3.removeAllItems();
            nombre3.addItem("VITAMINAS A, C, D");
        }
        if(med2.getSelectedItem()=="ELECTROLITOS"){
            nombre3.removeAllItems();
            nombre3.addItem("ORALES");
        }
        if(med2.getSelectedItem()=="METAMIZOL SÓDICO"){
            nombre3.removeAllItems();
            nombre3.addItem("METAMIZOL COMPRIMIDO");
        }
        if(med2.getSelectedItem()=="OSELTAMIVIR"){
            nombre3.removeAllItems();
            nombre3.addItem("OSELTAMIVIR CAPSULA");
        }
        if(med2.getSelectedItem()=="AMOXICILINA ÁCIDO CLAVULÁNICO"){
            nombre3.removeAllItems();
            nombre3.addItem("SUSPENSIÓN ORAL AMOXICILINA");
            nombre3.addItem("TABLETA AMOXICILINA");
        }
        if(med2.getSelectedItem()=="AMPICILINA"){
            nombre3.removeAllItems();
            nombre3.addItem("SUSPENSIÓN ORAL AMPICILINA");
        }
        if(med2.getSelectedItem()=="BENCILPENICILINA BENZATICA COMPUESTA"){
            nombre3.removeAllItems();
            nombre3.addItem("SUSPENSIÓN INYECTABLE BENCILPENICILINA");
        }
        if(med2.getSelectedItem()=="BENCILPENICILINA PROCAINICA CON CRISTALINA"){
            nombre3.removeAllItems();
            nombre3.addItem("3ml INYECTABLE");
            nombre3.addItem("2ml INYECTABLE");
        }
        if(med2.getSelectedItem()=="BENZATINA BENCILPENICILINA"){
            nombre3.removeAllItems();
            nombre3.addItem("BENZATINA INYECTABLE");
        }
        if(med2.getSelectedItem()=="ERITROMICINA"){
            nombre3.removeAllItems();
            nombre3.addItem("ERITROMICINA CAPSULA");
            nombre3.addItem("ERITROMICINA ORAL");
        }
        if(med2.getSelectedItem()=="TRIMETOPRIMASULFAMETOXAZOL"){
            nombre3.removeAllItems();
            nombre3.addItem("TABLETA TRIME");
            nombre3.addItem("ORAL TRIME");
        }
        if(med2.getSelectedItem()=="CLORFENAMINA"){
            nombre3.removeAllItems();
            nombre3.addItem("JARABE CLORFENAMINA");
            nombre3.addItem("TABLETA CLORFENAMINA");
        }
        if(med2.getSelectedItem()=="LORATADINA"){
            nombre3.removeAllItems();
            nombre3.addItem("JARABE LORATADINA");
            nombre3.addItem("TABLETA LORATADINA");
        }
        if(med2.getSelectedItem()=="NAPROXENO "){
            nombre3.removeAllItems();
            nombre3.addItem("SUSPENSION ORAL NAPROXENO");
            nombre3.addItem("INYECTABLE NAPROXENO");
        }
        if(med2.getSelectedItem()=="METAMIZOL SÓDICO "){
            nombre3.removeAllItems();
            nombre3.addItem("METAMIZOL COMPRIMIDO");
            nombre3.addItem("METAMIZOL INYECTABLE");
        }
        if(med2.getSelectedItem()=="DICLOFENACO"){
            nombre3.removeAllItems();
            nombre3.addItem("CAPSULA DICLOFENACO");
            nombre3.addItem("INYECTABLE DICLOFENACO");
        }
        if(med2.getSelectedItem()=="CIPROFLOXACINO"){
            nombre3.removeAllItems();
            nombre3.addItem("TABLETA CIPROFLOXACINO");
        }
        if(med2.getSelectedItem()=="CEFALEXINA"){
            nombre3.removeAllItems();
            nombre3.addItem("TABLETA CEFALEXINA");
        }
        if(med2.getSelectedItem()=="AMOXICILINA"){
            nombre3.removeAllItems();
            nombre3.addItem("12 CAPSULAS AMOXICILINA");
            nombre3.addItem("15 CAPSULAS AMOXICILINA");
            nombre3.addItem("AMOXICILINA SUSPENSION ORAL");
        }
        if(med2.getSelectedItem()=="TOBRAMICINA"){
            nombre3.removeAllItems();
            nombre3.addItem("SOLUCION OFTAMOLICA TOBRAMICINA");
        }
        if(med2.getSelectedItem()=="TETRACAÍNA"){
            nombre3.removeAllItems();
            nombre3.addItem("SOLUCION OFTAMOLICA TETRACAÍNA");
        }
        if(med2.getSelectedItem()=="SULFACETAMIDA"){
            nombre3.removeAllItems();
            nombre3.addItem("SOLUCION OFTAMOLICA SULFACETAMIDA");
        }
        if(med2.getSelectedItem()=="PREDNISOLONA-SULFACETAMIDA"){
            nombre3.removeAllItems();
            nombre3.addItem("SUSPENSION OFTAMOLICA PREDNISOLONA");
        }
        if(med2.getSelectedItem()=="PREDNISOLONA"){
            nombre3.removeAllItems();
            nombre3.addItem("SOLUCION OFTAMOLICA PREDNISOLONA");
            nombre3.addItem("UNGUENTO OFTAMOLICO PREDNISOLONA");
        }
        if(med2.getSelectedItem()=="NEOMICINA, POLIMIXINA B Y GRAMICIDINA"){
            nombre3.removeAllItems();
            nombre3.addItem("SOLUCION OFTAMOLICA NEOMICINA");
        }
        if(med2.getSelectedItem()=="NAFAZOLINA"){
            nombre3.removeAllItems();
            nombre3.addItem("SOLUCION OFTAMOLICA NAFAZOLINA");
        }
        if(med2.getSelectedItem()=="CLORURO DE SODIO"){
            nombre3.removeAllItems();
            nombre3.addItem("POMADA CLORURO DE SODIO");
        }
        if(med2.getSelectedItem()=="CLORANFENICOL"){
            nombre3.removeAllItems();
            nombre3.addItem("SOLUCIÓN OFTAMOLICA CLORANFENICOL");
        }
        if(med2.getSelectedItem()=="ACICLOVIR"){
            nombre3.removeAllItems();
            nombre3.addItem("UNGUENTO OFTAMOLICO ACICLOVIR");
        }
        if(med2.getSelectedItem()=="TETRACICLINA"){
            nombre3.removeAllItems();
            nombre3.addItem("TABLETA TETRACICLINA");
        }
        if(med2.getSelectedItem()=="NITAZOXANIDA"){
            nombre3.removeAllItems();
            nombre3.addItem("SUSPENSION ORAL NITAZOXANIDA");
            nombre3.addItem("TABLETA NITAZOXANIDA");
        }
        if(med2.getSelectedItem()=="METRONIDAZOL"){
            nombre3.removeAllItems();
            nombre3.addItem("SUSPENSION ORAL METRONIDAZOL");
            nombre3.addItem("20 TABLETAS METRONIDAZOL");
            nombre3.addItem("30 TABLETAS METRONIDAZOL");
        }
        if(med2.getSelectedItem()=="ELECTROLITOS"){
            nombre3.removeAllItems();
            nombre3.addItem("POLVO ELECTROLITOS ORALES");
            nombre3.addItem("SOLUCION ELECTROLITOS ORALES");
        }
        if(med2.getSelectedItem()=="DOXICILINA"){
            nombre3.removeAllItems();
            nombre3.addItem("CAPSULA O TABLETA DOXICILINA");
        }
        if(med2.getSelectedItem()=="BUTILHIOSCINA-METAMIZOL"){
            nombre3.removeAllItems();
            nombre3.addItem("SOLUCION INYECTABLE BM");
        }
        if(med2.getSelectedItem()=="BUTILHIOSCINA"){
            nombre3.removeAllItems();
            nombre3.addItem("GRAGEA O TABLETA BUTILHIOSCINA");
            nombre3.addItem("SOLUCION INYECTABLE BUTILHIOSCINA");
        }
        if(med2.getSelectedItem()=="FOSFATO DE POTASIO"){
            nombre3.removeAllItems();
            nombre3.addItem("SOLUCION INYECTABLE FOSFATO");
        }
        if(med2.getSelectedItem()=="DOXICICLINA"){
            nombre3.removeAllItems();
            nombre3.addItem("CAPSULA O TABLETA DOXICILINA");
        }
        if(med2.getSelectedItem()=="INSULINA LISPRO PROTAMINA"){
            nombre3.removeAllItems();
            nombre3.addItem("INYECTABLE LISPRO PROTAMINA");
        }
        if(med2.getSelectedItem()=="INSULINA LISPRO"){
            nombre3.removeAllItems();
            nombre3.addItem("INYECTABLE LISPRO");
        }
        if(med2.getSelectedItem()=="INSULINA HUMANA"){
            nombre3.removeAllItems();
            nombre3.addItem("5ml INYECTABLE ACCION RAPIDA");
            nombre3.addItem("10ml INYECTABLE ACCION RAPIDA");
            nombre3.addItem("10ml INYECTABLE ACCION LENTA");
            nombre3.addItem("5ml INYECTABLE ACCION INTERMEDIA");
            nombre3.addItem("10ml INYECTABLE ACCION INTERMEDIA");
        }
        if(med2.getSelectedItem()=="INSULINA GLARGINA"){
            nombre3.removeAllItems();
            nombre3.addItem("10ml INYECTABLE GLARGINA");
            nombre3.addItem("3ml INYECTABLE GLARGINA");
        }
        if(med2.getSelectedItem()=="INSULINA DEMETIR"){
            nombre3.removeAllItems();
            nombre3.addItem("1 PLUMA INYECTABLE");
            nombre3.addItem("5 PLUMAS INYECTABLES");
        }
        if(med2.getSelectedItem()=="INSULINA ASPARTICA"){
            nombre3.removeAllItems();
            nombre3.addItem("INYECTABLE INSULINA;");
            nombre3.addItem("INYECTABLE INSULINA");
        }
        if(med2.getSelectedItem()=="VILDAGLIPTINA"){
            nombre3.removeAllItems();
            nombre3.addItem("VILDAGLIPTINA COMPRIMIDO");
        }
        if(med2.getSelectedItem()=="SITAGLIPTINA"){
            nombre3.removeAllItems();
            nombre3.addItem("14 COMPRIMIDOS SITAGLIPTINA");
            nombre3.addItem("28 COMPRIMIDOS SITAGLIPTINA");
        }
        if(med2.getSelectedItem()=="METFORMINA"){
            nombre3.removeAllItems();
            nombre3.addItem("TABLETA METFORMINA");
        }
        if(med2.getSelectedItem()=="LINAGLIPTINA"){
            nombre3.removeAllItems();
            nombre3.addItem("TABLETA LINAGLIPTINA");
        }
        if(med2.getSelectedItem()=="GLIBENCLAMIDA"){
            nombre3.removeAllItems();
            nombre3.addItem("TABLETA GLIBENCLAMIDA");
        }
        if(med2.getSelectedItem()=="VERAPAMILO"){
            nombre3.removeAllItems();
            nombre3.addItem("GRAGEA O TABLETA RECUBIERTA VERAPAMILO");
            nombre3.addItem("SOLUCION INYECTABLE VERAPAMILO");
        }
        if(med2.getSelectedItem()=="TRINITRATO DE GLICERILO"){
            nombre3.removeAllItems();
            nombre3.addItem("PARCHE TRINITRATO DE GLICERILO");
        }
        if(med2.getSelectedItem()=="TELMISARTÁN"){
            nombre3.removeAllItems();
            nombre3.addItem("TABLETA TELMISARTAN");
        }
        if(med2.getSelectedItem()=="TELMISARTÁN HIDROCLOROTIAZIDA"){
            nombre3.removeAllItems();
            nombre3.addItem("TABLETA TELMISARTANH");
        }
        if(med2.getSelectedItem()=="PROPRANOLOL"){
            nombre3.removeAllItems();
            nombre3.addItem("40mg TABLETA PROPRANOLOL");
            nombre3.addItem("10mg TABLETA PROPRANOLOL");
        }
        if(med2.getSelectedItem()=="NITROPRUSIATO"){
            nombre3.removeAllItems();
            nombre3.addItem("SOLUCION INYECTABLE NITROPRUSIATO");
        }
        if(med2.getSelectedItem()=="NIFEDIPINO"){
            nombre3.removeAllItems();
            nombre3.addItem("CAPSULA DE GELATINA BLANDA");
            nombre3.addItem("COMPRIMIDO DE LIBERACION PROLONGADA");
        }
        if(med2.getSelectedItem()=="METOPROLOL"){
            nombre3.removeAllItems();
            nombre3.addItem("TABLETA METOPROLOL");
        }
        if(med2.getSelectedItem()=="LOSARTÁN"){
            nombre3.removeAllItems();
            nombre3.addItem("GRAGEA LOSARTÁN");
        }
        if(med2.getSelectedItem()=="ISOSORBIDA"){
            nombre3.removeAllItems();
            nombre3.addItem("TABLETA ISOSORBIDA");
            nombre3.addItem("TABLETA SUBLINGUAL ISOSORBIDA");
        }
        if(med2.getSelectedItem()=="IRBESARTÁN"){
            nombre3.removeAllItems();
            nombre3.addItem("150mg TABLETA IRBESARTÁN");
            nombre3.addItem("300mg TABLETA IRBESARTÁN");
        }
        if(med2.getSelectedItem()=="HIDROCLOROTIAZIDA"){
            nombre3.removeAllItems();
            nombre3.addItem("TABLETA HIDROCLOROTIAZIDA");
        }
        if(med2.getSelectedItem()=="FUROSEMIDA"){
            nombre3.removeAllItems();
            nombre3.addItem("INYECTABLE FUROSEMIDA");
            nombre3.addItem("TABLETA FIROSEMIDA");
        }
        if(med2.getSelectedItem()=="ESMOLOL"){
            nombre3.removeAllItems();
            nombre3.addItem("INYECTABLE ESMOLOL");
        }
        if(med2.getSelectedItem()=="ENALAPRIL O LISINOPRIL O RAMIPRIL"){
            nombre3.removeAllItems();
            nombre3.addItem("TABLETA ENALAPRIL");
        }
        if(med2.getSelectedItem()=="CLORTALIDONA"){
            nombre3.removeAllItems();
            nombre3.addItem("TABLETA CLORTALIDONA");
        }
        if(med2.getSelectedItem()=="CAPTOPRIL"){
            nombre3.removeAllItems();
            nombre3.addItem("TABLETA CAPTOPRIL");
        }
        if(med2.getSelectedItem()=="CANDESARTÁN CILEXETILO HIDROCLOROTIAZIDA"){
            nombre3.removeAllItems();
            nombre3.addItem("TABLETA CANDESARTAN");
        }
        if(med2.getSelectedItem()=="AMLODIPINO"){
            nombre3.removeAllItems();
            nombre3.addItem("TABLETA O CAPSULA AMLODIPINO");
        }
        if(med2.getSelectedItem()=="ÁCIDO ACETILSALICÍLICO"){
            nombre3.removeAllItems();
            nombre3.addItem("TABLETA SOLUBLE ACELTILSALICILICO");
        }
    }//GEN-LAST:event_med2ActionPerformed

    private void nombre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre3ActionPerformed
        // TODO add your handling code here:
        if(nombre3.getSelectedItem()=="GRAGEA O TABLETA RECUBIERTA VERAPAMILO"){
            jTextArea3.setText("Cada gragea o tableta recubierta contiene: Clorhidrato de verapamilo 80 mg. Envase con 20 grageas o tabletas recubiertas");
        }
        if(nombre3.getSelectedItem()=="SOLUCION INYECTABLE VERAPAMILO"){
            jTextArea3.setText("Cada ampolleta contiene: Clorhidrato de verapamilo 5 mg. Envase con 2 ml (2.5 mg/ ml).");
        }
        if(nombre3.getSelectedItem()=="PARCHE TRINITRATO DE GLICERILO"){
            jTextArea3.setText("Cada parche libera: Trinitrato de glicerilo 5 mg/día. Envase con 7 parches");
        }
        if(nombre3.getSelectedItem()=="TABLETA TELMISARTAN"){
            jTextArea3.setText("Cada tableta contiene: Telmisartán 40 mg. Envase con 30 tabletas");
        }
        if(nombre3.getSelectedItem()=="TABLETA TELMISARTANH"){
            jTextArea3.setText("Cada tableta contiene: Telmisartán 80.0 mg. Hidroclorotiazida 12.5 mg. Envase con 14 tabletas.");
        }
        if(nombre3.getSelectedItem()=="40mg TABLETA PROPRANOLOL"){
            jTextArea3.setText("Cada tableta contiene: Clorhidrato de propranolol 40 mg. Envase con 30 tabletas.");
        }
        if(nombre3.getSelectedItem()=="10mg TABLETA PROPRANOLOL"){
            jTextArea3.setText("Cada tableta contiene: Clorhidrato de propranolol 10 mg. Envase con 30 tabletas");
        }
        if(nombre3.getSelectedItem()=="SOLUCION INYECTABLE NITROPRUSIATO"){
            jTextArea3.setText("Cada frasco ámpula con polvo o solución contiene: Nitroprusiato de sodio 50 mg. Envase con un frasco ámpula con o sin diluyente");
        }
        if(nombre3.getSelectedItem()=="CAPSULA DE GELATINA BLANDA"){
            jTextArea3.setText("Cada cápsula contiene: Nifedipino 10 mg. Envase con 20 cápsulas");
        }
        if(nombre3.getSelectedItem()=="COMPRIMIDO DE LIBERACION PROLONGADA"){
            jTextArea3.setText("Cada comprimido contiene: Nifedipino 30 mg. Envase con 30 comprimidos.");
        }
        if(nombre3.getSelectedItem()=="TABLETA METOPROLOL"){
            jTextArea3.setText("Cada tableta contiene: Tartrato de metoprolol 100 mg. Envase con 20 tabletas");
        }
        if(nombre3.getSelectedItem()=="GRAGEA LOSARTÁN"){
            jTextArea3.setText("Cada gragea o comprimido recubierto contiene: Losartán potásico 50 mg. Envase con 30 grageas o comprimidos recubiertos");
        }
        if(nombre3.getSelectedItem()=="TABLETA ISOSORBIDA"){
            jTextArea3.setText("Cada tableta contiene: Dinitrato de isosorbida 10 mg. Envase con 20 tabletas");
        }
        if(nombre3.getSelectedItem()=="TABLETA SUBLINGUAL ISOSORBIDA"){
            jTextArea3.setText("Cada tableta contiene: Dinitrato de isosorbida 5 mg. Envase con 20 tabletas sublinguales");
        }
        if(nombre3.getSelectedItem()=="150mg TABLETA IRBESARTÁN"){
            jTextArea3.setText("Cada tableta contiene: Irbesartán 150 mg. Envase con 28 tabletas.");
        }
        if(nombre3.getSelectedItem()=="300mg TABLETA IRBESARTÁN"){
            jTextArea3.setText("Cada tableta contiene: Irbesartán 300 mg. Envase con 28 tabletas");
        }
        if(nombre3.getSelectedItem()=="TABLETA HIDROCLOROTIAZIDA"){
            jTextArea3.setText("Cada tableta contiene: Hidroclorotiazida 25 mg. Envase con 20 tabletas.");
        }
        if(nombre3.getSelectedItem()=="INYECTABLE FUROSEMIDA"){
            jTextArea3.setText("Cada ampolleta contiene: Furosemida 20 mg. Envase con 5 ampolletas de 2 mL");
        }
        if(nombre3.getSelectedItem()=="TABLETA FIROSEMIDA"){
            jTextArea3.setText("Cada tableta contiene: Furosemida 40 mg. Envase con 20 tabletas.");
        }
        if(nombre3.getSelectedItem()=="INYECTABLE ESMOLOL"){
            jTextArea3.setText("Cada frasco ámpula contiene: Clorhidrato de esmolol 100 mg. Envase con un frasco ámpula con 10 mL (10 mg/ mL).");
        }
        if(nombre3.getSelectedItem()=="TABLETA ENALAPRIL"){
            jTextArea3.setText("Cada cápsula o tableta contiene: Maleato de enalapril 10 mg o lisinopril 10 mg o ramipril 10 mg. Envase con 30 cápsulas o tabletas");
        }
        if(nombre3.getSelectedItem()=="TABLETA CLORTALIDONA"){
            jTextArea3.setText("Cada tableta contiene: Clortalidona 50 mg. Envase con 20 tabletas");
        }
        if(nombre3.getSelectedItem()=="TABLETA CAPTOPRIL"){
            jTextArea3.setText("Cada tableta contiene: Captopril 25 mg");
        }
        if(nombre3.getSelectedItem()=="TABLETA CANDESARTAN"){
            jTextArea3.setText("Cada tableta contiene: Candesartán cilexetilo 16.0 mg. Hidroclorotiazida 12.5 mg. Envase con 28 tabletas");
        }
        if(nombre3.getSelectedItem()=="TABLETA O CAPSULA AMLODIPINO"){
            jTextArea3.setText("Cada tableta o cápsula contiene: Besilato o maleato de amlodipino equivalente a 5 mg de amlodipino. Envase con 30 tabletas o cápsulas.");
        }
        if(nombre3.getSelectedItem()=="TABLETA SOLUBLE ACELTILSALICILICO"){
            jTextArea3.setText("Cada comprimido contiene: Vildagliptina 50 mg. Envase con 28 comprimidos");
        }
        if(nombre3.getSelectedItem()=="VILDAGLIPTINA COMPRIMIDO"){
            jTextArea3.setText("Cada comprimido contiene: Vildagliptina 50 mg. Envase con 28 comprimidos");
        }
        if(nombre3.getSelectedItem()=="14 COMPRIMIDOS SITAGLIPTINA"){
            jTextArea3.setText("Cada comprimido contiene: Sitagliptina monohidratada, fosfato de 100 mg. Envase con 14 comprimidos");
        }
        if(nombre3.getSelectedItem()=="28 COMPRIMIDOS SITAGLIPTINA"){
            jTextArea3.setText("Cada comprimido contiene: Sitagliptina monohidratada, fosfato de 100 mg. Envase con 28 comprimidos");
        }
        if(nombre3.getSelectedItem()=="TABLETA METFORMINA"){
            jTextArea3.setText("Cada tableta contiene: Clorhidrato de metformina 850 mg. Envase con 30 tabletas.");
        }
        if(nombre3.getSelectedItem()=="TABLETA LINAGLIPTINA"){
            jTextArea3.setText("Cada tableta contiene: Linagliptina de 5 mg. Envase con 30 tabletas. ");
        }
        if(nombre3.getSelectedItem()=="TABLETA GLIBENCLAMIDA"){
            jTextArea3.setText("Cada tableta contiene: Glibenclamida 5 mg. Envase con 50 tabletas.");
        }
        if(nombre3.getSelectedItem()=="10ml INYECTABLE GLARGINA"){
            jTextArea3.setText("Cada mL de solución contiene: Insulina glargina 3.64 mg equivalente a 100.0 UI de insulina humana. Envase con un frasco ámpula con 10 mL.");
        }
        if(nombre3.getSelectedItem()=="3ml INYECTABLE GLARGINA"){
            jTextArea3.setText("Envase con 5 cartuchos de vidrio con 3 mL en dispositivo");
        }
        if(nombre3.getSelectedItem()=="INYECTABLE LISPRO PROTAMINA"){
            jTextArea3.setText("INYECTABLE LISPRO PROTAMINA");
        }
        if(nombre3.getSelectedItem()=="INYECTABLE LISPRO"){
            jTextArea3.setText("Cada mL contiene: Insulina lispro (origen ADN recombinante) 100 UI. Envase con un frasco ámpula con 10 mL");
        }
        if(nombre3.getSelectedItem()=="10ml INYECTABLE ACCION INTERMEDIA"){
            jTextArea3.setText("Cada mL contiene: Insulina humana isófana (origen ADN recombinante) 100 UI o Insulina zinc isófana humana (origen ADN recombinante) 100 UI Envase con un frasco ámpula con 10 mL");
        }
        if(nombre3.getSelectedItem()=="5ml INYECTABLE ACCION INTERMEDIA"){
            jTextArea3.setText("Cada mL contiene: Insulina humana isófana (origen ADN recombinante) 100 UI o Insulina zinc isófana humana (origen ADN recombinante) 100 UI Envase con un frasco ámpula con 5 mL.");
        }
        if(nombre3.getSelectedItem()=="10ml INYECTABLE ACCION LENTA"){
            jTextArea3.setText("Cada mL contiene: Insulina zinc compuesta humana (origen ADN recombinante) 100 UI. Envase con un frasco ámpula con 10 mL");
        }
        if(nombre3.getSelectedItem()=="10ml INYECTABLE ACCION RAPIDA"){
            jTextArea3.setText("Cada mL contiene: Insulina humana (origen ADN recombinante) 100 UI o Insulina zinc isófana humana (origen ADN recombinante) 100 UI. Envase con un frasco ámpula con 10mL");
        }
        if(nombre3.getSelectedItem()=="5ml INYECTABLE ACCION RAPIDA"){
            jTextArea3.setText("Cada mL contiene: Insulina humana (origen ADN recombinante) 100 UI o Insulina zinc isófana humana (origen ADN recombinante) 100 UI Envase con un frasco ámpula con 5 mL.");
        }
        if(nombre3.getSelectedItem()=="5 PLUMA INYECTABLE"){
            jTextArea3.setText("Envase con 5 plumas prellenadas con 3 mL (100 U/mL).");
        }
        if(nombre3.getSelectedItem()=="1 PLUMA INYECTABLE"){
            jTextArea3.setText("Envase con 1 pluma prellenada de 3 mL (100 U/mL).");
        }
        if(nombre3.getSelectedItem()=="INYECTABLE INSULINA"){
            jTextArea3.setText("Cada cápsula contiene: Cloranfenicol 500 mg. Envase con 20 cápsulas");
        }
        if(nombre3.getSelectedItem()=="INYECTABLE INSULINA*"){
            jTextArea3.setText("Envase con un frasco ámpula con 10 mL.");
        }
        if(nombre3.getSelectedItem()=="CAPSULA CLORANFENICOL"){
            jTextArea3.setText("Cada cápsula contiene: Cloranfenicol 500 mg. Envase con 20 cápsulas");
        }
        if(nombre3.getSelectedItem()=="CAPSULA O TABLETA DOXICILINA"){
            jTextArea3.setText("Cada cápsula o tableta contiene: Hiclato de doxiciclina equivalente a 100 mg de doxiciclina. Envase con 10 cápsulas o tabletas");
        }
        if(nombre3.getSelectedItem()=="SOLUCION INYECTABLE FOSFATO"){
            jTextArea3.setText("Cada ampolleta contiene: Fosfato de potasio dibásico 1.550 g. Fosfato de potasio monobásico 0.300 g. (Potasio 20 mEq) (Fosfato 20 mEq). Envase con 50 ampolletas con 10 mL");
        }
        if(nombre3.getSelectedItem()=="TABLETA TETRACICLINA"){
            jTextArea3.setText("Cada tableta o cápsula contiene: Clorhidrato de tetraciclina 250 mg. Envase con 10 tabletas o cápsulas");
        }
        if(nombre3.getSelectedItem()=="SUSPENSION ORAL NITAZOXANIDA"){
            jTextArea3.setText("Cada 5 mL contienen: Nitazoxanida 100 mg. Envase con 30 mL.");
        }
        if(nombre3.getSelectedItem()=="TABLETA NITAZOXANIDA"){
            jTextArea3.setText("Cada tableta contiene: Nitazoxanida 200 mg. Envase con 6 tabletas");
        }
        if(nombre3.getSelectedItem()=="SUSPENSION ORAL METRONIDAZOL"){
            jTextArea3.setText("Cada 5 mL contienen: Benzoilo de metronidazol equivalente a 250 mg de metronidazol. Envase con 120 mL y dosificador");
        }
        if(nombre3.getSelectedItem()=="20 TABLETAS METRONIDAZOL"){
            jTextArea3.setText("Cada tableta contiene: Metronidazol 500 mg. Envase con 20 tabletas");
        }
        if(nombre3.getSelectedItem()=="30 TABLETAS METRONIDAZOL"){
            jTextArea3.setText("Cada tableta contiene: Metronidazol 500 mg. Envase con 30 tabletas.");
        }
        if(nombre3.getSelectedItem()=="POLVO ELECTROLITOS ORALES"){
            jTextArea3.setText("(Fórmula de Osmolaridad Baja) Cada sobre con polvo contiene: Glucosa anhidra 13.5 g. Cloruro de potasio 1.5 g. Cloruro de sodio 2.6 g. Citrato trisódico dihidratado 2.9 g. Envase con 20.5 g");
        }
        if(nombre3.getSelectedItem()=="SOLUCION ELECTROLITOS ORALES"){
            jTextArea3.setText("Cada sobre con polvo contiene: Glucosa 20.0 g. Cloruro de potasio 1.5 Cloruro de sodio 3.5 g. Citrato trisódico dihidratado 2.9 g. Envase con 27.9 g.");
        }
        if(nombre3.getSelectedItem()=="CAPSULA O TABLETA DOXICILINA"){
            jTextArea3.setText("Cada cápsula o tableta contiene: Hiclato de doxiciclina equivalente a 100 mg de doxiciclina. Envase con 10 cápsulas o tabletas");
        }
        if(nombre3.getSelectedItem()=="SOLUCION INYECTABLE BM"){
            jTextArea3.setText("Cada ampolleta contiene: N-butilbromuro de hioscina 20 mg. Metamizol 2.5 g. Envase con 5 ampolletas de 5 mL");
        }
        if(nombre3.getSelectedItem()=="GRAGEA O TABLETA BUTILHIOSCINA"){
            jTextArea3.setText("Cada gragea o tableta contiene: Bromuro de butilhioscina 10 mg. Envase con 10 grageas o tabletas.");
        }
        if(nombre3.getSelectedItem()=="SOLUCION INYECTABLE BUTILHIOSCINA"){
            jTextArea3.setText("Cada ampolleta contiene: Bromuro de butilhioscina 20 mg. Envase con 3 ampolletas de 1 mL");
        }
        if(nombre3.getSelectedItem()=="SOLUCION OFTAMOLICA TOBRAMICINA"){
            jTextArea3.setText("Cada mL contiene: Sulfato de tobramicina equivalente a 3.0 mg. De tobramicina o tobramicina 3.0 mg. Envase con gotero integral con 5 mL");
        }
        if(nombre3.getSelectedItem()=="SOLUCION OFTAMOLICA TETRACAÍNA"){
            jTextArea3.setText("Cada mL contiene: Clorhidrato de tetracaína 5.0 mg. Envase con gotero integral con 10 mL.");
        }
        if(nombre3.getSelectedItem()=="SOLUCION OFTAMOLICA SULFACETAMIDA"){
            jTextArea3.setText("Cada mL contiene: Sulfacetamida sódica 0.1 g. Envase con gotero integral con 15 mL..");
        }
        if(nombre3.getSelectedItem()=="SUSPENSION OFTAMOLICA PREDNISOLONA"){
            jTextArea3.setText("Cada mL contiene: Acetato de prednisolona 5 mg. Sulfacetamida sódica 100 mg. Envase con gotero integrado con 5 mL.");
        }
        if(nombre3.getSelectedItem()=="SOLUCION OFTAMOLICA PREDNISOLONA"){
            jTextArea3.setText("Cada mL contiene: Fosfato sódico de prednisolona equivalente a 5 mg de fosfato de prednisolona. Envase con gotero integral con 5 mL");
        }
        if(nombre3.getSelectedItem()=="UNGUENTO OFTAMOLICO PREDNISOLONA"){
            jTextArea3.setText("Cada g contiene: Acetato de prednisolona equivalente a 5 mg de prednisolona. Envase con 3 g.");
        }
        if(nombre3.getSelectedItem()=="SOLUCION OFTAMOLICA NEOMICINA"){
            jTextArea3.setText("Cada mL contiene: Sulfato de neomicina equivalente a 1.75 mg de neomicina. Sulfato de polimixina B equivalente a 5 000 U de Polimixina B. Gramicidina 25 μg. Envase con gotero integral con 15 mL");
        }
        if(nombre3.getSelectedItem()=="SOLUCION OFTAMOLICA NAFAZOLINA"){
            jTextArea3.setText("Cada mL contiene: Clorhidrato de nafazolina 1 mg. Envase con gotero integral con 15 mL");
        }
        if(nombre3.getSelectedItem()=="POMADA CLORURO DE SODIO"){
            jTextArea3.setText("Cada g o mL contiene: Cloruro de sodio 50 mg. Envase con 7 g o con gotero integral con 10 mL.");
        }
        if(nombre3.getSelectedItem()=="SOLUCIÓN OFTAMOLICA CLORANFENICOL"){
            jTextArea3.setText("Cada mL contiene: Cloranfenicol levógiro 5 mg. Envase con gotero integral con 15 mL");
        }
        if(nombre3.getSelectedItem()=="UNGUENTO OFTAMOLICO ACICLOVIR"){
            jTextArea3.setText("Cada 100 g contienen: Aciclovir 3 g. Envase con 4.5 g.");
        }
        if(nombre3.getSelectedItem()=="CAPSULA DICLOFENACO"){
            jTextArea3.setText("Cada gragea contiene: Diclofenaco sódico 100 mg. Envase con 20 cápsulas o grageas.");
        }
        if(nombre3.getSelectedItem()=="INYECTABLE DICLOFENACO"){
            jTextArea3.setText("Cada ampolleta contiene: Diclofenaco sódico 75 mg. Envase con 2 ampolletas con 3 mL");
        }
        if(nombre3.getSelectedItem()=="TABLETA CIPROFLOXACINO"){
            jTextArea3.setText("Cada cápsula o tableta contiene: Clorhidrato de ciprofloxacino monohidratado equivalente a 250 mg de ciprofloxacino. Envase con 8 cápsulas o tabletas");
        }
        if(nombre3.getSelectedItem()=="TABLETA CEFALEXINA"){
            jTextArea3.setText("Cada tableta o cápsula contiene: Cefalexina monohidratada equivalente a 500 mg de cefalexina. Envase con 20 tabletas o cápsulas");
        }
        if(nombre3.getSelectedItem()=="AMOXICILINA SUSPENSION ORAL"){
            jTextArea3.setText("Cada frasco con polvo contiene: Amoxicilina trihidratada equivalente a 7.5 g de amoxicilina. Envase con polvo para 75 mL (500 mg/5 mL).");
        }
        if(nombre3.getSelectedItem()=="12 CAPSULAS AMOXICILINA"){
            jTextArea3.setText("Cada cápsula contiene: Amoxicilina trihidratada equivalente a 500 mg de amoxicilina. Envase con 12 cápsulas");
        }
        if(nombre3.getSelectedItem()=="15 CAPSULAS AMOXICILINA"){
            jTextArea3.setText("Cada cápsula contiene: Amoxicilina trihidratada equivalente a 500 mg de amoxicilina. Envase con 15 cápsulas");
        }
        if(nombre3.getSelectedItem()=="INYECTABLE NAPROXENO"){
            jTextArea3.setText("Cada ampolleta contiene: Metamizol sódico 1 g. Envase con 3 ampolletas con 2 mL.");
        }
        if(nombre3.getSelectedItem()=="METAMIZOL INYECTABLE"){
            jTextArea3.setText("Cada frasco ámpula o ampolleta contiene: Fosfato sódico de dexametasona equivalente a 8 mg de fosfato de dexametasona. Envase con un frasco ámpula o ampolleta con 2 mL.");
        }
        if(nombre3.getSelectedItem()=="JARABE CLORFENAMINA"){
            jTextArea3.setText("Cada mL contiene: Maleato de clorfenamina 0.5 mg. Envase con 60 mL.");
        }
        if(nombre3.getSelectedItem()=="TABLETA CLORFENAMINA"){
            jTextArea3.setText("Cada tableta contiene: Maleato de clorfenamina 4.0 mg. Envase con 20 tabletas");
        }
        if(nombre3.getSelectedItem()=="JARABE LORATADINA"){
            jTextArea3.setText("Cada 100 mL contienen: Loratadina 100 mg. Envase con 60 mL y dosificador.");
        }
        if(nombre3.getSelectedItem()=="TABLETA LORATADINA"){
            jTextArea3.setText("Cada tableta o gragea contiene: Loratadina 10 mg. Envase con 20 tabletas o grageas");
        }
        if(nombre3.getSelectedItem()=="SUSPENSIÓN ORAL AMOXICILINA"){
            jTextArea3.setText("Cada 5 mL contienen: Ampicilina trihidratada equivalente a 250 mg de ampicilina. Envase con polvo para 60 mL y dosificador.");
        }
        if(nombre3.getSelectedItem()=="TABLETA AMOXICILINA"){
            jTextArea3.setText("Cada frasco con polvo contiene: Amoxicilina trihidratada equivalente a 1.5 g de amoxicilina. Clavulanato de potasio equivalente a 375 mg de ácido clavulánico. Envase con 60 mL. Cada 5 mL con 125 mg de amoxicilina y 31.25 mg de ácido clavulánico");
        }
        if(nombre3.getSelectedItem()=="SUSPENSIÓN ORAL AMPICILINA"){
            jTextArea3.setText("Cada 5 mL contienen: Ampicilina trihidratada equivalente a 250 mg de ampicilina. Envase con polvo para 60 mL y dosificador.");
        }
        if(nombre3.getSelectedItem()=="SUSPENSIÓN INYECTABLE BENCILPENICILINA"){
            jTextArea3.setText("Cada frasco ámpula con polvo contiene: Benzatina bencilpenicilina equivalente a 600 000 UI de bencilpenicilina procaínica equivalente a 300 000 UI de bencilpenicilina a cristalina equivalente a 300 000 UI de bencilpenicilina Envase con un frasco ámpula y diluyente con 3 mL.");
        }
        if(nombre3.getSelectedItem()=="3ml INYECTABLE"){
            jTextArea3.setText("Cada frasco ámpula con polvo contiene: Benzatina bencilpenicilina equivalente a 600 000 UI de bencilpenicilina procaínica equivalente a 300 000 UI de bencilpenicilina a cristalina equivalente a 300 000 UI de bencilpenicilina Envase con un frasco ámpula y diluyente con 3 mL.");
        }
        if(nombre3.getSelectedItem()=="2ml INYECTABLE"){
            jTextArea3.setText("Cada frasco ámpula con polvo contiene: Bencilpenicilina procaínica equivalente a 300 000 UI de bencilpenicilina cristalina equivalente a 100 000 UI de bencilpenicilina. Envase con un frasco ámpula y 2 mL de diluyente.");
        }
        if(nombre3.getSelectedItem()=="BENZATINA INYECTABLE"){
            jTextArea3.setText("Cada frasco ámpula con polvo contiene: Benzatina bencilpenicilina equivalente a 1 200 000 UI de bencilpenicilina. Envase con un frasco ámpula y 5 mL de diluyente.");
        }
        if(nombre3.getSelectedItem()=="ERITROMICINA CAPSULA"){
            jTextArea3.setText("Cada cápsula o tableta contiene: Estearato de eritromicina equivalente a 500 mg de eritromicina. Envase con 20 cápsulas o tabletas.");
        }
        if(nombre3.getSelectedItem()=="ERITROMICINA ORAL"){
            jTextArea3.setText("Cada 5 mL contienen: Estearato o etilsuccinato o estolato de eritromicina equivalente a 250 mg de eritromicina. Envase con polvo para 100 mL y dosificador.");
        }
        if(nombre3.getSelectedItem()=="TABLETA TRIME"){
            jTextArea3.setText("Cada comprimido o tableta contiene: Trimetoprima 80 mg y Sulfametoxazol 400 mg. Envase con 20 comprimidos o tabletas.");
        }
        if(nombre3.getSelectedItem()=="ORAL TRIME"){
            jTextArea3.setText("Cada 5 mL contienen: Trimetoprima 40 mg. Sulfametoxazol 200 mg. Envase con 120");
        }
        if(nombre3.getSelectedItem()=="NAPROXENO TABLETA"){
            jTextArea3.setText("Cada tableta contiene: Naproxeno 250 mg. Envase con 30 tabletas.");
        }
        if(nombre3.getSelectedItem()=="SUSPENSION ORAL"){
            jTextArea3.setText("Cada 5 mL contienen: Naproxeno 125 mg. Envase con 100 mL.");
        }
        if(nombre3.getSelectedItem()=="SOLUCION ORAL"){
            jTextArea3.setText("Cada mL contiene: Paracetamol 100 mg. Envase con 15 mL, gotero calibrado a 0.5 y 1 mL, integrado o adjunto al envase que sirve de tapa.");
        }
        if(nombre3.getSelectedItem()=="3 SUPOSITORIOS 300 mg"){
            jTextArea3.setText("Cada supositorio contiene: Paracetamol 300 mg. Envase con 3 supositorios");
        }
        if(nombre3.getSelectedItem()=="3 SUPOSITORIOS 100 mg"){
            jTextArea3.setText("Cada supositorio contiene: Paracetamol 100 mg. Envase con 3 supositorios");
        }
        if(nombre3.getSelectedItem()=="6 SUPOSITORIOS 100 mg"){
            jTextArea3.setText("Cada supositorio contiene: Paracetamol 100 mg. Envase con 6 supositorios");
        }
        if(nombre3.getSelectedItem()=="10 SUPOSITORIOS 100 mg"){
            jTextArea3.setText("Cada supositorio contiene: Paracetamol 100 mg. Envase con 10 supositorios.");
        }
        if(nombre3.getSelectedItem()=="PARACETAMOL TABLETA"){
            jTextArea3.setText("Cada tableta contiene: Paracetamol 500 mg. Envase con 10 tabletas.");
        }
        if(nombre3.getSelectedItem()=="VITAMINAS A, C, D"){
            jTextArea3.setText("Cada mL contiene: Palmitato de Retinol 7000 a 9000 UI. Ácido ascórbico 80 a 125 mg. Colecalciferol 1400 a 1800 UI. Envase con 15 mL.");
        }
        if(nombre3.getSelectedItem()=="ORALES"){
            jTextArea3.setText("Cada sobre con polvo contiene: Glucosa 20.0 g. Cloruro de potasio 1.5 Cloruro de sodio 3.5 g. Citrato trisódico dihidratado 2.9 g. Envase con 27.9 g.");
        }
        if(nombre3.getSelectedItem()=="METAMIZOL COMPRIMIDO"){
            jTextArea3.setText("Cada comprimido contiene: Metamizol sódico 500 mg. Envase con 10 comprimidos.");
        }
        if(nombre3.getSelectedItem()=="OSELTAMIVIR CAPSULA"){
            jTextArea3.setText("Cada cápsula contiene: Oseltamivir 75.0 mg. Envase con 10 cápsulas.");
        }
    }//GEN-LAST:event_nombre3ActionPerformed

    private void med3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_med3ActionPerformed
        // TODO add your handling code here:
        if(med3.getSelectedItem()=="VERAPAMILO"){
            nombre4.removeAllItems();
            nombre4.addItem("GRAGEA O TABLETA RECUBIERTA VERAPAMILO");
            nombre4.addItem("SOLUCION INYECTABLE VERAPAMILO");
        }
        if(med3.getSelectedItem()=="TRINITRATO DE GLICERILO"){
            nombre4.removeAllItems();
            nombre4.addItem("PARCHE TRINITRATO DE GLICERILO");
        }
        if(med3.getSelectedItem()=="TELMISARTÁN"){
            nombre4.removeAllItems();
            nombre4.addItem("TABLETA TELMISARTAN");
        }
        if(med3.getSelectedItem()=="TELMISARTÁN HIDROCLOROTIAZIDA"){
            nombre4.removeAllItems();
            nombre4.addItem("TABLETA TELMISARTANH");
        }
        if(med3.getSelectedItem()=="PROPRANOLOL"){
            nombre4.removeAllItems();
            nombre4.addItem("40mg TABLETA PROPRANOLOL");
            nombre4.addItem("10mg TABLETA PROPRANOLOL");
        }
        if(med3.getSelectedItem()=="NITROPRUSIATO"){
            nombre4.removeAllItems();
            nombre4.addItem("SOLUCION INYECTABLE NITROPRUSIATO");
        }
        if(med3.getSelectedItem()=="NIFEDIPINO"){
            nombre4.removeAllItems();
            nombre4.addItem("CAPSULA DE GELATINA BLANDA");
            nombre4.addItem("COMPRIMIDO DE LIBERACION PROLONGADA");
        }
        if(med3.getSelectedItem()=="METOPROLOL"){
            nombre4.removeAllItems();
            nombre4.addItem("TABLETA METOPROLOL");
        }
        if(med3.getSelectedItem()=="LOSARTÁN"){
            nombre4.removeAllItems();
            nombre4.addItem("GRAGEA LOSARTÁN");
        }
        if(med3.getSelectedItem()=="ISOSORBIDA"){
            nombre4.removeAllItems();
            nombre4.addItem("TABLETA ISOSORBIDA");
            nombre4.addItem("TABLETA SUBLINGUAL ISOSORBIDA");
        }
        if(med3.getSelectedItem()=="IRBESARTÁN"){
            nombre4.removeAllItems();
            nombre4.addItem("150mg TABLETA IRBESARTÁN");
            nombre4.addItem("300mg TABLETA IRBESARTÁN");
        }
        if(med3.getSelectedItem()=="HIDROCLOROTIAZIDA"){
            nombre4.removeAllItems();
            nombre4.addItem("TABLETA HIDROCLOROTIAZIDA");
        }
        if(med3.getSelectedItem()=="FUROSEMIDA"){
            nombre4.removeAllItems();
            nombre4.addItem("INYECTABLE FUROSEMIDA");
            nombre4.addItem("TABLETA FIROSEMIDA");
        }
        if(med3.getSelectedItem()=="ESMOLOL"){
            nombre4.removeAllItems();
            nombre4.addItem("INYECTABLE ESMOLOL");
        }
        if(med3.getSelectedItem()=="ENALAPRIL O LISINOPRIL O RAMIPRIL"){
            nombre4.removeAllItems();
            nombre4.addItem("TABLETA ENALAPRIL");
        }
        if(med3.getSelectedItem()=="CLORTALIDONA"){
            nombre4.removeAllItems();
            nombre4.addItem("TABLETA CLORTALIDONA");
        }
        if(med3.getSelectedItem()=="CAPTOPRIL"){
            nombre4.removeAllItems();
            nombre4.addItem("TABLETA CAPTOPRIL");
        }
        if(med3.getSelectedItem()=="CANDESARTÁN CILEXETILO HIDROCLOROTIAZIDA"){
            nombre4.removeAllItems();
            nombre4.addItem("TABLETA CANDESARTAN");
        }
        if(med3.getSelectedItem()=="AMLODIPINO"){
            nombre4.removeAllItems();
            nombre4.addItem("TABLETA O CAPSULA AMLODIPINO");
        }
        if(med3.getSelectedItem()=="ÁCIDO ACETILSALICÍLICO"){
            nombre4.removeAllItems();
            nombre4.addItem("TABLETA SOLUBLE ACELTILSALICILICO");
        }
        if(med3.getSelectedItem()=="BUTILHIOSCINA "){
            nombre4.removeAllItems();
            nombre4.addItem("GRAGEA O TABLETA BUTILHIOSCINA");
        }
        if(med3.getSelectedItem()=="CLORANFENICOL "){
            nombre4.removeAllItems();
            nombre4.addItem("CAPSULA CLORANFENICOL");
        }
        if(med3.getSelectedItem()=="FLUORURO DE SODIO"){
            nombre4.addItem("FLUORURO DE SODIO");
            jTextArea2.setText("acidulado al 2%. En gel de sabor. Envase Z01.2 Examen odontológico con 480 mL.");
        }
        if(med3.getSelectedItem()=="NAPROXENO"){
            nombre4.removeAllItems();
            nombre4.addItem("SUSPENSION ORAL");
            nombre4.addItem("NAPROXENO TABLETA");
        }
        if(med3.getSelectedItem()=="PARACETAMOL"){
            nombre4.removeAllItems();
            nombre4.addItem("PARACETAMOL TABLETA");
            nombre4.addItem("SOLUCION ORAL");
            nombre4.addItem("3 SUPOSITORIOS 300 mg");
            nombre4.addItem("3 SUPOSITORIOS 100 mg");
            nombre4.addItem("6 SUPOSITORIOS 100 mg");
            nombre4.addItem("10 SUPOSITORIOS 100 mg");
        }
        if(med3.getSelectedItem()=="VITAMINAS A, C, D"){
            nombre4.removeAllItems();
            nombre4.addItem("VITAMINAS A, C, D");
        }
        if(med3.getSelectedItem()=="ELECTROLITOS"){
            nombre4.removeAllItems();
            nombre4.addItem("ORALES");
        }
        if(med3.getSelectedItem()=="METAMIZOL SÓDICO"){
            nombre4.removeAllItems();
            nombre4.addItem("METAMIZOL COMPRIMIDO");
        }
        if(med3.getSelectedItem()=="OSELTAMIVIR"){
            nombre4.removeAllItems();
            nombre4.addItem("OSELTAMIVIR CAPSULA");
        }
        if(med3.getSelectedItem()=="AMOXICILINA ÁCIDO CLAVULÁNICO"){
            nombre4.removeAllItems();
            nombre4.addItem("SUSPENSIÓN ORAL AMOXICILINA");
            nombre4.addItem("TABLETA AMOXICILINA");
        }
        if(med3.getSelectedItem()=="AMPICILINA"){
            nombre4.removeAllItems();
            nombre4.addItem("SUSPENSIÓN ORAL AMPICILINA");
        }
        if(med3.getSelectedItem()=="BENCILPENICILINA BENZATICA COMPUESTA"){
            nombre4.removeAllItems();
            nombre4.addItem("SUSPENSIÓN INYECTABLE BENCILPENICILINA");
        }
        if(med3.getSelectedItem()=="BENCILPENICILINA PROCAINICA CON CRISTALINA"){
            nombre4.removeAllItems();
            nombre4.addItem("3ml INYECTABLE");
            nombre4.addItem("2ml INYECTABLE");
        }
        if(med3.getSelectedItem()=="BENZATINA BENCILPENICILINA"){
            nombre4.removeAllItems();
            nombre4.addItem("BENZATINA INYECTABLE");
        }
        if(med3.getSelectedItem()=="ERITROMICINA"){
            nombre4.removeAllItems();
            nombre4.addItem("ERITROMICINA CAPSULA");
            nombre4.addItem("ERITROMICINA ORAL");
        }
        if(med3.getSelectedItem()=="TRIMETOPRIMASULFAMETOXAZOL"){
            nombre4.removeAllItems();
            nombre4.addItem("TABLETA TRIME");
            nombre4.addItem("ORAL TRIME");
        }
        if(med3.getSelectedItem()=="CLORFENAMINA"){
            nombre4.removeAllItems();
            nombre4.addItem("JARABE CLORFENAMINA");
            nombre4.addItem("TABLETA CLORFENAMINA");
        }
        if(med3.getSelectedItem()=="LORATADINA"){
            nombre4.removeAllItems();
            nombre4.addItem("JARABE LORATADINA");
            nombre4.addItem("TABLETA LORATADINA");
        }
        if(med3.getSelectedItem()=="NAPROXENO "){
            nombre4.removeAllItems();
            nombre4.addItem("SUSPENSION ORAL NAPROXENO");
            nombre4.addItem("INYECTABLE NAPROXENO");
        }
        if(med3.getSelectedItem()=="METAMIZOL SÓDICO "){
            nombre4.removeAllItems();
            nombre4.addItem("METAMIZOL COMPRIMIDO");
            nombre4.addItem("METAMIZOL INYECTABLE");
        }
        if(med3.getSelectedItem()=="DICLOFENACO"){
            nombre4.removeAllItems();
            nombre4.addItem("CAPSULA DICLOFENACO");
            nombre4.addItem("INYECTABLE DICLOFENACO");
        }
        if(med3.getSelectedItem()=="CIPROFLOXACINO"){
            nombre4.removeAllItems();
            nombre4.addItem("TABLETA CIPROFLOXACINO");
        }
        if(med3.getSelectedItem()=="CEFALEXINA"){
            nombre4.removeAllItems();
            nombre4.addItem("TABLETA CEFALEXINA");
        }
        if(med3.getSelectedItem()=="AMOXICILINA"){
            nombre4.removeAllItems();
            nombre4.addItem("12 CAPSULAS AMOXICILINA");
            nombre4.addItem("15 CAPSULAS AMOXICILINA");
            nombre4.addItem("AMOXICILINA SUSPENSION ORAL");
        }
         if(med3.getSelectedItem()=="TOBRAMICINA"){
            nombre4.removeAllItems();
            nombre4.addItem("SOLUCION OFTAMOLICA TOBRAMICINA");
        }
        if(med3.getSelectedItem()=="TETRACAÍNA"){
            nombre4.removeAllItems();
            nombre4.addItem("SOLUCION OFTAMOLICA TETRACAÍNA");
        }
        if(med3.getSelectedItem()=="SULFACETAMIDA"){
            nombre4.removeAllItems();
            nombre4.addItem("SOLUCION OFTAMOLICA SULFACETAMIDA");
        }
        if(med3.getSelectedItem()=="PREDNISOLONA-SULFACETAMIDA"){
            nombre4.removeAllItems();
            nombre4.addItem("SUSPENSION OFTAMOLICA PREDNISOLONA");
        }
        if(med3.getSelectedItem()=="PREDNISOLONA"){
            nombre4.removeAllItems();
            nombre4.addItem("SOLUCION OFTAMOLICA PREDNISOLONA");
            nombre4.addItem("UNGUENTO OFTAMOLICO PREDNISOLONA");
        }
        if(med3.getSelectedItem()=="NEOMICINA, POLIMIXINA B Y GRAMICIDINA"){
            nombre4.removeAllItems();
            nombre4.addItem("SOLUCION OFTAMOLICA NEOMICINA");
        }
        if(med3.getSelectedItem()=="NAFAZOLINA"){
            nombre4.removeAllItems();
            nombre4.addItem("SOLUCION OFTAMOLICA NAFAZOLINA");
        }
        if(med3.getSelectedItem()=="CLORURO DE SODIO"){
            nombre4.removeAllItems();
            nombre4.addItem("POMADA CLORURO DE SODIO");
        }
        if(med3.getSelectedItem()=="CLORANFENICOL"){
            nombre4.removeAllItems();
            nombre4.addItem("SOLUCIÓN OFTAMOLICA CLORANFENICOL");
        }
        if(med3.getSelectedItem()=="ACICLOVIR"){
            nombre4.removeAllItems();
            nombre4.addItem("UNGUENTO OFTAMOLICO ACICLOVIR");
        }
        if(med3.getSelectedItem()=="TETRACICLINA"){
            nombre4.removeAllItems();
            nombre4.addItem("TABLETA TETRACICLINA");
        }
        if(med3.getSelectedItem()=="NITAZOXANIDA"){
            nombre4.removeAllItems();
            nombre4.addItem("SUSPENSION ORAL NITAZOXANIDA");
            nombre4.addItem("TABLETA NITAZOXANIDA");
        }
        if(med3.getSelectedItem()=="METRONIDAZOL"){
            nombre4.removeAllItems();
            nombre4.addItem("SUSPENSION ORAL METRONIDAZOL");
            nombre4.addItem("20 TABLETAS METRONIDAZOL");
            nombre4.addItem("30 TABLETAS METRONIDAZOL");
        }
        if(med3.getSelectedItem()=="ELECTROLITOS"){
            nombre4.removeAllItems();
            nombre4.addItem("POLVO ELECTROLITOS ORALES");
            nombre4.addItem("SOLUCION ELECTROLITOS ORALES");
        }
        if(med3.getSelectedItem()=="DOXICILINA"){
            nombre4.removeAllItems();
            nombre4.addItem("CAPSULA O TABLETA DOXICILINA");
        }
        if(med3.getSelectedItem()=="BUTILHIOSCINA-METAMIZOL"){
            nombre4.removeAllItems();
            nombre4.addItem("SOLUCION INYECTABLE BM");
        }
        if(med3.getSelectedItem()=="BUTILHIOSCINA"){
            nombre4.removeAllItems();
            nombre4.addItem("GRAGEA O TABLETA BUTILHIOSCINA");
            nombre4.addItem("SOLUCION INYECTABLE BUTILHIOSCINA");
        }
        if(med3.getSelectedItem()=="FOSFATO DE POTASIO"){
            nombre4.removeAllItems();
            nombre4.addItem("SOLUCION INYECTABLE FOSFATO");
        }
        if(med3.getSelectedItem()=="DOXICICLINA"){
            nombre4.removeAllItems();
            nombre4.addItem("CAPSULA O TABLETA DOXICILINA");
        }
        if(med3.getSelectedItem()=="INSULINA LISPRO PROTAMINA"){
            nombre4.removeAllItems();
            nombre4.addItem("INYECTABLE LISPRO PROTAMINA");
        }
        if(med3.getSelectedItem()=="INSULINA LISPRO"){
            nombre4.removeAllItems();
            nombre4.addItem("INYECTABLE LISPRO");
        }
        if(med3.getSelectedItem()=="INSULINA HUMANA"){
            nombre4.removeAllItems();
            nombre4.addItem("5ml INYECTABLE ACCION RAPIDA");
            nombre4.addItem("10ml INYECTABLE ACCION RAPIDA");
            nombre4.addItem("10ml INYECTABLE ACCION LENTA");
            nombre4.addItem("5ml INYECTABLE ACCION INTERMEDIA");
            nombre4.addItem("10ml INYECTABLE ACCION INTERMEDIA");
        }
        if(med3.getSelectedItem()=="INSULINA GLARGINA"){
            nombre4.removeAllItems();
            nombre4.addItem("10ml INYECTABLE GLARGINA");
            nombre4.addItem("3ml INYECTABLE GLARGINA");
        }
        if(med3.getSelectedItem()=="INSULINA DEMETIR"){
            nombre4.removeAllItems();
            nombre4.addItem("1 PLUMA INYECTABLE");
            nombre4.addItem("5 PLUMAS INYECTABLES");
        }
        if(med3.getSelectedItem()=="INSULINA ASPARTICA"){
            nombre4.removeAllItems();
            nombre4.addItem("INYECTABLE INSULINA*");
            nombre4.addItem("INYECTABLE INSULINA");
        }
        if(med3.getSelectedItem()=="VILDAGLIPTINA"){
            nombre4.removeAllItems();
            nombre4.addItem("VILDAGLIPTINA COMPRIMIDO");
        }
        if(med3.getSelectedItem()=="SITAGLIPTINA"){
            nombre4.removeAllItems();
            nombre4.addItem("14 COMPRIMIDOS SITAGLIPTINA");
            nombre4.addItem("28 COMPRIMIDOS SITAGLIPTINA");
        }
        if(med3.getSelectedItem()=="METFORMINA"){
            nombre4.removeAllItems();
            nombre4.addItem("TABLETA METFORMINA");
        }
        if(med3.getSelectedItem()=="LINAGLIPTINA"){
            nombre4.removeAllItems();
            nombre4.addItem("TABLETA LINAGLIPTINA");
        }
        if(med3.getSelectedItem()=="GLIBENCLAMIDA"){
            nombre4.removeAllItems();
            nombre4.addItem("TABLETA GLIBENCLAMIDA");
        }
        
        
    }//GEN-LAST:event_med3ActionPerformed

    private void nombre4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre4ActionPerformed
        // TODO add your handling code here:
        if(nombre4.getSelectedItem()=="GRAGEA O TABLETA RECUBIERTA VERAPAMILO"){
            jTextArea2.setText("Cada gragea o tableta recubierta contiene: Clorhidrato de verapamilo 80 mg. Envase con 20 grageas o tabletas recubiertas");
        }
        if(nombre4.getSelectedItem()=="SOLUCION INYECTABLE VERAPAMILO"){
            jTextArea2.setText("Cada ampolleta contiene: Clorhidrato de verapamilo 5 mg. Envase con 2 ml (2.5 mg/ ml).");
        }
        if(nombre4.getSelectedItem()=="PARCHE TRINITRATO DE GLICERILO"){
            jTextArea2.setText("Cada parche libera: Trinitrato de glicerilo 5 mg/día. Envase con 7 parches");
        }
        if(nombre4.getSelectedItem()=="TABLETA TELMISARTAN"){
            jTextArea2.setText("Cada tableta contiene: Telmisartán 40 mg. Envase con 30 tabletas");
        }
        if(nombre4.getSelectedItem()=="TABLETA TELMISARTANH"){
            jTextArea2.setText("Cada tableta contiene: Telmisartán 80.0 mg. Hidroclorotiazida 12.5 mg. Envase con 14 tabletas.");
        }
        if(nombre4.getSelectedItem()=="40mg TABLETA PROPRANOLOL"){
            jTextArea2.setText("Cada tableta contiene: Clorhidrato de propranolol 40 mg. Envase con 30 tabletas.");
        }
        if(nombre4.getSelectedItem()=="10mg TABLETA PROPRANOLOL"){
            jTextArea2.setText("Cada tableta contiene: Clorhidrato de propranolol 10 mg. Envase con 30 tabletas");
        }
        if(nombre4.getSelectedItem()=="SOLUCION INYECTABLE NITROPRUSIATO"){
            jTextArea2.setText("Cada frasco ámpula con polvo o solución contiene: Nitroprusiato de sodio 50 mg. Envase con un frasco ámpula con o sin diluyente");
        }
        if(nombre4.getSelectedItem()=="CAPSULA DE GELATINA BLANDA"){
            jTextArea2.setText("Cada cápsula contiene: Nifedipino 10 mg. Envase con 20 cápsulas");
        }
        if(nombre4.getSelectedItem()=="COMPRIMIDO DE LIBERACION PROLONGADA"){
            jTextArea2.setText("Cada comprimido contiene: Nifedipino 30 mg. Envase con 30 comprimidos.");
        }
        if(nombre4.getSelectedItem()=="TABLETA METOPROLOL"){
            jTextArea2.setText("Cada tableta contiene: Tartrato de metoprolol 100 mg. Envase con 20 tabletas");
        }
        if(nombre4.getSelectedItem()=="GRAGEA LOSARTÁN"){
            jTextArea2.setText("Cada gragea o comprimido recubierto contiene: Losartán potásico 50 mg. Envase con 30 grageas o comprimidos recubiertos");
        }
        if(nombre4.getSelectedItem()=="TABLETA ISOSORBIDA"){
            jTextArea2.setText("Cada tableta contiene: Dinitrato de isosorbida 10 mg. Envase con 20 tabletas");
        }
        if(nombre4.getSelectedItem()=="TABLETA SUBLINGUAL ISOSORBIDA"){
            jTextArea2.setText("Cada tableta contiene: Dinitrato de isosorbida 5 mg. Envase con 20 tabletas sublinguales");
        }
        if(nombre4.getSelectedItem()=="150mg TABLETA IRBESARTÁN"){
            jTextArea2.setText("Cada tableta contiene: Irbesartán 150 mg. Envase con 28 tabletas.");
        }
        if(nombre4.getSelectedItem()=="300mg TABLETA IRBESARTÁN"){
            jTextArea2.setText("Cada tableta contiene: Irbesartán 300 mg. Envase con 28 tabletas");
        }
        if(nombre4.getSelectedItem()=="TABLETA HIDROCLOROTIAZIDA"){
            jTextArea2.setText("Cada tableta contiene: Hidroclorotiazida 25 mg. Envase con 20 tabletas.");
        }
        if(nombre4.getSelectedItem()=="INYECTABLE FUROSEMIDA"){
            jTextArea2.setText("Cada ampolleta contiene: Furosemida 20 mg. Envase con 5 ampolletas de 2 mL");
        }
        if(nombre4.getSelectedItem()=="TABLETA FIROSEMIDA"){
            jTextArea2.setText("Cada tableta contiene: Furosemida 40 mg. Envase con 20 tabletas.");
        }
        if(nombre4.getSelectedItem()=="INYECTABLE ESMOLOL"){
            jTextArea2.setText("Cada frasco ámpula contiene: Clorhidrato de esmolol 100 mg. Envase con un frasco ámpula con 10 mL (10 mg/ mL).");
        }
        if(nombre4.getSelectedItem()=="TABLETA ENALAPRIL"){
            jTextArea2.setText("Cada cápsula o tableta contiene: Maleato de enalapril 10 mg o lisinopril 10 mg o ramipril 10 mg. Envase con 30 cápsulas o tabletas");
        }
        if(nombre4.getSelectedItem()=="TABLETA CLORTALIDONA"){
            jTextArea2.setText("Cada tableta contiene: Clortalidona 50 mg. Envase con 20 tabletas");
        }
        if(nombre4.getSelectedItem()=="TABLETA CAPTOPRIL"){
            jTextArea2.setText("Cada tableta contiene: Captopril 25 mg");
        }
        if(nombre4.getSelectedItem()=="TABLETA CANDESARTAN"){
            jTextArea2.setText("Cada tableta contiene: Candesartán cilexetilo 16.0 mg. Hidroclorotiazida 12.5 mg. Envase con 28 tabletas");
        }
        if(nombre4.getSelectedItem()=="TABLETA O CAPSULA AMLODIPINO"){
            jTextArea2.setText("Cada tableta o cápsula contiene: Besilato o maleato de amlodipino equivalente a 5 mg de amlodipino. Envase con 30 tabletas o cápsulas.");
        }
        if(nombre4.getSelectedItem()=="TABLETA SOLUBLE ACELTILSALICILICO"){
            jTextArea2.setText("Cada comprimido contiene: Vildagliptina 50 mg. Envase con 28 comprimidos");
        }
        if(nombre4.getSelectedItem()=="VILDAGLIPTINA COMPRIMIDO"){
            jTextArea2.setText("Cada comprimido contiene: Vildagliptina 50 mg. Envase con 28 comprimidos");
        }
        if(nombre4.getSelectedItem()=="14 COMPRIMIDOS SITAGLIPTINA"){
            jTextArea2.setText("Cada comprimido contiene: Sitagliptina monohidratada, fosfato de 100 mg. Envase con 14 comprimidos");
        }
        if(nombre4.getSelectedItem()=="28 COMPRIMIDOS SITAGLIPTINA"){
            jTextArea2.setText("Cada comprimido contiene: Sitagliptina monohidratada, fosfato de 100 mg. Envase con 28 comprimidos");
        }
        if(nombre4.getSelectedItem()=="TABLETA METFORMINA"){
            jTextArea2.setText("Cada tableta contiene: Clorhidrato de metformina 850 mg. Envase con 30 tabletas.");
        }
        if(nombre4.getSelectedItem()=="TABLETA LINAGLIPTINA"){
            jTextArea2.setText("Cada tableta contiene: Linagliptina de 5 mg. Envase con 30 tabletas. ");
        }
        if(nombre4.getSelectedItem()=="TABLETA GLIBENCLAMIDA"){
            jTextArea2.setText("Cada tableta contiene: Glibenclamida 5 mg. Envase con 50 tabletas.");
        }
        if(nombre4.getSelectedItem()=="10ml INYECTABLE GLARGINA"){
            jTextArea2.setText("Cada mL de solución contiene: Insulina glargina 3.64 mg equivalente a 100.0 UI de insulina humana. Envase con un frasco ámpula con 10 mL.");
        }
        if(nombre4.getSelectedItem()=="3ml INYECTABLE GLARGINA"){
            jTextArea2.setText("Envase con 5 cartuchos de vidrio con 3 mL en dispositivo");
        }
        if(nombre4.getSelectedItem()=="INYECTABLE LISPRO PROTAMINA"){
            jTextArea2.setText("INYECTABLE LISPRO PROTAMINA");
        }
        if(nombre4.getSelectedItem()=="INYECTABLE LISPRO"){
            jTextArea2.setText("Cada mL contiene: Insulina lispro (origen ADN recombinante) 100 UI. Envase con un frasco ámpula con 10 mL");
        }
        if(nombre4.getSelectedItem()=="10ml INYECTABLE ACCION INTERMEDIA"){
            jTextArea2.setText("Cada mL contiene: Insulina humana isófana (origen ADN recombinante) 100 UI o Insulina zinc isófana humana (origen ADN recombinante) 100 UI Envase con un frasco ámpula con 10 mL");
        }
        if(nombre4.getSelectedItem()=="5ml INYECTABLE ACCION INTERMEDIA"){
            jTextArea2.setText("Cada mL contiene: Insulina humana isófana (origen ADN recombinante) 100 UI o Insulina zinc isófana humana (origen ADN recombinante) 100 UI Envase con un frasco ámpula con 5 mL.");
        }
        if(nombre4.getSelectedItem()=="10ml INYECTABLE ACCION LENTA"){
            jTextArea2.setText("Cada mL contiene: Insulina zinc compuesta humana (origen ADN recombinante) 100 UI. Envase con un frasco ámpula con 10 mL");
        }
        if(nombre4.getSelectedItem()=="10ml INYECTABLE ACCION RAPIDA"){
            jTextArea2.setText("Cada mL contiene: Insulina humana (origen ADN recombinante) 100 UI o Insulina zinc isófana humana (origen ADN recombinante) 100 UI. Envase con un frasco ámpula con 10mL");
        }
        if(nombre4.getSelectedItem()=="5ml INYECTABLE ACCION RAPIDA"){
            jTextArea2.setText("Cada mL contiene: Insulina humana (origen ADN recombinante) 100 UI o Insulina zinc isófana humana (origen ADN recombinante) 100 UI Envase con un frasco ámpula con 5 mL.");
        }
        if(nombre4.getSelectedItem()=="5 PLUMA INYECTABLE"){
            jTextArea2.setText("Envase con 5 plumas prellenadas con 3 mL (100 U/mL).");
        }
        if(nombre4.getSelectedItem()=="1 PLUMA INYECTABLE"){
            jTextArea2.setText("Envase con 1 pluma prellenada de 3 mL (100 U/mL).");
        }
        if(nombre4.getSelectedItem()=="INYECTABLE INSULINA"){
            jTextArea2.setText("Cada cápsula contiene: Cloranfenicol 500 mg. Envase con 20 cápsulas");
        }
        if(nombre4.getSelectedItem()=="INYECTABLE INSULINA*"){
            jTextArea2.setText("Envase con un frasco ámpula con 10 mL.");
        }
        if(nombre4.getSelectedItem()=="CAPSULA CLORANFENICOL"){
            jTextArea2.setText("Cada cápsula contiene: Cloranfenicol 500 mg. Envase con 20 cápsulas");
        }
        if(nombre4.getSelectedItem()=="CAPSULA O TABLETA DOXICILINA"){
            jTextArea2.setText("Cada cápsula o tableta contiene: Hiclato de doxiciclina equivalente a 100 mg de doxiciclina. Envase con 10 cápsulas o tabletas");
        }
        if(nombre4.getSelectedItem()=="SOLUCION INYECTABLE FOSFATO"){
            jTextArea2.setText("Cada ampolleta contiene: Fosfato de potasio dibásico 1.550 g. Fosfato de potasio monobásico 0.300 g. (Potasio 20 mEq) (Fosfato 20 mEq). Envase con 50 ampolletas con 10 mL");
        }
        if(nombre4.getSelectedItem()=="TABLETA TETRACICLINA"){
            jTextArea2.setText("Cada tableta o cápsula contiene: Clorhidrato de tetraciclina 250 mg. Envase con 10 tabletas o cápsulas");
        }
        if(nombre4.getSelectedItem()=="SUSPENSION ORAL NITAZOXANIDA"){
            jTextArea2.setText("Cada 5 mL contienen: Nitazoxanida 100 mg. Envase con 30 mL.");
        }
        if(nombre4.getSelectedItem()=="TABLETA NITAZOXANIDA"){
            jTextArea2.setText("Cada tableta contiene: Nitazoxanida 200 mg. Envase con 6 tabletas");
        }
        if(nombre4.getSelectedItem()=="SUSPENSION ORAL METRONIDAZOL"){
            jTextArea2.setText("Cada 5 mL contienen: Benzoilo de metronidazol equivalente a 250 mg de metronidazol. Envase con 120 mL y dosificador");
        }
        if(nombre4.getSelectedItem()=="20 TABLETAS METRONIDAZOL"){
            jTextArea2.setText("Cada tableta contiene: Metronidazol 500 mg. Envase con 20 tabletas");
        }
        if(nombre4.getSelectedItem()=="30 TABLETAS METRONIDAZOL"){
            jTextArea2.setText("Cada tableta contiene: Metronidazol 500 mg. Envase con 30 tabletas.");
        }
        if(nombre4.getSelectedItem()=="POLVO ELECTROLITOS ORALES"){
            jTextArea2.setText("(Fórmula de Osmolaridad Baja) Cada sobre con polvo contiene: Glucosa anhidra 13.5 g. Cloruro de potasio 1.5 g. Cloruro de sodio 2.6 g. Citrato trisódico dihidratado 2.9 g. Envase con 20.5 g");
        }
        if(nombre4.getSelectedItem()=="SOLUCION ELECTROLITOS ORALES"){
            jTextArea2.setText("Cada sobre con polvo contiene: Glucosa 20.0 g. Cloruro de potasio 1.5 Cloruro de sodio 3.5 g. Citrato trisódico dihidratado 2.9 g. Envase con 27.9 g.");
        }
        if(nombre4.getSelectedItem()=="CAPSULA O TABLETA DOXICILINA"){
            jTextArea2.setText("Cada cápsula o tableta contiene: Hiclato de doxiciclina equivalente a 100 mg de doxiciclina. Envase con 10 cápsulas o tabletas");
        }
        if(nombre4.getSelectedItem()=="SOLUCION INYECTABLE BM"){
            jTextArea2.setText("Cada ampolleta contiene: N-butilbromuro de hioscina 20 mg. Metamizol 2.5 g. Envase con 5 ampolletas de 5 mL");
        }
        if(nombre4.getSelectedItem()=="GRAGEA O TABLETA BUTILHIOSCINA"){
            jTextArea2.setText("Cada gragea o tableta contiene: Bromuro de butilhioscina 10 mg. Envase con 10 grageas o tabletas.");
        }
        if(nombre4.getSelectedItem()=="SOLUCION INYECTABLE BUTILHIOSCINA"){
            jTextArea2.setText("Cada ampolleta contiene: Bromuro de butilhioscina 20 mg. Envase con 3 ampolletas de 1 mL");
        }
        if(nombre4.getSelectedItem()=="SOLUCION OFTAMOLICA TOBRAMICINA"){
            jTextArea2.setText("Cada mL contiene: Sulfato de tobramicina equivalente a 3.0 mg. De tobramicina o tobramicina 3.0 mg. Envase con gotero integral con 5 mL");
        }
        if(nombre4.getSelectedItem()=="SOLUCION OFTAMOLICA TETRACAÍNA"){
            jTextArea2.setText("Cada mL contiene: Clorhidrato de tetracaína 5.0 mg. Envase con gotero integral con 10 mL.");
        }
        if(nombre4.getSelectedItem()=="SOLUCION OFTAMOLICA SULFACETAMIDA"){
            jTextArea2.setText("Cada mL contiene: Sulfacetamida sódica 0.1 g. Envase con gotero integral con 15 mL..");
        }
        if(nombre4.getSelectedItem()=="SUSPENSION OFTAMOLICA PREDNISOLONA"){
            jTextArea2.setText("Cada mL contiene: Acetato de prednisolona 5 mg. Sulfacetamida sódica 100 mg. Envase con gotero integrado con 5 mL.");
        }
        if(nombre4.getSelectedItem()=="SOLUCION OFTAMOLICA PREDNISOLONA"){
            jTextArea2.setText("Cada mL contiene: Fosfato sódico de prednisolona equivalente a 5 mg de fosfato de prednisolona. Envase con gotero integral con 5 mL");
        }
        if(nombre4.getSelectedItem()=="UNGUENTO OFTAMOLICO PREDNISOLONA"){
            jTextArea2.setText("Cada g contiene: Acetato de prednisolona equivalente a 5 mg de prednisolona. Envase con 3 g.");
        }
        if(nombre4.getSelectedItem()=="SOLUCION OFTAMOLICA NEOMICINA"){
            jTextArea2.setText("Cada mL contiene: Sulfato de neomicina equivalente a 1.75 mg de neomicina. Sulfato de polimixina B equivalente a 5 000 U de Polimixina B. Gramicidina 25 μg. Envase con gotero integral con 15 mL");
        }
        if(nombre4.getSelectedItem()=="SOLUCION OFTAMOLICA NAFAZOLINA"){
            jTextArea2.setText("Cada mL contiene: Clorhidrato de nafazolina 1 mg. Envase con gotero integral con 15 mL");
        }
        if(nombre4.getSelectedItem()=="POMADA CLORURO DE SODIO"){
            jTextArea2.setText("Cada g o mL contiene: Cloruro de sodio 50 mg. Envase con 7 g o con gotero integral con 10 mL.");
        }
        if(nombre4.getSelectedItem()=="SOLUCIÓN OFTAMOLICA CLORANFENICOL"){
            jTextArea2.setText("Cada mL contiene: Cloranfenicol levógiro 5 mg. Envase con gotero integral con 15 mL");
        }
        if(nombre4.getSelectedItem()=="UNGUENTO OFTAMOLICO ACICLOVIR"){
            jTextArea2.setText("Cada 100 g contienen: Aciclovir 3 g. Envase con 4.5 g.");
        }
        if(nombre4.getSelectedItem()=="CAPSULA DICLOFENACO"){
            jTextArea2.setText("Cada gragea contiene: Diclofenaco sódico 100 mg. Envase con 20 cápsulas o grageas.");
        }
        if(nombre4.getSelectedItem()=="INYECTABLE DICLOFENACO"){
            jTextArea2.setText("Cada ampolleta contiene: Diclofenaco sódico 75 mg. Envase con 2 ampolletas con 3 mL");
        }
        if(nombre4.getSelectedItem()=="TABLETA CIPROFLOXACINO"){
            jTextArea2.setText("Cada cápsula o tableta contiene: Clorhidrato de ciprofloxacino monohidratado equivalente a 250 mg de ciprofloxacino. Envase con 8 cápsulas o tabletas");
        }
        if(nombre4.getSelectedItem()=="TABLETA CEFALEXINA"){
            jTextArea2.setText("Cada tableta o cápsula contiene: Cefalexina monohidratada equivalente a 500 mg de cefalexina. Envase con 20 tabletas o cápsulas");
        }
        if(nombre4.getSelectedItem()=="AMOXICILINA SUSPENSION ORAL"){
            jTextArea2.setText("Cada frasco con polvo contiene: Amoxicilina trihidratada equivalente a 7.5 g de amoxicilina. Envase con polvo para 75 mL (500 mg/5 mL).");
        }
        if(nombre4.getSelectedItem()=="12 CAPSULAS AMOXICILINA"){
            jTextArea2.setText("Cada cápsula contiene: Amoxicilina trihidratada equivalente a 500 mg de amoxicilina. Envase con 12 cápsulas");
        }
        if(nombre4.getSelectedItem()=="15 CAPSULAS AMOXICILINA"){
            jTextArea2.setText("Cada cápsula contiene: Amoxicilina trihidratada equivalente a 500 mg de amoxicilina. Envase con 15 cápsulas");
        }
        if(nombre4.getSelectedItem()=="INYECTABLE NAPROXENO"){
            jTextArea2.setText("Cada ampolleta contiene: Metamizol sódico 1 g. Envase con 3 ampolletas con 2 mL.");
        }
        if(nombre4.getSelectedItem()=="METAMIZOL INYECTABLE"){
            jTextArea2.setText("Cada frasco ámpula o ampolleta contiene: Fosfato sódico de dexametasona equivalente a 8 mg de fosfato de dexametasona. Envase con un frasco ámpula o ampolleta con 2 mL.");
        }
        if(nombre4.getSelectedItem()=="JARABE CLORFENAMINA"){
            jTextArea2.setText("Cada mL contiene: Maleato de clorfenamina 0.5 mg. Envase con 60 mL.");
        }
        if(nombre4.getSelectedItem()=="TABLETA CLORFENAMINA"){
            jTextArea2.setText("Cada tableta contiene: Maleato de clorfenamina 4.0 mg. Envase con 20 tabletas");
        }
        if(nombre4.getSelectedItem()=="JARABE LORATADINA"){
            jTextArea2.setText("Cada 100 mL contienen: Loratadina 100 mg. Envase con 60 mL y dosificador.");
        }
        if(nombre4.getSelectedItem()=="TABLETA LORATADINA"){
            jTextArea2.setText("Cada tableta o gragea contiene: Loratadina 10 mg. Envase con 20 tabletas o grageas");
        }
        if(nombre4.getSelectedItem()=="SUSPENSIÓN ORAL AMOXICILINA"){
            jTextArea2.setText("Cada 5 mL contienen: Ampicilina trihidratada equivalente a 250 mg de ampicilina. Envase con polvo para 60 mL y dosificador.");
        }
        if(nombre4.getSelectedItem()=="TABLETA AMOXICILINA"){
            jTextArea2.setText("Cada frasco con polvo contiene: Amoxicilina trihidratada equivalente a 1.5 g de amoxicilina. Clavulanato de potasio equivalente a 375 mg de ácido clavulánico. Envase con 60 mL. Cada 5 mL con 125 mg de amoxicilina y 31.25 mg de ácido clavulánico");
        }
        if(nombre4.getSelectedItem()=="SUSPENSIÓN ORAL AMPICILINA"){
            jTextArea2.setText("Cada 5 mL contienen: Ampicilina trihidratada equivalente a 250 mg de ampicilina. Envase con polvo para 60 mL y dosificador.");
        }
        if(nombre4.getSelectedItem()=="SUSPENSIÓN INYECTABLE BENCILPENICILINA"){
            jTextArea2.setText("Cada frasco ámpula con polvo contiene: Benzatina bencilpenicilina equivalente a 600 000 UI de bencilpenicilina procaínica equivalente a 300 000 UI de bencilpenicilina a cristalina equivalente a 300 000 UI de bencilpenicilina Envase con un frasco ámpula y diluyente con 3 mL.");
        }
        if(nombre4.getSelectedItem()=="3ml INYECTABLE"){
            jTextArea2.setText("Cada frasco ámpula con polvo contiene: Benzatina bencilpenicilina equivalente a 600 000 UI de bencilpenicilina procaínica equivalente a 300 000 UI de bencilpenicilina a cristalina equivalente a 300 000 UI de bencilpenicilina Envase con un frasco ámpula y diluyente con 3 mL.");
        }
        if(nombre4.getSelectedItem()=="2ml INYECTABLE"){
            jTextArea2.setText("Cada frasco ámpula con polvo contiene: Bencilpenicilina procaínica equivalente a 300 000 UI de bencilpenicilina cristalina equivalente a 100 000 UI de bencilpenicilina. Envase con un frasco ámpula y 2 mL de diluyente.");
        }
        if(nombre4.getSelectedItem()=="BENZATINA INYECTABLE"){
            jTextArea2.setText("Cada frasco ámpula con polvo contiene: Benzatina bencilpenicilina equivalente a 1 200 000 UI de bencilpenicilina. Envase con un frasco ámpula y 5 mL de diluyente.");
        }
        if(nombre4.getSelectedItem()=="ERITROMICINA CAPSULA"){
            jTextArea2.setText("Cada cápsula o tableta contiene: Estearato de eritromicina equivalente a 500 mg de eritromicina. Envase con 20 cápsulas o tabletas.");
        }
        if(nombre4.getSelectedItem()=="ERITROMICINA ORAL"){
            jTextArea2.setText("Cada 5 mL contienen: Estearato o etilsuccinato o estolato de eritromicina equivalente a 250 mg de eritromicina. Envase con polvo para 100 mL y dosificador.");
        }
        if(nombre4.getSelectedItem()=="TABLETA TRIME"){
            jTextArea2.setText("Cada comprimido o tableta contiene: Trimetoprima 80 mg y Sulfametoxazol 400 mg. Envase con 20 comprimidos o tabletas.");
        }
        if(nombre4.getSelectedItem()=="ORAL TRIME"){
            jTextArea2.setText("Cada 5 mL contienen: Trimetoprima 40 mg. Sulfametoxazol 200 mg. Envase con 120");
        }
        if(nombre4.getSelectedItem()=="NAPROXENO TABLETA"){
            jTextArea2.setText("Cada tableta contiene: Naproxeno 250 mg. Envase con 30 tabletas.");
        }
        if(nombre4.getSelectedItem()=="SUSPENSION ORAL"){
            jTextArea2.setText("Cada 5 mL contienen: Naproxeno 125 mg. Envase con 100 mL.");
        }
        if(nombre4.getSelectedItem()=="SOLUCION ORAL"){
            jTextArea2.setText("Cada mL contiene: Paracetamol 100 mg. Envase con 15 mL, gotero calibrado a 0.5 y 1 mL, integrado o adjunto al envase que sirve de tapa.");
        }
        if(nombre4.getSelectedItem()=="3 SUPOSITORIOS 300 mg"){
            jTextArea2.setText("Cada supositorio contiene: Paracetamol 300 mg. Envase con 3 supositorios");
        }
        if(nombre4.getSelectedItem()=="3 SUPOSITORIOS 100 mg"){
            jTextArea2.setText("Cada supositorio contiene: Paracetamol 100 mg. Envase con 3 supositorios");
        }
        if(nombre4.getSelectedItem()=="6 SUPOSITORIOS 100 mg"){
            jTextArea2.setText("Cada supositorio contiene: Paracetamol 100 mg. Envase con 6 supositorios");
        }
        if(nombre4.getSelectedItem()=="10 SUPOSITORIOS 100 mg"){
            jTextArea2.setText("Cada supositorio contiene: Paracetamol 100 mg. Envase con 10 supositorios.");
        }
        if(nombre4.getSelectedItem()=="PARACETAMOL TABLETA"){
            jTextArea2.setText("Cada tableta contiene: Paracetamol 500 mg. Envase con 10 tabletas.");
        }
        if(nombre4.getSelectedItem()=="VITAMINAS A, C, D"){
            jTextArea2.setText("Cada mL contiene: Palmitato de Retinol 7000 a 9000 UI. Ácido ascórbico 80 a 125 mg. Colecalciferol 1400 a 1800 UI. Envase con 15 mL.");
        }
         if(nombre4.getSelectedItem()=="ORALES"){
            jTextArea2.setText("Cada sobre con polvo contiene: Glucosa 20.0 g. Cloruro de potasio 1.5 Cloruro de sodio 3.5 g. Citrato trisódico dihidratado 2.9 g. Envase con 27.9 g.");
        }
         if(nombre4.getSelectedItem()=="METAMIZOL COMPRIMIDO"){
            jTextArea2.setText("Cada comprimido contiene: Metamizol sódico 500 mg. Envase con 10 comprimidos.");
        }
        if(nombre4.getSelectedItem()=="OSELTAMIVIR CAPSULA"){
            jTextArea2.setText("Cada cápsula contiene: Oseltamivir 75.0 mg. Envase con 10 cápsulas.");
        }
    }//GEN-LAST:event_nombre4ActionPerformed

    private void finActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finActionPerformed
        // TODO add your handling code here:
        
            try{
                //
                if(((String)nombre1.getSelectedItem()==(String)med2.getSelectedItem()&&(String)med3.getSelectedItem()==(String)med2.getSelectedItem())&&(
                        (String)nombre1.getSelectedItem()!=""&&(String)med2.getSelectedItem()!=""&&(String)med3.getSelectedItem()!="")&&(String)nombre2.getSelectedItem()==(String)nombre3.getSelectedItem()
                        &&(String)nombre4.getSelectedItem()==(String)nombre3.getSelectedItem()){
                    JOptionPane.showMessageDialog(null,"No se puede seleccionar 3 veces el mismo medicamento");
                }else if((String)nombre1.getSelectedItem()==""&&(String)med2.getSelectedItem()==""&&(String)med3.getSelectedItem()==""){
                    JOptionPane.showMessageDialog(null,"Por favor seleccione un medicamento");
                }else if(nombre1.getSelectedItem()!=""&&med2.getSelectedItem()==""&&med3.getSelectedItem()==""){
                    try{
                        String enfermedad1=(String)nombre1.getSelectedItem();
                        String subenfermedad1=(String)nombre2.getSelectedItem();
                        File f = new File("src\\"+enfermedad1+"\\"+subenfermedad1+".txt");
                        if(f.exists()){
                            FileReader fr = new FileReader(f);
                            BufferedReader br = new BufferedReader(fr);
                            String linea;
                            linea = br.readLine();
                            numenf=Integer.parseInt(linea);
                            System.out.println(numenf);
                            br.close();
                            if(numenf>=1){
                                uno();
                                JOptionPane.showMessageDialog(null,"Receta realizada con exito");
                            }else{
                                JOptionPane.showMessageDialog(null,"No existen suficientes medicamentos, actualice inventario");
                            }
                    }else{
                        System.out.println("La enfermedad 1 no existe");
                    }
                    }catch(Exception e){}
                }else if(nombre1.getSelectedItem()==""&&med2.getSelectedItem()!=""&&med3.getSelectedItem()==""){
                    System.out.println("Dos seleccionado");
                    String enfermedad2=(String)med2.getSelectedItem();
                    String subenfermedad2=(String)nombre3.getSelectedItem();
                    File f2 = new File("src\\"+enfermedad2+"\\"+subenfermedad2+".txt");
                    if(f2.exists()){
                        FileReader fr2 = new FileReader(f2);
                        BufferedReader br2 = new BufferedReader(fr2);
                        String linea2;
                        linea2 = br2.readLine();
                        numenf2=Integer.parseInt(linea2);
                        System.out.println(numenf2);
                        br2.close();
                        if(numenf2>=1){
                                dos();
                                JOptionPane.showMessageDialog(null,"Receta realizada con exito");
                            }else{
                                JOptionPane.showMessageDialog(null,"No existen suficientes medicamentos, actualice inventario");
                            }
                    }else{
                        System.out.println("La enfermedad 2 no existe");
                    }
                }else if(nombre1.getSelectedItem()==""&&med2.getSelectedItem()==""&&med3.getSelectedItem()!=""){
                    String enfermedad3=(String)med3.getSelectedItem();
                    String subenfermedad3=(String)nombre4.getSelectedItem();
                    File f3 = new File("src\\"+enfermedad3+"\\"+subenfermedad3+".txt");
                    if(f3.exists()){
                        FileReader fr3 = new FileReader(f3);
                        BufferedReader br3 = new BufferedReader(fr3);
                        String linea3;
                        linea3 = br3.readLine();
                        numenf3=Integer.parseInt(linea3);
                        System.out.println(numenf3);
                        br3.close();
                        if(numenf3>=1){
                                tres();
                                JOptionPane.showMessageDialog(null,"Receta realizada con exito");
                            }else{
                                JOptionPane.showMessageDialog(null,"No existen suficientes medicamentos, actualice inventario");
                            }
                    }else{
                        System.out.println("La enfermedad 3 no existe");
                    }
                }else if(nombre1.getSelectedItem()!=""&&med2.getSelectedItem()!=""&&med3.getSelectedItem()==""){
                    System.out.println("Uno y dos seleccionado");
                    String enfermedad1=(String)nombre1.getSelectedItem();
                    String subenfermedad1=(String)nombre2.getSelectedItem();
                    File f = new File("src\\"+enfermedad1+"\\"+subenfermedad1+".txt");
                    if(f.exists()){
                        FileReader fr = new FileReader(f);
                        BufferedReader br = new BufferedReader(fr);
                        String linea;
                        linea = br.readLine();
                        numenf=Integer.parseInt(linea);
                        System.out.println(numenf);
                        br.close();
                    }else{
                        System.out.println("La enfermedad 1 no existe");
                    }
                    String enfermedad2=(String)med2.getSelectedItem();
                    String subenfermedad2=(String)nombre3.getSelectedItem();
                    File f2 = new File("src\\"+enfermedad2+"\\"+subenfermedad2+".txt");
                    if(f2.exists()){
                        FileReader fr2 = new FileReader(f2);
                        BufferedReader br2 = new BufferedReader(fr2);
                        String linea2;
                        linea2 = br2.readLine();
                        numenf2=Integer.parseInt(linea2);
                        numenf2=numenf2-1;
                        System.out.println(numenf2);
                        br2.close();
                    }else{
                        System.out.println("La enfermedad 2 no existe");
                    }
                    if((enfermedad1==enfermedad2)&&numenf>=2){
                        uno();
                        dos();
                        JOptionPane.showMessageDialog(null,"Receta realizada con exito");
                    }else{
                        JOptionPane.showMessageDialog(null,"No existen suficientes medicamentos, actualice inventario");
                    }
                }else if(nombre1.getSelectedItem()!=""&&med2.getSelectedItem()==""&&med3.getSelectedItem()!=""){
                    System.out.println("uno y tres seleccionado");
                    String enfermedad1=(String)nombre1.getSelectedItem();
                    String subenfermedad1=(String)nombre2.getSelectedItem();
                    File f = new File("src\\"+enfermedad1+"\\"+subenfermedad1+".txt");
                    if(f.exists()){
                        FileReader fr = new FileReader(f);
                        BufferedReader br = new BufferedReader(fr);
                        String linea;
                        linea = br.readLine();
                        numenf=Integer.parseInt(linea);
                        System.out.println(numenf);
                        br.close();
                    }else{
                        System.out.println("La enfermedad 1 no existe");
                    }
                    String enfermedad3=(String)med3.getSelectedItem();
                    String subenfermedad3=(String)nombre4.getSelectedItem();
                    File f3 = new File("src\\"+enfermedad3+"\\"+subenfermedad3+".txt");
                    if(f3.exists()){
                        FileReader fr3 = new FileReader(f3);
                        BufferedReader br3 = new BufferedReader(fr3);
                        String linea3;
                        linea3 = br3.readLine();
                        numenf3=Integer.parseInt(linea3);
                        numenf3--;
                        System.out.println(numenf3);
                        br3.close();
                    }else{
                        System.out.println("La enfermedad 3 no existe");
                    }
                   if((enfermedad1==enfermedad3)&&numenf>=2){
                        uno();
                        tres();
                        JOptionPane.showMessageDialog(null,"Receta realizada con exito");
                    }else{
                        JOptionPane.showMessageDialog(null,"No existen suficientes medicamentos, actualice inventario");
                    }
                }else if(nombre1.getSelectedItem()==""&&med2.getSelectedItem()!=""&&med3.getSelectedItem()!=""){
                    System.out.println("Dos y tres seleccionado");
                    String enfermedad2=(String)med2.getSelectedItem();
                    String subenfermedad2=(String)nombre3.getSelectedItem();
                    File f2 = new File("src\\"+enfermedad2+"\\"+subenfermedad2+".txt");
                    if(f2.exists()){
                        FileReader fr2 = new FileReader(f2);
                        BufferedReader br2 = new BufferedReader(fr2);
                        String linea2;
                        linea2 = br2.readLine();
                        numenf2=Integer.parseInt(linea2);
                        System.out.println(numenf2);
                        br2.close();
                    }else{
                        System.out.println("La enfermedad 2 no existe");
                    }
                    String enfermedad3=(String)med3.getSelectedItem();
                    String subenfermedad3=(String)nombre4.getSelectedItem();
                    File f3 = new File("src\\"+enfermedad3+"\\"+subenfermedad3+".txt");
                    if(f3.exists()){
                        FileReader fr3 = new FileReader(f3);
                        BufferedReader br3 = new BufferedReader(fr3);
                        String linea3;
                        linea3 = br3.readLine();
                        numenf3=Integer.parseInt(linea3);
                        numenf3--;
                        System.out.println(numenf3);
                        br3.close();
                    }else{
                        System.out.println("La enfermedad 3 no existe");
                    }
                    if((enfermedad2==enfermedad3)&&numenf2>=2){
                        dos();
                        tres();
                        JOptionPane.showMessageDialog(null,"Receta realizada con exito");
                    }else{
                        JOptionPane.showMessageDialog(null,"No existen suficientes medicamentos, actualice inventario");
                    }
                }else{
                //
                    String enfermedad1=(String)nombre1.getSelectedItem();
                    String subenfermedad1=(String)nombre2.getSelectedItem();
                    File f = new File("src\\"+enfermedad1+"\\"+subenfermedad1+".txt");
                    if(f.exists()){
                        FileReader fr = new FileReader(f);
                        BufferedReader br = new BufferedReader(fr);
                        String linea;
                        linea = br.readLine();
                        numenf=Integer.parseInt(linea);
                        System.out.println(numenf);
                        br.close();
                    }else{
                        System.out.println("La enfermedad 1 no existe");
                    }
                    //
                    String enfermedad2=(String)med2.getSelectedItem();
                    String subenfermedad2=(String)nombre3.getSelectedItem();
                    File f2 = new File("src\\"+enfermedad2+"\\"+subenfermedad2+".txt");
                    if(f2.exists()){
                        FileReader fr2 = new FileReader(f2);
                        BufferedReader br2 = new BufferedReader(fr2);
                        String linea2;
                        linea2 = br2.readLine();
                        numenf2=Integer.parseInt(linea2);
                        System.out.println(numenf2);
                        br2.close();
                    }else{
                        System.out.println("La enfermedad 2 no existe");
                    }
                    //
                    String enfermedad3=(String)med3.getSelectedItem();
                    String subenfermedad3=(String)nombre4.getSelectedItem();
                    File f3 = new File("src\\"+enfermedad3+"\\"+subenfermedad3+".txt");
                    if(f3.exists()){
                        FileReader fr3 = new FileReader(f3);
                        BufferedReader br3 = new BufferedReader(fr3);
                        String linea3;
                        linea3 = br3.readLine();
                        numenf3=Integer.parseInt(linea3);
                        System.out.println(numenf3);
                        br3.close();
                    }else{
                        System.out.println("La enfermedad 3 no existe");
                    }
                    if(numenf>1&&numenf2>1&&numenf3>1){
                        medicamentos();
                    }else{
                        System.out.println("No hay disponibles");
                    }
                }
            }catch(Exception e){}
        
    }//GEN-LAST:event_finActionPerformed

    private void inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioActionPerformed
        // TODO add your handling code here:
        Inventario i=new Inventario();
        i.setVisible(true);
    }//GEN-LAST:event_inventarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Inventario i=new Inventario();
        i.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    public void uno(){
       try{    
            File f = new File("src\\"+(String)nombre1.getSelectedItem()+"\\"+(String)nombre2.getSelectedItem()+".txt");
            f.delete();
            f.createNewFile();
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            bw.write("");
            pw.print((numenf-1)+"");
            pw.close();
        }catch(Exception e){} 
    }
    public void dos(){
        try{    
            File f = new File("src\\"+(String)med2.getSelectedItem()+"\\"+(String)nombre3.getSelectedItem()+".txt");
            f.delete();
            f.createNewFile();
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            bw.write("");
            pw.print((numenf2-1)+"");
            pw.close();
        }catch(Exception e){} 
    }
    public void tres(){
        try{    
            File f = new File("src\\"+(String)med3.getSelectedItem()+"\\"+(String)nombre4.getSelectedItem()+".txt");
            f.delete();
            f.createNewFile();
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            bw.write("");
            pw.print((numenf3-1)+"");
            pw.close();
        }catch(Exception e){} 
    }
    public void medicamentos(){
        try{    
            File f = new File("src\\"+(String)nombre1.getSelectedItem()+"\\"+(String)nombre2.getSelectedItem()+".txt");
            f.delete();
            f.createNewFile();
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            bw.write("");
            pw.print((numenf-1)+"");
            pw.close();
            JOptionPane.showMessageDialog(null,"Receta realizada con exito");
        }catch(Exception e){}
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Receta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receta(nombre,di,me,añ,numeroafiliacio,diagnostic,unida,sex).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel afiliacion;
    private javax.swing.JLabel default1;
    private javax.swing.JLabel diagnostico;
    private javax.swing.JLabel edad;
    private javax.swing.JLabel fecha;
    private javax.swing.JButton fin;
    private javax.swing.JLabel folio;
    private javax.swing.JMenu inventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JComboBox med2;
    private javax.swing.JComboBox med3;
    private javax.swing.JLabel nombr;
    private javax.swing.JComboBox nombre1;
    private javax.swing.JComboBox nombre2;
    private javax.swing.JComboBox nombre3;
    private javax.swing.JComboBox nombre4;
    private javax.swing.JLabel otros;
    private javax.swing.JLabel seguro;
    private javax.swing.JLabel sexo;
    private javax.swing.JComboBox subdiagnostico;
    private javax.swing.JLabel unidad;
    // End of variables declaration//GEN-END:variables
}
