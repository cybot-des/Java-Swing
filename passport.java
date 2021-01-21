import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.BorderFactory;

public class passport extends JFrame implements ActionListener
{
JFrame f,f1,f2,f3,f4,f6;

JLabel l0,lq,l1,l2,l3,l4,l,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38,l39,l40,l41,l42,l43,l44,l45,l46,l47,l48,l49,l50,l51,l52,l53;
JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,r20,r21,r22,r23,r24,r25,r26,r27,r28,r29,r30,r31,r32,r33,r34,r35,r36,r37,r38,r39,r40,r41,r42,r43,r44,r45,r46,r47,r48,r49,r50,r51,r52,r53,r54,r55,r56,r57,r59,r58,r60,r61,r62,r63;
JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15,tf16,tf17,tf18,tf19,tf20;
JScrollBar s;
ImageIcon pic;
JComboBox cb;
JButton b1,b2,b3,b4,b5;
ButtonGroup bg,bg1,bg2,bg3,bg4,bg5,bg6,bg7,bg8,bg9,bg10,bg11,bg12,bg13,bg14,bg15,bg16,bg17,bg18,bg19,bg20,bg21,bg22,bg23,bg24;
String gender[]={"Male","Female","Other"};

passport()
{
f=new JFrame("frame");

pic=new ImageIcon("lo.jpg");
l0=new JLabel(pic);
l0.setBounds(70,10,50,40);
lq=new JLabel("                                            INDIAN  PASSPORT  APPLICATION  FORM");
lq.setBounds(5,10,510,40);
Border bq=BorderFactory.createLineBorder(Color.BLUE);
lq.setBorder(bq);
//s=new JScrollBar();
//s.setBounds(510,0,10,700);

l1=new JLabel("Applying For*:");
l1.setBounds(10,50,100,20);
bg=new ButtonGroup();
r1=new JRadioButton("Fresh Passport");
r1.setBounds(150,50,150,20);
r2=new JRadioButton("Re-issue of passport");
r2.setBounds(300,50,150,20);
bg.add(r1);
bg.add(r2);

l2=new JLabel("Application Type* :");
l2.setBounds(10,100,150,20);
bg1=new ButtonGroup();
r3=new JRadioButton("Normal");
r3.setBounds(150,100,150,20);
r4=new JRadioButton("Tatkaal");
r4.setBounds(300,100,150,20);
bg1.add(r3);
bg1.add(r4);

l5=new JLabel("Type Of Passport Booklet:");
l5.setBounds(10,150,200,20);
bg2=new ButtonGroup();
r5=new JRadioButton("36 pages");
r5.setBounds(250,150,100,20);
r6=new JRadioButton("60 pages");
r6.setBounds(350,150,100,20);
bg2.add(r5);
bg2.add(r6);

l3=new JLabel("APPLICANT'S DETAILS");
l3.setBounds(10,180,500,20);
l3.setOpaque(true);
l3.setBackground(Color.YELLOW);

l4=new JLabel("Applicant's Given Name (Given Name Means First Name Followed By Middle Name) :");
l4.setBounds(10,230,500,20);
tf1=new JTextField();
tf1.setBounds(10,250,500,20);

l=new JLabel("Surname :");
l.setBounds(10,300,150,20);
tf2=new JTextField();
//tf2.setBackground(Color.lightBlue );
tf2.setBounds(10,320,500,20);

l6=new JLabel("Gender :");
l6.setBounds(10,370,150,20);
bg3=new ButtonGroup();
r7=new JRadioButton("Male");
r7.setBounds(10,390,70,20);
r8=new JRadioButton("Female");
r8.setBounds(100,390,70,20);
r9=new JRadioButton("Other");
r9.setBounds(190,390,70,20);
bg3.add(r7);
bg3.add(r8);
bg3.add(r9);

l7=new JLabel("Are you known by any other names(aliases)? :");
l7.setBounds(10,440,500,20);
r10=new JRadioButton("Yes");
r10.setBounds(10,460,60,20);
r11=new JRadioButton("No");
r11.setBounds(90,460,60,20);
bg4=new ButtonGroup();
bg4.add(r10);
bg4.add(r11);

l8=new JLabel("Date of Birth (DD/MM/YYYY) :");
l8.setBounds(10,510,200,20);
tf3=new JTextField();
tf3.setBounds(230,510,150,20);

l9=new JLabel("PLACE OF BIRTH ");
l9.setBounds(10,560,500,20);
l9.setBackground(Color.YELLOW);
l9.setOpaque(true);

l10=new JLabel("Is your Place of Birth out of India? :");
l10.setBounds(10,610,200,20);
bg5=new ButtonGroup();
r12=new JRadioButton("Yes");
r12.setBounds(230,610,60,20);
r13=new JRadioButton("No");
r13.setBounds(310,610,60,20);
bg5.add(r12);
bg5.add(r13);

l11=new JLabel("Village or Town or City :");
l11.setBounds(10,660,170,20);
tf4=new JTextField();
tf4.setBounds(190,660,170,20);
l12=new JLabel("Marital Status :");
l12.setBounds(10,710,100,20);
r14=new JRadioButton("Single");
r14.setBounds(120,710,80,20);
r15=new JRadioButton("Married");
r15.setBounds(210,710,80,20);
r16=new JRadioButton("Divorced");
r16.setBounds(310,710,80,20);
r17=new JRadioButton("Widower");
r17.setBounds(410,710,80,20);
bg6=new ButtonGroup();
bg6.add(r14);
bg6.add(r15);
bg6.add(r16);
bg6.add(r17);

b1=new JButton("Next Page");
b1.setBounds(200,760,120,30);
b1.setBackground(Color.YELLOW);
b1.addActionListener(this);


//cb=new JComboBox(gender);
//cb.setBounds(170,370,150,20);



f.add(l0);
f.add(lq);
f.add(r1);
f.add(r2);
f.add(l1);
f.add(tf1);
f.add(l2);
f.add(r3);
f.add(r4);
f.add(l3);
f.add(l4);
f.add(l);
f.add(tf2);
f.add(l5);
f.add(r5);
f.add(r6);
f.add(l6);
f.add(r7);
f.add(r8);
f.add(r9);
f.add(l7);
f.add(r10);
f.add(r11);
f.add(l8);
f.add(tf3);
f.add(l9);
f.add(l10);
f.add(r12);
f.add(r13);
f.add(l11);
f.add(tf4);
f.add(l12);
f.add(r15);
f.add(r17);
f.add(r16);
f.add(r14);
f.add(b1);


f.setSize(540,1500);
f.setLayout(null);
f.setVisible(true);
//f.setBackground(Color.WHITE);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}


public void actionPerformed(ActionEvent ae)
{

if(ae.getSource()==b1)
{
f1=new JFrame();

l13=new JLabel("Citizenship of India by :");
l13.setBounds(10,50,150,20);
r18=new JRadioButton("Birth");
r18.setBounds(170,50,90,20);
r19=new JRadioButton("Descent");
r19.setBounds(280,50,90,20);
r20=new JRadioButton("Registration/Natuaralization");
r20.setBounds(390,50,90,20);
bg7=new ButtonGroup();
bg7.add(r18);
bg7.add(r19);
bg7.add(r20);

l14=new JLabel("PAN (If available) :");
l14.setBounds(10,100,120,20);
tf5=new JTextField();
tf5.setBounds(140,100,150,20);

l15=new JLabel("Voter ID ( If available) :");
l15.setBounds(10,150,150,20);
tf6=new JTextField();
tf6.setBounds(170,150,150,20);

l16=new JLabel("Employment Type :");
l16.setBounds(10,200,150,20);
bg8=new ButtonGroup();
r21=new JRadioButton("Owners,Partners & Directors of Companies which are members of CII, FICII & ASSOCHAM");
r21.setBounds(10,220,550,20);
r22=new JRadioButton("Private");
r22.setBounds(10,240,100,20);
r23=new JRadioButton("Homemaker");
r23.setBounds(120,240,100,20);
r24=new JRadioButton("Self-Employed");
r24.setBounds(230,240,150,20);
r25=new JRadioButton("Not Employed");
r25.setBounds(10,280,160,20);
r26=new JRadioButton("PSU");
r26.setBounds(400,240,120,20);
r27=new JRadioButton("Retired Government Servant");
r27.setBounds(10,260,190,20);
r28=new JRadioButton("Retired Private Service");
r28.setBounds(210,260,190,20);
r29=new JRadioButton("Government");
r29.setBounds(400,260,120,20);
bg8.add(r21);
bg8.add(r22);
bg8.add(r23);
bg8.add(r24);
bg8.add(r25);
bg8.add(r26);
bg8.add(r27);
bg8.add(r28);
bg8.add(r29);

l17=new JLabel("Is either of your parent (in case of minor)/ spouse, a government servant? :");
l17.setBounds(10,310,500,20);
bg9=new ButtonGroup();
r30=new JRadioButton("Yes");
r30.setBounds(10,330,50,20);
r31=new JRadioButton("No");
r31.setBounds(70,330,50,20);
bg9.add(r30);
bg9.add(r31);

l18=new JLabel("Educational Qualification :");
l18.setBounds(10,380,150,20);
bg10=new ButtonGroup();
r32=new JRadioButton("7th pass or less");
r32.setBounds(170,380,150,20);
r33=new JRadioButton("Between 8th and 9th standard");
r33.setBounds(350,380,200,20);
r34=new JRadioButton("10th standard and above");
r34.setBounds(170,400,170,20);
r35=new JRadioButton("Graduate and above");
r35.setBounds(350,400,200,20);
bg10.add(r32);
bg10.add(r33);
bg10.add(r34);
bg10.add(r35);

l19=new JLabel("Are you eligible for Non-ECR category? :");
l19.setBounds(10,450,500,20);
bg11=new ButtonGroup();
r36=new JRadioButton("Yes");
r36.setBounds(10,480,50,20);
r37=new JRadioButton("No");
r37.setBounds(70,480,50,20);
bg11.add(r36);
bg11.add(r37);

l20=new JLabel("Visible Distinguishing Mark :");
l20.setBounds(10,530,170,20);
tf7=new JTextField();
tf7.setBounds(190,530,150,20);

l21=new JLabel("Aadhaar Number :");
l21.setBounds(10,580,150,20);
tf8=new JTextField();
tf8.setBounds(190,580,150,20);

l22=new JLabel("<html> I, the holder of above mentioned Aadhaar Number , hereby give my consent to Passport Seva <br> to obtain my Aadhaar Number, Name and Fingerprint/Iris for authentication with UIDAI. I have <br>  no objection using my identity and biometric information for validation with Aadhaar (CIDR) <br> database only for the purpose of authentication. </html>");
l22.setBounds(10,630,550,120);
Border bo = BorderFactory.createLineBorder(Color.BLUE,1);
l22.setBorder(bo);
l23=new JLabel("I agree");
l23.setBounds(30,720,90,20);
bg12=new ButtonGroup();
r38=new JRadioButton("Yes");
r38.setBounds(110,720,70,20);
r39=new JRadioButton("No");
r39.setBounds(190,720,70,20);
bg12.add(r38);
bg12.add(r39);
b2=new JButton("Next Page");
b2.setBounds(230,760,120,30);
b2.setBackground(Color.YELLOW);
b2.addActionListener(this);


f1.add(l13);
f1.add(r18);
f1.add(r19);
f1.add(r20);
f1.add(l14);
f1.add(tf5);
f1.add(l15);
f1.add(tf6);
f1.add(l16);
f1.add(r21);
f1.add(r22);
f1.add(r23);
f1.add(r24);
f1.add(r25);
f1.add(r26);
f1.add(r27);
f1.add(r28);
f1.add(r29);
f1.add(l17);
f1.add(r30);
f1.add(r31);
f1.add(l18);
f1.add(r32);
f1.add(r33);
f1.add(r34);
f1.add(r35);
f1.add(r36);
f1.add(r37);
f1.add(l19);
f1.add(l20);
f1.add(tf7);
f1.add(l21);
f1.add(tf8);
f1.add(l22);
f1.add(l23);
f1.add(r38);
f1.add(r39);
f1.add(b2);


f1.setSize(600,1500);
f1.setLayout(null);
f1.setVisible(true);
}



if(ae.getSource()==b2)
{
f2=new JFrame();
l24=new JLabel(" FAMILY DETAILS (FATHER / MOTHER / LEGAL GUARDIAN DETAILS ; AT LEAST ONE IS MANDATORY.)*");
l24.setBackground(Color.YELLOW);
l24.setOpaque(true);
l24.setBounds(10,50,650,20);
l25=new JLabel("Father's Given Name (Given Name means First Name followed by Middle Name (If any)) :");
l25.setBounds(10,80,650,20);
tf9=new JTextField();
tf9.setBounds(10,100,600,20);

l26=new JLabel("Surname :");
l26.setBounds(10,150,150,20);
tf10=new JTextField();
tf10.setBounds(10,170,600,20);

l27=new JLabel("Legal Guardian's Given Name (if applicable) :");
l27.setBounds(10,220,600,20);
tf11=new JTextField();
tf11.setBounds(10,240,600,20);

l28=new JLabel("Surname :");
l28.setBounds(10,290,170,20);
tf12=new JTextField();
tf12.setBounds(10,310,600,20);

l29=new JLabel("Mother's Given Name (Given Name means First Name followed by Middle Name (If any)) :");
l29.setBounds(10,360,600,20);
tf13=new JTextField();
tf13.setBounds(10,380,600,20);

l30=new JLabel("Surname :");
l30.setBounds(10,430,600,20);
tf14=new JTextField();
tf14.setBounds(10,450,600,20);


l31=new JLabel(" PRESENT RESIDENTIAL ADDRESS DETAILS (WHERE APPLICANT RESIDES) ");
l31.setBackground(Color.YELLOW);
l31.setOpaque(true);
l31.setBounds(10,500,650,20);


l32=new JLabel("Is your present address out of India? :");
l32.setBounds(10,550,230,20);
bg13=new ButtonGroup();
r40=new JRadioButton("Yes");
r40.setBounds(240,550,70,20);
r41=new JRadioButton("No");
r41.setBounds(320,550,70,20);
bg13.add(r41);
bg13.add(r40);


l33=new JLabel("Do you have a Permanent Address? :");
l33.setBounds(10,600,230,20);
bg14=new ButtonGroup();
r42=new JRadioButton("Yes");
r42.setBounds(240,600,70,20);
r43=new JRadioButton("No");
r43.setBounds(320,600,70,20);
bg14.add(r43);
bg14.add(r42);

l34=new JLabel("EMERGENCY CONTACT DETAILS");
l34.setBounds(10,650,650,20);
l34.setOpaque(true);
l34.setBackground(Color.YELLOW);
l35=new JLabel("Name and Address :");
l35.setBounds(10,700,120,20);
tf15=new JTextField();
tf15.setBounds(10,730,600,20);


b3=new JButton("Next Page");
b3.setBackground(Color.YELLOW);
b3.setBounds(230,760,120,30);
b3.addActionListener(this);


f2.add(l24);
f2.add(l25);
f2.add(tf9);
f2.add(l26);
f2.add(tf10);
f2.add(l27);
f2.add(tf11);
f2.add(l28);
f2.add(tf12);
f2.add(l29);
f2.add(tf13);
f2.add(l30);
f2.add(tf14);
f2.add(l31);
f2.add(l32);
f2.add(r40);
f2.add(r41);
f2.add(l33);
f2.add(r42);
f2.add(r43);
f2.add(l34);
f2.add(l35);
f2.add(tf15);
f2.add(b3);

f2.setSize(700,1500);
f2.setLayout(null);
f2.setVisible(true);
}


if(ae.getSource()==b3)
{
f3=new JFrame();
l36=new JLabel("Mobile Number :");
l36.setBounds(10,50,120,20);
tf16=new JTextField();
tf16.setBounds(140,50,150,20);

l37=new JLabel("Telephone Number :");
l37.setBounds(330,50,150,20);
tf17=new JTextField();
tf17.setBounds(480,50,150,20);

l38=new JLabel("E-mail ID :");
l38.setBounds(10,100,120,20);
tf18=new JTextField();
tf18.setBounds(140,100,490,20);

l39=new JLabel("IDENTITY CERTIFICATE / PASSPORT DETAILS");
l39.setBackground(Color.YELLOW);
l39.setOpaque(true);
l39.setBounds(10,150,650,20);

l40=new JLabel("Have you ever held/hold any Identity Certificate? :");
l40.setBounds(10,200,300,20);
bg16=new ButtonGroup();
r46=new JRadioButton("Yes");
r46.setBounds(320,200,70,20);
r47=new JRadioButton("No");
r47.setBounds(400,200,50,20);
bg16.add(r46);
bg16.add(r47);

l41=new JLabel("<html> (Identity Certificate(IC) is normally issued to Tibetan/other stateless people residing in India) <br> Details of Previous/Current Diplomatic/Official Passport :</html>");
l41.setBounds(10,220,550,90);
bg17=new ButtonGroup();
r48=new JRadioButton("Details Available");
r48.setBounds(10,295,120,20);
r49=new JRadioButton("Details Not Available/Never Held Diplomatic/Official Passport ");
r49.setBounds(150,295,400,20);
bg17.add(r48);
bg17.add(r49);

l42=new JLabel("Have you ever applied for passport, but not issued? :");
l42.setBounds(10,335,300,20);
bg18=new ButtonGroup();
r50=new JRadioButton("Yes");
r50.setBounds(332,335,70,20);
r51=new JRadioButton("No");
r51.setBounds(412,335,50,20);
bg18.add(r51);
bg18.add(r50);

l43=new JLabel("OTHER DETAILS");
l43.setBounds(10,385,650,20);
l43.setBackground(Color.YELLOW);
l43.setOpaque(true);

l44=new JLabel("<html>1) Have you ever been charged with criminal proceedings or any arrest warrant<br>/ summon pending  before a court of India? *</html>");
l44.setBounds(10,390,500,90);
bg19=new ButtonGroup();
r52=new JRadioButton("Yes");
r52.setBounds(520,415,50,20);
r53=new JRadioButton("No");
r53.setBounds(580,415,50,20);
bg19.add(r52);
bg19.add(r53);

l45=new JLabel("<html>2) Have you at any time during the period of 5 years immediately preceding the <br>date of this application  been convicted by a court in India for any criminal <br>offence and sentenced to imprisonment  for  two  years or more? *</html>");
l45.setBounds(10,435,500,100);
bg20=new ButtonGroup();
r54=new JRadioButton("Yes");
r54.setBounds(520,455,50,20);
r55=new JRadioButton("No");
r55.setBounds(580,455,50,20);
bg20.add(r54);
bg20.add(r55);

l46=new JLabel("3) Have you ever been refused or denied passport? *");
l46.setBounds(10,530,300,20);
bg21=new ButtonGroup();
r56=new JRadioButton("Yes");
r56.setBounds(520,530,50,20);
r57=new JRadioButton("No");
r57.setBounds(580,530,50,20);
bg21.add(r57);
bg21.add(r56);

l47=new JLabel("4) Has your Passport ever been impounded or Revoked? *");
l47.setBounds(10,550,400,20);
bg22=new ButtonGroup();
r58=new JRadioButton("Yes");
r58.setBounds(520,550,50,20);
r59=new JRadioButton("No");
r59.setBounds(580,550,50,20);
bg22.add(r58);
bg22.add(r59);

l48=new JLabel("5) Have you ever applied for/ been granted political asylum to/ by any foreign country? ");
l48.setBounds(10,590,500,20);
bg23=new ButtonGroup();
r60=new JRadioButton("Yes");
r60.setBounds(520,590,50,20);
r61=new JRadioButton("No");
r61.setBounds(580,590,50,20);
bg23.add(r60);
bg23.add(r61);

l49=new JLabel("<html>6) Have you ever returned to India on Emergency Certificate (EC) or were ever deported<br> or repatriated? *</html>");
l49.setBounds(10,630,500,30);
bg24=new ButtonGroup();
r62=new JRadioButton("Yes");
r62.setBounds(520,630,50,20);
r63=new JRadioButton("No");
r63.setBounds(580,630,50,20);
bg24.add(r60);
bg24.add(r61);

b4=new JButton("Next Page");
b4.setBounds(250,760,120,30);
b4.setBackground(Color.YELLOW);
b4.addActionListener(this);


f3.add(l36);
f3.add(tf16);
f3.add(l37);
f3.add(tf17);
f3.add(l38);
f3.add(tf18);
f3.add(l39);
f3.add(l40);
f3.add(r46);
f3.add(r47);
f3.add(l41);
f3.add(r48);
f3.add(r49);
f3.add(l42);
f3.add(r50);
f3.add(r51);
f3.add(l43);
f3.add(l44);
f3.add(r52);
f3.add(r53);
f3.add(l45);
f3.add(r54);
f3.add(r55);
f3.add(l46);
f3.add(r56);
f3.add(r57);
f3.add(l47);
f3.add(r58);
f3.add(r59);
f3.add(l48);
f3.add(r60);
f3.add(r61);
f3.add(l49);
f3.add(r63);
f3.add(r62);
f3.add(b4);


f3.setSize(700,1500);
f3.setLayout(null);
f3.setVisible(true);

}

if(ae.getSource()==b4)
{
f4=new JFrame();

l50=new JLabel("<html><b><strong><u>Self Declaration</u></strong></b><br> I owe allegiance to the sovereignty , unity & integrity of India,  and have not voluntarily acquired citizenship or travel document of any <br>other country. I have not lost, surrendered or been deprived of the the citizenship of India and I affirm that the information given by me in <br>this form and the enclosures is true and I solely responsible for its accuracy, and I am liable to be penalized or prosecuted if found <br>otherwise. I am aware that under the Passport Act, 1967 it is a criminal offence to furnish any false information or to suppress any material <br>information with a view to obtaining passport or travel document. </html>");
l50.setBounds(10,50,650,250);
Border bo2=BorderFactory.createBevelBorder(BevelBorder.LOWERED);
l50.setBorder(bo2);
JCheckBox c1=new JCheckBox("I agree");
c1.setBounds(20,260,100,20);

l51=new JLabel("Place *:");
l51.setBounds(10,320,70,20);
tf19=new JTextField();
tf19.setBounds(80,320,200,20);

l52=new JLabel("Date (DD/MM/YYYY) *:");
l52.setBounds(300,320,130,20);
tf20=new JTextField();
tf20.setBounds(440,320,200,20);

l53=new JLabel("<html>NOTE :<br> Applicants are required to submit the proof of address of the present address only, irrespective of the date from which he/she has been <br>residing at the given address. However, he/she is required to mention all the places of stay during previous one year (from the date of<br>application filling) in the Passport application form.</html>");
l53.setBounds(10,380,650,100);
Border bo3=BorderFactory.createLineBorder(Color.RED,1);
l53.setBorder(bo3);

b5=new JButton("Submit");
b5.setBounds(250,560,120,30);
b5.setBackground(Color.YELLOW);
b5.addActionListener(this);

cb=new JComboBox(gender);
cb.setBounds(250,600,120,30);


f4.add(l50);
f4.add(c1);
f4.add(l51);
f4.add(tf19);
f4.add(l52);
f4.add(tf20);
f4.add(l53);
f4.add(b5);
f4.add(cb);


f4.setSize(700,1500);
f4.setLayout(null);
f4.setVisible(true);
}

if(ae.getSource()==b5)
{
f6=new JFrame();
JOptionPane.showMessageDialog(f6,"Application Accepted!!"); 
//f6.setSize(300,300);
//f6.setLayout(null);
//f6.setVisible(true);
}

}


public static void main(String args[])
{
passport p1=new passport();
}
}