import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.custom.ScrolledComposite;

public class AirControl {

	protected Shell shlAirplaneControl;
	private Text text_6;
	private Text text_7;
	private Text text_8;
	private Text an;
	private Text text_10;
	private Text text_11;
	private Text txt_Xtransfer;
	private Text txt_Ytransfer;
	private Text txt_Xstagger;
	private Text txt_Ystagger;
	private Text txtX_rotate;
	private Text txtY_rotate;
	private Text txtMinimumDistance;
	private Text text_12;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			AirControl window = new AirControl();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlAirplaneControl.open();
		shlAirplaneControl.layout();
		while (!shlAirplaneControl.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlAirplaneControl = new Shell();
		shlAirplaneControl.setSize(1226, 697);
		shlAirplaneControl.setText("Airplane control");
		
		Label lblData_Input = new Label(shlAirplaneControl, SWT.NONE);
		lblData_Input.setFont(SWTResourceManager.getFont("Times New Roman", 13, SWT.ITALIC));
		lblData_Input.setBounds(124, 39, 147, 15);
		lblData_Input.setText("Entrada de Dados");
		
		Label lblRadar = new Label(shlAirplaneControl, SWT.NONE);
		lblRadar.setFont(SWTResourceManager.getFont("Times New Roman", 13, SWT.ITALIC));
		lblRadar.setText("Radar");
		lblRadar.setBounds(551, 39, 50, 25);
		
		Label lblDatagrid = new Label(shlAirplaneControl, SWT.NONE);
		lblDatagrid.setText("DataGrid");
		lblDatagrid.setFont(SWTResourceManager.getFont("Times New Roman", 13, SWT.ITALIC));
		lblDatagrid.setBounds(932, 39, 90, 25);
		
		Composite composite_1 = new Composite(shlAirplaneControl, SWT.BORDER);
		composite_1.setBounds(46, 70, 307, 174);
		
		text_6 = new Text(composite_1, SWT.BORDER);
		text_6.setBounds(87, 24, 47, 21);
		
		Label lblNewLabel_1 = new Label(composite_1, SWT.NONE);
		lblNewLabel_1.setText("X:");
		lblNewLabel_1.setAlignment(SWT.RIGHT);
		lblNewLabel_1.setBounds(54, 27, 27, 15);
		
		text_7 = new Text(composite_1, SWT.BORDER);
		text_7.setBounds(213, 24, 47, 21);
		
		Label lblY_1 = new Label(composite_1, SWT.NONE);
		lblY_1.setText("Y:");
		lblY_1.setAlignment(SWT.RIGHT);
		lblY_1.setBounds(180, 30, 27, 15);
		
		text_8 = new Text(composite_1, SWT.BORDER);
		text_8.setBounds(87, 63, 47, 21);
		
		Label lblRaio_1 = new Label(composite_1, SWT.NONE);
		lblRaio_1.setText("Raio:");
		lblRaio_1.setAlignment(SWT.RIGHT);
		lblRaio_1.setBounds(54, 69, 27, 15);
		
		text_10 = new Text(composite_1, SWT.BORDER);
		text_10.setBounds(87, 106, 47, 21);
		
		Label lblVelocidade_1 = new Label(composite_1, SWT.NONE);
		lblVelocidade_1.setText("Velocidade:");
		lblVelocidade_1.setAlignment(SWT.RIGHT);
		lblVelocidade_1.setBounds(21, 112, 60, 15);
		
		text_11 = new Text(composite_1, SWT.BORDER);
		text_11.setBounds(213, 106, 47, 21);
		
		Label lblDireo_1 = new Label(composite_1, SWT.NONE);
		lblDireo_1.setText("Dire\u00E7\u00E3o:");
		lblDireo_1.setAlignment(SWT.RIGHT);
		lblDireo_1.setBounds(147, 112, 60, 15);
		
		Button btnInsert = new Button(composite_1, SWT.NONE);
		btnInsert.setText("Inserir");
		btnInsert.setBounds(111, 143, 75, 25);
		
		text_12 = new Text(composite_1, SWT.BORDER);
		text_12.setBounds(213, 63, 47, 21);
		
		Label lblngulo_1_2 = new Label(composite_1, SWT.NONE);
		lblngulo_1_2.setText("\u00C2ngulo:");
		lblngulo_1_2.setAlignment(SWT.RIGHT);
		lblngulo_1_2.setBounds(160, 69, 47, 15);
		
		Composite composite_1_1 = new Composite(shlAirplaneControl, SWT.BORDER);
		composite_1_1.setBounds(46, 300, 150, 90);
		
		txt_Xtransfer = new Text(composite_1_1, SWT.BORDER);
		txt_Xtransfer.setBounds(20, 24, 47, 21);
		
		Label lblXtransfer = new Label(composite_1_1, SWT.NONE);
		lblXtransfer.setText("X:");
		lblXtransfer.setAlignment(SWT.RIGHT);
		lblXtransfer.setBounds(-13, 27, 27, 15);
		
		txt_Ytransfer = new Text(composite_1_1, SWT.BORDER);
		txt_Ytransfer.setBounds(94, 24, 47, 21);
		
		Label lblYtransfer = new Label(composite_1_1, SWT.NONE);
		lblYtransfer.setText("Y:");
		lblYtransfer.setAlignment(SWT.RIGHT);
		lblYtransfer.setBounds(73, 27, 15, 15);
		
		Button btnTranslate = new Button(composite_1_1, SWT.NONE);
		btnTranslate.setText("Transladar");
		btnTranslate.setBounds(30, 51, 75, 25);
		
		Label lblTransformationFuntion = new Label(shlAirplaneControl, SWT.NONE);
		lblTransformationFuntion.setText("Fun\u00E7\u00F5es de Transforma\u00E7\u00E3o");
		lblTransformationFuntion.setFont(SWTResourceManager.getFont("Times New Roman", 13, SWT.ITALIC));
		lblTransformationFuntion.setBounds(87, 268, 196, 15);
		
		Composite composite_1_1_1 = new Composite(shlAirplaneControl, SWT.BORDER);
		composite_1_1_1.setBounds(203, 300, 150, 90);
		
		txt_Xstagger = new Text(composite_1_1_1, SWT.BORDER);
		txt_Xstagger.setBounds(20, 24, 47, 21);
		
		Label lblXstagger = new Label(composite_1_1_1, SWT.NONE);
		lblXstagger.setText("X:");
		lblXstagger.setAlignment(SWT.RIGHT);
		lblXstagger.setBounds(-13, 27, 27, 15);
		
		txt_Ystagger = new Text(composite_1_1_1, SWT.BORDER);
		txt_Ystagger.setBounds(94, 24, 47, 21);
		
		Label lblYstagger = new Label(composite_1_1_1, SWT.NONE);
		lblYstagger.setText("Y:");
		lblYstagger.setAlignment(SWT.RIGHT);
		lblYstagger.setBounds(73, 27, 15, 15);
		
		Button btnStagger = new Button(composite_1_1_1, SWT.NONE);
		btnStagger.setText("Escalonar");
		btnStagger.setBounds(30, 51, 75, 25);
		
		Composite composite_1_1_2 = new Composite(shlAirplaneControl, SWT.BORDER);
		composite_1_1_2.setBounds(46, 396, 310, 90);
		
		txtX_rotate = new Text(composite_1_1_2, SWT.BORDER);
		txtX_rotate.setBounds(159, 47, 47, 21);
		
		Label lblNewLabel_1_1_2 = new Label(composite_1_1_2, SWT.NONE);
		lblNewLabel_1_1_2.setText("X:");
		lblNewLabel_1_1_2.setAlignment(SWT.RIGHT);
		lblNewLabel_1_1_2.setBounds(126, 50, 27, 15);
		
		txtY_rotate = new Text(composite_1_1_2, SWT.BORDER);
		txtY_rotate.setBounds(233, 47, 47, 21);
		
		Label lblY_1_1_2 = new Label(composite_1_1_2, SWT.NONE);
		lblY_1_1_2.setText("Y:");
		lblY_1_1_2.setAlignment(SWT.RIGHT);
		lblY_1_1_2.setBounds(212, 50, 15, 15);
		
		Button btnRotate = new Button(composite_1_1_2, SWT.NONE);
		btnRotate.setText("Rotacionar");
		btnRotate.setBounds(10, 47, 87, 25);
		
		an = new Text(composite_1_1_2, SWT.BORDER);
		an.setBounds(63, 10, 47, 21);
		
		Label lblngulo_1 = new Label(composite_1_1_2, SWT.NONE);
		lblngulo_1.setBounds(10, 16, 47, 15);
		lblngulo_1.setText("\u00C2ngulo:");
		lblngulo_1.setAlignment(SWT.RIGHT);
		
		Label lblVelocidade_1_1 = new Label(composite_1_1_2, SWT.NONE);
		lblVelocidade_1_1.setText("Centro de Rota\u00E7\u00E3o:");
		lblVelocidade_1_1.setAlignment(SWT.CENTER);
		lblVelocidade_1_1.setBounds(159, 13, 121, 15);
		
		Label lblTrackFunction = new Label(shlAirplaneControl, SWT.NONE);
		lblTrackFunction.setText("Fun\u00E7\u00F5es de Rastreamento");
		lblTrackFunction.setFont(SWTResourceManager.getFont("Times New Roman", 13, SWT.ITALIC));
		lblTrackFunction.setBounds(87, 504, 196, 15);
		
		Composite composite_1_1_2_1 = new Composite(shlAirplaneControl, SWT.BORDER);
		composite_1_1_2_1.setBounds(46, 542, 250, 90);
		
		Button btnAirplan = new Button(composite_1_1_2_1, SWT.NONE);
		btnAirplan.setText("Avi\u00F5es pr\u00F3ximo ao Aeroporto");
		btnAirplan.setBounds(20, 40, 171, 25);
		
		txtMinimumDistance = new Text(composite_1_1_2_1, SWT.BORDER);
		txtMinimumDistance.setBounds(116, 13, 89, 21);
		
		Label lblMinimumDistance = new Label(composite_1_1_2_1, SWT.NONE);
		lblMinimumDistance.setText("Dist\u00E2ncia m\u00EDnima:");
		lblMinimumDistance.setBounds(10, 16, 100, 15);

	}
}
