package suma;
import java.awt.*;
import java.awt.event.*;

public class contenedor extends Frame implements ActionListener{

	Frame container;
	Panel p;
	TextField num1;
	Label suma;
	TextField num2;
	TextField resultado;
	Button sumar;
	
	public contenedor() {
		container=new Frame("sumas");
		p=new Panel();
		
		container.setLayout(new FlowLayout());
		container.add(p);
		container.setSize(500,500);
		container.setVisible(true);
		
		
		
		num1=new TextField(5);
		p.add(num1);
		
		suma=new Label("+");
		p.add(suma);
		
		num2=new TextField(5);
		p.add(num2);
		
		resultado=new TextField(5);
		
		sumar=new Button("=");
		p.add(sumar);
		sumar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int numero1=Integer.parseInt(num1.getText());
				int numero2=Integer.parseInt(num2.getText());
				int plus=numero1+numero2;
				resultado.setText(String.valueOf(plus));
			}
			
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
