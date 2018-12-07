package presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Ecosistemas.Animal;
import Ecosistemas.Arroyo;
import Ecosistemas.BiomaUArtificial;
import Ecosistemas.BiomaUSemiArtificial;
import Ecosistemas.Bosque;
import Ecosistemas.ConstituyenteAtmosferico;
import Ecosistemas.Continente;
import Ecosistemas.Desierto;
import Ecosistemas.Ecosistema;
import Ecosistemas.Estanques;
import Ecosistemas.Fenomenos;
import Ecosistemas.FormacionesGeologicas;
import Ecosistemas.Fungi;
import Ecosistemas.Humedales;
import Ecosistemas.Isla;
import Ecosistemas.Lagos;
import Ecosistemas.Mar;
import Ecosistemas.Plantae;
import Ecosistemas.Pradera;
import Ecosistemas.Procarionte;
import Ecosistemas.Protista;
import Ecosistemas.Rio;
import Ecosistemas.Sabana;
import Ecosistemas.Selva;
import Ecosistemas.Suelos;
import Ecosistemas.Taiga;
import Ecosistemas.Tundra;
import Ecosistemas.ZonaAbisal;
import Ecosistemas.ZonaDemesal;
import Ecosistemas.ZonaIntermareal;
import Ecosistemas.ZonaPelagica;

