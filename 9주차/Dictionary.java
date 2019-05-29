import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;

class Word//단어를 저장할 Word클래스를 만든다.
{
	String Korean;
	String English;
	
	
	Word(String Korean, String English)//생성자로 한국어와 영어를 입력받아 저장한다.
	{
		this.Korean = Korean;
		this.English = English;
	}
	
	
}

public class Dictionary extends JFrame{
	ArrayList<Word> Words = new ArrayList<Word>();//단어를 저장할 동적 객체배열 Words를 만든다.

	void WordInit()//Words에 단어를 넣는 메소드이다.
	{
		
		Words.add(new Word("느슨한", "lax"));
		Words.add(new Word("미루다.", "procrastinate"));
		Words.add(new Word("성취하다.", "accomplish"));
		Words.add(new Word("사실이라고 생각하다.", "assume"));
		Words.add(new Word("수행하다.", "conduct"));
		Words.add(new Word("정응하다.", "adjust"));
		Words.add(new Word("직원", "personnel"));
		Words.add(new Word("배정하다.", "assign"));
		Words.add(new Word("가르쳐주다.", "direct"));
		Words.add(new Word("기밀의", "confidential"));
		Words.add(new Word("격식을 갖춘", "formal"));
		Words.add(new Word("조정하다.", "coordinate"));
		Words.add(new Word("주소록", "directory"));
		Words.add(new Word("책임이 있는", "accountable"));
		Words.add(new Word("능숙하게", "skillfully"));
		Words.add(new Word("독점적인", "exclusive"));
		Words.add(new Word("의향", "intension"));
		Words.add(new Word("사본", "duplicate"));
		Words.add(new Word("충격적인", "disturbing"));
		Words.add(new Word("관여하다.", "engage"));
		Words.add(new Word("촉진하다.", "foster"));
		Words.add(new Word("중립", "neutrality"));
		Words.add(new Word("정교한", "sophisticated"));
		Words.add(new Word("시기적절한", "timely"));
		Words.add(new Word("즉시", "promptly"));
		Words.add(new Word("출입가능한", "accessible"));
		Words.add(new Word("실시하다.", "implement"));
		Words.add(new Word("발표", "announcement"));
		Words.add(new Word("부서", "department"));
		Words.add(new Word("영구적으로", "permanently"));
		Words.add(new Word("지키다.", "fulfill"));
		Words.add(new Word("개요", "outline"));
		Words.add(new Word("편집하다.", "compile"));
		Words.add(new Word("차후의", "subsequent"));
		Words.add(new Word("개요", "overview"));
		Words.add(new Word("문제", "matter"));
		Words.add(new Word("나머지", "reminder"));
		Words.add(new Word("준수", "compliance"));
		Words.add(new Word("관점", "aspect"));
		Words.add(new Word("외관상으로는", "apparently"));
		Words.add(new Word("알고있는", "aware"));
		Words.add(new Word("연장한", "extended"));
		Words.add(new Word("바람직한", "advisable"));
		Words.add(new Word("즉흥적으로 하다.", "improvise"));
		Words.add(new Word("졸업생들", "alumni"));
		Words.add(new Word("제시하다.", "present"));
		Words.add(new Word("입장", "admission"));
		Words.add(new Word("연회", "banquet"));
		Words.add(new Word("동행하다.", "accompany"));
		Words.add(new Word("헌신하다.", "commit"));
		Words.add(new Word("익명의", "anonymous"));
		Words.add(new Word("주목하다.", "note"));
		Words.add(new Word("원고", "manuscript"));
		Words.add(new Word("다양성", "variety"));
		Words.add(new Word("옹호자", "advocate"));
		Words.add(new Word("공헌자", "contributor"));
		Words.add(new Word("저항하다.", "defy"));
		Words.add(new Word("매혹적인", "fascinating"));
	}
	
	public Dictionary() {
		
		setTitle("English Translator");
		setLayout(new FlowLayout());//메인프레임의 배치관리자를 FlowLayout으로 지정한다.
		
		WordInit();//동적 객체배열을 초기화한다.
		
		JButton Translate = new JButton("번역");//번역 버튼을 만든다.
		JButton Cancel = new JButton("취소");//취소 버튼을 만든다.
		
		JTextField InputArea = new JTextField(25);//영단어를 입력할 TextField InputArea를 만든다.
		
		
		
		
		JTextArea TextArea = new JTextArea(4,25);//자동검색이 나올 텍스트영역 TextArea를 만든다.
		JScrollPane LtextArea = new JScrollPane(TextArea);//자동검색이 나올 텍스트필드에 스크롤기능을 추가한다.
		
		JTextArea RtextArea = new JTextArea(5,25);//번역결과가 나올 텍스트영역 RtextArea를 만든다.
		TextArea.setEditable(false);//자동검색이 자동으로 나올것이므로 수정불가능하게 만든다.
		RtextArea.setEditable(false);//번역결과가 나올것이므로 수정불가능하게 만든다.
		
		
		JPanel LPanel = new JPanel();//입력부분을 넣을 페널 LPanel을 만든다.
		JPanel RPanel = new JPanel();//출력부분을 넣을 페널 RPanel을 만든다.
		JPanel Buttons = new JPanel();//번역버튼과 취소버튼이 들어갈 Buttons를 만든다.
		
		InputArea.requestFocus();
		InputArea.setFocusable(true);
		
		InputArea.addKeyListener(new KeyListener() {//자동완성을 구현하기위해 키보드가 눌렸을 경우의 이벤트를 처리할 이벤트관리자를 만든다.

		
			public void keyTyped(KeyEvent e) {
				
				
			}

		
			public void keyPressed(KeyEvent e) {

				
			}

		
			public void keyReleased(KeyEvent e) {
		
				
				String NowText = InputArea.getText();//현제 입력된 알파벳들을 NowText에 저장한다.
				TextArea.setText("");//매번 입력될때마다 자동검색된 결과를 새로 나오게 해줄것이다.
				for(Word obj : Words)//for - each문을 이용해 동적 객체배열의 값에 접근한다.
				{
					
					if(obj.English.length() < NowText.length()) continue;//만약 입력된 알파벳의 수가 해당 단어의 개수보다 많으면 밑의 내용을 생략한다.
					
					String a = obj.English.substring(0,NowText.length());//입력된 알파벳의 수만큼의 객체배열의 값을 a에 저장한다.
					if(NowText.equals(a))//만약 입력된 알파벳과 그것과 동수의 객체배열의 값이 같다면 그것을 TextArea에 출력한다.
					{
						TextArea.append(obj.English + "\n");

					}
				}
			}
			
		});

		
		Translate.addActionListener(e->{//번역 버튼이 눌렸을 경우 객체배열의 해당 영단어에 해당하는 한글을 출력한다.
			String InputWord = (String)InputArea.getText();
		
	
			for(Word obj : Words)
			{
				
				if(InputWord.equals(obj.English))
				{
					RtextArea.setText(obj.Korean);
				}
			}
			
		});
		
		Cancel.addActionListener(e->{//취소버튼이 눌렸을 경우 메인프레임을 닫는다.
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
