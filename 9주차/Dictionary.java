import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;

class Word//�ܾ ������ WordŬ������ �����.
{
	String Korean;
	String English;
	
	
	Word(String Korean, String English)//�����ڷ� �ѱ���� ��� �Է¹޾� �����Ѵ�.
	{
		this.Korean = Korean;
		this.English = English;
	}
	
	
}

public class Dictionary extends JFrame{
	ArrayList<Word> Words = new ArrayList<Word>();//�ܾ ������ ���� ��ü�迭 Words�� �����.

	void WordInit()//Words�� �ܾ �ִ� �޼ҵ��̴�.
	{
		
		Words.add(new Word("������", "lax"));
		Words.add(new Word("�̷��.", "procrastinate"));
		Words.add(new Word("�����ϴ�.", "accomplish"));
		Words.add(new Word("����̶�� �����ϴ�.", "assume"));
		Words.add(new Word("�����ϴ�.", "conduct"));
		Words.add(new Word("�����ϴ�.", "adjust"));
		Words.add(new Word("����", "personnel"));
		Words.add(new Word("�����ϴ�.", "assign"));
		Words.add(new Word("�������ִ�.", "direct"));
		Words.add(new Word("�����", "confidential"));
		Words.add(new Word("�ݽ��� ����", "formal"));
		Words.add(new Word("�����ϴ�.", "coordinate"));
		Words.add(new Word("�ּҷ�", "directory"));
		Words.add(new Word("å���� �ִ�", "accountable"));
		Words.add(new Word("�ɼ��ϰ�", "skillfully"));
		Words.add(new Word("��������", "exclusive"));
		Words.add(new Word("����", "intension"));
		Words.add(new Word("�纻", "duplicate"));
		Words.add(new Word("�������", "disturbing"));
		Words.add(new Word("�����ϴ�.", "engage"));
		Words.add(new Word("�����ϴ�.", "foster"));
		Words.add(new Word("�߸�", "neutrality"));
		Words.add(new Word("������", "sophisticated"));
		Words.add(new Word("�ñ�������", "timely"));
		Words.add(new Word("���", "promptly"));
		Words.add(new Word("���԰�����", "accessible"));
		Words.add(new Word("�ǽ��ϴ�.", "implement"));
		Words.add(new Word("��ǥ", "announcement"));
		Words.add(new Word("�μ�", "department"));
		Words.add(new Word("����������", "permanently"));
		Words.add(new Word("��Ű��.", "fulfill"));
		Words.add(new Word("����", "outline"));
		Words.add(new Word("�����ϴ�.", "compile"));
		Words.add(new Word("������", "subsequent"));
		Words.add(new Word("����", "overview"));
		Words.add(new Word("����", "matter"));
		Words.add(new Word("������", "reminder"));
		Words.add(new Word("�ؼ�", "compliance"));
		Words.add(new Word("����", "aspect"));
		Words.add(new Word("�ܰ������δ�", "apparently"));
		Words.add(new Word("�˰��ִ�", "aware"));
		Words.add(new Word("������", "extended"));
		Words.add(new Word("�ٶ�����", "advisable"));
		Words.add(new Word("���������� �ϴ�.", "improvise"));
		Words.add(new Word("��������", "alumni"));
		Words.add(new Word("�����ϴ�.", "present"));
		Words.add(new Word("����", "admission"));
		Words.add(new Word("��ȸ", "banquet"));
		Words.add(new Word("�����ϴ�.", "accompany"));
		Words.add(new Word("����ϴ�.", "commit"));
		Words.add(new Word("�͸���", "anonymous"));
		Words.add(new Word("�ָ��ϴ�.", "note"));
		Words.add(new Word("����", "manuscript"));
		Words.add(new Word("�پ缺", "variety"));
		Words.add(new Word("��ȣ��", "advocate"));
		Words.add(new Word("������", "contributor"));
		Words.add(new Word("�����ϴ�.", "defy"));
		Words.add(new Word("��Ȥ����", "fascinating"));
	}
	
