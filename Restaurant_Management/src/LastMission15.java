import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.*;
import java.io.*;
import java.text.*;

public class LastMission15 extends JFrame {
	String Stringtxt [] = new String[10];
	int Stringnum =0;
	int surveycount = 0;
	int tablesell = 0;
	int moneysum = 0;
	int tablecount= 0;
	int select = 0;
	int thisluck;
	int lucknum[] = new int[12];
	int ran;
	int todaysell = 0;
	
	int money[] = new int[12];
	String mon1, mon2, mon3, mon4, mon5, mon6, mon7, mon8, mon9, mon10, mon11, mon12;
	int num[] = new int[12];
	
	JButton endbtn = new JButton("주문 완료");
	JLabel stkpic = new JLabel(new ImageIcon("images/background.jpg"));
	JLabel pstpic = new JLabel(new ImageIcon("images/background.jpg"));
	JLabel pizpic = new JLabel(new ImageIcon("images/background.jpg"));
	JLabel pilpic = new JLabel(new ImageIcon("images/background.jpg"));
	JLabel sidepic = new JLabel(new ImageIcon("images/background.jpg"));
	JLabel drinkpic = new JLabel(new ImageIcon("images/background.jpg"));
	JLabel aa1 = new JLabel(new ImageIcon("images/beauty.jpg"));
	JLabel aa2 = new JLabel(new ImageIcon("images/원빈.jpg"));
	JLabel aa3 = new JLabel(new ImageIcon("images/아이린.jpg"));
	JLabel aa4 = new JLabel(new ImageIcon("images/강동원.jpg"));
	JLabel timelabel1 = new JLabel(); JLabel timelabel2 = new JLabel();
	JLabel 어서오세요 = new JLabel("안녕하십니까. JUNG KII & COOK 입니다. 우리 매장을 방문해주신 모든 고객님들께 감사드립니다. 항상 좋은 맛과 서비스를 위해서 열심히 노력하겠습니다.");
	
	JLabel steaklabel[] = new JLabel[7];
	JLabel pizzalabel[] = new JLabel[9];
	JLabel pzname[] = new JLabel[9];
	JLabel pilaflabel[] = new JLabel[4];
	JLabel pilname[] = new JLabel[4];
	JButton pzorder[] = new JButton[9];
	JButton pilorder[] = new JButton[4];
	JLabel stname[] = new JLabel[7];
	JButton order[] = new JButton[7];
	JLabel pastalabel[] = new JLabel[11];
	JLabel psname[] = new JLabel[11];
	JButton psorder[] = new JButton[11];
	JLabel sidelabel[] = new JLabel[6];
	JLabel sdname[] = new JLabel[6];
	JButton sdorder[] = new JButton[6];
	JLabel drinklabel[] = new JLabel[11];
	JLabel dkname[] = new JLabel[11];
	JButton dkorder[] = new JButton[11];
	String t1info[] = new String[20];
	String t2info[] = new String[20];
	String t3info[] = new String[20];
	String t4info[] = new String[20];
	String t5info[] = new String[20];
	String t6info[] = new String[20];
	String t7info[] = new String[20];
	String t8info[] = new String[20];
	String t9info[] = new String[20];
	String t10info[] = new String[20];
	String t11info[] = new String[20];
	String t12info[] = new String[20];
	JLabel t1money[] = new JLabel[20];
	JLabel t2money[] = new JLabel[20];
	JLabel t3money[] = new JLabel[20];
	JLabel t4money[] = new JLabel[20];
	JLabel t5money[] = new JLabel[20];
	JLabel t6money[] = new JLabel[20];
	JLabel t7money[] = new JLabel[20];
	JLabel t8money[] = new JLabel[20];
	JLabel t9money[] = new JLabel[20];
	JLabel t10money[] = new JLabel[20];
	JLabel t11money[] = new JLabel[20];
	JLabel t12money[] = new JLabel[20];
	ImageIcon tableimg = new ImageIcon("images/go.jpg");
	ImageIcon btn = new ImageIcon("images/btnimg.jpg");
	JMenuBar menubar1 = new JMenuBar();
	JMenu menu1 = new JMenu("예약관리");
	JMenuBar tablebar = new JMenuBar();
	JMenuItem tbinfo = new JMenuItem(" Table 정보");
	JMenu menu2 = new JMenu("Table 정보");
	JLabel label = new JLabel(tableimg);
	JButton tbtn[] = new JButton[18]; // 테이블 버튼
	JButton Clickbtn1, Clickbtn2, Clickbtn3;
	JLabel tblabel[] = new JLabel[12]; // 테이블 버튼 JLabel
	JLabel tblabel2[] = new JLabel[12]; // 테이블 버튼 JLabel
	JButton steak = new JButton(new ImageIcon("menu/steaksalad.jpg"));
	JButton pasta = new JButton(new ImageIcon("menu/pasta.jpg"));
	JButton pilaf = new JButton(new ImageIcon("menu/pilaf.jpg"));
	JButton pizza = new JButton(new ImageIcon("menu/pizza.jpg"));
	JButton side = new JButton(new ImageIcon("menu/sidedish.jpg"));
	JButton drink = new JButton(new ImageIcon("menu/beverage.jpg"));
	ImageIcon orderimg = new ImageIcon("menu/orderimg.png");
	
	// Reservation 필드
	String t1name, t1birth, t1main = "", t1side = "", t1person, t1phone, t1num, t1time, t2name, t2birth, t2main = "",
			t2side = "", t2person, t2phone, t2num, t2time, t3name, t3birth, t3main = "", t3side = "", t3person, t3phone,
			t3num, t3time, t4name, t4birth, t4main = "", t4side = "", t4person, t4phone, t4num, t4time, t5name, t5birth,
			t5main = "", t5side = "", t5person, t5phone, t5num, t5time, t6name, t6birth, t6main = "", t6side = "",
			t6person, t6phone, t6num, t6time, t7name, t7birth, t7main = "", t7side = "", t7person, t7phone, t7num,
			t7time, t8name, t8birth, t8main = "", t8side = "", t8person, t8phone, t8num, t8time, t9name, t9birth,
			t9main = "", t9side = "", t9person, t9phone, t9num, t9time, t10name, t10birth, t10main = "", t10side = "",
			t10person, t10phone, t10num, t10time, t11name, t11birth, t11main = "", t11side = "", t11person, t11phone,
			t11num, t11time, t12name, t12birth, t12main = "", t12side = "", t12person, t12phone, t12num, t12time,
			nowDate;

	JMenuBar menubar = new JMenuBar();
	JMenu menu = new JMenu("V I P");
	JMenuItem mn1, mn2, mn3, mn4, mn5, mn6;
	JTextField namefield, birthfield, hpfield1, hpfield2, hpfield3, timefield;
	JLabel name, phone, mainmenu, sidemenu, birth, time, person, a, sum, danger, led, ttable;
	JPanel jyp;
	JButton ok, cancel;
	JRadioButton man, woman;
	ButtonGroup g;
	JLabel manofwoman, myperson, la = new JLabel("정확한 개인정보를 입력해주시기 바랍니다.");;
	JComboBox combox, timebox, mainbox, sidebox, tablebox;
	String ea[] = { "인원선택", "   1 명", "   2 명", "   3 명", "   4 명", "   5 명", "   6 명", "   7 명", "   8 명" };
	String ea2[] = { "시간선택", " 9 시  ", "   10 시", "   11 시", "   12 시", "   13시", "   14 시", "   15 시", "   16 ",
			"   17 시", " 18 시" };
	String menuString[] = { " Main Select ", " 목살 스테이크 샐러드 ", " 하얀 토마토 파스타 ", " 스퀴드 파스타 ", " 베이컨 까르보나라 ",
			" 핫 스파이시 해물 파스타 ", " 버터꿀갈비 필라프 ", " 베이컨 크림 리조또 ", " 새우 필라프 " };
	String sideString[] = { " Side Select ", " 프렌치 프라이 ", " 갈릭 브레드 ", " 연어 샐러드 ", " 치킨 텐더 샐러드 " };
	String tablenum[] = { " 1번  ", " 2번  ", " 3번  ", " 4번  ", " 5번  ", " 6번  ", " 7번  ", " 8번  ", " 9번  ", " 10번  ",
			" 11번  ", " 12번  " };
	ImageIcon image1 = new ImageIcon("images/man.jpg");
	ImageIcon image2 = new ImageIcon("images/woman.jpg");
	String info[] = new String[10];
	String info2[] = new String[10];
	int numm = 0, numm2 = 0;
	Container contentpane;
	JLabel t_name = new JLabel("이 름");
	JLabel t_birth = new JLabel("생년월일");
	JLabel t_main = new JLabel("Main Dish");
	JLabel t_side = new JLabel("Side Dish");
	JLabel t_person = new JLabel("성 별");
	JLabel t_phone = new JLabel("전화번호");
	JLabel t_num = new JLabel("인 원");
	JLabel t_time = new JLabel("시 간");

	String t1price[] = new String[20];
	String t2price[] = new String[20];
	String t3price[] = new String[20];
	String t4price[] = new String[20];
	String t5price[] = new String[20];
	String t6price[] = new String[20];
	String t7price[] = new String[20];
	String t8price[] = new String[20];
	String t9price[] = new String[20];
	String t10price[] = new String[20];
	String t11price[] = new String[20];
	String t12price[] = new String[20];
	// 클래스 선언
	FoodMenu fdmenu;
	Click0 clk;
	SteakPanel stp;
	PastaPanel psp;
	PilafPanel plp;
	PizzaPanel pzp;
	SidePanel sdp;
	DrinkPanel dkp;
	OrderInfo od;
	SignPanel spsp;
	Payment pay;
	Survey sv;
	SurveyWindow sw;
	MyThird aaa;
	Reservation reser;
	Event event;
	MySubject sub;

	ImageIcon cardimg = new ImageIcon("images/카드결제.jpg");
	ImageIcon cashimg = new ImageIcon("images/현금결제.jpg");
	JButton paybtn1 = new JButton(cashimg), paybtn2 = new JButton(cardimg);
	JButton surveyok = new JButton("할래요");
	JButton surveycancel = new JButton("안 할래요");
	JTextField surveytxt[] = new JTextField[5];
	JLabel monitor1 = new JLabel("잔여 Table ");
	JButton sellinfo = new JButton(new ImageIcon("images/정산.jpg"));
	JButton sale = new JButton (new ImageIcon("images/통계.jpg"));
	JLabel mainsign = new JLabel(new ImageIcon("images/mainsign.jpg"));
	JButton subject = new JButton(new ImageIcon("images/매출목표.png"));
	
	JLabel foodinfo[] = new JLabel[20];
	JLabel north = new JLabel("< 결 제 내 용  >", JLabel.CENTER);
	JLabel south = new JLabel();
	JSlider slider = new JSlider(JSlider.HORIZONTAL,0,500,250);
	Scanner sc;
	
