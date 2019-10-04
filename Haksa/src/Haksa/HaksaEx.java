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
		this.setTitle("학사관리");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("학번"));
		JTextField tfId = new JTextField(20);
		c.add(tfId);
		c.add(new JLabel("이름"));
		JTextField tfName = new JTextField(20);
		c.add(tfName);
		c.add(new JLabel("학과"));
		JTextField tfMajor = new JTextField(20);
		c.add(tfMajor);
		c.add(new JLabel("주소"));
		JTextField tfAddress = new JTextField(20);
		c.add(tfAddress);
		
		JTextArea taList = new JTextArea(15,23);
		JScrollPane sp = new JScrollPane(taList);
		c.add(sp);
		
		JButton btnInsert = new JButton("등록");
		c.add(btnInsert);
		btnInsert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(tfId.getText().equals("")) {
					JOptionPane.showMessageDialog(
							null,"등록된 값이 없습니다.","알림",
							JOptionPane.ERROR_MESSAGE);
				}
			}
			
		});
		
		
		JButton btnList = new JButton("목록");
		c.add(btnList);
		JButton btnUpdate = new JButton("수정");
		c.add(btnUpdate);
		JButton btnDelete = new JButton("삭제");
		c.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null, 
						"삭제하시겠습니까?","삭제",
						JOptionPane.YES_NO_OPTION)
						==JOptionPane.YES_OPTION) {
					System.out.println("삭제처리....");
					
					JOptionPane.showMessageDialog(null, "삭제되었습니다.","알림"
							,JOptionPane.ERROR_MESSAGE);
				}
				
			}
			
		});
		
		
		
		taList.append("===================================\n");
		taList.append("         학번          이름          학과          주소\n");
		taList.append("===================================\n");
		
		this.setSize(300,500);
		this.setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		new HaksaEx();
	}


	
}
