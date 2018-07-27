package mordad_5.form;

import tamrin_5.dao.TeacherDao;

import javax.swing.*;
import javax.swing.table.TableColumn;

public class TeacherList {
    public JTable table1;
    public JPanel teacherListPanel;

    public TeacherList(){
        TeacherDao teacherDao=new TeacherDao();

        TableColumn tcl=new TableColumn(0);
        tcl.setHeaderValue("id");
        table1.addColumn(tcl);
        tcl.setHeaderValue("fname");
        table1.addColumn(tcl);
        tcl.setHeaderValue("lname");
        table1.addColumn(tcl);
        tcl.setHeaderValue("department");
        table1.addColumn(tcl);

//        table1.setModel();
    }
}