	public LastMission15() throws FileNotFoundException {	
		super("JUNG KII & COOK");
		
		
		for(int i=0; i<12; i++){
			money[i] = 0;
			num[i] = 0;
		}
		menu2.add(tbinfo); // Click class 로 전달
		tablebar.add(menu2); // Click class 로 전달
		fdmenu = new FoodMenu();
		sw = new SurveyWindow();
		spsp = new SignPanel();
		clk = new Click0();
		stp = new SteakPanel();
		psp = new PastaPanel();
		plp = new PilafPanel();
		pzp = new PizzaPanel();
		sdp = new SidePanel();
		dkp = new DrinkPanel();
		reser = new Reservation();
		event = new Event();
		pay = new Payment();
		sub = new MySubject();
		
		thisluck = (int)(Math.random()*10);
		
		getContentPane();
		getContentPane().setBackground(Color.YELLOW);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel aa = new JLabel("1 번");
		JLabel aa2 = new JLabel("2 번");
		for (int i = 0; i < 12; i++) {
			tblabel[i] = new JLabel((i + 1) + " 번");
			tblabel2[i] = new JLabel("", JLabel.CENTER);
			tbtn[i] = new JButton("입석 가능");
			tbtn[i].setLayout(new GridLayout(2, 1));
			tbtn[i].add(tblabel[i]);
			tbtn[i].add(tblabel2[i]);
			label.add(tbtn[i]);
			tbtn[i].addActionListener(new MyActionListener());
			tbtn[i].setBackground(Color.WHITE);
			tbtn[i].addMouseListener(new MyMouseListener());
		}
		for (int j = 0; j < 4; j++) {
			tbtn[j].setBounds(37 + (j * 251), 45, 174, 83);
			tbtn[j + 4].setBounds(37 + (j * 251), 220, 174, 83);
			tbtn[j + 8].setBounds(37 + (j * 251), 395, 174, 83);
		}
		add(sellinfo);
		sellinfo.setContentAreaFilled(false);
		sellinfo.setBounds(1040,160, 122, 109);
		sellinfo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("현재 매출액은 : "+moneysum+" 입니다.");
				System.out.println("판매한 Table수는 "+tablesell+" 입니다");
			}
		});
		sale.setBounds(1040, 310, 122, 109);
		subject.setBounds(1040, 450, 122, 38);
		label.setBounds(0,154, 1000, 526);
		mainsign.setBounds(0, 0, 1200, 154);
		timelabel1.setBounds(1020, 530, 200, 40);
		timelabel2.setBounds(1010, 590, 200, 40);
		timelabel1.setFont(new Font("Bold",Font.BOLD, 25));
		timelabel2.setFont(new Font("Bold",Font.BOLD, 35));
		어서오세요.setFont(new Font("Bold",Font.BOLD, 40));
		add(timelabel1);
		add(timelabel2);
		add(어서오세요);
		add(label);
		add(sale);
		add(subject);
		add(mainsign);
		sale.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int result = JOptionPane.showConfirmDialog(null, "정산을 합니다",  // 미션 15 JOptionPane 활용
						"Confirm", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_OPTION){
					System.out.println("하루 매출액은 : "+moneysum+"이고,");
					System.out.println(moneysum+" 원이 금고에 저장되었습니다.");
					moneysum = 0;
					tablesell = 0;
				}	
				System.exit(0);
			}	
		});
		subject.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sub.setVisible(true);
			}
		});
		setResizable(false);
		setSize(1200, 800);
		setLocation(165,100);
		setVisible(true);
	}
	class SignPanel extends JFrame{ 
		BufferedImage image	= new BufferedImage(500,500, BufferedImage.TYPE_INT_RGB);
		Graphics graphics = image.createGraphics();
		JButton yesbtn = new JButton("결제"); 
		Point stpoint = null, epoint = null;
		JPanel signpanel = new JPanel();
		JPanel southpanel = new JPanel();
		SignPanel(){
			setTitle("Your Sign Plz");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			southpanel.setLayout(new FlowLayout());
			southpanel.add(yesbtn);

			add(southpanel,BorderLayout.SOUTH);
			add(signpanel, BorderLayout.CENTER);
			signpanel.addMouseListener(new MyMouseAdapter());
			signpanel.addMouseMotionListener(new MyMouseMotion());
			yesbtn.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					try { 
						File file = new File("싸인"+ran+".jpeg");
						ImageIO.write(image, "jpeg", file);
					} 
					catch (Exception e1)
					{
						e1.printStackTrace(); 
					} 
					setVisible(false);
				}
			});
			setResizable(false);
			setSize(400,400);
		}
		class MyMouseAdapter extends MouseAdapter{   // 미션 3 마우스 이벤트
			public void mousePressed(MouseEvent e){		
				stpoint = e.getPoint();
			}
			public void mouseReleased(MouseEvent e){
				epoint  = e.getPoint();					
				repaint();
			}
		} 
		class MyMouseMotion extends MouseMotionAdapter{ // 미션 5 마우스 모션 리스트
			public void mouseDragged(MouseEvent e){
				epoint = e.getPoint();
				repaint();
			}
		}

		public void paint(Graphics g){
			if(stpoint != null && epoint != null) {
				g.drawLine(stpoint.x, stpoint.y, epoint.x, epoint.y);
				graphics.drawLine(stpoint.x, stpoint.y, epoint.x, epoint.y);
				stpoint = epoint;
			}
		}
	}
	class SurveyWindow extends JDialog{
		JLabel la2 = new JLabel(new ImageIcon("images/5%할인.jpg"));
		SurveyWindow(){
			getContentPane();
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setLayout(new FlowLayout(FlowLayout.CENTER,5,20));
			JLabel la = new JLabel("  설문에 참여하시면 다음번에 5%할인 해드립니다.  ");
			add(la);
			add(surveyok);
			add(surveycancel);
			add(la2);
			surveyok.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					setModal(false);
					new Survey();
					setVisible(false);
				}
			});
			surveycancel.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					setModal(false);
					setVisible(false);
				}
			});
			setResizable(false);
			setSize(370,300);
		}
	}
	class Survey extends JDialog{
		JButton go = new JButton("제출하기");
		JLabel sv1 = new JLabel("1. 직원들의 서비스는 어떠셨습니까 ?",JLabel.LEFT);
		JLabel sv2 = new JLabel("2. 음식의 맛은 어떠셨습니까 ?",JLabel.LEFT);
		JLabel sv3 = new JLabel("3. 불편한 점은 없으셨습니까 ?",JLabel.LEFT);
		JLabel sv4 = new JLabel("4. 개선방안 의견을 제시해 주세요.",JLabel.LEFT);
		Survey(){
			setTitle("매장 평가");
			getContentPane();
			setLayout(new GridLayout(10,1));
			setModal(true);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			sv1.setFont(new Font("고딕체", Font.BOLD, 16));
			sv2.setFont(new Font("고딕체", Font.BOLD, 16));
			sv3.setFont(new Font("고딕체", Font.BOLD, 16));
			sv4.setFont(new Font("고딕체", Font.BOLD, 16));
			for(int i=0; i<5; i++)
				surveytxt[i] = new JTextField(40);
			add(sv1);
			add(surveytxt[0]);
			add(sv2);
			add(surveytxt[1]);
			add(sv3);
			add(surveytxt[2]);
			add(sv4);
			add(surveytxt[3]);
			add(go);
			go.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					setVisible(false);
					System.out.println("");
					new SurveyWrite();
				}
			});
			setSize(500,600);
			setResizable(false);
			setVisible(true);
		}
	}
	class OrderInfo extends JDialog {
		JLabel foodinfo[] = new JLabel[20];
		JLabel north = new JLabel("< 주 문 내 역  >", JLabel.CENTER);
		JLabel south;

		OrderInfo() {
			setTitle("주문 내역");
			getContentPane();
			getContentPane().setBackground(Color.YELLOW);
			setLayout(null);
			setModal(true);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			north.setBounds(10, 10, 360, 25);
			add(north);
			if (select == 1) {
				for (int i = 0; i < 20; i++) {
					foodinfo[i] = new JLabel(t1info[i]);
					foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
					t1money[i] = new JLabel(t1price[i]);
					t1money[i].setBounds(195, 40 + (i * 30), 100, 25);
					add(t1money[i]);
					south = new JLabel("< 합 계 금 액  > : " + money[0] + " 원입니다.", JLabel.CENTER);
				}
			} else if (select == 2) {
				for (int i = 0; i < 20; i++) {
					foodinfo[i] = new JLabel(t2info[i]);
					foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
					t2money[i] = new JLabel(t2price[i]);
					t2money[i].setBounds(195, 40 + (i * 30), 100, 25);
					add(t2money[i]);
					south = new JLabel("< 합 계 금 액  > : " + money[1] + " 원입니다.", JLabel.CENTER);
				}
			}
			if (select == 3) {
				for (int i = 0; i < 20; i++) {
					foodinfo[i] = new JLabel(t3info[i]);
					foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
					t3money[i] = new JLabel(t3price[i]);
					t3money[i].setBounds(195, 40 + (i * 30), 100, 25);
					add(t3money[i]);
					south = new JLabel("< 합 계 금 액  > : " + money[2] + " 원입니다.", JLabel.CENTER);
				}
			}
			if (select == 4) {
				for (int i = 0; i < 20; i++) {
					foodinfo[i] = new JLabel(t4info[i]);
					foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
					t4money[i] = new JLabel(t4price[i]);
					t4money[i].setBounds(195, 40 + (i * 30), 100, 25);
					add(t4money[i]);
					south = new JLabel("< 합 계 금 액  > : " + money[3] + " 원입니다.", JLabel.CENTER);
				}
			}
			if (select == 5) {
				for (int i = 0; i < 20; i++) {
					foodinfo[i] = new JLabel(t5info[i]);
					foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
					t5money[i] = new JLabel(t5price[i]);
					t5money[i].setBounds(195, 40 + (i * 30), 100, 25);
					add(t5money[i]);
					south = new JLabel("< 합 계 금 액  > : " + money[4] + " 원입니다.", JLabel.CENTER);
				}
			}
			if (select == 6) {
				for (int i = 0; i < 20; i++) {
					foodinfo[i] = new JLabel(t6info[i]);
					foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
					t6money[i] = new JLabel(t6price[i]);
					t6money[i].setBounds(195, 40 + (i * 30), 100, 25);
					add(t6money[i]);
					south = new JLabel("< 합 계 금 액  > : " + money[5] + " 원입니다.", JLabel.CENTER);
				}
			}
			if (select == 7) {
				for (int i = 0; i < 20; i++) {
					foodinfo[i] = new JLabel(t7info[i]);
					foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
					t7money[i] = new JLabel(t7price[i]);
					t7money[i].setBounds(195, 40 + (i * 30), 100, 25);
					add(t7money[i]);
					south = new JLabel("< 합 계 금 액  > : " + money[6] + " 원입니다.", JLabel.CENTER);
				}
			}
			if (select == 8) {
				for (int i = 0; i < 20; i++) {
					foodinfo[i] = new JLabel(t8info[i]);
					foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
					t8money[i] = new JLabel(t8price[i]);
					t8money[i].setBounds(195, 40 + (i * 30), 100, 25);
					add(t8money[i]);
					south = new JLabel("< 합 계 금 액  > : " + money[7] + " 원입니다.", JLabel.CENTER);
				}
			}
			if (select == 9) {
				for (int i = 0; i < 20; i++) {
					foodinfo[i] = new JLabel(t9info[i]);
					foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
					t9money[i] = new JLabel(t9price[i]);
					t9money[i].setBounds(195, 40 + (i * 30), 100, 25);
					add(t9money[i]);
					south = new JLabel("< 합 계 금 액  > : " + money[8] + " 원입니다.", JLabel.CENTER);
				}
			}
			if (select == 10) {
				for (int i = 0; i < 20; i++) {
					foodinfo[i] = new JLabel(t10info[i]);
					foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
					t10money[i] = new JLabel(t10price[i]);
					t10money[i].setBounds(195, 40 + (i * 30), 100, 25);
					add(t10money[i]);
					south = new JLabel("< 합 계 금 액  > : " + money[9] + " 원입니다.", JLabel.CENTER);
				}
			}
			if (select == 11) {
				for (int i = 0; i < 20; i++) {
					foodinfo[i] = new JLabel(t11info[i]);
					foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
					t11money[i] = new JLabel(t11price[i]);
					t11money[i].setBounds(195, 40 + (i * 30), 100, 25);
					add(t11money[i]);
					south = new JLabel("< 합 계 금 액  > : " + money[10] + " 원입니다.", JLabel.CENTER);
				}
			}
			if (select == 12) {
				for (int i = 0; i < 20; i++) {
					foodinfo[i] = new JLabel(t12info[i]);
					foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
					t12money[i] = new JLabel(t12price[i]);
					t12money[i].setBounds(195, 40 + (i * 30), 100, 25);
					add(t12money[i]);
					south = new JLabel("< 합 계 금 액  > : " + money[11] + " 원입니다.", JLabel.CENTER);
				}
			}
			for (int i = 0; i < 20; i++)
				add(foodinfo[i]);
			south.setBounds(100, 300, 300, 30);
			add(south);
			setSize(400, 500);
			setVisible(true);
		}
	}
	class MySubject extends JFrame{
		JLabel lol = new JLabel(new ImageIcon("images/매출배경.jpg"));
		JButton ok = new JButton("설 정");
		JLabel mny = new JLabel("(만원)");
		MySubject(){
			getContentPane().setLayout(null);
		
			lol.setBounds(0, -30, 450, 400);
			slider.setBounds(15, 190, 400, 60);
			mny.setBounds(390, 245, 50, 30);
			ok.setBounds(180, 260, 70, 40);
			slider.setPaintLabels(true);
			slider.setPaintTicks(true);
			slider.setMajorTickSpacing(50);
			slider.setMinorTickSpacing(10);
			slider.setBackground(Color.ORANGE);
			slider.setFont(new Font("",Font.BOLD, 15));
			slider.setValue(500);
			lol.add(ok);
			lol.add(mny);
			lol.add(slider);
			add(lol);
			slider.addChangeListener(new ChangeListener(){
				public void stateChanged(ChangeEvent e) {
					todaysell = slider.getValue()*10000;
				}
			});
			ok.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					setVisible(false);
					System.out.println("매출목표가 "+todaysell+" 원으로 설정되었습니다.");
				}
			});		
			setSize(450,330);
			setLocation(800,300);
			setResizable(false);
			setVisible(false);
		}
	}
	class Payment extends JFrame{
		Payment() {
			for(int i=0; i<20; i++)
				foodinfo[i] = new JLabel();
			setTitle("INIPAY 3.0");
			getContentPane();
			getContentPane().setBackground(Color.YELLOW);
			setLayout(null);
			setBackground(Color.WHITE);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			north.setBounds(10, 10, 360, 25);
			add(north);
			for (int i = 0; i < 20; i++){
				foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
				add(foodinfo[i]);
			}
			paybtn1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					setVisible(false);
					for(int i=0; i<20; i++)
						foodinfo[i].setText("");
					if (select == 1) {
						num[0] = 0;
						moneysum += money[0];
						tablesell += 1;
						System.out.println("1번 테이블에서 "+money[0]+" 원이 계산되었습니다.");
						tbtn[0].setText("입석 가능");
						tbtn[0].setBackground(Color.WHITE);
						tblabel2[0].setText("");
						money[0] = 0;
						for (int i = 0; i < 20; i++){
							t1money[i].setText("");
							t1info[i] = "";
							t1price[i] = "";
						}
					} 
					else if (select == 2) {
						num[1] = 0;
						moneysum += money[1];
						tablesell += 1;
						System.out.println("2번 테이블에서 "+money[1]+" 원이 계산되었습니다.");
						tbtn[1].setText("입석 가능");
						tbtn[1].setBackground(Color.WHITE);
						tblabel2[1].setText("");
						money[1] = 0;
						for (int i = 0; i < 20; i++){
							t2money[i].setText("");
							t2info[i] = "";
							t2price[i] = "";
						}
					}
					else if (select == 3) {
						num[2] = 0;
						moneysum += money[2];
						tablesell += 1;
						System.out.println("3번 테이블에서 "+money[2]+" 원이 계산되었습니다.");
						tbtn[2].setText("입석 가능");
						tbtn[2].setBackground(Color.WHITE);
						tblabel2[2].setText("");
						money[2] = 0;
						for (int i = 0; i < 20; i++){
							t3money[i].setText("");
							t3info[i] = "";
							t3price[i] = "";
						}
					}
					else if (select == 4) {
						num[3] = 0;
						moneysum += money[3];
						tablesell += 1;
						System.out.println("4번 테이블에서 "+money[3]+" 원이 계산되었습니다.");
						tbtn[3].setText("입석 가능");
						tbtn[3].setBackground(Color.WHITE);
						tblabel2[3].setText("");
						money[3] = 0;
						for (int i = 0; i < 20; i++) {
							t4money[i].setText("");
							t4info[i] = "";
							t4price[i] = "";
						}
					}
					else if (select == 5) {
						num[4] = 0;
						moneysum += money[4];
						tablesell += 1;
						System.out.println("5번 테이블에서 "+money[4]+" 원이 계산되었습니다.");
						tbtn[4].setText("입석 가능");
						tbtn[4].setBackground(Color.WHITE);
						tblabel2[4].setText("");
						money[4] = 0;
						for (int i = 0; i < 20; i++){
							t5money[i].setText("");
							t5info[i] = "";
							t5price[i] = "";
						}
					}
					else if (select == 6) {
						num[5] = 0;
						moneysum += money[5];
						tablesell += 1;
						System.out.println("6번 테이블에서 "+money[5]+" 원이 계산되었습니다.");
						tbtn[5].setText("입석 가능");
						tbtn[5].setBackground(Color.WHITE);
						tblabel2[5].setText("");
						money[5] = 0;
						for (int i = 0; i < 20; i++){
							t6money[i].setText("");
							t6info[i] = "";
							t6price[i] = "";
						}
					}
					else if (select == 7) {
						num[6] = 7;
						moneysum += money[6];
						tablesell += 1;
						System.out.println("7번 테이블에서 "+money[6]+" 원이 계산되었습니다.");
						tbtn[6].setText("입석 가능");
						tbtn[6].setBackground(Color.WHITE);
						tblabel2[6].setText("");
						money[6] = 0;
						for (int i = 0; i < 20; i++) {
							t7money[i].setText("");
							t7info[i] = "";
							t7price[i] = "";
						}
					}
					else if (select == 8) {
						num[7] = 0;
						moneysum += money[7];
						tablesell += 1;
						System.out.println("8번 테이블에서 "+money[7]+" 원이 계산되었습니다.");
						tbtn[7].setText("입석 가능");
						tbtn[7].setBackground(Color.WHITE);
						tblabel2[7].setText("");
						money[7] = 0;
						for (int i = 0; i < 20; i++){
							t8money[i].setText("");
							t8info[i] = "";
							t8price[i] = "";
						}
					}
					else if (select == 9) {
						num[8] = 0;
						moneysum += money[8];
						tablesell += 1;
						System.out.println("9번 테이블에서 "+money[8]+" 원이 계산되었습니다.");
						tbtn[8].setText("입석 가능");
						tbtn[8].setBackground(Color.WHITE);
						tblabel2[8].setText("");
						money[8] = 0;
						for (int i = 0; i < 20; i++) {
							t9money[i].setText("");
							t9info[i] = "";
							t9price[i] = "";
						}
					}
					else if (select == 10) {
						num[9] = 10;
						moneysum += money[9];
						tablesell += 1;
						System.out.println("10번 테이블에서 "+money[9]+" 원이 계산되었습니다.");
						tbtn[9].setText("입석 가능");
						tbtn[9].setBackground(Color.WHITE);
						tblabel2[9].setText("");
						money[9] = 0;
						for (int i = 0; i < 20; i++){
							t10money[i].setText("");
							t10info[i] = "";
							t10price[i] = "";
						}
					}
					else if (select == 11) {
						num[10] = 0;
						moneysum += money[10];
						tablesell += 1;
						System.out.println("11번 테이블에서 "+money[10]+" 원이 계산되었습니다.");
						tbtn[10].setText("입석 가능");
						tbtn[10].setBackground(Color.WHITE);
						tblabel2[10].setText("");
						money[10] = 0;
						for (int i = 0; i < 20; i++){
							t11money[i].setText("");
							t11info[i] = "";
							t11price[i] = "";
						}
					}
					else if (select == 12) {
						num[11] = 0;
						moneysum += money[11];
						tablesell += 1;
						System.out.println("12번 테이블에서 "+money[11]+" 원이 계산되었습니다.");
						tbtn[11].setText("입석 가능");
						tbtn[11].setBackground(Color.WHITE);
						tblabel2[11].setText("");
						money[11] = 0;
						for (int i = 0; i < 20; i++){
							t12money[i].setText("");
							t12info[i] = "";
							t12price[i] = "";
						}
					}		
					sw.setVisible(true);
					tablecount++;
					if(moneysum > todaysell){
						System.out.println("하루 목표 매출액을 돌파했습니다 !!");
					}
				}
			});
			paybtn2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					setVisible(false);
					spsp.setVisible(true);
					for(int i=0; i<20; i++)
						foodinfo[i].setText("");
					if (select == 1) {
						num[0] = 0;
						moneysum += money[0];
						tablesell += 1;
						System.out.println("1번 테이블에서 "+money[0]+" 원이 계산되었습니다.");
						tbtn[0].setText("입석 가능");
						tbtn[0].setBackground(Color.WHITE);
						tblabel2[0].setText("");
						money[0] = 0;
						for (int i = 0; i < 20; i++){
							t1money[i].setText("");
							t1info[i] = "";
							t1price[i] = "";
						}
					} 
					else if (select == 2) {
						num[1] = 0;
						moneysum += money[1];
						tablesell += 1;
						System.out.println("2번 테이블에서 "+money[1]+" 원이 계산되었습니다.");
						tbtn[1].setText("입석 가능");
						tbtn[1].setBackground(Color.WHITE);
						tblabel2[1].setText("");
						money[1] = 0;
						for (int i = 0; i < 20; i++){
							t2money[i].setText("");
							t2info[i] = "";
							t2price[i] = "";
						}
					}
					else if (select == 3) {
						num[2] = 0;
						moneysum += money[2];
						tablesell += 1;
						System.out.println("3번 테이블에서 "+money[2]+" 원이 계산되었습니다.");
						tbtn[2].setText("입석 가능");
						tbtn[2].setBackground(Color.WHITE);
						tblabel2[2].setText("");
						money[2] = 0;
						for (int i = 0; i < 20; i++){
							t3money[i].setText("");
							t3info[i] = "";
							t3price[i] = "";
						}
					}
					else if (select == 4) {
						num[3] = 0;
						moneysum += money[3];
						tablesell += 1;
						System.out.println("4번 테이블에서 "+money[3]+" 원이 계산되었습니다.");
						tbtn[3].setText("입석 가능");
						tbtn[3].setBackground(Color.WHITE);
						tblabel2[3].setText("");
						money[3] = 0;
						for (int i = 0; i < 20; i++) {
							t4money[i].setText("");
							t4info[i] = "";
							t4price[i] = "";
						}
					}
					else if (select == 5) {
						num[4] = 0;
						moneysum += money[4];
						tablesell += 1;
						System.out.println("5번 테이블에서 "+money[4]+" 원이 계산되었습니다.");
						tbtn[4].setText("입석 가능");
						tbtn[4].setBackground(Color.WHITE);
						tblabel2[4].setText("");
						money[4] = 0;
						for (int i = 0; i < 20; i++){
							t5money[i].setText("");
							t5info[i] = "";
							t5price[i] = "";
						}
					}
					else if (select == 6) {
						num[5] = 0;
						moneysum += money[5];
						tablesell += 1;
						System.out.println("6번 테이블에서 "+money[5]+" 원이 계산되었습니다.");
						tbtn[5].setText("입석 가능");
						tbtn[5].setBackground(Color.WHITE);
						tblabel2[5].setText("");
						money[5] = 0;
						for (int i = 0; i < 20; i++){
							t6money[i].setText("");
							t6info[i] = "";
							t6price[i] = "";
						}
					}
					else if (select == 7) {
						num[6] = 7;
						moneysum += money[6];
						tablesell += 1;
						System.out.println("7번 테이블에서 "+money[6]+" 원이 계산되었습니다.");
						tbtn[6].setText("입석 가능");
						tbtn[6].setBackground(Color.WHITE);
						tblabel2[6].setText("");
						money[6] = 0;
						for (int i = 0; i < 20; i++) {
							t7money[i].setText("");
							t7info[i] = "";
							t7price[i] = "";
						}
					}
					else if (select == 8) {
						num[7] = 0;
						moneysum += money[7];
						tablesell += 1;
						System.out.println("8번 테이블에서 "+money[7]+" 원이 계산되었습니다.");
						tbtn[7].setText("입석 가능");
						tbtn[7].setBackground(Color.WHITE);
						tblabel2[7].setText("");
						money[7] = 0;
						for (int i = 0; i < 20; i++){
							t8money[i].setText("");
							t8info[i] = "";
							t8price[i] = "";
						}
					}
					else if (select == 9) {
						num[8] = 0;
						moneysum += money[8];
						tablesell += 1;
						System.out.println("9번 테이블에서 "+money[8]+" 원이 계산되었습니다.");
						tbtn[8].setText("입석 가능");
						tbtn[8].setBackground(Color.WHITE);
						tblabel2[8].setText("");
						money[8] = 0;
						for (int i = 0; i < 20; i++) {
							t9money[i].setText("");
							t9info[i] = "";
							t9price[i] = "";
						}
					}
					else if (select == 10) {
						num[9] = 10;
						moneysum += money[9];
						tablesell += 1;
						System.out.println("10번 테이블에서 "+money[9]+" 원이 계산되었습니다.");
						tbtn[9].setText("입석 가능");
						tbtn[9].setBackground(Color.WHITE);
						tblabel2[9].setText("");
						money[9] = 0;
						for (int i = 0; i < 20; i++){
							t10money[i].setText("");
							t10info[i] = "";
							t10price[i] = "";
						}
					}
					else if (select == 11) {
						num[10] = 0;
						moneysum += money[10];
						tablesell += 1;
						System.out.println("11번 테이블에서 "+money[10]+" 원이 계산되었습니다.");
						tbtn[10].setText("입석 가능");
						tbtn[10].setBackground(Color.WHITE);
						tblabel2[10].setText("");
						money[10] = 0;
						for (int i = 0; i < 20; i++){
							t11money[i].setText("");
							t11info[i] = "";
							t11price[i] = "";
						}
					}
					else if (select == 12) {
						num[11] = 0;
						moneysum += money[11];
						tablesell += 1;
						System.out.println("12번 테이블에서 "+money[11]+" 원이 계산되었습니다.");
						tbtn[11].setText("입석 가능");
						tbtn[11].setBackground(Color.WHITE);
						tblabel2[11].setText("");
						money[11] = 0;
						for (int i = 0; i < 20; i++){
							t12money[i].setText("");
							t12info[i] = "";
							t12price[i] = "";
						}
					}
				}
			});
			
			south.setBounds(30, 435, 400, 30);
			paybtn1.setBounds(60, 480, 117, 104);
			paybtn2.setBounds(190, 480, 117, 104);
			south.setFont(new Font("GOOD", Font.BOLD, 16));
			add(south);
			add(paybtn1); 
			add(paybtn2);
			paybtn1.setVisible(true);
			paybtn2.setVisible(true);
			setResizable(false);
			setSize(400, 650);
			setVisible(false);
		}
	}
	class SteakPanel extends JDialog {
		SteakPanel() {
			setTitle("STEAK");
			getContentPane();
			setLayout(null);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setModal(true);
			steaklabel[0] = new JLabel(new ImageIcon("steak/닭가슴닭스테이크.jpg"));
			steaklabel[1] = new JLabel(new ImageIcon("steak/목살스테이크샐러드.jpg"));
			steaklabel[2] = new JLabel(new ImageIcon("steak/목심스테이크2.jpg"));
			steaklabel[3] = new JLabel(new ImageIcon("steak/work22.jpg"));
			steaklabel[4] = new JLabel(new ImageIcon("steak/스파이스스테이크.jpg"));
			steaklabel[5] = new JLabel(new ImageIcon("steak/오리지날닭다리스테이크.jpg"));
			steaklabel[6] = new JLabel(new ImageIcon("steak/폭찹스테이크.jpg"));

			stname[0] = new JLabel("칠리스테이크 샐러드 -19.800", JLabel.CENTER);
			stname[1] = new JLabel("닭가슴살스테이크 샐러드  -19.800", JLabel.CENTER);
			stname[2] = new JLabel("목심 스테이크 -19.800", JLabel.CENTER);
			stname[3] = new JLabel("나만의 스테이크 -19.800", JLabel.CENTER);
			stname[4] = new JLabel("스파이스 스테이크 샐러드 -19.800", JLabel.CENTER);
			stname[5] = new JLabel("오리지널 닭다리 스테이크 -19.800", JLabel.CENTER);
			stname[6] = new JLabel("폭찹 스테이크 -19.800", JLabel.CENTER);
			
			for(int i=0; i<7; i++){
				order[i] = new JButton(orderimg);
				stname[i].setForeground(Color.WHITE);
				order[i].addActionListener(new SteakAction());
				stkpic.add(steaklabel[i]);
				stkpic.add(stname[i]);
				stkpic.add(order[i]);
				
			}
			steaklabel[0].setBounds(10, 50, 196, 126); 
			steaklabel[1].setBounds(260, 50, 196, 126);
			steaklabel[2].setBounds(510, 50, 196, 126);
			steaklabel[3].setBounds(10, 260, 196, 126);
			steaklabel[4].setBounds(260, 260, 196, 126);
			steaklabel[5].setBounds(510, 260, 196, 126);
			steaklabel[6].setBounds(10, 470, 196, 126);

			stname[0].setBounds(10, 190, 196, 20); 
			stname[1].setBounds(260, 190, 196, 20); 
			stname[2].setBounds(510, 190, 196, 20); 
			stname[3].setBounds(10, 400, 196, 20); 
			stname[4].setBounds(260, 400, 196, 20);
			stname[5].setBounds(510, 400, 196, 20);
			stname[6].setBounds(10, 610, 196, 20);

			order[0].setBounds(50, 212, 116, 35); 
			order[1].setBounds(300, 212, 116, 35);
			order[2].setBounds(550, 212, 116, 35);
			order[3].setBounds(50, 422, 116, 35);
			order[4].setBounds(300, 422, 116, 35);
			order[5].setBounds(550, 422, 116, 35);
			order[6].setBounds(50, 632, 116, 35);
			stkpic.setBounds(0, 0, 750, 690);
			add(stkpic);
		
			setSize(750, 730);
			setLocation(165, 100);
			setResizable(false);
			setVisible(false);
		}

		class SteakAction implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == order[0]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "칠리스테이크 샐러드";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "칠리스테이크 샐러드";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "칠리스테이크 샐러드";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "칠리스테이크 샐러드";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "칠리스테이크 샐러드";
						t1price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "칠리스테이크 샐러드";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[0] += 19800;
						t7info[num[6]] = "칠리스테이크 샐러드";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "칠리스테이크 샐러드";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "칠리스테이크 샐러드";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "칠리스테이크 샐러드";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "칠리스테이크 샐러드";
						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "칠리스테이크 샐러드";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == order[1]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "목살스테이크샐러드";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "목살스테이크샐러드";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "목살스테이크샐러드";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "목살스테이크샐러드";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[0]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "목살스테이크샐러드";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "목살스테이크샐러드";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "목살스테이크샐러드";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t7info[num[0]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t1info[num[7]] = "목살스테이크샐러드";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "목살스테이크샐러드";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "목살스테이크샐러드";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "목살스테이크샐러드";
						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "목살스테이크샐러드";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == order[2]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "목심 스테이크";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					}
					if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "목심 스테이크";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					}
					if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "목심 스테이크";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					}
					if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "목심 스테이크";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					}
					if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "목심 스테이크";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					}
					if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "목심 스테이크";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					}
					if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "목심 스테이크";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					}
					if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "목심 스테이크";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					}
					if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "목심 스테이크";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					}
					if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "목심 스테이크";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					}
					if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "목심 스테이크";
						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					}
					if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "목심 스테이크";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == order[3]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "나만의 스테이크";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "나만의 스테이크";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "나만의 스테이크";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "나만의 스테이크";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "나만의 스테이크";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "나만의 스테이크";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "나만의 스테이크";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "나만의 스테이크";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[8]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "나만의 스테이크";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "나만의 스테이크";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[0]] = "나만의 스테이크";
						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "나만의 스테이크";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == order[4]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "스파이스 스테이크 샐러드";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "스파이스 스테이크 샐러드";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "스파이스 스테이크 샐러드";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "스파이스 스테이크 샐러드";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "스파이스 스테이크 샐러드";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "스파이스 스테이크 샐러드";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "스파이스 스테이크 샐러드";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "스파이스 스테이크 샐러드";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "스파이스 스테이크 샐러드";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "스파이스 스테이크 샐러드";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "스파이스 스테이크 샐러드";
						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t1info[num[11]] = "스파이스 스테이크 샐러드";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == order[5]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "오리지널 닭다리 스테이크";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "오리지널 닭다리 스테이크";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "오리지널 닭다리 스테이크";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "오리지널 닭다리 스테이크";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "오리지널 닭다리 스테이크";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "오리지널 닭다리 스테이크";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "오리지널 닭다리 스테이크";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "오리지널 닭다리 스테이크";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "오리지널 닭다리 스테이크";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "오리지널 닭다리 스테이크";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "오리지널 닭다리 스테이크";

						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "오리지널 닭다리 스테이크";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == order[6]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "폭찹 스테이크";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "폭찹 스테이크";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "폭찹 스테이크";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "폭찹 스테이크";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "폭찹 스테이크";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "폭찹 스테이크";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "폭찹 스테이크";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "폭찹 스테이크";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "폭찹 스테이크";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "폭찹 스테이크";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "폭찹 스테이크";
						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "폭찹 스테이크";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				}
			}
		}
	}

	class PastaPanel extends JDialog {
		PastaPanel() {
			setTitle("PASTA");
			getContentPane();
			setLayout(null);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setModal(true);
			pastalabel[0] = new JLabel(new ImageIcon("pasta/머쉬룸치킨.jpg"));
			pastalabel[1] = new JLabel(new ImageIcon("pasta/머쉬룸해산물.jpg"));
			pastalabel[2] = new JLabel(new ImageIcon("pasta/미트토마토.jpg"));
			pastalabel[3] = new JLabel(new ImageIcon("pasta/베이컨까르보나라.jpg"));
			pastalabel[4] = new JLabel(new ImageIcon("pasta/베이컨크림.jpg"));
			pastalabel[5] = new JLabel(new ImageIcon("pasta/스퀴드 파스타.jpg"));
			pastalabel[6] = new JLabel(new ImageIcon("pasta/핫스파이스해물파스타.jpg"));
			pastalabel[7] = new JLabel(new ImageIcon("pasta/해물토마토.jpg"));
			pastalabel[8] = new JLabel(new ImageIcon("pasta/해산물올리브.jpg"));
			pastalabel[9] = new JLabel(new ImageIcon("pasta/해산물크림.jpg"));
			pastalabel[10] = new JLabel(new ImageIcon("pasta/해산물토마토.jpg"));
			psname[0] = new JLabel("머쉬룸 치킨 파스타 - 19.800", JLabel.CENTER);
			psname[1] = new JLabel("머쉬룸 해산물 파스타 - 19.800", JLabel.CENTER);
			psname[2] = new JLabel("미트 토마토 파스타 - 19.800", JLabel.CENTER);
			psname[3] = new JLabel("까르보나라 파스타 - 19.800", JLabel.CENTER);
			psname[4] = new JLabel("베이컨 크림 파스타 - 19.800", JLabel.CENTER);
			psname[5] = new JLabel("스퀴드 파스타 - 19.800", JLabel.CENTER);
			psname[6] = new JLabel("스파이스 해물 파스타 - 19.800", JLabel.CENTER);
			psname[7] = new JLabel("해물 토마토 파스타 - 19.800", JLabel.CENTER);
			psname[8] = new JLabel("해산물 올리브 파스타 - 19.800", JLabel.CENTER);
			psname[9] = new JLabel("해산물 크림 파스타 - 19.800", JLabel.CENTER);
			psname[10] = new JLabel("해산물 토마토 파스타 - 19.800", JLabel.CENTER);
			
			for(int i=0; i<11; i++){
				psorder[i] = new JButton(orderimg);
				psname[i].setForeground(Color.white);
				pstpic.add(pastalabel[i]);
				pstpic.add(psname[i]);
				pstpic.add(psorder[i]);
				psorder[i].addActionListener(new PastaAction());
			}
			pastalabel[0].setBounds(10, 50, 168, 108);
			pastalabel[1].setBounds(195, 50, 168, 108);
			pastalabel[2].setBounds(375, 50, 168, 108);
			pastalabel[3].setBounds(555, 50, 168, 108);
			pastalabel[4].setBounds(10, 250, 168, 108);
			pastalabel[5].setBounds(195, 250, 168, 108);
			pastalabel[6].setBounds(375, 250, 168, 108);
			pastalabel[7].setBounds(555, 250, 168, 108);
			pastalabel[8].setBounds(10, 460, 168, 108);
			pastalabel[9].setBounds(195, 460, 168, 108);
			pastalabel[10].setBounds(375, 460, 168, 108);

			psname[0].setBounds(10, 160, 175, 20); 
			psname[1].setBounds(195, 160, 175, 20); 
			psname[2].setBounds(375, 160, 175, 20); 
			psname[3].setBounds(555, 160, 175, 20);
			psname[4].setBounds(10, 360, 175, 20);
			psname[5].setBounds(195, 360, 175, 20);
			psname[6].setBounds(375, 360, 175, 20); 
			psname[7].setBounds(555, 360, 175, 20); 
			psname[8].setBounds(10, 570, 175, 20);
			psname[9].setBounds(195, 570, 175, 20);
			psname[10].setBounds(375, 570, 175, 20); 

			psorder[0].setBounds(40, 190, 116, 30);
			psorder[1].setBounds(220, 190, 116, 30);
			psorder[2].setBounds(400, 190, 116, 30);
			psorder[3].setBounds(585, 190, 116, 30);
			psorder[4].setBounds(40, 390, 116, 30);
			psorder[5].setBounds(220, 390, 116, 30);
			psorder[6].setBounds(400, 390, 116, 30);
			psorder[7].setBounds(585, 390, 116, 30);
			psorder[8].setBounds(40, 600, 116, 30);
			psorder[9].setBounds(220, 600, 116, 30);
			psorder[10].setBounds(400, 600, 116, 30);
			
			pstpic.setBounds(0, 0, 750, 690);
			add(pstpic);

			setLocation(165, 100);
			setSize(750, 690);
			setResizable(false);
			setVisible(false);
		}

		class PastaAction implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == psorder[0]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "머쉬룸 치킨 파스타";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "머쉬룸 치킨 파스타";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "머쉬룸 치킨 파스타";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "머쉬룸 치킨 파스타";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "머쉬룸 치킨 파스타";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "머쉬룸 치킨 파스타";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "머쉬룸 치킨 파스타";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "머쉬룸 치킨 파스타";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "머쉬룸 치킨 파스타";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "머쉬룸 치킨 파스타";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "머쉬룸 치킨 파스타";
						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "머쉬룸 치킨 파스타";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == psorder[1]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "머쉬룸 해산물 파스타";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "머쉬룸 해산물 파스타";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "머쉬룸 해산물 파스타";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "머쉬룸 해산물 파스타";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "머쉬룸 해산물 파스타";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "머쉬룸 해산물 파스타";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "머쉬룸 해산물 파스타";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "머쉬룸 해산물 파스타";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "머쉬룸 해산물 파스타";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "머쉬룸 해산물 파스타";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "머쉬룸 해산물 파스타";
						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "머쉬룸 해산물 파스타";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == psorder[2]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "미트 토마토 파스타";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "미트 토마토 파스타";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "미트 토마토 파스타";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "미트 토마토 파스타";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "미트 토마토 파스타";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "미트 토마토 파스타";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "미트 토마토 파스타";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "미트 토마토 파스타";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "미트 토마토 파스타";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "미트 토마토 파스타";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "미트 토마토 파스타";
						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "미트 토마토 파스타";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == psorder[3]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "까르보나라 파스타";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "까르보나라 파스타";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "까르보나라 파스타";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "까르보나라 파스타";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "까르보나라 파스타";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "까르보나라 파스타";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "까르보나라 파스타";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "까르보나라 파스타";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "까르보나라 파스타";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "까르보나라 파스타";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "까르보나라 파스타";
						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "까르보나라 파스타";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == psorder[4]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "베이컨 크림 파스타";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "베이컨 크림 파스타";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "베이컨 크림 파스타";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "베이컨 크림 파스타";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "베이컨 크림 파스타";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "베이컨 크림 파스타";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "베이컨 크림 파스타";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "베이컨 크림 파스타";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "베이컨 크림 파스타";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "베이컨 크림 파스타";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "베이컨 크림 파스타";
						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "베이컨 크림 파스타";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == psorder[5]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "스퀴드 파스타";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "스퀴드 파스타";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "스퀴드 파스타";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "스퀴드 파스타";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "스퀴드 파스타";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "스퀴드 파스타";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "스퀴드 파스타";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "스퀴드 파스타";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "스퀴드 파스타";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "스퀴드 파스타";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "스퀴드 파스타";
						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "스퀴드 파스타";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == psorder[6]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "스파이스 해물 파스타";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "스파이스 해물 파스타";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "스파이스 해물 파스타";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "스파이스 해물 파스타";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "스파이스 해물 파스타";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "스파이스 해물 파스타";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "스파이스 해물 파스타";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "스파이스 해물 파스타";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "스파이스 해물 파스타";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "스파이스 해물 파스타";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "스파이스 해물 파스타";
						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "스파이스 해물 파스타";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == psorder[7]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "해물 토마토 파스타";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "해물 토마토 파스타";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "해물 토마토 파스타";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "해물 토마토 파스타";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "해물 토마토 파스타";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "해물 토마토 파스타";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "해물 토마토 파스타";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "해물 토마토 파스타";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "해물 토마토 파스타";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "해물 토마토 파스타";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "해물 토마토 파스타";
						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "해물 토마토 파스타";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == psorder[8]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "해산물 올리브 파스타";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "해산물 올리브 파스타";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "해산물 올리브 파스타";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "해산물 올리브 파스타";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "해산물 올리브 파스타";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "해산물 올리브 파스타";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "해산물 올리브 파스타";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "해산물 올리브 파스타";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "해물 토마토 파스타";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "해산물 올리브 파스타";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "해산물 올리브 파스타";
						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "해산물 올리브 파스타";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == psorder[9]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "해산물 크림 파스타";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "해산물 크림 파스타";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "해산물 크림 파스타";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "해산물 크림 파스타";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "해산물 크림 파스타";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "해산물 크림 파스타";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "해산물 크림 파스타";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "해산물 크림 파스타";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "해산물 크림 파스타";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "해산물 크림 파스타";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "해산물 크림 파스타";
						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "해산물 크림 파스타";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == psorder[10]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "해산물 토마토 파스타";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "해산물 토마토 파스타";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "해산물 토마토 파스타";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "해산물 토마토 파스타";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "해산물 토마토 파스타";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "해산물 토마토 파스타";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "해산물 토마토 파스타";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "해산물 토마토 파스타";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "해산물 토마토 파스타";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "해산물 토마토 파스타";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "해산물 토마토 파스타";
						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "해산물 토마토 파스타";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				}
			}
		}
	}

	class PilafPanel extends JDialog {
		PilafPanel() {
			setTitle("PILAF");
			getContentPane();
			setLayout(null);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setModal(true);
			pilaflabel[0] = new JLabel(new ImageIcon("pilaf/김치필라프.jpg"));
			pilaflabel[1] = new JLabel(new ImageIcon("pilaf/목살필라프.jpg"));
			pilaflabel[2] = new JLabel(new ImageIcon("pilaf/베이컨필라프.jpg"));
			pilaflabel[3] = new JLabel(new ImageIcon("pilaf/새우필라프.jpg"));
			pilname[0] = new JLabel("김치 필라프 - 19.800", JLabel.CENTER);
			pilname[1] = new JLabel("목살 필라프 - 19.800", JLabel.CENTER);
			pilname[2] = new JLabel("베이컨 필라프 - 19.800", JLabel.CENTER);
			pilname[3] = new JLabel("새우 필라프 - 19.800", JLabel.CENTER);
			for(int i=0; i<4; i++){
				pilorder[i] = new JButton(orderimg);
				pilname[i].setForeground(Color.white);
				pilpic.add(pilaflabel[i]);
				pilpic.add(pilname[i]);
				pilpic.add(pilorder[i]);
				pilorder[i].addActionListener(new PilafAction());
			}
			pilaflabel[0].setBounds(10, 50, 168, 108);
			pilaflabel[1].setBounds(195, 50, 168, 108);
			pilaflabel[2].setBounds(375, 50, 168, 108);
			pilaflabel[3].setBounds(555, 50, 168, 108);

			pilname[0].setBounds(10, 160, 175, 20); 
			pilname[1].setBounds(195, 160, 175, 20); 
			pilname[2].setBounds(375, 160, 175, 20); 
			pilname[3].setBounds(555, 160, 175, 20);

			pilorder[0].setBounds(40, 190, 116, 30);
			pilorder[1].setBounds(220, 190, 116, 30);
			pilorder[2].setBounds(400, 190, 116, 30);
			pilorder[3].setBounds(580, 190, 116, 30);
			pilpic.setBounds(0, 0, 750, 690);
			add(pilpic);

			setLocation(165, 100);
			setResizable(false);
			setSize(750, 690);
			setVisible(false);
		}

		class PilafAction implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == pilorder[0]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "김치 필라프";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "김치 필라프";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "김치 필라프";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "김치 필라프";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "김치 필라프";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "김치 필라프";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "김치 필라프";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "김치 필라프";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "김치 필라프";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "김치 필라프";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "김치 필라프";
						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "김치 필라프";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == pilorder[1]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "목살 필라프";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "목살 필라프";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "목살 필라프";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "목살 필라프";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "목살 필라프";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "목살 필라프";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "목살 필라프";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "목살 필라프";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "목살 필라프";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "목살 필라프";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "목살 필라프";
						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "목살 필라프";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == pilorder[2]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "베이컨 필라프";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "베이컨 필라프";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "베이컨 필라프";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "베이컨 필라프";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "베이컨 필라프";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "베이컨 필라프";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "베이컨 필라프";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "베이컨 필라프";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "베이컨 필라프";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "베이컨 필라프";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "베이컨 필라프";
						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "베이컨 필라프";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == pilorder[3]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "새우 필라프";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "새우 필라프";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "새우 필라프";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "새우 필라프";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "새우 필라프";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "새우 필라프";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "새우 필라프";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "새우 필라프";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "새우 필라프";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "새우 필라프";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "새우 필라프";
						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "새우 필라프";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				}
			}
		}
	}

	class PizzaPanel extends JDialog {
		PizzaPanel() {
			setTitle("PIZZA");
			getContentPane();
			setLayout(null);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setModal(true);
			pizzalabel[0] = new JLabel(new ImageIcon("pizza/고르곤졸라피자.jpg"));
			pizzalabel[1] = new JLabel(new ImageIcon("pizza/달콤감자피자.jpg"));
			pizzalabel[2] = new JLabel(new ImageIcon("pizza/더블미트피자.jpg"));
			pizzalabel[3] = new JLabel(new ImageIcon("pizza/더블포테이토피자.jpg"));
			pizzalabel[4] = new JLabel(new ImageIcon("pizza/불고구마피자.jpg"));
			pizzalabel[5] = new JLabel(new ImageIcon("pizza/스테이크샐러드피자.jpg"));
			pizzalabel[6] = new JLabel(new ImageIcon("pizza/스텔라피자.jpg"));
			pizzalabel[7] = new JLabel(new ImageIcon("pizza/애플시나몬피자.jpg"));
			pizzalabel[8] = new JLabel(new ImageIcon("pizza/토마토미드피자.png"));

			pzname[0] = new JLabel("고르곤졸라 피자 -9.800", JLabel.CENTER);
			pzname[1] = new JLabel("달콤감자 피자  -19.800", JLabel.CENTER);
			pzname[2] = new JLabel("더블미트 피자 -14.800", JLabel.CENTER);
			pzname[3] = new JLabel("더블포테이토 피자 -14.800", JLabel.CENTER);
			pzname[4] = new JLabel("불고구마 피자 -19.800", JLabel.CENTER);
			pzname[5] = new JLabel("스테이크샐러드 피자 -14.800", JLabel.CENTER);
			pzname[6] = new JLabel("스텔라 피자 -13.800", JLabel.CENTER);
			pzname[7] = new JLabel("애플시나몬 피자 -14.800", JLabel.CENTER);
			pzname[8] = new JLabel("토마토미드 피자 -19.800", JLabel.CENTER);
			
			for(int i=0; i<9; i++){
				pzorder[i] = new JButton(orderimg);
				pzname[i].setForeground(Color.white);
				pzorder[i].addActionListener(new PizzaAction());
				pizpic.add(pizzalabel[i]);
				pizpic.add(pzname[i]);
				pizpic.add(pzorder[i]);
			}

			pizzalabel[0].setBounds(10, 50, 196, 126);
			pizzalabel[1].setBounds(260, 50, 196, 126);
			pizzalabel[2].setBounds(510, 50, 196, 126);
			pizzalabel[3].setBounds(10, 260, 196, 126);
			pizzalabel[4].setBounds(260, 260, 196, 126);
			pizzalabel[5].setBounds(510, 260, 196, 126);
			pizzalabel[6].setBounds(10, 470, 196, 126);
			pizzalabel[7].setBounds(260, 470, 196, 126);
			pizzalabel[8].setBounds(510, 470, 196, 126);

			pzname[0].setBounds(10, 190, 196, 20); 
			pzname[1].setBounds(260, 190, 196, 20); 
			pzname[2].setBounds(510, 190, 196, 20); 
			pzname[3].setBounds(10, 400, 196, 20); 
			pzname[4].setBounds(260, 400, 196, 20); 
			pzname[5].setBounds(510, 400, 196, 20);
			pzname[6].setBounds(10, 610, 196, 20); 
			pzname[7].setBounds(260, 610, 196, 20);
			pzname[8].setBounds(510, 610, 196, 20); 

			pzorder[0].setBounds(50, 212, 116, 35);
			pzorder[1].setBounds(300, 212, 116, 35);
			pzorder[2].setBounds(550, 212, 116, 35);
			pzorder[3].setBounds(50, 422, 116, 35);
			pzorder[4].setBounds(300, 422, 116, 35);
			pzorder[5].setBounds(550, 422, 116, 35);
			pzorder[6].setBounds(50, 632, 116, 35);
			pzorder[7].setBounds(300, 632, 116, 35);
			pzorder[8].setBounds(550, 632, 116, 35);
			
			pizpic.setBounds(0, 0, 750, 690);
			add(pizpic);		
			setSize(750, 750);
			setLocation(165, 100);
			setResizable(false);
			setVisible(false);
		}

		class PizzaAction implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == pzorder[0]) {
					if (select == 1) {
						money[0] += 9800;
						t1info[num[0]] = "고르곤졸라 피자";
						t1price[num[0]] = " 9.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 9800;
						t2info[num[1]] = "고르곤졸라 피자";
						t2price[num[1]] = " 9.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 9800;
						t3info[num[2]] = "고르곤졸라 피자";
						t3price[num[2]] = " 9.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 9800;
						t4info[num[3]] = "고르곤졸라 피자";
						t4price[num[3]] = " 9.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 9800;
						t5info[num[4]] = "고르곤졸라 피자";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 9800;
						t6info[num[5]] = "고르곤졸라 피자";
						t6price[num[5]] = " 9.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 9800;
						t7info[num[6]] = "고르곤졸라 피자";
						t7price[num[6]] = " 9.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 9800;
						t8info[num[7]] = "고르곤졸라 피자";
						t8price[num[7]] = " 9.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 9800;
						t9info[num[8]] = "고르곤졸라 피자";
						t9price[num[8]] = " 9.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 9800;
						t10info[num[9]] = "고르곤졸라 피자";
						t10price[num[9]] = " 9.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 9800;
						t11info[num[10]] = "고르곤졸라 피자";
						t11price[num[10]] = " 9.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 9800;
						t12info[num[11]] = "고르곤졸라 피자";
						t12price[num[11]] = " 9.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == pzorder[1]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "달콤감자 피자";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "달콤감자 피자";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "달콤감자 피자";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "달콤감자 피자";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "달콤감자 피자";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "달콤감자 피자";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "달콤감자 피자";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "달콤감자 피자";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "달콤감자 피자";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "달콤감자 피자";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "달콤감자 피자";
						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "달콤감자 피자";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == pzorder[2]) {
					if (select == 1) {
						money[0] += 14800;
						t1info[num[0]] = "더블미트 피자";
						t1price[num[0]] = " 14.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 14800;
						t2info[num[1]] = "더블미트 피자";
						t2price[num[1]] = " 14.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 14800;
						t3info[num[2]] = "더블미트 피자";
						t3price[num[2]] = " 14.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 14800;
						t4info[num[3]] = "더블미트 피자";
						t4price[num[3]] = " 14.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 14800;
						t5info[num[4]] = "더블미트 피자";
						t5price[num[4]] = " 14.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 14800;
						t6info[num[5]] = "더블미트 피자";
						t6price[num[5]] = " 14.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 14800;
						t7info[num[6]] = "더블미트 피자";
						t7price[num[6]] = " 14.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 14800;
						t8info[num[7]] = "더블미트 피자";
						t8price[num[7]] = " 14.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 14800;
						t9info[num[8]] = "더블미트 피자";
						t9price[num[8]] = " 14.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 14800;
						t10info[num[9]] = "더블미트 피자";
						t10price[num[9]] = " 14.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 14800;
						t11info[num[10]] = "더블미트 피자";
						t11price[num[10]] = " 14.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 14800;
						t12info[num[11]] = "더블미트 피자";
						t12price[num[11]] = " 14.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == pzorder[3]) {
					if (select == 1) {
						money[0] += 14800;
						t1info[num[0]] = "더블포테이토 피자";
						t1price[num[0]] = " 14.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 14800;
						t2info[num[1]] = "더블포테이토 피자";
						t2price[num[1]] = " 14.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 14800;
						t3info[num[2]] = "더블포테이토 피자";
						t3price[num[2]] = " 14.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 14800;
						t4info[num[3]] = "더블포테이토 피자";
						t4price[num[3]] = " 14.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 14800;
						t5info[num[4]] = "더블포테이토 피자";
						t5price[num[4]] = " 14.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 14800;
						t6info[num[5]] = "더블포테이토 피자";
						t6price[num[5]] = " 14.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 14800;
						t7info[num[6]] = "더블포테이토 피자";
						t7price[num[6]] = " 14.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 14800;
						t8info[num[7]] = "더블포테이토 피자";
						t8price[num[7]] = " 14.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 14800;
						t9info[num[8]] = "더블포테이토 피자";
						t9price[num[8]] = " 14.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 14800;
						t10info[num[9]] = "더블포테이토 피자";
						t10price[num[9]] = " 14.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 14800;
						t11info[num[10]] = "더블포테이토 피자";
						t11price[num[10]] = " 14.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 14800;
						t12info[num[11]] = "더블포테이토 피자";
						t12price[num[11]] = " 14.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == pzorder[4]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "불고구마 피자";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "불고구마 피자";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "불고구마 피자";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "불고구마 피자";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "불고구마 피자";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "불고구마 피자";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "불고구마 피자";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "불고구마 피자";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "불고구마 피자";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "불고구마 피자";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "불고구마 피자";
						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "불고구마 피자";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == pzorder[5]) {
					if (select == 1) {
						money[0] += 14800;
						t1info[num[0]] = "스테이크샐러드 피자";
						t1price[num[0]] = " 14.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 14800;
						t2info[num[1]] = "스테이크샐러드 피자";
						t2price[num[1]] = " 14.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 14800;
						t3info[num[2]] = "스테이크샐러드 피자";
						t3price[num[2]] = " 14.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 14800;
						t4info[num[3]] = "스테이크샐러드 피자";
						t4price[num[3]] = " 14.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 14800;
						t5info[num[4]] = "스테이크샐러드 피자";
						t5price[num[4]] = " 14.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 14800;
						t6info[num[5]] = "스테이크샐러드 피자";
						t6price[num[5]] = " 14.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 14800;
						t7info[num[6]] = "스테이크샐러드 피자";
						t7price[num[6]] = " 14.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 14800;
						t8info[num[7]] = "스테이크샐러드 피자";
						t8price[num[7]] = " 14.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 14800;
						t9info[num[8]] = "스테이크샐러드 피자";
						t9price[num[8]] = " 14.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 14800;
						t10info[num[9]] = "스테이크샐러드 피자";
						t10price[num[9]] = " 14.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 14800;
						t11info[num[10]] = "스테이크샐러드 피자";
						t11price[num[10]] = " 14.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 14800;
						t12info[num[11]] = "스테이크샐러드 피자";
						t12price[num[11]] = " 14.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == pzorder[6]) {
					if (select == 1) {
						money[0] += 13800;
						t1info[num[0]] = "스텔라 피자";
						t1price[num[0]] = " 13.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 13800;
						t2info[num[1]] = "스텔라 피자";
						t2price[num[1]] = " 13.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 13800;
						t3info[num[2]] = "스텔라 피자";
						t3price[num[2]] = " 13.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 13800;
						t4info[num[3]] = "스텔라 피자";
						t4price[num[3]] = " 13.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 13800;
						t5info[num[4]] = "스텔라 피자";
						t5price[num[4]] = " 13.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 13800;
						t6info[num[5]] = "스텔라 피자";
						t6price[num[5]] = " 13.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 13800;
						t7info[num[6]] = "스텔라 피자";
						t7price[num[6]] = " 13.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 13800;
						t8info[num[7]] = "스텔라 피자";
						t8price[num[7]] = " 13.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 13800;
						t9info[num[8]] = "스텔라 피자";
						t9price[num[8]] = " 13.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 13800;
						t10info[num[9]] = "스텔라 피자";
						t10price[num[9]] = " 13.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 13800;
						t11info[num[10]] = "스텔라 피자";
						t11price[num[10]] = " 13.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 13800;
						t12info[num[11]] = "스텔라 피자";
						t12price[num[11]] = " 13.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == pzorder[7]) {
					if (select == 1) {
						money[0] += 14800;
						t1info[num[0]] = "애플시나몬 피자";
						t1price[num[0]] = " 14.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 14800;
						t2info[num[1]] = "애플시나몬 피자";
						t2price[num[1]] = " 14.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 14800;
						t3info[num[2]] = "애플시나몬 피자";
						t3price[num[2]] = " 14.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 14800;
						t4info[num[3]] = "애플시나몬 피자";
						t4price[num[3]] = " 14.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 14800;
						t5info[num[4]] = "애플시나몬 피자";
						t5price[num[4]] = " 14.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 14800;
						t6info[num[5]] = "애플시나몬 피자";
						t6price[num[5]] = " 14.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 14800;
						t7info[num[6]] = "애플시나몬 피자";
						t7price[num[6]] = " 14.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 14800;
						t8info[num[7]] = "애플시나몬 피자";
						t8price[num[7]] = " 14.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 14800;
						t9info[num[8]] = "애플시나몬 피자";
						t9price[num[8]] = " 14.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 14800;
						t10info[num[9]] = "애플시나몬 피자";
						t10price[num[9]] = " 14.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 14800;
						t11info[num[10]] = "애플시나몬 피자";
						t11price[num[10]] = " 14.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 14800;
						t12info[num[11]] = "애플시나몬 피자";
						t12price[num[11]] = " 14.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == pzorder[8]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "토마토미드 피자";
						t1price[num[0]] = " 19.800";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "토마토미드 피자";
						t2price[num[1]] = " 19.800";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "토마토미드 피자";
						t3price[num[2]] = " 19.800";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "토마토미드 피자";
						t4price[num[3]] = " 19.800";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "토마토미드 피자";
						t5price[num[4]] = " 19.800";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "토마토미드 피자";
						t6price[num[5]] = " 19.800";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "토마토미드 피자";
						t7price[num[6]] = " 19.800";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "토마토미드 피자";
						t8price[num[7]] = " 19.800";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "토마토미드 피자";
						t9price[num[8]] = " 19.800";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "토마토미드 피자";
						t10price[num[9]] = " 19.800";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "토마토미드 피자";
						t11price[num[10]] = " 19.800";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "토마토미드 피자";
						t12price[num[11]] = " 19.800";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				}
			}
		}
	}

	class SidePanel extends JDialog {
		SidePanel() {
			setTitle("SIDE MENU");
			getContentPane();
			setLayout(null);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setModal(true);
			sidelabel[0] = new JLabel(new ImageIcon("side/갈릭브레드.jpg"));
			sidelabel[1] = new JLabel(new ImageIcon("side/리코타그린샐러드.jpg"));
			sidelabel[2] = new JLabel(new ImageIcon("side/연어샐러드.jpg"));
			sidelabel[3] = new JLabel(new ImageIcon("side/치킨텐더샐러드.jpg"));
			sidelabel[4] = new JLabel(new ImageIcon("side/칠리피즈프라이.jpg"));
			sidelabel[5] = new JLabel(new ImageIcon("side/프렌치프라이.jpg"));

			sdname[0] = new JLabel("갈릭 브레드(2EA) -1.000", JLabel.CENTER);
			sdname[1] = new JLabel("리코타 그린 샐러드  -12.000", JLabel.CENTER);
			sdname[2] = new JLabel("연어 샐러드 -12.000", JLabel.CENTER);
			sdname[3] = new JLabel("치킨텐더 샐러드 -12.000", JLabel.CENTER);
			sdname[4] = new JLabel("칠리피즈 프라이 -12.000", JLabel.CENTER);
			sdname[5] = new JLabel("프렌치 프라이 -4.000", JLabel.CENTER);
			
			for(int i=0; i<6; i++){
				sdorder[i] = new JButton(orderimg);
				sdname[i].setForeground(Color.WHITE);
				sdorder[i].addActionListener(new SideAction());
				sidepic.add(sidelabel[i]);
				sidepic.add(sdname[i]);
				sidepic.add(sdorder[i]);
			}
			
			sidelabel[0].setBounds(10, 50, 196, 126);
			sidelabel[1].setBounds(260, 50, 196, 126);
			sidelabel[2].setBounds(510, 50, 196, 126);
			sidelabel[3].setBounds(10, 260, 196, 126);
			sidelabel[4].setBounds(260, 260, 196, 126);
			sidelabel[5].setBounds(510, 260, 196, 126);

			sdname[0].setBounds(10, 190, 196, 20); 
			sdname[1].setBounds(260, 190, 196, 20); 
			sdname[2].setBounds(510, 190, 196, 20); 
			sdname[3].setBounds(10, 400, 196, 20);
			sdname[4].setBounds(260, 400, 196, 20); 
			sdname[5].setBounds(510, 400, 196, 20);

			sdorder[0].setBounds(50, 212, 116, 35);
			sdorder[1].setBounds(300, 212, 116, 35);
			sdorder[2].setBounds(550, 212, 116, 35);
			sdorder[3].setBounds(50, 422, 116, 35);
			sdorder[4].setBounds(300, 422, 116, 35);
			sdorder[5].setBounds(550, 422, 116, 35);
			
			sidepic.setBounds(0, 0, 750, 690);
			add(sidepic);

			setSize(750, 690);
			setResizable(false);
			setLocation(165, 100);
			setVisible(false);
		}

		class SideAction implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == sdorder[0]) {
					if (select == 1) {
						money[0] += 1000;
						t1info[num[0]] = "갈릭 브레드(2EA)";
						t1price[num[0]] = " 1.000";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 1000;
						t2info[num[1]] = "갈릭 브레드(2EA)";
						t2price[num[1]] = " 1.000";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 1000;
						t3info[num[2]] = "갈릭 브레드(2EA)";
						t3price[num[2]] = " 1.000";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 1000;
						t4info[num[3]] = "갈릭 브레드(2EA)";
						t4price[num[3]] = " 1.000";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 1000;
						t5info[num[4]] = "갈릭 브레드(2EA)";
						t5price[num[4]] = " 1.000";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 1000;
						t6info[num[5]] = "갈릭 브레드(2EA)";
						t6price[num[5]] = " 1.000";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 1000;
						t7info[num[6]] = "갈릭 브레드(2EA)";
						t7price[num[6]] = " 1.000";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 1000;
						t8info[num[7]] = "갈릭 브레드(2EA)";
						t8price[num[7]] = " 1.000";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 1000;
						t9info[num[8]] = "갈릭 브레드(2EA)";
						t9price[num[8]] = " 1.000";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 1000;
						t10info[num[9]] = "갈릭 브레드(2EA)";
						t10price[num[9]] = " 1.000";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 1000;
						t11info[num[10]] = "갈릭 브레드(2EA)";
						t11price[num[10]] = " 1.000";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 1000;
						t12info[num[11]] = "갈릭 브레드(2EA)";
						t12price[num[11]] = " 1.000";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == sdorder[1]) {
					if (select == 1) {
						money[0] += 12000;
						t1info[num[0]] = "리코타 그린 샐러드";
						t1price[num[0]] = " 12.000";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 12000;
						t2info[num[1]] = "리코타 그린 샐러드";
						t2price[num[1]] = " 12.000";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 12000;
						t3info[num[2]] = "리코타 그린 샐러드";
						t3price[num[2]] = " 12.000";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 12000;
						t4info[num[3]] = "리코타 그린 샐러드";
						t4price[num[3]] = " 12.000";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 12000;
						t5info[num[4]] = "리코타 그린 샐러드";
						t5price[num[4]] = " 12.000";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 12000;
						t6info[num[5]] = "리코타 그린 샐러드";
						t6price[num[5]] = " 12.000";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 12000;
						t7info[num[6]] = "리코타 그린 샐러드";
						t7price[num[6]] = " 12.000";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 12000;
						t8info[num[7]] = "리코타 그린 샐러드";
						t8price[num[7]] = " 12.000";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 12000;
						t9info[num[8]] = "리코타 그린 샐러드";
						t9price[num[8]] = " 12.000";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 12000;
						t10info[num[9]] = "리코타 그린 샐러드";
						t10price[num[9]] = " 12.000";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 12000;
						t11info[num[10]] = "리코타 그린 샐러드";
						t11price[num[10]] = " 12.000";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 12000;
						t12info[num[11]] = "리코타 그린 샐러드";
						t12price[num[11]] = " 12.000";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == sdorder[2]) {
					if (select == 1) {
						money[0] += 12000;
						t1info[num[0]] = "연어 샐러드";
						t1price[num[0]] = " 12.000";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 12000;
						t2info[num[1]] = "연어 샐러드";
						t2price[num[1]] = " 12.000";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 12000;
						t3info[num[2]] = "연어 샐러드";
						t3price[num[2]] = " 12.000";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 12000;
						t4info[num[3]] = "연어 샐러드";
						t4price[num[3]] = " 12.000";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 12000;
						t5info[num[4]] = "연어 샐러드";
						t5price[num[4]] = " 12.000";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 12000;
						t6info[num[5]] = "연어 샐러드";
						t6price[num[5]] = " 12.000";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 12000;
						t7info[num[6]] = "연어 샐러드";
						t7price[num[6]] = " 12.000";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 12000;
						t8info[num[7]] = "연어 샐러드";
						t8price[num[7]] = " 12.000";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 12000;
						t9info[num[8]] = "연어 샐러드";
						t9price[num[8]] = " 12.000";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 12000;
						t10info[num[9]] = "연어 샐러드";
						t10price[num[9]] = " 12.000";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 12000;
						t11info[num[10]] = "연어 샐러드";
						t11price[num[10]] = " 12.000";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 12000;
						t12info[num[11]] = "연어 샐러드";
						t12price[num[11]] = " 12.000";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == sdorder[3]) {
					if (select == 1) {
						money[0] += 12000;
						t1info[num[0]] = "치킨텐더 샐러드";
						t1price[num[0]] = " 12.000";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 12000;
						t2info[num[1]] = "치킨텐더 샐러드";
						t2price[num[1]] = " 12.000";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 12000;
						t3info[num[2]] = "치킨텐더 샐러드";
						t3price[num[2]] = " 12.000";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 12000;
						t4info[num[3]] = "치킨텐더 샐러드";
						t4price[num[3]] = " 12.000";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 12000;
						t5info[num[4]] = "치킨텐더 샐러드";
						t5price[num[4]] = " 12.000";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 12000;
						t6info[num[5]] = "치킨텐더 샐러드";
						t6price[num[5]] = " 12.000";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 12000;
						t7info[num[6]] = "치킨텐더 샐러드";
						t7price[num[6]] = " 12.000";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 12000;
						t8info[num[7]] = "치킨텐더 샐러드";
						t8price[num[7]] = " 12.000";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 12000;
						t9info[num[8]] = "치킨텐더 샐러드";
						t9price[num[8]] = " 12.000";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 12000;
						t10info[num[9]] = "치킨텐더 샐러드";
						t10price[num[9]] = " 12.000";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 12000;
						t11info[num[10]] = "치킨텐더 샐러드";
						t11price[num[10]] = " 12.000";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 12000;
						t12info[num[11]] = "치킨텐더 샐러드";
						t12price[num[11]] = " 12.000";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == sdorder[4]) {
					if (select == 1) {
						money[0] += 12000;
						t1info[num[0]] = "칠리피즈 프라이";
						t1price[num[0]] = " 12.000";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 12000;
						t2info[num[1]] = "칠리피즈 프라이";
						t2price[num[1]] = " 12.000";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 12000;
						t3info[num[2]] = "칠리피즈 프라이";
						t3price[num[2]] = " 12.000";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 12000;
						t4info[num[3]] = "칠리피즈 프라이";
						t4price[num[3]] = " 12.000";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 12000;
						t5info[num[4]] = "칠리피즈 프라이";
						t5price[num[4]] = " 12.000";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 12000;
						t6info[num[5]] = "칠리피즈 프라이";
						t6price[num[5]] = " 12.000";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 12000;
						t7info[num[6]] = "칠리피즈 프라이";
						t7price[num[6]] = " 12.000";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 12000;
						t8info[num[7]] = "칠리피즈 프라이";
						t8price[num[7]] = " 12.000";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 12000;
						t9info[num[8]] = "칠리피즈 프라이";
						t9price[num[8]] = " 12.000";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 12000;
						t10info[num[9]] = "칠리피즈 프라이";
						t10price[num[9]] = " 12.000";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 12000;
						t11info[num[10]] = "칠리피즈 프라이";
						t11price[num[10]] = " 12.000";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 12000;
						t12info[num[11]] = "칠리피즈 프라이";
						t12price[num[11]] = " 12.000";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == sdorder[5]) {
					if (select == 1) {
						money[0] += 4000;
						t1info[num[0]] = "프렌치 프라이";
						t1price[num[0]] = " 4.000";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 4000;
						t2info[num[1]] = "프렌치 프라이";
						t2price[num[1]] = " 4.000";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 4000;
						t3info[num[2]] = "프렌치 프라이";
						t3price[num[2]] = " 4.000";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 4000;
						t4info[num[3]] = "프렌치 프라이";
						t4price[num[3]] = " 4.000";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 4000;
						t5info[num[4]] = "프렌치 프라이";
						t5price[num[4]] = " 4.000";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 4000;
						t6info[num[5]] = "프렌치 프라이";
						t6price[num[5]] = " 4.000";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 4000;
						t7info[num[6]] = "프렌치 프라이";
						t7price[num[6]] = " 4.000";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 4000;
						t8info[num[7]] = "프렌치 프라이";
						t8price[num[7]] = " 4.000";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 4000;
						t9info[num[8]] = "프렌치 프라이";
						t9price[num[8]] = " 4.000";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 4000;
						t10info[num[9]] = "프렌치 프라이";
						t10price[num[9]] = " 4.000";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 4000;
						t11info[num[10]] = "프렌치 프라이";
						t11price[num[10]] = " 4.000";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 4000;
						t12info[num[11]] = "프렌치 프라이";
						t12price[num[11]] = " 4.000";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				}
			}
		}
	}

	class DrinkPanel extends JDialog {
		DrinkPanel() {
			setTitle("BEVERAGE");
			getContentPane();
			setLayout(null);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setModal(true);
			drinklabel[0] = new JLabel(new ImageIcon("drink/딸기에이드.jpg"));
			drinklabel[1] = new JLabel(new ImageIcon("drink/라즈베리에이드.jpg"));
			drinklabel[2] = new JLabel(new ImageIcon("drink/레모네이드.jpg"));
			drinklabel[3] = new JLabel(new ImageIcon("drink/망고에이드.jpg"));
			drinklabel[4] = new JLabel(new ImageIcon("drink/한라봉에이드.jpg"));
			drinklabel[5] = new JLabel(new ImageIcon("drink/자몽에이드.jpg"));
			drinklabel[6] = new JLabel(new ImageIcon("drink/청순청포도.jpg"));
			drinklabel[7] = new JLabel(new ImageIcon("drink/체리에이드.jpg"));
			drinklabel[8] = new JLabel(new ImageIcon("drink/콜라.jpg"));
			drinklabel[9] = new JLabel(new ImageIcon("drink/사이다.jpg"));
			drinklabel[10] = new JLabel(new ImageIcon("drink/환타파인.jpg"));
			dkname[0] = new JLabel("딸기 에이드 - 7.000", JLabel.CENTER);
			dkname[1] = new JLabel("라즈베리 에이드 - 7.000", JLabel.CENTER);
			dkname[2] = new JLabel("레모네이드 - 7.000", JLabel.CENTER);
			dkname[3] = new JLabel("망고 에이드 - 7.000", JLabel.CENTER);
			dkname[4] = new JLabel("한라봉 에이드 - 7.000", JLabel.CENTER);
			dkname[5] = new JLabel("자몽에이드 - 7.000", JLabel.CENTER);
			dkname[6] = new JLabel("청포도 에이드 - 7.000", JLabel.CENTER);
			dkname[7] = new JLabel("체리 에이드 - 7.000", JLabel.CENTER);
			dkname[8] = new JLabel("콜라 - 2.000", JLabel.CENTER);
			dkname[9] = new JLabel("사이다 - 2.000", JLabel.CENTER);
			dkname[10] = new JLabel("환타 (파인) - 2.000", JLabel.CENTER);
			
			for(int i=0; i<11; i++){
				dkorder[i] = new JButton(orderimg);
				dkname[i].setForeground(Color.WHITE);
				dkorder[i].addActionListener(new DrinkAction());
				drinkpic.add(drinklabel[i]);
				drinkpic.add(dkname[i]);
				drinkpic.add(dkorder[i]);
			}

			drinklabel[0].setBounds(10, 50, 168, 108);
			drinklabel[1].setBounds(195, 50, 168, 108);
			drinklabel[2].setBounds(375, 50, 168, 108);
			drinklabel[3].setBounds(555, 50, 168, 108);
			drinklabel[4].setBounds(10, 250, 168, 108);
			drinklabel[5].setBounds(195, 250, 168, 108);
			drinklabel[6].setBounds(375, 250, 168, 108);
			drinklabel[7].setBounds(555, 250, 168, 108);
			drinklabel[8].setBounds(10, 460, 168, 108);
			drinklabel[9].setBounds(195, 460, 168, 108);
			drinklabel[10].setBounds(375, 460, 168, 108);

			dkname[0].setBounds(10, 160, 175, 20); 
			dkname[1].setBounds(195, 160, 175, 20); 
			dkname[2].setBounds(375, 160, 175, 20); 
			dkname[3].setBounds(555, 160, 175, 20); 
			dkname[4].setBounds(10, 360, 175, 20); 
			dkname[5].setBounds(195, 360, 175, 20); 
			dkname[6].setBounds(375, 360, 175, 20); 
			dkname[7].setBounds(555, 360, 175, 20);
			dkname[8].setBounds(10, 570, 175, 20); 
			dkname[9].setBounds(195, 570, 175, 20); 
			dkname[10].setBounds(375, 570, 175, 20); 

			dkorder[0].setBounds(40, 190, 116, 30);
			dkorder[1].setBounds(220, 190, 116, 30);
			dkorder[2].setBounds(400, 190, 116, 30);
			dkorder[3].setBounds(585, 190, 116, 30);
			dkorder[4].setBounds(40, 390, 116, 30);
			dkorder[5].setBounds(220, 390, 116, 30);
			dkorder[6].setBounds(400, 390, 116, 30);
			dkorder[7].setBounds(585, 390, 116, 30);
			dkorder[8].setBounds(40, 600, 116, 30);
			dkorder[9].setBounds(220, 600, 116, 30);
			dkorder[10].setBounds(400, 600, 116, 30);
			
			drinkpic.setBounds(0, 0, 750, 690);
			add(drinkpic);

			setLocation(165, 100);
			setResizable(false);
			setSize(750, 690);
			setVisible(false);
		}

		class DrinkAction implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == dkorder[0]) {
					if (select == 1) {
						money[0] += 7000;
						t1info[num[0]] = "딸기 에이드";
						t1price[num[0]] = " 7.000";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 7000;
						t2info[num[1]] = "딸기 에이드";
						t2price[num[1]] = " 7.000";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 7000;
						t3info[num[2]] = "딸기 에이드";
						t3price[num[2]] = " 7.000";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 7000;
						t4info[num[3]] = "딸기 에이드";
						t4price[num[3]] = " 7.000";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 7000;
						t5info[num[4]] = "딸기 에이드";
						t5price[num[4]] = " 7.000";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 7000;
						t6info[num[5]] = "딸기 에이드";
						t6price[num[5]] = " 7.000";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 7000;
						t7info[num[6]] = "딸기 에이드";
						t7price[num[6]] = " 7.000";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 7000;
						t8info[num[7]] = "딸기 에이드";
						t8price[num[7]] = " 7.000";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 7000;
						t9info[num[8]] = "딸기 에이드";
						t9price[num[8]] = " 7.000";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 7000;
						t10info[num[9]] = "딸기 에이드";
						t10price[num[9]] = " 7.000";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 7000;
						t11info[num[10]] = "딸기 에이드";
						t11price[num[10]] = " 7.000";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 7000;
						t12info[num[11]] = "딸기 에이드";
						t12price[num[11]] = " 7.000";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == dkorder[1]) {
					if (select == 1) {
						money[0] += 7000;
						t1info[num[0]] = "라즈베리 에이드";
						t1price[num[0]] = " 7.000";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 7000;
						t2info[num[1]] = "라즈베리 에이드";
						t2price[num[1]] = " 7.000";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 7000;
						t3info[num[2]] = "라즈베리 에이드";
						t3price[num[2]] = " 7.000";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 7000;
						t4info[num[3]] = "라즈베리 에이드";
						t4price[num[3]] = " 7.000";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 7000;
						t5info[num[4]] = "라즈베리 에이드";
						t5price[num[4]] = " 7.000";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 7000;
						t6info[num[5]] = "라즈베리 에이드";
						t6price[num[5]] = " 7.000";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 7000;
						t7info[num[6]] = "라즈베리 에이드";
						t7price[num[6]] = " 7.000";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 7000;
						t8info[num[7]] = "라즈베리 에이드";
						t8price[num[7]] = " 7.000";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 7000;
						t9info[num[8]] = "라즈베리 에이드";
						t9price[num[8]] = " 7.000";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 7000;
						t10info[num[9]] = "라즈베리 에이드";
						t10price[num[9]] = " 7.000";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 7000;
						t11info[num[10]] = "라즈베리 에이드";
						t11price[num[10]] = " 7.000";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 7000;
						t12info[num[11]] = "라즈베리 에이드";
						t12price[num[11]] = " 7.000";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == dkorder[2]) {
					if (select == 1) {
						money[0] += 7000;
						t1info[num[0]] = "레모네이드";
						t1price[num[0]] = " 7.000";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 7000;
						t2info[num[1]] = "레모네이드";
						t2price[num[1]] = " 7.000";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 7000;
						t3info[num[2]] = "레모네이드";
						t3price[num[2]] = " 7.000";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 7000;
						t4info[num[3]] = "레모네이드";
						t4price[num[3]] = " 7.000";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 7000;
						t5info[num[4]] = "레모네이드";
						t5price[num[4]] = " 7.000";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 7000;
						t6info[num[5]] = "레모네이드";
						t6price[num[5]] = " 7.000";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 7000;
						t7info[num[6]] = "레모네이드";
						t7price[num[6]] = " 7.000";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 7000;
						t8info[num[7]] = "레모네이드";
						t8price[num[7]] = " 7.000";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 7000;
						t9info[num[8]] = "레모네이드";
						t9price[num[8]] = " 7.000";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 7000;
						t10info[num[9]] = "레모네이드";
						t10price[num[9]] = " 7.000";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 7000;
						t11info[num[10]] = "레모네이드";
						t11price[num[10]] = " 7.000";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 7000;
						t12info[num[11]] = "레모네이드";
						t12price[num[11]] = " 7.000";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == dkorder[3]) {
					if (select == 1) {
						money[0] += 7000;
						t1info[num[0]] = "망고 에이드";
						t1price[num[0]] = " 7.000";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 7000;
						t2info[num[1]] = "망고 에이드";
						t2price[num[1]] = " 7.000";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 7000;
						t3info[num[2]] = "망고 에이드";
						t3price[num[2]] = " 7.000";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 7000;
						t4info[num[3]] = "망고 에이드";
						t4price[num[3]] = " 7.000";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 7000;
						t5info[num[4]] = "망고 에이드";
						t5price[num[4]] = " 7.000";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 7000;
						t6info[num[5]] = "망고 에이드";
						t6price[num[5]] = " 7.000";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 7000;
						t7info[num[6]] = "망고 에이드";
						t7price[num[6]] = " 7.000";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 7000;
						t8info[num[7]] = "망고 에이드";
						t8price[num[7]] = " 7.000";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 7000;
						t9info[num[8]] = "망고 에이드";
						t9price[num[8]] = " 7.000";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 7000;
						t10info[num[9]] = "망고 에이드";
						t10price[num[9]] = " 7.000";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 7000;
						t11info[num[10]] = "망고 에이드";
						t11price[num[10]] = " 7.000";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 7000;
						t12info[num[11]] = "망고 에이드";
						t12price[num[11]] = " 7.000";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == dkorder[4]) {
					if (select == 1) {
						money[0] += 7000;
						t1info[num[0]] = "한라봉 에이드";
						t1price[num[0]] = " 7.000";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 7000;
						t2info[num[1]] = "한라봉 에이드";
						t2price[num[1]] = " 7.000";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 7000;
						t3info[num[2]] = "한라봉 에이드";
						t3price[num[2]] = " 7.000";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 7000;
						t4info[num[3]] = "한라봉 에이드";
						t4price[num[3]] = " 7.000";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 7000;
						t5info[num[4]] = "한라봉 에이드";
						t5price[num[4]] = " 7.000";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 7000;
						t6info[num[5]] = "한라봉 에이드";
						t6price[num[5]] = " 7.000";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 7000;
						t7info[num[6]] = "한라봉 에이드";
						t7price[num[6]] = " 7.000";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 7000;
						t8info[num[7]] = "한라봉 에이드";
						t8price[num[7]] = " 7.000";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 7000;
						t9info[num[8]] = "한라봉 에이드";
						t9price[num[8]] = " 7.000";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 7000;
						t10info[num[9]] = "한라봉 에이드";
						t10price[num[9]] = " 7.000";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 7000;
						t11info[num[10]] = "한라봉 에이드";
						t11price[num[10]] = " 7.000";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 7000;
						t12info[num[11]] = "한라봉 에이드";
						t12price[num[11]] = " 7.000";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == dkorder[5]) {
					if (select == 1) {
						money[0] += 7000;
						t1info[num[0]] = "자몽에이드";
						t1price[num[0]] = " 7.000";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 7000;
						t2info[num[1]] = "자몽에이드";
						t2price[num[1]] = " 7.000";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 7000;
						t3info[num[2]] = "자몽에이드";
						t3price[num[2]] = " 7.000";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 7000;
						t4info[num[3]] = "자몽에이드";
						t4price[num[3]] = " 7.000";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 7000;
						t5info[num[4]] = "자몽에이드";
						t5price[num[4]] = " 7.000";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 7000;
						t6info[num[5]] = "자몽에이드";
						t6price[num[5]] = " 7.000";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 7000;
						t7info[num[6]] = "자몽에이드";
						t7price[num[6]] = " 7.000";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 7000;
						t8info[num[7]] = "자몽에이드";
						t8price[num[7]] = " 7.000";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 7000;
						t9info[num[8]] = "자몽에이드";
						t9price[num[8]] = " 7.000";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 7000;
						t10info[num[9]] = "자몽에이드";
						t10price[num[9]] = " 7.000";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 7000;
						t11info[num[10]] = "자몽에이드";
						t11price[num[10]] = " 7.000";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 7000;
						t12info[num[11]] = "자몽에이드";
						t12price[num[11]] = " 7.000";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == dkorder[6]) {
					if (select == 1) {
						money[0] += 7000;
						t1info[num[0]] = "청포도 에이드";
						t1price[num[0]] = " 7.000";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 7000;
						t2info[num[1]] = "청포도 에이드";
						t2price[num[1]] = " 7.000";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 7000;
						t3info[num[2]] = "청포도 에이드";
						t3price[num[2]] = " 7.000";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 7000;
						t4info[num[3]] = "청포도 에이드";
						t4price[num[3]] = " 7.000";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 7000;
						t5info[num[4]] = "청포도 에이드";
						t5price[num[4]] = " 7.000";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 7000;
						t6info[num[5]] = "청포도 에이드";
						t6price[num[5]] = " 7.000";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 7000;
						t7info[num[6]] = "청포도 에이드";
						t7price[num[6]] = " 7.000";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 7000;
						t8info[num[7]] = "청포도 에이드";
						t8price[num[7]] = " 7.000";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 7000;
						t9info[num[8]] = "청포도 에이드";
						t9price[num[8]] = " 7.000";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 7000;
						t10info[num[9]] = "청포도 에이드";
						t10price[num[9]] = " 7.000";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 7000;
						t11info[num[10]] = "청포도 에이드";
						t11price[num[10]] = " 7.000";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 7000;
						t12info[num[11]] = "청포도 에이드";
						t12price[num[11]] = " 7.000";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == dkorder[7]) {
					if (select == 1) {
						money[0] += 7000;
						t1info[num[0]] = "체리 에이드";
						t1price[num[0]] = " 7.000";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 7000;
						t2info[num[1]] = "체리 에이드";
						t2price[num[1]] = " 7.000";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 7000;
						t3info[num[2]] = "체리 에이드";
						t3price[num[2]] = " 7.000";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 7000;
						t4info[num[3]] = "체리 에이드";
						t4price[num[3]] = " 7.000";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 7000;
						t5info[num[4]] = "체리 에이드";
						t5price[num[4]] = " 7.000";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 7000;
						t6info[num[5]] = "체리 에이드";
						t6price[num[5]] = " 7.000";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 7000;
						t7info[num[6]] = "체리 에이드";
						t7price[num[6]] = " 7.000";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 7000;
						t8info[num[7]] = "체리 에이드";
						t8price[num[7]] = " 7.000";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 7000;
						t9info[num[8]] = "체리 에이드";
						t9price[num[8]] = " 7.000";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 7000;
						t10info[num[9]] = "체리 에이드";
						t10price[num[9]] = " 7.000";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 7000;
						t11info[num[10]] = "체리 에이드";
						t11price[num[10]] = " 7.000";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 7000;
						t12info[num[11]] = "체리 에이드";
						t12price[num[11]] = " 7.000";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == dkorder[8]) {
					if (select == 1) {
						money[0] += 2000;
						t1info[num[0]] = "콜라";
						t1price[num[0]] = " 2.000";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 2000;
						t2info[num[1]] = "콜라";
						t2price[num[1]] = " 2.000";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 2000;
						t3info[num[2]] = "콜라";
						t3price[num[2]] = " 2.000";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 2000;
						t4info[num[3]] = "콜라";
						t4price[num[3]] = " 2.000";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 2000;
						t5info[num[4]] = "콜라";
						t5price[num[4]] = " 2.000";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 2000;
						t6info[num[5]] = "콜라";
						t6price[num[5]] = " 2.000";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 2000;
						t7info[num[6]] = "콜라";
						t7price[num[6]] = " 2.000";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 2000;
						t8info[num[7]] = "콜라";
						t8price[num[7]] = " 2.000";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 2000;
						t9info[num[8]] = "콜라";
						t9price[num[8]] = " 2.000";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 2000;
						t10info[num[9]] = "콜라";
						t10price[num[9]] = " 2.000";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 2000;
						t11info[num[10]] = "콜라";
						t11price[num[10]] = " 2.000";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 2000;
						t12info[num[11]] = "콜라";
						t12price[num[11]] = " 2.000";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == dkorder[9]) {
					if (select == 1) {
						money[0] += 2000;
						t1info[num[0]] = "사이다";
						t1price[num[0]] = " 2.000";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 2000;
						t2info[num[1]] = "사이다";
						t2price[num[1]] = " 2.000";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 2000;
						t3info[num[2]] = "사이다";
						t3price[num[2]] = " 2.000";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 2000;
						t4info[num[3]] = "사이다";
						t4price[num[3]] = " 2.000";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 2000;
						t5info[num[4]] = "사이다";
						t5price[num[4]] = " 2.000";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 2000;
						t6info[num[5]] = "사이다";
						t6price[num[5]] = " 2.000";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 2000;
						t7info[num[6]] = "사이다";
						t7price[num[6]] = " 2.000";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 2000;
						t8info[num[7]] = "사이다";
						t8price[num[7]] = " 2.000";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 2000;
						t9info[num[8]] = "사이다";
						t9price[num[8]] = " 2.000";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 2000;
						t10info[num[9]] = "사이다";
						t10price[num[9]] = " 2.000";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 2000;
						t11info[num[10]] = "사이다";
						t11price[num[10]] = " 2.000";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 2000;
						t12info[num[11]] = "사이다";
						t12price[num[11]] = " 2.000";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == dkorder[10]) {
					if (select == 1) {
						money[0] += 2000;
						t1info[num[0]] = "환타 (파인)";
						t1price[num[0]] = " 2.000";
						System.out.println("주문 음식 : " + t1info[num[0]] + " 합계금액 : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 2000;
						t2info[num[1]] = "환타 (파인)";
						t2price[num[1]] = " 2.000";
						System.out.println("주문 음식 : " + t2info[num[1]] + " 합계금액 : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 2000;
						t3info[num[2]] = "환타 (파인)";
						t3price[num[2]] = " 2.000";
						System.out.println("주문 음식 : " + t3info[num[2]] + " 합계금액 : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 2000;
						t4info[num[3]] = "환타 (파인)";
						t4price[num[3]] = " 2.000";
						System.out.println("주문 음식 : " + t4info[num[3]] + " 합계금액 : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 2000;
						t5info[num[4]] = "환타 (파인)";
						t5price[num[4]] = " 2.000";
						System.out.println("주문 음식 : " + t5info[num[4]] + " 합계금액 : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 2000;
						t6info[num[5]] = "환타 (파인)";
						t6price[num[5]] = " 2.000";
						System.out.println("주문 음식 : " + t6info[num[5]] + " 합계금액 : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 2000;
						t7info[num[6]] = "환타 (파인)";
						t7price[num[6]] = " 2.000";
						System.out.println("주문 음식 : " + t7info[num[6]] + " 합계금액 : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 2000;
						t8info[num[7]] = "환타 (파인)";
						t8price[num[7]] = " 2.000";
						System.out.println("주문 음식 : " + t8info[num[7]] + " 합계금액 : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 2000;
						t9info[num[8]] = "환타 (파인)";
						t9price[num[8]] = " 2.000";
						System.out.println("주문 음식 : " + t9info[num[8]] + " 합계금액 : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 2000;
						t10info[num[9]] = "환타 (파인)";
						t10price[num[9]] = " 2.000";
						System.out.println("주문 음식 : " + t10info[num[9]] + " 합계금액 : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 2000;
						t11info[num[10]] = "환타 (파인)";
						t11price[num[10]] = " 2.000";
						System.out.println("주문 음식 : " + t11info[num[10]] + " 합계금액 : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 2000;
						t12info[num[11]] = "환타 (파인)";
						t12price[num[11]] = " 2.000";
						System.out.println("주문 음식 : " + t12info[num[11]] + " 합계금액 : " + money[11]);
						num[11]++;
					}
				}
			}
		}
	}

	class FoodMenu extends JDialog {
		JPanel menupanel = new JPanel();
		JLabel menull = new JLabel(new ImageIcon("menu/menu.jpg"));

		FoodMenu() {
			steak.setContentAreaFilled(false);
			pasta.setContentAreaFilled(false);
			pilaf.setContentAreaFilled(false);
			pizza.setContentAreaFilled(false);
			side.setContentAreaFilled(false);
			drink.setContentAreaFilled(false);
			endbtn.setContentAreaFilled(false);
			steak.addActionListener(new FoodAction());
			pasta.addActionListener(new FoodAction());
			pilaf.addActionListener(new FoodAction());
			pizza.addActionListener(new FoodAction());
			side.addActionListener(new FoodAction());
			drink.addActionListener(new FoodAction());
			endbtn.addActionListener(new FoodAction());
			getContentPane();
			setLayout(null);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			menupanel.setSize(160, 600);
			menupanel.setBackground(Color.WHITE);
			menupanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));
			menupanel.add(menull);
			menupanel.add(steak);
			menupanel.add(pasta);
			menupanel.add(pilaf);
			menupanel.add(pizza);
			menupanel.add(side);
			menupanel.add(drink);
			menupanel.add(endbtn);
			add(menupanel);
			endbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (select == 1) {
						if(money[0] > 0){
							lucknum[0] = (int)(Math.random()*10);
							tbtn[0].setBackground(Color.GREEN);
							tbtn[0].setForeground(Color.BLACK);
							mon1 = "금액: " + Integer.toString(money[0]) + " 원";
							tbtn[0].setText(mon1);
							tblabel2[0].setText("시간: " + nowDate);
						}						
					} else if (select == 2) {
						if(money[1] > 0){
							lucknum[1] = (int)(Math.random()*10);
							tbtn[1].setBackground(Color.GREEN);
							tbtn[1].setForeground(Color.BLACK);
							mon2 = "금액: " + Integer.toString(money[1]) + " 원";
							tbtn[1].setText(mon2);
							tblabel2[1].setText("시간: " + nowDate);
						}
					} else if (select == 3) {
						if(money[2] > 0){
							lucknum[2] = (int)(Math.random()*10);
							tbtn[2].setBackground(Color.GREEN);
							tbtn[2].setForeground(Color.BLACK);
							mon3 = "금액: " + Integer.toString(money[2]) + " 원";
							tbtn[2].setText(mon3);
							tblabel2[2].setText("시간: " + nowDate);
						}
					} else if (select == 4) {
						if(money[3] > 0){
							lucknum[3] = (int)(Math.random()*10);
							tbtn[3].setBackground(Color.GREEN);
							tbtn[3].setForeground(Color.BLACK);
							mon4 = "금액: " + Integer.toString(money[3]) + " 원";
							tbtn[3].setText(mon4);
							tblabel2[3].setText("시간: " + nowDate);
						}
					} else if (select == 5) {
						if(money[4] > 0){
							lucknum[4] = (int)(Math.random()*10);
							tbtn[4].setBackground(Color.GREEN);
							tbtn[4].setForeground(Color.BLACK);
							mon5 = "금액: " + Integer.toString(money[4]) + " 원";
							tbtn[4].setText(mon5);
							tblabel2[4].setText("시간: " + nowDate);
						}
					} else if (select == 6) {
						if(money[5] > 0){
							lucknum[5] = (int)(Math.random()*10);
							tbtn[5].setBackground(Color.GREEN);
							tbtn[5].setForeground(Color.BLACK);
							mon6 = "금액: " + Integer.toString(money[5]) + " 원";
							tbtn[5].setText(mon6);
							tblabel2[5].setText("시간: " + nowDate);
						}
					} else if (select == 7) {
						if(money[6] > 0){
							lucknum[6] = (int)(Math.random()*10);
							tbtn[6].setBackground(Color.GREEN);
							tbtn[6].setForeground(Color.BLACK);
							mon7 = "금액: " + Integer.toString(money[6]) + " 원";
							tbtn[6].setText(mon7);
							tblabel2[6].setText("시간: " + nowDate);
						}
					} else if (select == 8) {
						if(money[7] > 0){
							lucknum[7] = (int)(Math.random()*10);
							tbtn[7].setBackground(Color.GREEN);
							tbtn[7].setForeground(Color.BLACK);
							mon8 = "금액: " + Integer.toString(money[7]) + " 원";
							tbtn[7].setText(mon8);
							tblabel2[7].setText("시간: " + nowDate);
						}
					} else if (select == 9) {
						if(money[8] > 0){
							lucknum[8] = (int)(Math.random()*10);
							tbtn[8].setBackground(Color.GREEN);
							tbtn[8].setForeground(Color.BLACK);
							mon9 = "금액: " + Integer.toString(money[8]) + " 원";
							tbtn[8].setText(mon9);
							tblabel2[8].setText("시간: " + nowDate);
						}
					} else if (select == 10) {
						if(money[9] > 0){
							lucknum[9] = (int)(Math.random()*10);
							tbtn[9].setBackground(Color.GREEN);
							tbtn[9].setForeground(Color.BLACK);
							mon10 = "금액: " + Integer.toString(money[9]) + " 원";
							tbtn[9].setText(mon10);
							tblabel2[9].setText("시간: " + nowDate);
						}
					} else if (select == 11) {
						if(money[10] > 0){
							lucknum[10] = (int)(Math.random()*10);
							tbtn[10].setBackground(Color.GREEN);
							tbtn[10].setForeground(Color.BLACK);
							mon11 = "금액: " + Integer.toString(money[10]) + " 원";
							tbtn[10].setText(mon11);
							tblabel2[10].setText("시간: " + nowDate);
						}
					} else if (select == 12) {
						if(money[11] > 0){
							lucknum[11] = (int)(Math.random()*10);
							tbtn[11].setBackground(Color.GREEN);
							tbtn[11].setForeground(Color.BLACK);
							mon12 = "금액: " + Integer.toString(money[11]) + " 원";
							tbtn[11].setText(mon12);
							tblabel2[11].setText("시간: " + nowDate);
						}
					}
					setVisible(false);
				}
			});
			setSize(160, 450);
			setLocation(0, 100);
			setResizable(false);
		}
		class FoodAction implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == steak)
					stp.setVisible(true);
				else if (e.getSource() == pasta)
					psp.setVisible(true);
				else if (e.getSource() == pilaf)
					plp.setVisible(true);
				else if (e.getSource() == pizza)
					pzp.setVisible(true);
				else if (e.getSource() == side)
					sdp.setVisible(true);
				else if (e.getSource() == drink)
					dkp.setVisible(true);
			}
		}
	}
	class Click0 extends JDialog {
		ImageIcon a1 = new ImageIcon("click/주문.jpg");
		ImageIcon a2 = new ImageIcon("click/예약.jpg");
		ImageIcon a3 = new ImageIcon("click/계산.jpg");

		Click0() {
			getContentPane();
			setTitle("주문 / 계산  / 예약");
			setLayout(new GridLayout(1, 3));
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setModal(true);
			Clickbtn1 = new JButton("주문", a1);
			Clickbtn2 = new JButton("계산", a3);
			Clickbtn3 = new JButton("예약", a2);
			add(Clickbtn1);
			add(Clickbtn2);
			add(Clickbtn3);
			Clickbtn2.setEnabled(false);
			Clickbtn1.setSize(134, 108);
			Clickbtn2.setSize(134, 108);
			Clickbtn3.setSize(134, 108);
			Clickbtn1.addActionListener(new ClickAction());
			Clickbtn2.addActionListener(new ClickAction());
			Clickbtn3.addActionListener(new ClickAction());
			setJMenuBar(tablebar);
			tbinfo.addActionListener(new ClickAction());
			setSize(385, 165);
			setLocation(500, 300);
			setResizable(false);
			setVisible(false);
		}

		class Table1 extends JFrame {
			JLabel name = new JLabel(t1name);
			JLabel birth = new JLabel(t1birth);
			JLabel main = new JLabel(t1main);
			JLabel side = new JLabel(t1side);
			JLabel person = new JLabel(t1person);
			JLabel phone = new JLabel(t1phone);
			JLabel num = new JLabel(t1num);
			JLabel time = new JLabel(t1num);

			public Table1() {
				setTitle("Table 1");
				getContentPane();
				setLayout(null);
				setModal(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t_name.setBounds(30, 20, 100, 30);
				t_birth.setBounds(30, 60, 100, 30);
				t_main.setBounds(30, 100, 100, 30);
				t_side.setBounds(30, 140, 100, 30);
				t_person.setBounds(30, 180, 100, 30);
				t_phone.setBounds(30, 220, 100, 30);
				t_num.setBounds(30, 260, 100, 30);
				t_time.setBounds(30, 300, 100, 30);

				name.setBounds(150, 20, 100, 30);
				birth.setBounds(150, 60, 100, 30);
				main.setBounds(150, 100, 600, 30);
				side.setBounds(150, 140, 600, 30);
				person.setBounds(150, 180, 100, 30);
				phone.setBounds(150, 220, 100, 30);
				num.setBounds(150, 260, 100, 30);
				time.setBounds(150, 300, 100, 30);

				add(t_name);
				add(t_birth);
				add(t_main);
				add(t_side);
				add(t_person);
				add(t_phone);
				add(t_num);
				add(t_time);
				add(name);
				add(birth);
				add(main);
				add(side);
				add(person);
				add(phone);
				add(num);
				add(time);
				setSize(450, 400);
				setResizable(false);
				setVisible(true);
			}
		}

		class Table2 extends JFrame {
			JLabel name = new JLabel(t1name);
			JLabel birth = new JLabel(t1birth);
			JLabel main = new JLabel(t1main);
			JLabel side = new JLabel(t1side);
			JLabel person = new JLabel(t1person);
			JLabel phone = new JLabel(t1phone);
			JLabel num = new JLabel(t1num);
			JLabel time = new JLabel(t1time);

			public Table2() {
				setTitle("Table 2");
				getContentPane();
				setLayout(null);
				setModal(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t_name.setBounds(30, 20, 100, 30);
				t_birth.setBounds(30, 60, 100, 30);
				t_main.setBounds(30, 100, 100, 30);
				t_side.setBounds(30, 140, 100, 30);
				t_person.setBounds(30, 180, 100, 30);
				t_phone.setBounds(30, 220, 100, 30);
				t_num.setBounds(30, 260, 100, 30);
				t_time.setBounds(30, 300, 100, 30);

				name.setBounds(150, 20, 100, 30);
				birth.setBounds(150, 60, 100, 30);
				main.setBounds(150, 100, 600, 30);
				side.setBounds(150, 140, 600, 30);
				person.setBounds(150, 180, 100, 30);
				phone.setBounds(150, 220, 100, 30);
				num.setBounds(150, 260, 100, 30);
				time.setBounds(150, 300, 100, 30);

				add(t_name);
				add(t_birth);
				add(t_main);
				add(t_side);
				add(t_person);
				add(t_phone);
				add(t_num);
				add(t_time);
				add(name);
				add(birth);
				add(main);
				add(side);
				add(person);
				add(phone);
				add(num);
				add(time);
				setSize(600, 400);
				setResizable(false);
				setVisible(true);
			}
		}

		class Table3 extends JFrame {
			JLabel name = new JLabel(t3name);
			JLabel birth = new JLabel(t3birth);
			JLabel main = new JLabel(t3main);
			JLabel side = new JLabel(t3side);
			JLabel person = new JLabel(t3person);
			JLabel phone = new JLabel(t3phone);
			JLabel num = new JLabel(t3num);
			JLabel time = new JLabel(t3time);

			public Table3() {
				setTitle("Table 3");
				getContentPane();
				setLayout(null);
				setModal(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t_name.setBounds(30, 20, 100, 30);
				t_birth.setBounds(30, 60, 100, 30);
				t_main.setBounds(30, 100, 100, 30);
				t_side.setBounds(30, 140, 100, 30);
				t_person.setBounds(30, 180, 100, 30);
				t_phone.setBounds(30, 220, 100, 30);
				t_num.setBounds(30, 260, 100, 30);
				t_time.setBounds(30, 300, 100, 30);

				name.setBounds(150, 20, 100, 30);
				birth.setBounds(150, 60, 100, 30);
				main.setBounds(150, 100, 600, 30);
				side.setBounds(150, 140, 600, 30);
				person.setBounds(150, 180, 100, 30);
				phone.setBounds(150, 220, 100, 30);
				num.setBounds(150, 260, 100, 30);
				time.setBounds(150, 300, 100, 30);

				add(t_name);
				add(t_birth);
				add(t_main);
				add(t_side);
				add(t_person);
				add(t_phone);
				add(t_num);
				add(t_time);
				add(name);
				add(birth);
				add(main);
				add(side);
				add(person);
				add(phone);
				add(num);
				add(time);
				setSize(600, 400);
				setResizable(false);
				setVisible(true);
			}
		}

		class Table4 extends JFrame {
			JLabel name = new JLabel(t4name);
			JLabel birth = new JLabel(t4birth);
			JLabel main = new JLabel(t4main);
			JLabel side = new JLabel(t4side);
			JLabel person = new JLabel(t4person);
			JLabel phone = new JLabel(t4phone);
			JLabel num = new JLabel(t4num);
			JLabel time = new JLabel(t4time);

			public Table4() {
				setTitle("Table 4");
				getContentPane();
				setLayout(null);
				setModal(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t_name.setBounds(30, 20, 100, 30);
				t_birth.setBounds(30, 60, 100, 30);
				t_main.setBounds(30, 100, 100, 30);
				t_side.setBounds(30, 140, 100, 30);
				t_person.setBounds(30, 180, 100, 30);
				t_phone.setBounds(30, 220, 100, 30);
				t_num.setBounds(30, 260, 100, 30);
				t_time.setBounds(30, 300, 100, 30);

				name.setBounds(150, 20, 100, 30);
				birth.setBounds(150, 60, 100, 30);
				main.setBounds(150, 100, 600, 30);
				side.setBounds(150, 140, 600, 30);
				person.setBounds(150, 180, 100, 30);
				phone.setBounds(150, 220, 100, 30);
				num.setBounds(150, 260, 100, 30);
				time.setBounds(150, 300, 100, 30);

				add(t_name);
				add(t_birth);
				add(t_main);
				add(t_side);
				add(t_person);
				add(t_phone);
				add(t_num);
				add(t_time);
				add(name);
				add(birth);
				add(main);
				add(side);
				add(person);
				add(phone);
				add(num);
				add(time);
				setSize(600, 400);
				setResizable(false);
				setVisible(true);
			}
		}

		class Table5 extends JFrame {
			JLabel name = new JLabel(t5name);
			JLabel birth = new JLabel(t5birth);
			JLabel main = new JLabel(t5main);
			JLabel side = new JLabel(t5side);
			JLabel person = new JLabel(t5person);
			JLabel phone = new JLabel(t5phone);
			JLabel num = new JLabel(t5num);
			JLabel time = new JLabel(t5time);

			public Table5() {
				setTitle("Table 5");
				getContentPane();
				setLayout(null);
				setModal(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t_name.setBounds(30, 20, 100, 30);
				t_birth.setBounds(30, 60, 100, 30);
				t_main.setBounds(30, 100, 100, 30);
				t_side.setBounds(30, 140, 100, 30);
				t_person.setBounds(30, 180, 100, 30);
				t_phone.setBounds(30, 220, 100, 30);
				t_num.setBounds(30, 260, 100, 30);
				t_time.setBounds(30, 300, 100, 30);

				name.setBounds(150, 20, 100, 30);
				birth.setBounds(150, 60, 100, 30);
				main.setBounds(150, 100, 600, 30);
				side.setBounds(150, 140, 600, 30);
				person.setBounds(150, 180, 100, 30);
				phone.setBounds(150, 220, 100, 30);
				num.setBounds(150, 260, 100, 30);
				time.setBounds(150, 300, 100, 30);

				add(t_name);
				add(t_birth);
				add(t_main);
				add(t_side);
				add(t_person);
				add(t_phone);
				add(t_num);
				add(t_time);
				add(name);
				add(birth);
				add(main);
				add(side);
				add(person);
				add(phone);
				add(num);
				add(time);
				setSize(600, 400);
				setResizable(false);
				setVisible(true);
			}
		}

		class Table6 extends JFrame {
			JLabel name = new JLabel(t6name);
			JLabel birth = new JLabel(t6birth);
			JLabel main = new JLabel(t6main);
			JLabel side = new JLabel(t6side);
			JLabel person = new JLabel(t6person);
			JLabel phone = new JLabel(t6phone);
			JLabel num = new JLabel(t6num);
			JLabel time = new JLabel(t6time);

			public Table6() {
				setTitle("Table 6");
				getContentPane();
				setLayout(null);
				setModal(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t_name.setBounds(30, 20, 100, 30);
				t_birth.setBounds(30, 60, 100, 30);
				t_main.setBounds(30, 100, 100, 30);
				t_side.setBounds(30, 140, 100, 30);
				t_person.setBounds(30, 180, 100, 30);
				t_phone.setBounds(30, 220, 100, 30);
				t_num.setBounds(30, 260, 100, 30);
				t_time.setBounds(30, 300, 100, 30);

				name.setBounds(150, 20, 100, 30);
				birth.setBounds(150, 60, 100, 30);
				main.setBounds(150, 100, 600, 30);
				side.setBounds(150, 140, 600, 30);
				person.setBounds(150, 180, 100, 30);
				phone.setBounds(150, 220, 100, 30);
				num.setBounds(150, 260, 100, 30);
				time.setBounds(150, 300, 100, 30);

				add(t_name);
				add(t_birth);
				add(t_main);
				add(t_side);
				add(t_person);
				add(t_phone);
				add(t_num);
				add(t_time);
				add(name);
				add(birth);
				add(main);
				add(side);
				add(person);
				add(phone);
				add(num);
				add(time);
				setSize(600, 400);
				setResizable(false);
				setVisible(true);
			}
		}

		class Table7 extends JFrame {
			JLabel name = new JLabel(t7name);
			JLabel birth = new JLabel(t7birth);
			JLabel main = new JLabel(t7main);
			JLabel side = new JLabel(t7side);
			JLabel person = new JLabel(t7person);
			JLabel phone = new JLabel(t7phone);
			JLabel num = new JLabel(t7num);
			JLabel time = new JLabel(t7time);

			public Table7() {
				setTitle("Table 2");
				getContentPane();
				setLayout(null);
				setModal(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t_name.setBounds(30, 20, 100, 30);
				t_birth.setBounds(30, 60, 100, 30);
				t_main.setBounds(30, 100, 100, 30);
				t_side.setBounds(30, 140, 100, 30);
				t_person.setBounds(30, 180, 100, 30);
				t_phone.setBounds(30, 220, 100, 30);
				t_num.setBounds(30, 260, 100, 30);
				t_time.setBounds(30, 300, 100, 30);

				name.setBounds(150, 20, 100, 30);
				birth.setBounds(150, 60, 100, 30);
				main.setBounds(150, 100, 600, 30);
				side.setBounds(150, 140, 600, 30);
				person.setBounds(150, 180, 100, 30);
				phone.setBounds(150, 220, 100, 30);
				num.setBounds(150, 260, 100, 30);
				time.setBounds(150, 300, 100, 30);

				add(t_name);
				add(t_birth);
				add(t_main);
				add(t_side);
				add(t_person);
				add(t_phone);
				add(t_num);
				add(t_time);
				add(name);
				add(birth);
				add(main);
				add(side);
				add(person);
				add(phone);
				add(num);
				add(time);
				setSize(600, 400);
				setResizable(false);
				setVisible(true);
			}
		}

		class Table8 extends JFrame {
			JLabel name = new JLabel(t8name);
			JLabel birth = new JLabel(t8birth);
			JLabel main = new JLabel(t8main);
			JLabel side = new JLabel(t8side);
			JLabel person = new JLabel(t8person);
			JLabel phone = new JLabel(t8phone);
			JLabel num = new JLabel(t8num);
			JLabel time = new JLabel(t8time);

			public Table8() {
				setTitle("Table 8");
				getContentPane();
				setLayout(null);
				setModal(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t_name.setBounds(30, 20, 100, 30);
				t_birth.setBounds(30, 60, 100, 30);
				t_main.setBounds(30, 100, 100, 30);
				t_side.setBounds(30, 140, 100, 30);
				t_person.setBounds(30, 180, 100, 30);
				t_phone.setBounds(30, 220, 100, 30);
				t_num.setBounds(30, 260, 100, 30);
				t_time.setBounds(30, 300, 100, 30);

				name.setBounds(150, 20, 100, 30);
				birth.setBounds(150, 60, 100, 30);
				main.setBounds(150, 100, 600, 30);
				side.setBounds(150, 140, 600, 30);
				person.setBounds(150, 180, 100, 30);
				phone.setBounds(150, 220, 100, 30);
				num.setBounds(150, 260, 100, 30);
				time.setBounds(150, 300, 100, 30);

				add(t_name);
				add(t_birth);
				add(t_main);
				add(t_side);
				add(t_person);
				add(t_phone);
				add(t_num);
				add(t_time);
				add(name);
				add(birth);
				add(main);
				add(side);
				add(person);
				add(phone);
				add(num);
				add(time);
				setSize(600, 400);
				setResizable(false);
				setVisible(true);
			}
		}

		class Table9 extends JFrame {
			JLabel name = new JLabel(t9name);
			JLabel birth = new JLabel(t9birth);
			JLabel main = new JLabel(t9main);
			JLabel side = new JLabel(t9side);
			JLabel person = new JLabel(t9person);
			JLabel phone = new JLabel(t9phone);
			JLabel num = new JLabel(t9num);
			JLabel time = new JLabel(t9time);

			public Table9() {
				setTitle("Table 9");
				getContentPane();
				setLayout(null);
				setModal(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t_name.setBounds(30, 20, 100, 30);
				t_birth.setBounds(30, 60, 100, 30);
				t_main.setBounds(30, 100, 100, 30);
				t_side.setBounds(30, 140, 100, 30);
				t_person.setBounds(30, 180, 100, 30);
				t_phone.setBounds(30, 220, 100, 30);
				t_num.setBounds(30, 260, 100, 30);
				t_time.setBounds(30, 300, 100, 30);

				name.setBounds(150, 20, 100, 30);
				birth.setBounds(150, 60, 100, 30);
				main.setBounds(150, 100, 600, 30);
				side.setBounds(150, 140, 600, 30);
				person.setBounds(150, 180, 100, 30);
				phone.setBounds(150, 220, 100, 30);
				num.setBounds(150, 260, 100, 30);
				time.setBounds(150, 300, 100, 30);

				add(t_name);
				add(t_birth);
				add(t_main);
				add(t_side);
				add(t_person);
				add(t_phone);
				add(t_num);
				add(t_time);
				add(name);
				add(birth);
				add(main);
				add(side);
				add(person);
				add(phone);
				add(num);
				add(time);
				setSize(600, 400);
				setResizable(false);
				setVisible(true);
			}
		}

		class Table10 extends JFrame {
			JLabel name = new JLabel(t10name);
			JLabel birth = new JLabel(t10birth);
			JLabel main = new JLabel(t10main);
			JLabel side = new JLabel(t10side);
			JLabel person = new JLabel(t10person);
			JLabel phone = new JLabel(t10phone);
			JLabel num = new JLabel(t10num);
			JLabel time = new JLabel(t10time);

			public Table10() {
				setTitle("Table 10");
				getContentPane();
				setLayout(null);
				setModal(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t_name.setBounds(30, 20, 100, 30);
				t_birth.setBounds(30, 60, 100, 30);
				t_main.setBounds(30, 100, 100, 30);
				t_side.setBounds(30, 140, 100, 30);
				t_person.setBounds(30, 180, 100, 30);
				t_phone.setBounds(30, 220, 100, 30);
				t_num.setBounds(30, 260, 100, 30);
				t_time.setBounds(30, 300, 100, 30);

				name.setBounds(150, 20, 100, 30);
				birth.setBounds(150, 60, 100, 30);
				main.setBounds(150, 100, 600, 30);
				side.setBounds(150, 140, 600, 30);
				person.setBounds(150, 180, 100, 30);
				phone.setBounds(150, 220, 100, 30);
				num.setBounds(150, 260, 100, 30);
				time.setBounds(150, 300, 100, 30);

				add(t_name);
				add(t_birth);
				add(t_main);
				add(t_side);
				add(t_person);
				add(t_phone);
				add(t_num);
				add(t_time);
				add(name);
				add(birth);
				add(main);
				add(side);
				add(person);
				add(phone);
				add(num);
				add(time);
				setSize(600, 400);
				setResizable(false);
				setVisible(true);
			}
		}

		class Table11 extends JFrame {
			JLabel name = new JLabel(t11name);
			JLabel birth = new JLabel(t11birth);
			JLabel main = new JLabel(t11main);
			JLabel side = new JLabel(t11side);
			JLabel person = new JLabel(t11person);
			JLabel phone = new JLabel(t11phone);
			JLabel num = new JLabel(t11num);
			JLabel time = new JLabel(t11time);

			public Table11() {
				setTitle("Table 11");
				getContentPane();
				setLayout(null);
				setModal(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t_name.setBounds(30, 20, 100, 30);
				t_birth.setBounds(30, 60, 100, 30);
				t_main.setBounds(30, 100, 100, 30);
				t_side.setBounds(30, 140, 100, 30);
				t_person.setBounds(30, 180, 100, 30);
				t_phone.setBounds(30, 220, 100, 30);
				t_num.setBounds(30, 260, 100, 30);
				t_time.setBounds(30, 300, 100, 30);

				name.setBounds(150, 20, 100, 30);
				birth.setBounds(150, 60, 100, 30);
				main.setBounds(150, 100, 600, 30);
				side.setBounds(150, 140, 600, 30);
				person.setBounds(150, 180, 100, 30);
				phone.setBounds(150, 220, 100, 30);
				num.setBounds(150, 260, 100, 30);
				time.setBounds(150, 300, 100, 30);

				add(t_name);
				add(t_birth);
				add(t_main);
				add(t_side);
				add(t_person);
				add(t_phone);
				add(t_num);
				add(t_time);
				add(name);
				add(birth);
				add(main);
				add(side);
				add(person);
				add(phone);
				add(num);
				add(time);
				setSize(600, 400);
				setResizable(false);
				setVisible(true);
			}
		}

		class Table12 extends JFrame {
			JLabel name = new JLabel(t12name);
			JLabel birth = new JLabel(t12birth);
			JLabel main = new JLabel(t12main);
			JLabel side = new JLabel(t12side);
			JLabel person = new JLabel(t12person);
			JLabel phone = new JLabel(t12phone);
			JLabel num = new JLabel(t12num);
			JLabel time = new JLabel(t12time);

			public Table12() {
				setTitle("Table 12");
				getContentPane();
				setLayout(null);
				setModal(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t_name.setBounds(30, 20, 100, 30);
				t_birth.setBounds(30, 60, 100, 30);
				t_main.setBounds(30, 100, 100, 30);
				t_side.setBounds(30, 140, 100, 30);
				t_person.setBounds(30, 180, 100, 30);
				t_phone.setBounds(30, 220, 100, 30);
				t_num.setBounds(30, 260, 100, 30);
				t_time.setBounds(30, 300, 100, 30);

				name.setBounds(150, 20, 100, 30);
				birth.setBounds(150, 60, 100, 30);
				main.setBounds(150, 100, 600, 30);
				side.setBounds(150, 140, 600, 30);
				person.setBounds(150, 180, 100, 30);
				phone.setBounds(150, 220, 100, 30);
				num.setBounds(150, 260, 100, 30);
				time.setBounds(150, 300, 100, 30);

				add(t_name);
				add(t_birth);
				add(t_main);
				add(t_side);
				add(t_person);
				add(t_phone);
				add(t_num);
				add(t_time);
				add(name);
				add(birth);
				add(main);
				add(side);
				add(person);
				add(phone);
				add(num);
				add(time);
				setSize(600, 400);
				setResizable(false);
				setVisible(true);
			}
		}

		class ClickAction implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Clickbtn1) {
					setModal(false);
					setVisible(false);
					fdmenu.setVisible(true);
				} 
				else if(e.getSource() == Clickbtn2){
					setModal(false);
					setVisible(false);
					if (select == 1) {
						for (int i = 0; i < 20; i++) {
							foodinfo[i].setText(t1info[i]);
							t1money[i] = new JLabel(t1price[i]);
							t1money[i].setBounds(195, 40 + (i * 30), 100, 25);
							pay.add(t1money[i]);
							south = new JLabel("< 합 계 금 액  > : " + money[0] + " 원입니다.", JLabel.CENTER);
						}
						pay.setVisible(true);
					} else if (select == 2) {
						for (int i = 0; i < 20; i++) {
							foodinfo[i].setText(t2info[i]);
							t2money[i] = new JLabel(t2price[i]);
							t2money[i].setBounds(195, 40 + (i * 30), 100, 25);
							pay.add(t2money[i]);
							south = new JLabel("< 합 계 금 액  > : " + money[1] + " 원입니다.", JLabel.CENTER);
						}
						pay.setVisible(true);
					}
					else if (select == 3) {
						for (int i = 0; i < 20; i++) {
							foodinfo[i].setText(t3info[i]);
							t3money[i] = new JLabel(t3price[i]);
							t3money[i].setBounds(195, 40 + (i * 30), 100, 25);
							pay.add(t3money[i]);
							south = new JLabel("< 합 계 금 액  > : " + money[2] + " 원입니다.", JLabel.CENTER);
						}
						pay.setVisible(true);
					}
					else if (select == 4) {
						for (int i = 0; i < 20; i++) {
							foodinfo[i].setText(t4info[i]);
							t4money[i] = new JLabel(t4price[i]);
							t4money[i].setBounds(195, 40 + (i * 30), 100, 25);
							pay.add(t4money[i]);
							south = new JLabel("< 합 계 금 액  > : " + money[3] + " 원입니다.", JLabel.CENTER);
						}
						pay.setVisible(true);
					}
					else if (select == 5) {
						for (int i = 0; i < 20; i++) {
							foodinfo[i].setText(t5info[i]);
							t5money[i] = new JLabel(t5price[i]);
							t5money[i].setBounds(195, 40 + (i * 30), 100, 25);
							pay.add(t5money[i]);
							south = new JLabel("< 합 계 금 액  > : " + money[4] + " 원입니다.", JLabel.CENTER);
						}
						pay.setVisible(true);
					}
					else if (select == 6) {
						for (int i = 0; i < 20; i++) {
							foodinfo[i].setText(t6info[i]);
							t6money[i] = new JLabel(t6price[i]);
							t6money[i].setBounds(195, 40 + (i * 30), 100, 25);
							pay.add(t6money[i]);
							south = new JLabel("< 합 계 금 액  > : " + money[5] + " 원입니다.", JLabel.CENTER); 
						}
						pay.setVisible(true);
					}
					else if (select == 7) {
						for (int i = 0; i < 20; i++) {
							foodinfo[i].setText(t7info[i]);
							t7money[i] = new JLabel(t7price[i]);
							t7money[i].setBounds(195, 40 + (i * 30), 100, 25);
							pay.add(t7money[i]);
							south = new JLabel("< 합 계 금 액  > : " + money[6] + " 원입니다.", JLabel.CENTER);
						}
						pay.setVisible(true);
					}
					else if (select == 8) {
						for (int i = 0; i < 20; i++) {
							foodinfo[i].setText(t8info[i]);
							t8money[i] = new JLabel(t8price[i]);
							t8money[i].setBounds(195, 40 + (i * 30), 100, 25);
							pay.add(t8money[i]);
							south = new JLabel("< 합 계 금 액  > : " + money[7] + " 원입니다.", JLabel.CENTER);
						}
						pay.setVisible(true);
					}
					else if (select == 9) {
						for (int i = 0; i < 20; i++) {
							foodinfo[i].setText(t9info[i]);
							t9money[i] = new JLabel(t9price[i]);
							t9money[i].setBounds(195, 40 + (i * 30), 100, 25);
							pay.add(t9money[i]);
							south = new JLabel("< 합 계 금 액  > : " + money[8] + " 원입니다.", JLabel.CENTER);
						}
						pay.setVisible(true);
					}
					else if (select == 10) {
						for (int i = 0; i < 20; i++) {
							foodinfo[i].setText(t10info[i]);
							t10money[i] = new JLabel(t10price[i]);
							t10money[i].setBounds(195, 40 + (i * 30), 100, 25);
							pay.add(t10money[i]);
							south = new JLabel("< 합 계 금 액  > : " + money[9] + " 원입니다.", JLabel.CENTER);
						}
						pay.setVisible(true);
					}
					else if (select == 11) {
						for (int i = 0; i < 20; i++) {
							foodinfo[i].setText(t11info[i]);
							t11money[i] = new JLabel(t11price[i]);
							t11money[i].setBounds(195, 40 + (i * 30), 100, 25);
							pay.add(t11money[i]);
							south = new JLabel("< 합 계 금 액  > : " + money[10] + " 원입니다.", JLabel.CENTER);
						}
						pay.setVisible(true);
					}
					else if (select == 12) {
						for (int i = 0; i < 20; i++) {
							foodinfo[i].setText(t12info[i]);
							t12money[i] = new JLabel(t12price[i]);
							t12money[i].setBounds(195, 40 + (i * 30), 100, 25);
							pay.add(t12money[i]);
							south = new JLabel("< 합 계 금 액  > : " + money[11] + " 원입니다.", JLabel.CENTER);
						}
						pay.setVisible(true);
					}
					else if(select == 1 & lucknum[0] == thisluck){
						num[0] = 0;
						tablesell += 1;
						System.out.println("1번 테이블에서 무료 식사를 하였습니다.");
						tbtn[0].setText("입석 가능");
						tbtn[0].setBackground(Color.WHITE);
						tblabel2[0].setText("");
						money[0] = 0;
						for (int i = 0; i < 20; i++){
							t1money[i] = new JLabel("");
							t1info[i] = "";
							t1price[i] = "";
						}
						event.setVisible(true);
					}
					else if(select == 2 & lucknum[1] == thisluck){
						num[1] = 0;
						tablesell += 1;
						System.out.println("2번 테이블에서 무료 식사를 하였습니다.");
						tbtn[1].setText("입석 가능");
						tbtn[1].setBackground(Color.WHITE);
						tblabel2[1].setText("");
						money[1] = 0;
						for (int i = 0; i < 20; i++){
							t2money[i] = new JLabel("");
							t2info[i] = "";
							t2price[i] = "";
						}
						event.setVisible(true);
					}
					else if(select == 3 & lucknum[2] == thisluck){
						System.out.println(lucknum[2] +""+ thisluck);
						num[2] = 0;
						tablesell += 1;
						System.out.println("3번 테이블에서 무료 식사를 하였습니다.");
						tbtn[2].setText("입석 가능");
						tbtn[2].setBackground(Color.WHITE);
						tblabel2[2].setText("");
						money[2] = 0;
						for (int i = 0; i < 20; i++){
							t3money[i] = new JLabel("");
							t3info[i] = "";
							t3price[i] = "";
						}
						event.setVisible(true);
					}
					else if(select == 4 & lucknum[3] == thisluck){
						num[3] = 0;
						tablesell += 1;
						System.out.println("4번 테이블에서 무료 식사를 하였습니다.");
						tbtn[3].setText("입석 가능");
						tbtn[3].setBackground(Color.WHITE);
						tblabel2[3].setText("");
						money[3] = 0;
						for (int i = 0; i < 20; i++){
							t4money[i] = new JLabel("");
							t4info[i] = "";
							t4price[i] = "";
						}
						event.setVisible(true);
					}
					else if(select == 5 & lucknum[4] == thisluck){
						num[4] = 0;
						tablesell += 1;
						System.out.println("5번 테이블에서 무료 식사를 하였습니다.");
						tbtn[4].setText("입석 가능");
						tbtn[4].setBackground(Color.WHITE);
						tblabel2[4].setText("");
						money[4] = 0;
						for (int i = 0; i < 20; i++){
							t5money[i] = new JLabel("");
							t5info[i] = "";
							t5price[i] = "";
						}
						event.setVisible(true);
					}
					else if(select == 6 & lucknum[5] == thisluck){
						num[5] = 0;
						tablesell += 1;
						System.out.println("6번 테이블에서 무료 식사를 하였습니다.");
						tbtn[5].setText("입석 가능");
						tbtn[5].setBackground(Color.WHITE);
						tblabel2[5].setText("");
						money[5] = 0;
						for (int i = 0; i < 20; i++){
							t6money[i] = new JLabel("");
							t6info[i] = "";
							t6price[i] = "";
						}
						event.setVisible(true);
					}
					else if(select == 7 & lucknum[6] == thisluck){
						num[6] = 0;
						tablesell += 1;
						System.out.println("7번 테이블에서 무료 식사를 하였습니다.");
						tbtn[6].setText("입석 가능");
						tbtn[6].setBackground(Color.WHITE);
						tblabel2[6].setText("");
						money[6] = 0;
						for (int i = 0; i < 20; i++){
							t7money[i] = new JLabel();
							t7info[i] = "";
							t7price[i] = "";
						}
						event.setVisible(true);
					}
					else if(select == 8 & lucknum[7] == thisluck){
						num[7] = 0;
						tablesell += 1;
						System.out.println("8번 테이블에서 무료 식사를 하였습니다.");
						tbtn[7].setText("입석 가능");
						tbtn[7].setBackground(Color.WHITE);
						tblabel2[7].setText("");
						money[7] = 0;
						for (int i = 0; i < 20; i++){
							t8money[i] = new JLabel("");
							t8info[i] = "";
							t8price[i] = "";
						}
						event.setVisible(true);
					}
					else if(select == 9 & lucknum[8] == thisluck){
						num[8] = 0;
						tablesell += 1;
						System.out.println("9번 테이블에서 무료 식사를 하였습니다.");
						tbtn[8].setText("입석 가능");
						tbtn[8].setBackground(Color.WHITE);
						tblabel2[8].setText("");
						money[8] = 0;
						for (int i = 0; i < 20; i++){
							t9money[i] = new JLabel("");
							t9info[i] = "";
							t9price[i] = "";
						}
						event.setVisible(true);
					}
					else if(select == 10 & lucknum[9] == thisluck){
						num[9] = 0;
						tablesell += 1;
						System.out.println("10번 테이블에서 무료 식사를 하였습니다.");
						tbtn[9].setText("입석 가능");
						tbtn[9].setBackground(Color.WHITE);
						tblabel2[9].setText("");
						money[9] = 0;
						for (int i = 0; i < 20; i++){
							t10money[i] = new JLabel("");
							t10info[i] = "";
							t10price[i] = "";
						}
						event.setVisible(true);
					}
					else if(select == 11 & lucknum[10] == thisluck){
						num[10] = 0;
						tablesell += 1;
						System.out.println("11번 테이블에서 무료 식사를 하였습니다.");
						tbtn[10].setText("입석 가능");
						tbtn[10].setBackground(Color.WHITE);
						tblabel2[10].setText("");
						money[10] = 0;
						for (int i = 0; i < 20; i++){
							t11money[i] = new JLabel("");
							t11info[i] = "";
							t11price[i] = "";
						}
						event.setVisible(true);
					}
					else if(select == 12 & lucknum[11] == thisluck){
						num[11] = 0;
						tablesell += 1;
						System.out.println("12번 테이블에서 무료 식사를 하였습니다.");
						tbtn[11].setText("입석 가능");
						tbtn[11].setBackground(Color.WHITE);
						tblabel2[11].setText("");
						money[11] = 0;
						for (int i = 0; i < 20; i++){
							t12money[i] = new JLabel("");
							t12info[i] = "";
							t12price[i] = "";
						}
						event.setVisible(true);
					}	
				}
				else if (e.getSource() == Clickbtn3) {
					setModal(false);
					setVisible(false);
					int result = JOptionPane.showConfirmDialog(null, "예약하시겠습니까 ?",   // 미션 15 JOptionPane
							"Confirm", JOptionPane.YES_NO_OPTION);
					if(result == JOptionPane.YES_OPTION){
						setVisible(false);
						namefield.setText("");
						birthfield.setText("");
						man.setSelected(false);
						hpfield1.setText("");
						hpfield2.setText("");
						hpfield3.setText("");
						timefield.setText("");
						reser.setVisible(true);
					}	
				}
				if (e.getSource() == tbinfo) {
					if (select == 1) {
						if (tbtn[0].getBackground() == Color.YELLOW)
							new Table1();
						else if (tbtn[0].getBackground() == Color.GREEN)
							new OrderInfo();
					} else if (select == 2) {
						if (tbtn[1].getBackground() == Color.YELLOW)
							new Table2();
						else
							new OrderInfo();
					} else if (select == 3) {
						if (tbtn[2].getBackground() == Color.YELLOW)
							new Table3();
						else
							new OrderInfo();
					} else if (select == 4) {
						if (tbtn[3].getBackground() == Color.YELLOW)
							new Table4();
						else
							new OrderInfo();
					} else if (select == 5) {
						if (tbtn[4].getBackground() == Color.YELLOW)
							new Table5();
						else
							new OrderInfo();
					} else if (select == 6) {
						if (tbtn[5].getBackground() == Color.YELLOW)
							new Table6();
						else
							new OrderInfo();
					} else if (select == 7) {
						if (tbtn[6].getBackground() == Color.YELLOW)
							new Table7();
						else
							new OrderInfo();
					} else if (select == 8) {
						if (tbtn[7].getBackground() == Color.YELLOW)
							new Table8();
						else
							new OrderInfo();
					} else if (select == 9) {
						if (tbtn[8].getBackground() == Color.YELLOW)
							new Table9();
						else
							new OrderInfo();
					} else if (select == 10) {
						if (tbtn[9].getBackground() == Color.YELLOW)
							new Table10();
						else
							new OrderInfo();
					} else if (select == 11) {
						if (tbtn[10].getBackground() == Color.YELLOW)
							new Table1();
						else
							new OrderInfo();
					} else if (select == 12) {
						if (tbtn[11].getBackground() == Color.YELLOW)
							new Table12();
						else
							new OrderInfo();
					}
				}
			}
		}
	}
	class SurveyWrite {
		SurveyWrite(){
			String fileName = "설문조사"+ran+".txt";
			try{            
				File file = new File(fileName) ;           
				FileWriter fw = new FileWriter(file) ;
				for(int i=0; i<5; i++)
					fw.write(surveytxt[i].getText()+"  ");
				fw.flush();
				fw.close();        
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	class Event extends JDialog {
		Event(){
			setTitle("페인트 사용");
			getContentPane();
			setModal(true);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setSize(700,500);
			setVisible(false);
		}
		public void paint(Graphics g){
			ImageIcon icon = new ImageIcon("images/이벤트당첨.jpg");
			Image img = icon.getImage();
			g.drawImage(img, 0, 0, getWidth(),getHeight(), this);
		}
	}
	class Reservation extends JDialog {
		Reservation() throws FileNotFoundException {
			setTitle("통합 예약 시스템");
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			mn1 = new JMenuItem("강 동 원");
			mn2 = new JMenuItem("원 빈");
			mn3 = new JMenuItem("아 이 린");
			mn4 = new JMenuItem("엄 정 기");
			mn5 = new JMenuItem("초기화");
			mn6 = new JMenuItem("Close");
			
			Stringnum = 0;
			File file6 = new File("강동원.txt");
			sc = new Scanner(file6);
			while(sc.hasNext()){
				Stringtxt[Stringnum] = sc.nextLine();
				Stringnum++;
				System.out.println(Stringtxt[Stringnum]);
			}
			
			menu.add(mn1);
			menu.add(mn2);
			menu.add(mn3);
			menu.add(mn4);
			menu.add(mn5);
			menu.add(mn6);
			menubar.add(menu);
			setJMenuBar(menubar);
			mn1.addActionListener(new MyActionListener());
			mn2.addActionListener(new MyActionListener());
			mn3.addActionListener(new MyActionListener());
			mn4.addActionListener(new MyActionListener());
			mn5.addActionListener(new MyActionListener());
			mn6.addActionListener(new MyActionListener());
			menu.addActionListener(new MyActionListener());

			contentpane = getContentPane();
			contentpane.setLayout(new BorderLayout());
			
			add(new SouthPanel(), BorderLayout.SOUTH);
			add(new NorthPanel(), BorderLayout.NORTH);
			add(new CenterPanel(), BorderLayout.CENTER);
			
			setSize(420, 600);
			setLocation(1365,100);
			setResizable(false);
			setVisible(false);

			la.requestFocus();
			la.setFocusable(true);
		}

		class SouthPanel extends JPanel {
			SouthPanel() {
				getContentPane();
				setBackground(Color.LIGHT_GRAY);
				ImageIcon Icon1 = new ImageIcon("images/phone1.jpg");
				ImageIcon Icon2 = new ImageIcon("images/ex.jpg");

				ok = new JButton("예약", Icon1);
				ok.addActionListener(new MyActionListener());
				add(ok);
				ok.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

					}
				});
				cancel = new JButton("예약취소", Icon2);
				cancel.addActionListener(new MyActionListener());
				add(cancel);
			}
		}

		class NorthPanel extends JPanel {
			NorthPanel() {
				getContentPane();
				add(la);
				la.addMouseMotionListener(new MyMouseAdapter());
			}

			class MyChangeListener implements ChangeListener {
				public void stateChanged(ChangeEvent e) {
					Font f = name.getFont();
					int size = f.getSize();

					la.setBackground(Color.RED);
				}
			}

			class MyKeyListener extends KeyAdapter { //미션 4 키보드 이벤트
				public void keyPressed(KeyEvent e) {
					JLabel j2 = new JLabel();
					char keyChar = e.getKeyChar();
					la.setText(Character.toString(keyChar));
				}

				public void keyReleased(KeyEvent e) {
					System.out.println("key released");
				}

				public void keyTyped(KeyEvent e) {
					System.out.println("key typed");
				}
			}
		}

		class CenterPanel extends JPanel {
			public CenterPanel() {
				
				getContentPane();
				setLayout(null);
				setBackground(Color.orange);
				MyActionListener ls = new MyActionListener();
				MyMouseAdapter ls2 = new MyMouseAdapter();
				MyItemListener mi = new MyItemListener();

				ImageIcon Icon1 = new ImageIcon("images/phone1.jpg");
				manofwoman = new JLabel();
				myperson = new JLabel();

				name = new JLabel("이 름");
				birth = new JLabel("생년월일");
				mainmenu = new JLabel("MAIN DISH");
				sidemenu = new JLabel("SIDE DISH");
				person = new JLabel("성 별");
				phone = new JLabel("휴대폰");
				time = new JLabel("방문시간");
				sum = new JLabel("인원수");
				a = new JLabel(Icon1);
				led = new JLabel("성별을 선택해주세요.");
				ttable = new JLabel("Table");
				led.setBackground(Color.orange);

				name.setFont(new Font("고딕체", Font.BOLD, 15));
				birth.setFont(new Font("고딕체", Font.BOLD, 15));
				phone.setFont(new Font("고딕체", Font.BOLD, 15));
				mainmenu.setFont(new Font("고딕체", Font.BOLD, 15));
				sidemenu.setFont(new Font("고딕체", Font.BOLD, 15));
				person.setFont(new Font("고딕체", Font.BOLD, 15));
				time.setFont(new Font("고딕체", Font.BOLD, 15));
				sum.setFont(new Font("고딕체", Font.BOLD, 15));
				led.setFont(new Font("고딕체", Font.BOLD, 15));
				ttable.setFont(new Font("고딕체", Font.BOLD, 15));

				jyp = new JPanel(new FlowLayout(FlowLayout.LEFT));
				jyp.setBackground(Color.orange);

				g = new ButtonGroup();
				man = new JRadioButton("남자");
				woman = new JRadioButton("여자");
				g.add(man);
				g.add(woman);
				man.setFont(new Font("", Font.BOLD, 12));
				woman.setFont(new Font("", Font.BOLD, 12));
				man.addItemListener(mi);
				woman.addItemListener(mi);
				
				namefield = new JTextField(Stringtxt[0]);
				birthfield = new JTextField(Stringtxt[1]);
				namefield.addActionListener(ls);
				birthfield.addActionListener(ls);
				hpfield1 = new JTextField(Stringtxt[2]);
				hpfield2 = new JTextField(Stringtxt[3]);
				hpfield3 = new JTextField(Stringtxt[4]);
				timefield = new JTextField("");
				JLabel hipon = new JLabel("-");
				JLabel hipon2 = new JLabel("-");
				combox = new JComboBox(ea);
				combox.addActionListener(ls);
				timebox = new JComboBox(ea2);
				mainbox = new JComboBox(menuString);
				sidebox = new JComboBox(sideString);
				tablebox = new JComboBox(tablenum);
				mainbox.addActionListener(ls);
				sidebox.addActionListener(ls);

				man.setBackground(Color.orange);
				woman.setBackground(Color.orange);
				name.setBounds(20, 25, 100, 20);
				birth.setBounds(20, 65, 100, 20);
				mainmenu.setBounds(20, 105, 100, 20);
				sidemenu.setBounds(20, 145, 100, 20);
				person.setBounds(20, 185, 100, 20);
				phone.setBounds(20, 305, 100, 20); // 20,220,100,20
				sum.setBounds(20, 345, 100, 20);
				time.setBounds(20, 385, 100, 20);
				ttable.setBounds(20, 425, 100, 20);

				namefield.setBounds(120, 20, 100, 30);
				birthfield.setBounds(120, 60, 100, 30);
				mainbox.setBounds(120, 100, 200, 30);
				sidebox.setBounds(120, 140, 200, 30);
				man.setBounds(120, 180, 100, 30);
				woman.setBounds(120, 210, 100, 30);
				led.setBounds(120, 240, 150, 30);
				manofwoman.setBounds(270, 180, 100, 100);
				hpfield1.setBounds(120, 300, 50, 30);
				hipon.setBounds(179, 300, 10, 30);
				hpfield2.setBounds(190, 300, 50, 30);
				hipon2.setBounds(249, 300, 10, 30);
				hpfield3.setBounds(260, 300, 50, 30);
				combox.setBounds(120, 340, 100, 30);
				myperson.setBounds(180, 340, 100, 30);
				timebox.setBounds(120, 380, 100, 30);
				tablebox.setBounds(120, 420, 100, 30);
				// 1열
				add(name);
				add(birth);
				add(phone);
				add(mainmenu);
				add(sidemenu);
				add(time);
				add(person);
				add(jyp);
				add(sum);
				// 2열
				add(namefield);
				add(birthfield);
				add(mainbox);
				add(sidebox);
				add(hpfield1);
				add(hpfield2);
				add(hpfield3);
				add(combox);
				add(timebox);
				add(hipon);
				add(hipon2);
				add(manofwoman);
				add(tablebox);
				add(led);
				add(man);
				add(woman);
				add(myperson);
		//		add(mainbtn);
		//		add(sidebtn);
				add(ttable);
				
			}
		}

		class MyActionListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				File file2 = new File("강동원.txt");
				File file3 = new File("원빈.txt");
				File file4 = new File("아이린.txt");
				File file5 = new File("엄정기.txt");

				if (e.getSource() == mn1) {
					Stringnum = 0;
					try {
						sc = new Scanner(file2);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
					while(sc.hasNext()){
						Stringtxt[Stringnum] = sc.nextLine();
						Stringnum++;
					}
					namefield.setText(Stringtxt[0]);
					birthfield.setText(Stringtxt[1]);
					hpfield1.setText(Stringtxt[2]);
					hpfield2.setText(Stringtxt[3]);
					hpfield3.setText(Stringtxt[4]);
					man.setSelected(true);
				} else if (e.getSource() == mn2) {
					Stringnum = 0;
					try {
						sc = new Scanner(file3);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
					while(sc.hasNext()){
						Stringtxt[Stringnum] = sc.nextLine();
						Stringnum++;
					}
					MyThird aaa = new MyThird();
					aaa.add(aa2);
					led.setOpaque(true);
					man.setSelected(true);
				} else if (e.getSource() == mn3) {
					Stringnum = 0;
					try {
						sc = new Scanner(file4);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
					while(sc.hasNext()){
						Stringtxt[Stringnum] = sc.nextLine();
						Stringnum++;
					}
					MyThird aaa = new MyThird();
					aaa.add(aa3);
					led.setOpaque(true);
					woman.setSelected(true);
					namefield.setText(Stringtxt[0]);
					birthfield.setText(Stringtxt[1]);
					hpfield1.setText(Stringtxt[2]);
					hpfield2.setText(Stringtxt[3]);
					hpfield3.setText(Stringtxt[4]);
				} else if (e.getSource() == mn4) {
					Stringnum = 0;
					try {
						sc = new Scanner(file5);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
					while(sc.hasNext()){
						Stringtxt[Stringnum] = sc.nextLine();
						Stringnum++;
					}
					MyThird aaa = new MyThird();
					aaa.add(aa1);
					led.setOpaque(true);
					man.setSelected(true);
					namefield.setText(Stringtxt[0]);
					birthfield.setText(Stringtxt[1]);
					hpfield1.setText(Stringtxt[2]);
					hpfield2.setText(Stringtxt[3]);
					hpfield3.setText(Stringtxt[4]);
				} else if (e.getSource() == mn5) {
					namefield.setText("");
					birthfield.setText("");
					man.setSelected(false);
					hpfield1.setText("");
					hpfield2.setText("");
					hpfield3.setText("");
					timefield.setText("");
					setBackground(Color.ORANGE);
					jyp.setBackground(Color.ORANGE);
				}
				else if(e.getSource() == mn6 || e.getSource() == cancel){
					reser.setVisible(false);
					namefield.setText("");
					birthfield.setText("");
					man.setSelected(false);
					hpfield1.setText("");
					hpfield2.setText("");
					hpfield3.setText("");
					timefield.setText("");
					setBackground(Color.ORANGE);
					jyp.setBackground(Color.ORANGE);
				}
		/*		if (e.getSource() == ok) {
					ok.setBackground(Color.GREEN);
					cancel.setVisible(false);
				}*/
				if (e.getSource() == mainbox) {
					int result = JOptionPane.showConfirmDialog(null, "고르시겠습니까 ?","", JOptionPane.YES_NO_OPTION);//미션 15 JOptionPane
					if(result == JOptionPane.YES_OPTION){
						String b = (String) mainbox.getSelectedItem();
						if (!mainbox.getSelectedItem().equals(" Main Dish ")) {
							info[numm] = b;
							numm++;
							System.out.println(b);
						}
					}	

				} else if (e.getSource() == sidebox) {
					int result = JOptionPane.showConfirmDialog(null, "고르시겠습니까 ?","", JOptionPane.YES_NO_OPTION);//미션 15 JOptionPane
					String b = (String) sidebox.getSelectedItem();
					if (!sidebox.getSelectedItem().equals(" Side Dish ")) {
						info2[numm2] = b;
						numm2++;
						System.out.println(b);
					}
				}
				if (e.getSource() == ok && tablebox.getSelectedItem().equals(" 1번  ")) {
					if (tbtn[0].getBackground() == Color.YELLOW) {
						JOptionPane.showMessageDialog(null, "이미 예약된 자리입니다.", "", JOptionPane.ERROR_MESSAGE);//미션 15 JOptionPane
						ok.setBackground(Color.WHITE);
						cancel.setVisible(true);
					} else {
						tbtn[0].setBackground(Color.YELLOW);
						tbtn[0].setForeground(Color.GREEN);
						tbtn[0].setText("<예약> " + namefield.getText());
						t1name = namefield.getText();
						t1birth = birthfield.getText();
						for (int i = 0; i < numm; i++)
							t1main += info[i];
						if (man.isSelected() == true)
							t1person = man.getText();
						else if (woman.isSelected() == true)
							t1person = woman.getText();
						t1phone = hpfield1.getText() + "-" + hpfield2.getText() + "-" + hpfield3.getText();
						t1num = (String) combox.getSelectedItem();
						t1time = (String) timebox.getSelectedItem();
						setVisible(false);
					}
				} else if (e.getSource() == ok && tablebox.getSelectedItem().equals(" 2번  ")) {
					if (tbtn[1].getBackground() == Color.YELLOW) {
						JOptionPane.showMessageDialog(null, "이미 예약된 자리입니다.", "Message", JOptionPane.ERROR_MESSAGE);//미션 15 JOptionPane
						ok.setBackground(Color.WHITE);
						cancel.setVisible(true);
					} else {
						tbtn[1].setBackground(Color.YELLOW);
						tbtn[1].setForeground(Color.GREEN);
						tbtn[1].setText("<예약> " + namefield.getText());
						t2name = namefield.getText();
						t2birth = birthfield.getText();
						for (int i = 0; i < numm; i++)
							t2main += info[i];
						if (man.isSelected() == true)
							t2person = man.getText();
						else if (woman.isSelected() == true)
							t2person = woman.getText();
						t2phone = hpfield1.getText() + "-" + hpfield2.getText() + "-" + hpfield3.getText();
						t2num = (String) combox.getSelectedItem();
						t2time = (String) timebox.getSelectedItem();
						setVisible(false);
					}
				} else if (e.getSource() == ok && tablebox.getSelectedItem().equals(" 3번  ")) {
					if (tbtn[2].getBackground() == Color.YELLOW) {
						JOptionPane.showMessageDialog(null, "이미 예약된 자리입니다.", "Message", JOptionPane.ERROR_MESSAGE);//미션 15 JOptionPane
						ok.setBackground(Color.WHITE);
						cancel.setVisible(true);
					} else {
						tbtn[2].setForeground(Color.BLACK);
						tbtn[2].setBackground(Color.YELLOW);
						tbtn[2].setText("<예약> " + namefield.getText());
						t3name = namefield.getText();
						t3birth = birthfield.getText();
						for (int i = 0; i < numm; i++)
							t3main += info[i];
						if (man.isSelected() == true)
							t3person = man.getText();
						else if (woman.isSelected() == true)
							t3person = woman.getText();
						t3phone = hpfield1.getText() + "-" + hpfield2.getText() + "-" + hpfield3.getText();
						t3num = (String) combox.getSelectedItem();
						t3time = (String) timebox.getSelectedItem();
						setVisible(false);
					}
				} else if (e.getSource() == ok && tablebox.getSelectedItem().equals(" 4번  ")) {
					if (tbtn[3].getBackground() == Color.YELLOW) {
						JOptionPane.showMessageDialog(null, "이미 예약된 자리입니다.", "Message", JOptionPane.ERROR_MESSAGE);//미션 15 JOptionPane
						ok.setBackground(Color.WHITE);
						cancel.setVisible(true);
					} else {
						tbtn[3].setForeground(Color.BLACK);
						tbtn[3].setBackground(Color.YELLOW);
						tbtn[3].setText("<예약> " + namefield.getText());
						t4name = namefield.getText();
						t4birth = birthfield.getText();
						for (int i = 0; i < numm; i++)
							t4main += info[i];
						if (man.isSelected() == true)
							t4person = man.getText();
						else if (woman.isSelected() == true)
							t4person = woman.getText();
						t4phone = hpfield1.getText() + "-" + hpfield2.getText() + "-" + hpfield3.getText();
						t4num = (String) combox.getSelectedItem();
						t4time = (String) timebox.getSelectedItem();
						setVisible(false);
					}
				} else if (e.getSource() == ok && tablebox.getSelectedItem().equals(" 5번  ")) {
					if (tbtn[0].getBackground() == Color.YELLOW) {
						JOptionPane.showMessageDialog(null, "이미 예약된 자리입니다.", "Message", JOptionPane.ERROR_MESSAGE);//미션 15 JOptionPane
						ok.setBackground(Color.WHITE);
						cancel.setVisible(true);
					} else {
						tbtn[4].setForeground(Color.BLACK);
						tbtn[4].setBackground(Color.YELLOW);
						tbtn[4].setText("<예약> " + namefield.getText());
						t5name = namefield.getText();
						t5birth = birthfield.getText();
						for (int i = 0; i < numm; i++)
							t5main += info[i];
						if (man.isSelected() == true)
							t5person = man.getText();
						else if (woman.isSelected() == true)
							t5person = woman.getText();
						t5phone = hpfield1.getText() + "-" + hpfield2.getText() + "-" + hpfield3.getText();
						t5num = (String) combox.getSelectedItem();
						t5time = (String) timebox.getSelectedItem();
						setVisible(false);
					}
				} else if (e.getSource() == ok && tablebox.getSelectedItem().equals(" 6번  ")) {
					if (tbtn[0].getBackground() == Color.YELLOW) {
						JOptionPane.showMessageDialog(null, "이미 예약된 자리입니다.", "Message", JOptionPane.ERROR_MESSAGE);//미션 15 JOptionPane
						ok.setBackground(Color.WHITE);
						cancel.setVisible(true);
					} else {
						tbtn[5].setForeground(Color.BLACK);
						tbtn[5].setBackground(Color.YELLOW);
						tbtn[5].setText("<예약> " + namefield.getText());
						t6name = namefield.getText();
						t6birth = birthfield.getText();
						for (int i = 0; i < numm; i++)
							t6main += info[i];
						if (man.isSelected() == true)
							t6person = man.getText();
						else if (woman.isSelected() == true)
							t6person = woman.getText();
						t6phone = hpfield1.getText() + "-" + hpfield2.getText() + "-" + hpfield3.getText();
						t6num = (String) combox.getSelectedItem();
						t6time = (String) timebox.getSelectedItem();
						setVisible(false);
					}
				} else if (e.getSource() == ok && tablebox.getSelectedItem().equals(" 7번  ")) {
					if (tbtn[0].getBackground() == Color.YELLOW) {
						JOptionPane.showMessageDialog(null, "이미 예약된 자리입니다.", "Message", JOptionPane.ERROR_MESSAGE);//미션 15 JOptionPane
						ok.setBackground(Color.WHITE);
						cancel.setVisible(true);
					} else {
						tbtn[6].setForeground(Color.BLACK);
						tbtn[6].setBackground(Color.YELLOW);
						tbtn[6].setText("<예약> " + namefield.getText());
						t7name = namefield.getText();
						t7birth = birthfield.getText();
						for (int i = 0; i < numm; i++)
							t7main += info[i];
						if (man.isSelected() == true)
							t7person = man.getText();
						else if (woman.isSelected() == true)
							t7person = woman.getText();
						t7phone = hpfield1.getText() + "-" + hpfield2.getText() + "-" + hpfield3.getText();
						t7num = (String) combox.getSelectedItem();
						t7time = (String) timebox.getSelectedItem();
						setVisible(false);
					}
				} else if (e.getSource() == ok && tablebox.getSelectedItem().equals(" 8번  ")) {
					if (tbtn[0].getBackground() == Color.YELLOW) {
						JOptionPane.showMessageDialog(null, "이미 예약된 자리입니다.", "Message", JOptionPane.ERROR_MESSAGE);//미션 15 JOptionPane
						ok.setBackground(Color.WHITE);
						cancel.setVisible(true);
					} else {
						tbtn[7].setForeground(Color.BLACK);
						tbtn[7].setBackground(Color.YELLOW);
						tbtn[7].setText("<예약> " + namefield.getText());
						t8name = namefield.getText();
						t8birth = birthfield.getText();
						for (int i = 0; i < numm; i++)
							t8main += info[i];
						if (man.isSelected() == true)
							t8person = man.getText();
						else if (woman.isSelected() == true)
							t8person = woman.getText();
						t8phone = hpfield1.getText() + "-" + hpfield2.getText() + "-" + hpfield3.getText();
						t8num = (String) combox.getSelectedItem();
						t8time = (String) timebox.getSelectedItem();
						setVisible(false);
					}
				} else if (e.getSource() == ok && tablebox.getSelectedItem().equals(" 9번  ")) {
					if (tbtn[0].getBackground() == Color.YELLOW) {
						JOptionPane.showMessageDialog(null, "이미 예약된 자리입니다.", "Message", JOptionPane.ERROR_MESSAGE);//미션 15 JOptionPane
						ok.setBackground(Color.WHITE);
						cancel.setVisible(true);
					} else {
						tbtn[8].setForeground(Color.BLACK);
						tbtn[8].setBackground(Color.YELLOW);
						tbtn[8].setText("<예약> " + namefield.getText());
						t9name = namefield.getText();
						t9birth = birthfield.getText();
						for (int i = 0; i < numm; i++)
							t9main += info[i];
						if (man.isSelected() == true)
							t9person = man.getText();
						else if (woman.isSelected() == true)
							t9person = woman.getText();
						t9phone = hpfield1.getText() + "-" + hpfield2.getText() + "-" + hpfield3.getText();
						t9num = (String) combox.getSelectedItem();
						t9time = (String) timebox.getSelectedItem();
						setVisible(false);
					}
				} else if (e.getSource() == ok && tablebox.getSelectedItem().equals(" 10번  ")) {
					if (tbtn[0].getBackground() == Color.YELLOW) {
						JOptionPane.showMessageDialog(null, "이미 예약된 자리입니다.", "Message", JOptionPane.ERROR_MESSAGE);//미션 15 JOptionPane
						ok.setBackground(Color.WHITE);
						cancel.setVisible(true);
					} else {
						tbtn[9].setForeground(Color.BLACK);
						tbtn[9].setBackground(Color.YELLOW);
						tbtn[9].setText("<예약> " + namefield.getText());
						t10name = namefield.getText();
						t10birth = birthfield.getText();
						for (int i = 0; i < numm; i++)
							t10main += info[i];
						if (man.isSelected() == true)
							t10person = man.getText();
						else if (woman.isSelected() == true)
							t10person = woman.getText();
						t10phone = hpfield1.getText() + "-" + hpfield2.getText() + "-" + hpfield3.getText();
						t10num = (String) combox.getSelectedItem();
						t10time = (String) timebox.getSelectedItem();
						setVisible(false);
					}
				} else if (e.getSource() == ok && tablebox.getSelectedItem().equals(" 11번  ")) {
					if (tbtn[0].getBackground() == Color.YELLOW) {
						JOptionPane.showMessageDialog(null, "이미 예약된 자리입니다.", "Message", JOptionPane.ERROR_MESSAGE);//미션 15 JOptionPane
						ok.setBackground(Color.WHITE);
						cancel.setVisible(true);
					} else {
						tbtn[10].setForeground(Color.BLACK);
						tbtn[10].setBackground(Color.YELLOW);
						tbtn[10].setText("<예약> " + namefield.getText());
						t11name = namefield.getText();
						t11birth = birthfield.getText();
						for (int i = 0; i < numm; i++)
							t11main += info[i];
						if (man.isSelected() == true)
							t11person = man.getText();
						else if (woman.isSelected() == true)
							t11person = woman.getText();
						t11phone = hpfield1.getText() + "-" + hpfield2.getText() + "-" + hpfield3.getText();
						t11num = (String) combox.getSelectedItem();
						t11time = (String) timebox.getSelectedItem();
						setVisible(false);
					}
				} else if (e.getSource() == ok && tablebox.getSelectedItem().equals(" 12번  ")) {
					if (tbtn[0].getBackground() == Color.YELLOW) {
						JOptionPane.showMessageDialog(null, "이미 예약된 자리입니다.", "Message", JOptionPane.ERROR_MESSAGE);//미션 15 JOptionPane
						ok.setBackground(Color.WHITE);
						cancel.setVisible(true);
					} else {
						tbtn[11].setForeground(Color.BLACK);
						tbtn[11].setBackground(Color.YELLOW);
						tbtn[11].setText("<예약> " + namefield.getText());
						t12name = namefield.getText();
						t12birth = birthfield.getText();
						for (int i = 0; i < numm; i++)
							t12main += info[i];
						if (man.isSelected() == true)
							t12person = man.getText();
						else if (woman.isSelected() == true)
							t12person = woman.getText();
						t12phone = hpfield1.getText() + "-" + hpfield2.getText() + "-" + hpfield3.getText();
						t12num = (String) combox.getSelectedItem();
						t12time = (String) timebox.getSelectedItem();
						setVisible(false);
					}
				}
			}
		}
		class MyMouseAdapter extends MouseAdapter implements MouseMotionListener {  // 미션 3 마우스 이벤트 // 미션 5 마우스 모션 리스너
			public void mouseDragged(MouseEvent e) {
				la.setText("아주 정확한 개인정보를 입력해 주세요. (" + e.getX() + ", " + e.getY() + ")");
			}
			public void mouseMoved(MouseEvent e) {
				la.setText(" 개인정보는 타기관에 사용되지 않습니다.");
			}
		}
		public class MyItemListener implements ItemListener {
			public void itemStateChanged(ItemEvent e) {
				if (e.getItem() == man)
					led.setText("남자입니다.");
				else if (e.getItem() == woman)
					led.setText("여자입니다");
				if (man.isSelected())
					manofwoman.setIcon(image1);
				else if (woman.isSelected())
					manofwoman.setIcon(image2);
			}
		}
	}
	class MyThird extends JDialog {
		MyThird() {
			setTitle("단골손님 사진");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setSize(300, 400);
			setLocation(1050, 0);
			setVisible(true);
		}
	}
	class MyMouseListener extends MouseAdapter {  // 미션 3 마우스 이벤트
		public void mouseEntered(MouseEvent e){
			for(int i=0; i<12; i++)
				if(e.getSource() == tbtn[i] && tbtn[i].getBackground() == Color.WHITE)
					tbtn[i].setBackground(Color.LIGHT_GRAY);
		}
		public void mouseExited(MouseEvent e){
			for(int i=0; i<12; i++)
				if(e.getSource() == tbtn[i] && tbtn[i].getBackground() == Color.LIGHT_GRAY)
					tbtn[i].setBackground(Color.WHITE);
		}
	}
	class MyActionListener implements ActionListener { // 미션 2 버튼 이벤트 처리 ActionListener // 이하 모두 이벤트처리 완료
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == tbtn[0]) {
				if(tbtn[0].getBackground() == Color.LIGHT_GRAY || tbtn[0].getBackground() == Color.YELLOW){
					Clickbtn2.setEnabled(false);
					clk.setVisible(true);
				}
				else if(tbtn[0].getBackground() == Color.GREEN){
					Clickbtn2.setEnabled(true);
					clk.setVisible(true);
				}			
				select = 1;
			} else if (e.getSource() == tbtn[1]) {
				if(tbtn[1].getBackground() == Color.LIGHT_GRAY || tbtn[1].getBackground() == Color.YELLOW){
					Clickbtn2.setEnabled(false);
					clk.setVisible(true);
				}
				else if(tbtn[1].getBackground() == Color.GREEN){
					Clickbtn2.setEnabled(true);
					clk.setVisible(true);
				}
				select = 2;
			} else if (e.getSource() == tbtn[2]) {
				if(tbtn[2].getBackground() == Color.LIGHT_GRAY || tbtn[2].getBackground() == Color.YELLOW){
					Clickbtn2.setEnabled(false);
					clk.setVisible(true);
				}
				else if(tbtn[2].getBackground() == Color.GREEN){
					Clickbtn2.setEnabled(true);
					clk.setVisible(true);
				}
				select = 3;
			} else if (e.getSource() == tbtn[3]) {
				if(tbtn[3].getBackground() == Color.LIGHT_GRAY || tbtn[3].getBackground() == Color.YELLOW){
					Clickbtn2.setEnabled(false);
					clk.setVisible(true);
				}
				else if(tbtn[3].getBackground() == Color.GREEN){
					Clickbtn2.setEnabled(true);
					clk.setVisible(true);
				}
				select = 4;
			} else if (e.getSource() == tbtn[4]) {
				if(tbtn[4].getBackground() == Color.LIGHT_GRAY || tbtn[4].getBackground() == Color.YELLOW){
					Clickbtn2.setEnabled(false);
					clk.setVisible(true);
				}
				else if(tbtn[4].getBackground() == Color.GREEN){
					Clickbtn2.setEnabled(true);
					clk.setVisible(true);
				}
				select = 5;
			} else if (e.getSource() == tbtn[5]) {
				if(tbtn[5].getBackground() == Color.LIGHT_GRAY || tbtn[5].getBackground() == Color.YELLOW){
					Clickbtn2.setEnabled(false);
					clk.setVisible(true);
				}
				else if(tbtn[5].getBackground() == Color.GREEN){
					Clickbtn2.setEnabled(true);
					clk.setVisible(true);
				}
				select = 6;
			} else if (e.getSource() == tbtn[6]) {
				if(tbtn[6].getBackground() == Color.LIGHT_GRAY || tbtn[6].getBackground() == Color.YELLOW){
					Clickbtn2.setEnabled(false);
					clk.setVisible(true);
				}
				else if(tbtn[6].getBackground() == Color.GREEN){
					Clickbtn2.setEnabled(true);
					clk.setVisible(true);
				}
				select = 7;
			} else if (e.getSource() == tbtn[7]) {
				if(tbtn[7].getBackground() == Color.LIGHT_GRAY || tbtn[7].getBackground() == Color.YELLOW){
					Clickbtn2.setEnabled(false);
					clk.setVisible(true);
				}
				else if(tbtn[7].getBackground() == Color.GREEN){
					Clickbtn2.setEnabled(true);
					clk.setVisible(true);
				}
				select = 8;
			} else if (e.getSource() == tbtn[8]) {
				if(tbtn[8].getBackground() == Color.LIGHT_GRAY || tbtn[8].getBackground() == Color.YELLOW){
					Clickbtn2.setEnabled(false);
					clk.setVisible(true);
				}
				else if(tbtn[8].getBackground() == Color.GREEN){
					Clickbtn2.setEnabled(true);
					clk.setVisible(true);
				}
				select = 9;
			} else if (e.getSource() == tbtn[9]) {
				if(tbtn[9].getBackground() == Color.LIGHT_GRAY || tbtn[9].getBackground() == Color.YELLOW){
					Clickbtn2.setEnabled(false);
					clk.setVisible(true);
				}
				else if(tbtn[9].getBackground() == Color.GREEN){
					Clickbtn2.setEnabled(true);
					clk.setVisible(true);
				}
				select = 10;
			} else if (e.getSource() == tbtn[10]) {
				if(tbtn[10].getBackground() == Color.LIGHT_GRAY || tbtn[10].getBackground() == Color.YELLOW){
					Clickbtn2.setEnabled(false);
					clk.setVisible(true);
				}
				else if(tbtn[10].getBackground() == Color.GREEN){
					Clickbtn2.setEnabled(true);
					clk.setVisible(true);
				}
				select = 11;
			} else if (e.getSource() == tbtn[11]) {
				if(tbtn[11].getBackground() == Color.LIGHT_GRAY || tbtn[11].getBackground() == Color.YELLOW){
					Clickbtn2.setEnabled(false);
					clk.setVisible(true);
				}
				else if(tbtn[11].getBackground() == Color.GREEN){
					Clickbtn2.setEnabled(true);
					clk.setVisible(true);
				}
				select = 12;
			}
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		new LastMission15();
	}
}