import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.GridBagLayout;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class EcosistemaPresentacion extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombreEcosistema;
	private JTextField txtPraderasDeChecoslovaquia;
	private JTextField txtNombreBiotopo;
	private JTextField txtNombreReino;

	private Ecosistema elEcosistema;
	private Mar elMar;
	private Isla laIsla;
	private Continente elContinente;
	private BiomaUArtificial elBiomaUArtificial;
	private BiomaUSemiArtificial elBiomaUSemi;
	private Pradera laPradera;
	private Selva laSelva;
	private Tundra laTundra;
	private Desierto elDesierto;
	private Bosque elBosque;
	private Sabana laSabana;
	private Taiga laTaiga;
	private Arroyo elArroyo;
	private Rio elRio;
	private Humedales elHumedal;
	private Estanques elEstanque;
	private Lagos elLago;
	private ZonaAbisal laZAbisal;
	private ZonaPelagica laZPelagica;
	private ZonaDemesal laZDemersal;
	private ZonaIntermareal laZIntermareal;
	
	private Random random = new Random();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EcosistemaPresentacion frame = new EcosistemaPresentacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EcosistemaPresentacion() {
		setTitle("Dise\u00F1o Ecosistema");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 421);
		
		JButton btnIngresaFactorAbiotico = new JButton("Ingresa factor abiotico");
		btnIngresaFactorAbiotico.setEnabled(false);
		JButton btnNombreReino = new JButton("Ingresar nombre");
		btnNombreReino.setEnabled(false);
		JMenuItem mntmGuardar = new JMenuItem("Guardar");
		mntmGuardar.setEnabled(false);
		JMenuItem mntmRecuperar = new JMenuItem("Recuperar");


		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panelEcosistema = new JPanel();
		tabbedPane.addTab("Ecosistema", null, panelEcosistema, null);
		panelEcosistema.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblElijeElLugar = new JLabel("Elije el lugar de Ecosistema: ");
		lblElijeElLugar.setHorizontalAlignment(SwingConstants.CENTER);
		panelEcosistema.add(lblElijeElLugar);
		
		JPanel panelBotonEcosistema = new JPanel();
		panelEcosistema.add(panelBotonEcosistema);
		
		JRadioButton rdbtnContinental = new JRadioButton("Continente");
		panelBotonEcosistema.add(rdbtnContinental);
		
		JRadioButton rdbtnIslas = new JRadioButton("Islas");
		panelBotonEcosistema.add(rdbtnIslas);
		
		JRadioButton rdbtnMar = new JRadioButton("Mar");
		panelBotonEcosistema.add(rdbtnMar);
		
		ButtonGroup grupoEcosistemas = new ButtonGroup();
		grupoEcosistemas.add(rdbtnMar);
		grupoEcosistemas.add(rdbtnIslas);
		grupoEcosistemas.add(rdbtnContinental);
		
		rdbtnMar.setSelected(true);

		JPanel panelNombreEcosistema = new JPanel();
		panelEcosistema.add(panelNombreEcosistema);
		
		txtNombreEcosistema = new JTextField();
		txtNombreEcosistema.setText("Ecosistema");
		panelNombreEcosistema.add(txtNombreEcosistema);
		txtNombreEcosistema.setColumns(10);
		
		JButton btnIngresarNombre = new JButton("Ingresar nombre");
		btnIngresarNombre.setEnabled(false);
		
		JPanel panelBioma = new JPanel();
		tabbedPane.addTab("Bioma", null, panelBioma, null);
		panelBioma.setLayout(new GridLayout(5, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panelBioma.add(panel);
		
		JLabel lblBioma = new JLabel("Bioma Urbano");
		panel.add(lblBioma);
		
		JRadioButton rdbtnBiomaUrbanoArtificial = new JRadioButton("Bioma Urbano Artificial");
		panel.add(rdbtnBiomaUrbanoArtificial);
		
		JRadioButton rdbtnBiomaUrbanoSemi = new JRadioButton("Bioma Urbano Semi Artificial");
		panel.add(rdbtnBiomaUrbanoSemi);
		
		JPanel panel_1 = new JPanel();
		panelBioma.add(panel_1);
		
		JLabel lblBioma_1 = new JLabel("Bioma Terrestre");
		panel_1.add(lblBioma_1);
		
		JRadioButton rdbtnPradera = new JRadioButton("Pradera");
		panel_1.add(rdbtnPradera);
		
		JRadioButton rdbtnSelva = new JRadioButton("Selva");
		panel_1.add(rdbtnSelva);
		
		JRadioButton rdbtnTundra = new JRadioButton("Tundra");
		panel_1.add(rdbtnTundra);
		
		JRadioButton rdbtnDesierto = new JRadioButton("Desierto");
		panel_1.add(rdbtnDesierto);
		
		JRadioButton rdbtnBosque = new JRadioButton("Bosque");
		panel_1.add(rdbtnBosque);
		
		JRadioButton rdbtnSabana = new JRadioButton("Sabana");
		panel_1.add(rdbtnSabana);
		
		JRadioButton rdbtnTaiga = new JRadioButton("Taiga");
		panel_1.add(rdbtnTaiga);
		
		JPanel panel_3 = new JPanel();
		panelBioma.add(panel_3);
		
		JLabel lblBiomaAguaDulce = new JLabel("Bioma Agua Dulce");
		panel_3.add(lblBiomaAguaDulce);
		
		JLabel lblBiomaLotico = new JLabel("Bioma Lotico:");
		panel_3.add(lblBiomaLotico);
		
		JRadioButton rdbtnArroyo = new JRadioButton("Arroyo");
		panel_3.add(rdbtnArroyo);
		
		JRadioButton rdbtnRio = new JRadioButton("Rio");
		panel_3.add(rdbtnRio);
		
		JLabel lblBiomaLentico = new JLabel("Bioma Lentico:");
		panel_3.add(lblBiomaLentico);
		
		JRadioButton rdbtnHumedal = new JRadioButton("Humedal");
		panel_3.add(rdbtnHumedal);
		
		JRadioButton rdbtnEstanque = new JRadioButton("Estanque");
		panel_3.add(rdbtnEstanque);
		
		JRadioButton rdbtnLago = new JRadioButton("Lago");
		panel_3.add(rdbtnLago);
		
		JPanel panel_4 = new JPanel();
		panelBioma.add(panel_4);
		
		JLabel lblBiomaMarino = new JLabel("Bioma Marino");
		panel_4.add(lblBiomaMarino);
		
		JRadioButton rdbtnZonaAbisal = new JRadioButton("Zona Abisal");
		panel_4.add(rdbtnZonaAbisal);
		
		JRadioButton rdbtnZonaPelagica = new JRadioButton("Zona Pelagica");
		panel_4.add(rdbtnZonaPelagica);
		
		JRadioButton rdbtnZonaDemersal = new JRadioButton("Zona Demersal");
		panel_4.add(rdbtnZonaDemersal);
		
		JRadioButton rdbtnZonaIntermareal = new JRadioButton("Zona Intermareal");
		panel_4.add(rdbtnZonaIntermareal);
		
		JButton buttonCreaEco = new JButton("Crea Ecosistema");
		
		panelNombreEcosistema.add(buttonCreaEco);
		
		ButtonGroup grupoBioma = new ButtonGroup();
		grupoBioma.add(rdbtnBiomaUrbanoArtificial);
		grupoBioma.add(rdbtnBiomaUrbanoSemi);
		grupoBioma.add(rdbtnPradera);
		grupoBioma.add(rdbtnSelva);
		grupoBioma.add(rdbtnTundra);
		grupoBioma.add(rdbtnDesierto);
		grupoBioma.add(rdbtnBosque);
		grupoBioma.add(rdbtnSabana);
		grupoBioma.add(rdbtnTaiga);
		grupoBioma.add(rdbtnArroyo);
		grupoBioma.add(rdbtnRio);
		grupoBioma.add(rdbtnHumedal);
		grupoBioma.add(rdbtnEstanque);
		grupoBioma.add(rdbtnLago);
		grupoBioma.add(rdbtnZonaAbisal);
		grupoBioma.add(rdbtnZonaPelagica);
		grupoBioma.add(rdbtnZonaDemersal);
		grupoBioma.add(rdbtnZonaIntermareal);

		JPanel panel_5 = new JPanel();
		panelBioma.add(panel_5);
		
		txtPraderasDeChecoslovaquia = new JTextField();
		txtPraderasDeChecoslovaquia.setText("Praderas de Checoslovaquia");
		panel_5.add(txtPraderasDeChecoslovaquia);
		txtPraderasDeChecoslovaquia.setColumns(10);
		
		panel_5.add(btnIngresarNombre);
		
		JPanel panelBiotopo = new JPanel();
		tabbedPane.addTab("Biotopo", null, panelBiotopo, null);
		panelBiotopo.setLayout(new GridLayout(4, 0, 0, 0));
		
		JLabel lblEleccinDeFactores = new JLabel("Elecci\u00F3n de factores abioticos en el Ecosistema:");
		lblEleccinDeFactores.setHorizontalAlignment(SwingConstants.CENTER);
		panelBiotopo.add(lblEleccinDeFactores);
		
		JPanel panel_2 = new JPanel();
		panelBiotopo.add(panel_2);
		
		JRadioButton rdbtnFenomenos = new JRadioButton("Fenomenos");
		panel_2.add(rdbtnFenomenos);
		
		JRadioButton rdbtnSuelos = new JRadioButton("Suelos");
		panel_2.add(rdbtnSuelos);
		
		JRadioButton rdbtnConstituyenteAtmosferico = new JRadioButton("Constituyente atmosferico");
		panel_2.add(rdbtnConstituyenteAtmosferico);
		
		JRadioButton rdbtnFormacionesGeologicas = new JRadioButton("Formaciones Geologicas");
		panel_2.add(rdbtnFormacionesGeologicas);
		
		ButtonGroup grupoBiotopo = new ButtonGroup();
		grupoBiotopo.add(rdbtnFenomenos);
		grupoBiotopo.add(rdbtnSuelos);
		grupoBiotopo.add(rdbtnConstituyenteAtmosferico);
		grupoBiotopo.add(rdbtnFormacionesGeologicas);
		
		rdbtnFenomenos.setSelected(true);
		
		JPanel panel_6 = new JPanel();
		panelBiotopo.add(panel_6);
		
		txtNombreBiotopo = new JTextField();
		txtNombreBiotopo.setText("Nombre");
		panel_6.add(txtNombreBiotopo);
		txtNombreBiotopo.setColumns(10);
		
		panel_6.add(btnIngresaFactorAbiotico);
		
		JPanel panelBoxBiotopo = new JPanel();
		panelBiotopo.add(panelBoxBiotopo);
		
		JComboBox<Fenomenos> comboBoxFenomeno = new JComboBox<Fenomenos>();
		comboBoxFenomeno.setBounds(34, 84, 127, 27);
		panelBoxBiotopo.add(comboBoxFenomeno);
		
		JComboBox<Suelos> comboBoxSuelos = new JComboBox<Suelos>();
		comboBoxSuelos.setBounds(34, 84, 127, 27);
		panelBoxBiotopo.add(comboBoxSuelos);
		
		JComboBox<ConstituyenteAtmosferico> comboBoxAtmos = new JComboBox<ConstituyenteAtmosferico>();
		comboBoxAtmos.setBounds(34, 84, 127, 27);
		panelBoxBiotopo.add(comboBoxAtmos);
		
		JComboBox<FormacionesGeologicas> comboBoxGeologico = new JComboBox<FormacionesGeologicas>();
		comboBoxGeologico.setBounds(34, 84, 127, 27);
		panelBoxBiotopo.add(comboBoxGeologico);
		
		JPanel panelBiocenosis = new JPanel();
		tabbedPane.addTab("Biocenosis", null, panelBiocenosis, null);
		panelBiocenosis.setLayout(new GridLayout(4, 0, 0, 0));
		
		JLabel lblIngresarLosComponentes = new JLabel("Ingresar los componentes de los reinos que se encuentran:");
		lblIngresarLosComponentes.setHorizontalAlignment(SwingConstants.CENTER);
		panelBiocenosis.add(lblIngresarLosComponentes);
		
		JPanel panelReinos = new JPanel();
		panelBiocenosis.add(panelReinos);
		
		JRadioButton rdbtnAnimal = new JRadioButton("Animal");
		panelReinos.add(rdbtnAnimal);
		
		JRadioButton rdbtnPlantae = new JRadioButton("Plantae");
		panelReinos.add(rdbtnPlantae);
		
		JRadioButton rdbtnProtista = new JRadioButton("Protista");
		panelReinos.add(rdbtnProtista);
		
		JRadioButton rdbtnFungi = new JRadioButton("Fungi");
		panelReinos.add(rdbtnFungi);
		
		JRadioButton rdbtnProcarionte = new JRadioButton("Procarionte");
		panelReinos.add(rdbtnProcarionte);
		
		ButtonGroup grupoBiocenosis = new ButtonGroup();
		grupoBiocenosis.add(rdbtnAnimal);
		grupoBiocenosis.add(rdbtnPlantae);
		grupoBiocenosis.add(rdbtnProtista);
		grupoBiocenosis.add(rdbtnFungi);
		grupoBiocenosis.add(rdbtnProcarionte);
		
		rdbtnAnimal.setSelected(true);
		
		JPanel panelNombreReino = new JPanel();
		panelBiocenosis.add(panelNombreReino);
		
		txtNombreReino = new JTextField();
		txtNombreReino.setText("NombreReino");
		panelNombreReino.add(txtNombreReino);
		txtNombreReino.setColumns(10);
		
		panelNombreReino.add(btnNombreReino);
		
		JPanel panelBoxBiocenosis = new JPanel();
		panelBiocenosis.add(panelBoxBiocenosis);
		
		JComboBox<Animal> comboBoxAnimal = new JComboBox<Animal>();
		comboBoxAnimal.setBounds(34, 84, 127, 27);
		panelBoxBiocenosis.add(comboBoxAnimal);
		
		JComboBox<Plantae> comboBoxPlantae = new JComboBox<Plantae>();
		panelBoxBiocenosis.add(comboBoxPlantae);
		
		JComboBox<Protista> comboBoxProtista = new JComboBox<Protista>();
		panelBoxBiocenosis.add(comboBoxProtista);
		
		JComboBox<Fungi> comboBoxFungi = new JComboBox<Fungi>();
		panelBoxBiocenosis.add(comboBoxFungi);
		
		JComboBox<Procarionte> comboBoxProcarionte = new JComboBox<Procarionte>();
		panelBoxBiocenosis.add(comboBoxProcarionte);
		
		JPanel panelGrafico = new JPanel();
		tabbedPane.addTab("Grafico", null, panelGrafico, null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOpciones = new JMenu("Opciones");
		menuBar.add(mnOpciones);
		
		mnOpciones.add(mntmGuardar);
		
		
		mnOpciones.add(mntmRecuperar);
		
	}

}
