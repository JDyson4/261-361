package View;


import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RIVER
 */
public class ECAMMainFrame extends javax.swing.JFrame {
    
    public DefaultTableModel dtm = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column){
            return false;
        }
    };
    
    /**
     * Creates new form JTableTest
     */
    public ECAMMainFrame() {
        initComponents();
        ImageIcon img = new ImageIcon("FinalLogo2.jpg");
        this.setIconImage(img.getImage());
        this.setTitle("Data Manager");
        deptsComboBox.addItem("Sales");
        deptsComboBox.addItem("Manufacturing");
        deptsComboBox.addItem("Human Resources");
        deptsComboBox.addItem("Engineering");
        deptsComboBox.setSelectedIndex(-1);
        reportDataTable.setModel(dtm);
        reportDataTable.getTableHeader().setResizingAllowed(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void getRowData1() {
        User user1 = new User(1,"Abby", "Williams", 12);
        User user2 = new User(2,"Bobby", "Xilliams", 22);
        User user3 = new User(3,"Cabby", "Yilliams", 32);
        User user4 = new User(4,"Dabby", "Zilliams", 42);
        User user5 = new User(5,"Ebby", "Qilliams", 52);
        User user6 = new User(6,"Flabby", "Rilliams", 62);
        User user7 = new User(7,"Gbby", "Silliams", 53);
        User user8 = new User(8,"Habby", "Tilliams", 43);
        User user9 = new User(9,"Ibby", "Uilliams", 33);
        User user10 = new User(10,"Jabby", "Villiams", 23);
        
        ArrayList<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);
        
        Object[] rowData = new Object[user1.getClass().getDeclaredFields().length];
        
        for(int i = 0; i < users.size(); i++)
        {
            rowData[0] = users.get(i).getId();
            rowData[1] = users.get(i).getfName();
            rowData[2] = users.get(i).getlName();
            rowData[3] = users.get(i).getAge();
            getDtm().addRow(rowData);
        }
    }
    
    public void getRowData2() {
        User2 user1 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user2 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user3 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user4 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user5 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user6 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user7 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user8 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user9 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user10 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user11 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user12 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user13 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user14 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user15 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user16 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user17 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user18 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user19 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user20 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user21 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user22 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user23 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user24 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user25 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user26 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user27 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user28 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user29 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user30 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user31 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user32 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user33 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user34 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user35 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user36 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user37 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user38 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user39 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user40 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user41 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user42 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user43 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user44 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user45 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user46 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user47 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user48 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user49 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user50 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user51 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user52 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user53 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user54 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user55 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user56 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user57 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user58 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user59 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user60 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user61 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user62 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user63 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user64 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user65 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user66 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user67 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user68 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user69 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user70 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user71 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user72 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user73 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user74 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user75 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user76 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user77 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user78 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user79 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user80 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user81 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user82 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user83 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user84 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user85 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user86 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user87 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user88 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user89 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user90 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user91 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user92 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user93 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user94 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user95 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user96 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user97 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user98 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user99 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user100 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user101 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user102 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user103 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user104 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user105 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user106 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user107 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user108 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user109 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user110 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user111 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user112 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user113 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user114 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user115 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user116 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user117 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user118 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user119 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        User2 user120 = new User2(1,"Abby", "Williams", 12, 1,"Abby", "Williams", 12,1,"Abby", "Williams", 12);
        
        ArrayList<User2> users = new ArrayList<User2>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);
        users.add(user11);
        users.add(user12);
        users.add(user13);
        users.add(user14);
        users.add(user15);
        users.add(user16);
        users.add(user17);
        users.add(user18);
        users.add(user19);
        users.add(user20);
        users.add(user21);
        users.add(user22);
        users.add(user23);
        users.add(user24);
        users.add(user25);
        users.add(user26);
        users.add(user27);
        users.add(user28);
        users.add(user29);
        users.add(user30);
        users.add(user31);
        users.add(user32);
        users.add(user33);
        users.add(user34);
        users.add(user35);
        users.add(user36);
        users.add(user37);
        users.add(user38);
        users.add(user39);
        users.add(user40);
        users.add(user41);
        users.add(user42);
        users.add(user43);
        users.add(user44);
        users.add(user45);
        users.add(user46);
        users.add(user47);
        users.add(user48);
        users.add(user49);
        users.add(user50);
        users.add(user51);
        users.add(user52);
        users.add(user53);
        users.add(user54);
        users.add(user55);
        users.add(user56);
        users.add(user57);
        users.add(user58);
        users.add(user59);
        users.add(user60);
        users.add(user61);
        users.add(user62);
        users.add(user63);
        users.add(user64);
        users.add(user65);
        users.add(user66);
        users.add(user67);
        users.add(user68);
        users.add(user69);
        users.add(user70);
        users.add(user71);
        users.add(user72);
        users.add(user73);
        users.add(user74);
        users.add(user75);
        users.add(user76);
        users.add(user77);
        users.add(user78);
        users.add(user79);
        users.add(user80);
        users.add(user81);
        users.add(user82);
        users.add(user83);
        users.add(user84);
        users.add(user85);
        users.add(user86);
        users.add(user87);
        users.add(user88);
        users.add(user89);
        users.add(user90);
        users.add(user91);
        users.add(user92);
        users.add(user93);
        users.add(user94);
        users.add(user95);
        users.add(user96);
        users.add(user97);
        users.add(user98);
        users.add(user99);
        users.add(user100);
        users.add(user101);
        users.add(user102);
        users.add(user103);
        users.add(user104);
        users.add(user105);
        users.add(user106);
        users.add(user107);
        users.add(user108);
        users.add(user109);
        users.add(user110);
        users.add(user111);
        users.add(user112);
        users.add(user113);
        users.add(user114);
        users.add(user115);
        users.add(user116);
        users.add(user117);
        users.add(user118);
        users.add(user119);
        users.add(user120);
        
        Object[] rowData = new Object[user1.getClass().getDeclaredFields().length];
        
        for(int i = 0; i < users.size(); i++)
        {
            rowData[0] = users.get(i).getId();
            rowData[1] = users.get(i).getfName();
            rowData[2] = users.get(i).getlName();
            rowData[3] = users.get(i).getAge();
            rowData[4] = users.get(i).getWorkNo();
            rowData[5] = users.get(i).getJob();
            rowData[6] = users.get(i).getEmployer();
            rowData[7] = users.get(i).getHours();
            rowData[8] = users.get(i).getHeight();
            rowData[9] = users.get(i).getnName();
            rowData[10] = users.get(i).getHello();
            rowData[11] = users.get(i).getWidth();
            getDtm().addRow(rowData);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        deptsLabel = new javax.swing.JLabel();
        deptsComboBox = new javax.swing.JComboBox<>();
        reportLabel = new javax.swing.JLabel();
        reportComboBox = new javax.swing.JComboBox<>();
        goButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        scrollbar = new javax.swing.JScrollPane();
        reportDataTable = new javax.swing.JTable();
        menubar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        saveItem = new javax.swing.JMenuItem();
        exitItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        insertItem = new javax.swing.JMenuItem();
        deleteItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(192, 197, 193));
        jPanel3.setPreferredSize(new java.awt.Dimension(600, 70));

        deptsLabel.setForeground(new java.awt.Color(3, 37, 78));
        deptsLabel.setText("Department:");

        deptsComboBox.setBackground(new java.awt.Color(240, 240, 240));
        deptsComboBox.setForeground(new java.awt.Color(3, 37, 78));
        deptsComboBox.setFocusable(false);

        reportLabel.setForeground(new java.awt.Color(3, 37, 78));
        reportLabel.setText("Report:");

        reportComboBox.setBackground(new java.awt.Color(240, 240, 240));
        reportComboBox.setForeground(new java.awt.Color(3, 37, 78));
        reportComboBox.setFocusable(false);
        reportComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportComboBoxActionPerformed(evt);
            }
        });

        goButton.setBackground(new java.awt.Color(3, 37, 78));
        goButton.setForeground(new java.awt.Color(240, 240, 240));
        goButton.setText("Go");
        goButton.setFocusable(false);
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(deptsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deptsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(reportLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reportComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(goButton)
                .addGap(51, 51, 51))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deptsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportLabel)
                    .addComponent(reportComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goButton)
                    .addComponent(deptsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(192, 197, 193));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollbar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Report Data:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(3, 37, 78))); // NOI18N
        scrollbar.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollbar.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        reportDataTable.setForeground(new java.awt.Color(3, 37, 78));
        reportDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        reportDataTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        reportDataTable.setRowHeight(50);
        reportDataTable.getTableHeader().setReorderingAllowed(false);
        scrollbar.setViewportView(reportDataTable);

        jPanel4.add(scrollbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 800, 560));

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );

        fileMenu.setForeground(new java.awt.Color(3, 37, 78));
        fileMenu.setText("File");
        fileMenu.setFocusable(false);

        saveItem.setText("Save Report As...");
        fileMenu.add(saveItem);

        exitItem.setText("Exit");
        fileMenu.add(exitItem);

        menubar.add(fileMenu);

        editMenu.setForeground(new java.awt.Color(3, 37, 78));
        editMenu.setText("Edit");
        editMenu.setFocusable(false);

        insertItem.setText("Insert Row");
        editMenu.add(insertItem);

        deleteItem.setText("Delete Row");
        deleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemActionPerformed(evt);
            }
        });
        editMenu.add(deleteItem);

        menubar.add(editMenu);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed

    }//GEN-LAST:event_goButtonActionPerformed

    private void reportComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportComboBoxActionPerformed

    private void deleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem deleteItem;
    private javax.swing.JComboBox<String> deptsComboBox;
    private javax.swing.JLabel deptsLabel;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton goButton;
    private javax.swing.JMenuItem insertItem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JComboBox<String> reportComboBox;
    private javax.swing.JTable reportDataTable;
    private javax.swing.JLabel reportLabel;
    private javax.swing.JMenuItem saveItem;
    private javax.swing.JScrollPane scrollbar;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the dtm
     */
    public DefaultTableModel getDtm() {
        return dtm;
    }

    /**
     * @return the deleteItem
     */
    public javax.swing.JMenuItem getDeleteItem() {
        return deleteItem;
    }

    /**
     * @return the deptsComboBox
     */
    public javax.swing.JComboBox<String> getDeptsComboBox() {
        return deptsComboBox;
    }

    /**
     * @return the exitItem
     */
    public javax.swing.JMenuItem getExitItem() {
        return exitItem;
    }

    /**
     * @return the goButton
     */
    public javax.swing.JButton getGoButton() {
        return goButton;
    }

    /**
     * @return the insertItem
     */
    public javax.swing.JMenuItem getInsertItem() {
        return insertItem;
    }

    /**
     * @return the reportComboBox
     */
    public javax.swing.JComboBox<String> getReportComboBox() {
        return reportComboBox;
    }

    /**
     * @return the reportDataTable
     */
    public javax.swing.JTable getReportDataTable() {
        return reportDataTable;
    }

    /**
     * @return the saveItem
     */
    public javax.swing.JMenuItem getSaveItem() {
        return saveItem;
    }

    /**
     * @return the scrollbar
     */
    public javax.swing.JScrollPane getScrollbar() {
        return scrollbar;
    }
}
