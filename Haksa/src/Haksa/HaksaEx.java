package Haksa;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class HaksaEx extends JFrame{
	public HaksaEx() {
		this.setTitle("�л����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("�й�"));
		JTextField tfId = new JTextField(20);
		c.add(tfId);
		c.add(new JLabel("�̸�"));
		JTextField tfName = new JTextField(20);
		c.add(tfName);
		c.add(new JLabel("�а�"));
		JTextField tfMajor = new JTextField(20);
		c.add(tfMajor);
		c.add(new JLabel("�ּ�"));
		JTextField tfAddress = new JTextField(20);
		c.add(tfAddress);
		
		JTextArea taList = new JTextArea(15,23);
		JScrollPane sp = new JScrollPane(taList);
		c.add(sp);
		
		JButton btnInsert = new JButton("���");
		c.add(btnInsert);
		btnInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(tfId.getText().equals("")) {
					JOptionPane.showMessageDialog(
							null,"��ϵ� ���� �����ϴ�.","�˸�",
							JOptionPane.ERROR_MESSAGE);
				}
			}
			
		});
		
		
		JButton btnList = new JButton("���");
		c.add(btnList);
		JButton btnUpdate = new JButton("����");
		c.add(btnUpdate);
		JButton btnDelete = new JButton("����");
		c.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, 
						"�����Ͻðڽ��ϱ�?","����",
						JOptionPane.YES_NO_OPTION)
						==JOptionPane.YES_OPTION) {
					System.out.println("����ó��....");
					
					JOptionPane.showMessageDialog(null, "�����Ǿ����ϴ�.","�˸�"
							,JOptionPane.ERROR_MESSAGE);
				}
				
			}
			
		});
		
		
		
		taList.append("===================================\n");
		taList.append("         �й�          �̸�          �а�          �ּ�\n");
		taList.append("===================================\n");
		
		this.setSize(300,500);
		this.setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		new HaksaEx();
	}


	
}