	public Dictionary() {
		
		setTitle("English Translator");
		setLayout(new FlowLayout());//������������ ��ġ�����ڸ� FlowLayout���� �����Ѵ�.
		
		WordInit();//���� ��ü�迭�� �ʱ�ȭ�Ѵ�.
		
		JButton Translate = new JButton("����");//���� ��ư�� �����.
		JButton Cancel = new JButton("���");//��� ��ư�� �����.
		
		JTextField InputArea = new JTextField(25);//���ܾ �Է��� TextField InputArea�� �����.
		
		
		
		
		JTextArea TextArea = new JTextArea(4,25);//�ڵ��˻��� ���� �ؽ�Ʈ���� TextArea�� �����.
		JScrollPane LtextArea = new JScrollPane(TextArea);//�ڵ��˻��� ���� �ؽ�Ʈ�ʵ忡 ��ũ�ѱ���� �߰��Ѵ�.
		
		JTextArea RtextArea = new JTextArea(5,25);//��������� ���� �ؽ�Ʈ���� RtextArea�� �����.
		TextArea.setEditable(false);//�ڵ��˻��� �ڵ����� ���ð��̹Ƿ� �����Ұ����ϰ� �����.
		RtextArea.setEditable(false);//��������� ���ð��̹Ƿ� �����Ұ����ϰ� �����.
		
		
		JPanel LPanel = new JPanel();//�Էºκ��� ���� ��� LPanel�� �����.
		JPanel RPanel = new JPanel();//��ºκ��� ���� ��� RPanel�� �����.
		JPanel Buttons = new JPanel();//������ư�� ��ҹ�ư�� �� Buttons�� �����.
		
		InputArea.requestFocus();
		InputArea.setFocusable(true);
		
		InputArea.addKeyListener(new KeyListener() {//�ڵ��ϼ��� �����ϱ����� Ű���尡 ������ ����� �̺�Ʈ�� ó���� �̺�Ʈ�����ڸ� �����.

		
			public void keyTyped(KeyEvent e) {
				
				
			}

		
			public void keyPressed(KeyEvent e) {

				
			}

		
			public void keyReleased(KeyEvent e) {
		
				
				String NowText = InputArea.getText();//���� �Էµ� ���ĺ����� NowText�� �����Ѵ�.
				TextArea.setText("");//�Ź� �Էµɶ����� �ڵ��˻��� ����� ���� ������ ���ٰ��̴�.
				for(Word obj : Words)//for - each���� �̿��� ���� ��ü�迭�� ���� �����Ѵ�.
				{
					
					if(obj.English.length() < NowText.length()) continue;//���� �Էµ� ���ĺ��� ���� �ش� �ܾ��� �������� ������ ���� ������ �����Ѵ�.
					
					String a = obj.English.substring(0,NowText.length());//�Էµ� ���ĺ��� ����ŭ�� ��ü�迭�� ���� a�� �����Ѵ�.
					if(NowText.equals(a))//���� �Էµ� ���ĺ��� �װͰ� ������ ��ü�迭�� ���� ���ٸ� �װ��� TextArea�� ����Ѵ�.
					{
						TextArea.append(obj.English + "\n");

					}
				}
			}
			
		});

		
		Translate.addActionListener(e->{//���� ��ư�� ������ ��� ��ü�迭�� �ش� ���ܾ �ش��ϴ� �ѱ��� ����Ѵ�.
			String InputWord = (String)InputArea.getText();
		
	
			for(Word obj : Words)
			{
				
				if(InputWord.equals(obj.English))
				{
					RtextArea.setText(obj.Korean);
				}
			}
			
		});
		
		Cancel.addActionListener(e->{//��ҹ�ư�� ������ ��� ������������ �ݴ´�.
			System.exit(1);
		});
		
		
		
		
		LPanel.setLayout(new BoxLayout(LPanel,BoxLayout.Y_AXIS));
		
		LPanel.add(InputArea);
		LPanel.add(LtextArea);

		
		RPanel.add(RtextArea);
		Buttons.add(Translate);
		Buttons.add(Cancel);
		
		add(LPanel);
		add(RPanel);
		add(Buttons);
		
		setSize(600,250);
		setVisible(true);
		

	}
	

	
	
	public static void main(String[] args)
	{
		Dictionary a = new Dictionary();
		
		
	}
}
