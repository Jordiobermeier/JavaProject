import javax.swing.*;

public class BankApp extends JFrame {

	private static final String JTextfield  = null;

	//Main method
	public static void main(String[] args){ 
		new BankApp();
	}
	
	public BankApp() {
		
		//JFrame
		setSize(800,600);
		setTitle("Bankrekening");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		//JButtons
		JButton bankrekeningButton = new JButton("Bankrekening Openen");//The JButton name.
		add(bankrekeningButton);//Add the button to the JFrame.
		bankrekeningButton.setBounds(10, 10, 400, 20);//Set pos x & y + set width & height
		
		JButton cryptocurrencyrekening = new JButton("Cryptocurrencyrekening Openen");
		add(cryptocurrencyrekening);
		cryptocurrencyrekening.setBounds(10, 40, 400, 20);
		
		JButton spaarrekening = new JButton("Spaarrekening Openen");
		add(spaarrekening);
		spaarrekening.setBounds(10, 70, 400, 20);
		
		JTextField bedrag = new JTextField("0.0");
		add(bedrag);
		bedrag.setBounds(10, 100, 160, 80);
		
		JButton storten = new JButton("Storten");
		add(storten);
		storten.setBounds(170, 100, 240, 20);
		
		JButton opnemen = new JButton("Opnemen");
		add(opnemen);
		opnemen.setBounds(170, 130, 240, 20);
		
		JButton isNUL = new JButton("Reset");
		add(isNUL);
		isNUL.setBounds(170, 160, 240, 20);
		
		JLabel label1 = new JLabel();
		label1.setText("Uw saldo bedraagt:");
		add(label1);
		label1.setBounds(10, 220, 240, 20);
		
		JTextField saldo = new JTextField("1255.55");
		add(saldo);
		saldo.setBounds(170, 220, 240, 20);
		
		JLabel label2 = new JLabel();
		label2.setText("Rekeningnummer:");
		add(label2);
		label2.setBounds(10, 250, 240, 20);
		
		JButton plus = new JButton("PLUS");
		add(plus);
		plus.setBounds(310, 250, 100, 20);
		
		JButton min = new JButton("MIN");
		add(min);
		min.setBounds(310, 280, 100, 20);
		
		JLabel label3 = new JLabel();
		label3.setText("Spaarrekening");
		add(label3);
		label3.setBounds(10, 310, 240, 20);
		
		JButton print = new JButton("Bankrekening printen");
		add(print);
		print.setBounds(250, 400, 300, 20);
		
	}
	
}