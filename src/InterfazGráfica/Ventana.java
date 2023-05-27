package InterfazGráfica;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Ventana  extends JFrame {

    // atributos
    public JPanel panel = new JPanel(); // se crea un objeto public
    public Scanner sc = new Scanner(System.in);


    // metododos constructores
    public Ventana(){// metodo que sirve para dar formato a al ventada
        setSize(600,900); // tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE); // accion al dar clic en la X
        setLocationRelativeTo(null); // la ventana se abre en el centro
        this.getContentPane().setBackground(Color.YELLOW); // el fondo de la ventana es negro
        setTitle("Titulo barra de la pagina");// titulo de la barra de la ventana
        iniciarComponente();
    }


    // metodos normales
    private void iniciarComponente(){
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
        colocarRadioBotones();
        //Todo colocarBotonesDeActivacion();
        colocarCajasDeTexto();
        colocarAreaDeTexto();

    }

    private void colocarAreaDeTexto() {
        JTextArea areaTxt = new JTextArea(" Estoy en un sueño, nada es real...");
        areaTxt.setBounds(50,470,500,200);
        areaTxt.setBackground(Color.BLACK);
        areaTxt.setForeground(Color.GREEN);
        areaTxt.append("\n ¿Tú Existes?");
        areaTxt.setEditable(true);
        areaTxt.setBorder(BorderFactory.createLineBorder(Color.green, 2));
        panel.add(areaTxt);

    }

    private void colocarCajasDeTexto() {
        JTextField cjTxt1linea = new JTextField(2);
        cjTxt1linea.setText("Wake up!_");
        cjTxt1linea.setEditable(true);
        //Todo sc.nextLine();
        System.out.println("Texto en la caja: "+cjTxt1linea.getText());
        cjTxt1linea.setBounds(50,50,500,30);
        cjTxt1linea.setBackground(Color.BLACK);
        cjTxt1linea.setForeground(Color.GREEN);
        cjTxt1linea.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        panel.add(cjTxt1linea);

    }

    private void colocarRadioBotones() {
        JRadioButton rbtn1 = new JRadioButton("Pastilla roja");
        rbtn1.setBounds(50,100,120,50);
        panel.add(rbtn1);

        JRadioButton rbtn2 = new JRadioButton("Pastilla azul");
        rbtn2.setBounds(400,100,120,50);
        panel.add(rbtn2);

        /*JRadioButton rbtn3 = new JRadioButton("radiobtn3");
        rbtn3.setBounds(50,200,150,50);
        panel.add(rbtn3);*/

        // grupo de botones
        ButtonGroup grpBtns = new ButtonGroup();
        grpBtns.add(rbtn1);
        grpBtns.add(rbtn2);
        //grpBtns.add(rbtn3);
    }

    private void colocarPaneles(){
        this.getContentPane().add(panel);// metodo que añade un panel a la ventana
        panel.setBackground(Color.BLACK);// fondp del panel
        panel.setLayout(null);// desactiva diseño por defecto
    }

    // metodos para crear botones
    private void colocarEtiquetas(){// metodo para crear recuadro de texto
        JLabel etiqueta = new JLabel("Bienvenido a la Matrix",SwingConstants.CENTER);// creacion del objeto
        etiqueta.setBounds(220,10,200,30);// tamaño del cuadro de texto y localizacion
        panel.setLayout(null);
        etiqueta.setForeground(Color.green);// color letra
        etiqueta.setOpaque(true);//DAr permiso para cambiar el color de fondo
        etiqueta.setBackground(Color.black);// color de fondo
        etiqueta.setBorder(BorderFactory.createLineBorder(Color.green, 2));// borde cuadro
        etiqueta.setFont(new Font("Arial",Font.PLAIN,15));// formato de letra
        panel.add(etiqueta);// añade el label al panel que está en la ventana
    }

    private void colocarBotones (){
        // boton 1 - boton de texto
        JButton btn1 = new JButton();
        btn1.setText("NO-Click");
        btn1.setBounds(220,200,150,50);
        btn1.setMnemonic('a');
        btn1.setEnabled(true);
        btn1.setForeground(Color.green);//color letra del boton
        btn1.setBackground(Color.BLACK);// fondo boton
        btn1.setBorder(BorderFactory.createLineBorder(Color.green, 2));// borde cuadro
        btn1.setFont(new Font("cooper-black",Font.BOLD,19));
        panel.add(btn1);

        JButton btn2 = new JButton();
        btn2.setBounds(50,300,500,150);
        //btn1.setForeground(Color.green);//color letra del boton
        btn2.setBackground(Color.BLACK);// fondo boton
        ImageIcon imgFondo = new ImageIcon("src/InterfazGráfica/fondoMatrix.png");
        btn2.setIcon(new ImageIcon(imgFondo.getImage().getScaledInstance(btn2.getWidth(),btn2.getHeight(),Image.SCALE_SMOOTH)));
        btn2.setBorder(BorderFactory.createLineBorder(Color.green, 2));// borde cuadro
        panel.add(btn2);

    }

}
