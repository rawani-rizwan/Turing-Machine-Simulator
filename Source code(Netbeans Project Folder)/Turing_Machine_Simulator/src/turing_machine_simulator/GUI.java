package turing_machine_simulator;

class Filter extends javax.swing.filechooser.FileFilter{
     public String getDescription() {
        return "Turing Machine Files(*.tm)";
     }
     public boolean accept(java.io.File f) {
        if (f.isDirectory()) {
            return true;

        }
        String extension = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');
        if (i > 0 &&  i < s.length() - 1) {
            extension = s.substring(i+1).toLowerCase();
        }
        if (extension != null) {
            if (extension.equals("tm")) {
                    return true;
            } else {
                return false;
            }
        }

        return false;
    }
}
public class GUI extends javax.swing.JFrame {

    TuringMachine tm=new TuringMachine();
    public NewProjectPanel newprojectpanel;
    public ExecutionPanel executionpanel;
    public javax.swing.JFileChooser fc=new javax.swing.JFileChooser();
    public GUI() {
        initComponents();
        newprojectpanel=new NewProjectPanel(this);
        executionpanel=new ExecutionPanel(this);
        this.setContentPane(this.newprojectpanel);
        fc.setAcceptAllFileFilterUsed(false);
        fc.addChoosableFileFilter(new Filter());
        this.setTitle("Turing Machine Simulator ("+tm.getName()+")");
        addWindowListener(new java.awt.event.WindowAdapter(){public void windowClosing(java.awt.event.WindowEvent we){
            int choice=javax.swing.JOptionPane.showConfirmDialog(newprojectpanel.gui,"Do you want to save changes made to "+tm.getName()+"?", "Save File",javax.swing.JOptionPane.YES_NO_CANCEL_OPTION);
            boolean isSaved=true;
            if(choice==javax.swing.JOptionPane.YES_OPTION){
            isSaved=save();
            if(!isSaved)
            return;
            System.exit(0);
            }
            else if (choice==javax.swing.JOptionPane.NO_OPTION)
                System.exit(0);

        }});

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuBar = new javax.swing.JMenuBar();
        File_Menu = new javax.swing.JMenu();
        New_Project = new javax.swing.JMenuItem();
        Open_Project = new javax.swing.JMenuItem();
        Save_Project = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        Edit_Menu = new javax.swing.JMenu();
        Edit_Project = new javax.swing.JMenuItem();
        Help_Menu = new javax.swing.JMenu();
        About = new javax.swing.JMenuItem();
        Help_Contents = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Turing Machine Simulator");

        File_Menu.setMnemonic('F');
        File_Menu.setText("File");
        File_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                File_MenuMouseClicked(evt);
            }
        });

        New_Project.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        New_Project.setText("New Project");
        New_Project.setToolTipText("Creates New Turing Machine Project");
        New_Project.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                New_ProjectMouseClicked(evt);
            }
        });
        New_Project.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_ProjectActionPerformed(evt);
            }
        });
        File_Menu.add(New_Project);

        Open_Project.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        Open_Project.setText("Open Project");
        Open_Project.setToolTipText("Open Existing Project");
        Open_Project.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Open_ProjectActionPerformed(evt);
            }
        });
        File_Menu.add(Open_Project);

        Save_Project.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Save_Project.setText("Save Project");
        Save_Project.setToolTipText("Save Current Project");
        Save_Project.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_ProjectActionPerformed(evt);
            }
        });
        File_Menu.add(Save_Project);

        Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        File_Menu.add(Exit);

        MenuBar.add(File_Menu);

        Edit_Menu.setMnemonic('E');
        Edit_Menu.setText("Edit");
        Edit_Menu.setToolTipText("");

        Edit_Project.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        Edit_Project.setText("Edit Project");
        Edit_Project.setToolTipText("Edit Current Project");
        Edit_Project.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_ProjectActionPerformed(evt);
            }
        });
        Edit_Menu.add(Edit_Project);

        MenuBar.add(Edit_Menu);

        Help_Menu.setMnemonic('H');
        Help_Menu.setText("Help");

        About.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        About.setText("About TM Simulator");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        Help_Menu.add(About);

        Help_Contents.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        Help_Contents.setText("Contents");
        Help_Contents.setToolTipText("Help Regarding Simulator");
        Help_Contents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Help_ContentsActionPerformed(evt);
            }
        });
        Help_Menu.add(Help_Contents);

        MenuBar.add(Help_Menu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1197, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void File_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_File_MenuMouseClicked
       
    }//GEN-LAST:event_File_MenuMouseClicked

    private void New_ProjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_New_ProjectMouseClicked
  
    }//GEN-LAST:event_New_ProjectMouseClicked

    private void New_ProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_ProjectActionPerformed
        int choice=javax.swing.JOptionPane.showConfirmDialog(this,"Do you want to save changes made to "+tm.getName()+"?","Save File",javax.swing.JOptionPane.YES_NO_CANCEL_OPTION);
        boolean isSaved=true;
        if(choice==javax.swing.JOptionPane.YES_OPTION){
            isSaved=save();
            if(!isSaved)
            return;
            this.tm=new TuringMachine();
            this.setTitle("Turing Machine Simulator ("+tm.getName()+")");
            newprojectpanel=new NewProjectPanel(this);
            executionpanel=new ExecutionPanel(this);
            this.setContentPane(newprojectpanel);
            this.validate();
        }
        else if (choice==javax.swing.JOptionPane.NO_OPTION){
            this.tm=new TuringMachine();
            this.setTitle("Turing Machine Simulator ("+tm.getName()+")");
            newprojectpanel=new NewProjectPanel(this);
            executionpanel=new ExecutionPanel(this);
            this.setContentPane(newprojectpanel);
            this.validate();
        }
    }//GEN-LAST:event_New_ProjectActionPerformed

    private void Edit_ProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_ProjectActionPerformed
        this.tm.setCurrentState(null);
        this.tm.setCurrentMove(null);
        this.setContentPane(newprojectpanel);
        this.validate();
        this.newprojectpanel.setDrawingArea();
        this.newprojectpanel.redrawMachine();
        
        
    }//GEN-LAST:event_Edit_ProjectActionPerformed

    public void open(){
       int returnVal = fc.showOpenDialog(this);
       if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {
            java.io.File file = fc.getSelectedFile();
            try{
                     String path=file.getPath();
                     String name=file.getName();
                     if(!(name.endsWith(".tm")))
                          name=name+".tm";
                     if(!(path.endsWith(".tm")))
                          path=path+".tm";
                    java.io.InputStream is = new java.io.FileInputStream(path);
                    java.io.InputStream buffer = new java.io.BufferedInputStream( is );
                    java.io.ObjectInput input = new java.io.ObjectInputStream ( buffer );
                    try{
                        tm = (TuringMachine)input.readObject();
                        tm.setName(name);
                        this.setTitle("Turing Machine Simulator ("+tm.getName()+")");
                        this.newprojectpanel=new NewProjectPanel(this);
                        this.executionpanel=new ExecutionPanel(this);
                        this.setContentPane(this.executionpanel);
                        this.executionpanel.initialize();
                        this.validate();
                        this.newprojectpanel.openFile();
                        this.executionpanel.redrawMachine();
                       }
                   finally{
                        input.close();
                        buffer.close();
                        is.close();
                          }
               }
            catch(java.io.FileNotFoundException ex){
                  javax.swing.JOptionPane.showMessageDialog(this,"The system cannot find the file specified!","File not found!",javax.swing.JOptionPane.ERROR_MESSAGE);
            }
           catch(java.io.IOException ex){
                 javax.swing.JOptionPane.showMessageDialog(this,"The file specified is not a valid Turing Machine file!","Action Failed",javax.swing.JOptionPane.INFORMATION_MESSAGE);

           }
           catch(java.lang.ClassNotFoundException ex){
                 javax.swing.JOptionPane.showMessageDialog(this,"Requested action could not be performed!","Action Failed",javax.swing.JOptionPane.INFORMATION_MESSAGE);
           }
       }
    }
    private void Open_ProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Open_ProjectActionPerformed
      int choice=javax.swing.JOptionPane.showConfirmDialog(this,"Do you want to save changes made to "+tm.getName()+"?","Save File!",javax.swing.JOptionPane.YES_NO_CANCEL_OPTION);
      boolean isSaved=false;
      if(choice==javax.swing.JOptionPane.YES_OPTION){
           isSaved=save();
           if(!isSaved)
           return;
           open();
      }
      else if(choice==javax.swing.JOptionPane.NO_OPTION)
           open();
    }//GEN-LAST:event_Open_ProjectActionPerformed

    public boolean save(){
        if(this.tm.getStartState()==null){
            javax.swing.JOptionPane.showMessageDialog(this,"Please Select a Start State before saving the file!","Action Cancelled",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return false;
        }

        if(this.tm.getHaltState()==null){
            javax.swing.JOptionPane.showMessageDialog(this,"Please Select a Halt State before saving the file!","Action Cancelled",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        int returnVal =fc.showSaveDialog(this);
        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {
            java.io.File file = fc.getSelectedFile();
             try{ if (file.exists()){
                  int choice=javax.swing.JOptionPane.showConfirmDialog(this,"OverWrite Existing File "+file.getName()+"?","Confirm Action!",javax.swing.JOptionPane.YES_NO_OPTION);
                  if (choice!=javax.swing.JOptionPane.YES_OPTION)
                      return save();
                  }
                  String path=file.getPath();
                  String name=file.getName();
                  if(!(name.endsWith(".tm")))
                          name=name+".tm";
                  if(!(path.endsWith(".tm")))
                          path=path+".tm";
                  java.io.OutputStream os = new java.io.FileOutputStream(path);
                  java.io.OutputStream buffer = new java.io.BufferedOutputStream( os );
                  java.io.ObjectOutput output = new java.io.ObjectOutputStream(buffer);
                  try{
                        output.writeObject(tm);
                        tm.setName(name);
                        this.setTitle("Turing Machine Simulator ("+tm.getName()+")");
                     }
                  finally{
                        output.close();
                        buffer.close();
                        os.close();
                         }
                }
             catch(Exception ex){
             javax.swing.JOptionPane.showMessageDialog(this,"Requested action could not be performed!","Action Failed",javax.swing.JOptionPane.INFORMATION_MESSAGE);
             }
             return true;
        }
        return false;
    }
    private void Save_ProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_ProjectActionPerformed
       save();
    }//GEN-LAST:event_Save_ProjectActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
       int choice=javax.swing.JOptionPane.showConfirmDialog(this,"Do you want to save changes made to "+tm.getName()+"?", "Save File",javax.swing.JOptionPane.YES_NO_CANCEL_OPTION);
            boolean isSaved=true;
            if(choice==javax.swing.JOptionPane.YES_OPTION){
            isSaved=save();
            if(!isSaved)
            return;
            System.exit(0);
            }
            else if (choice==javax.swing.JOptionPane.NO_OPTION)
                System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        javax.swing.JOptionPane.showMessageDialog(this,"This Simulator has been developped by the following students of IET-DAVV\nso as to fulfill the Project requirement in thier B.E curriculum under the \nguidance of Dr. Manohar Chandwani and Mr. Arpit Agrawal -:\n\nMohammed Rizwan Rawani(7C6057)\nNupoor Deobhakta(7C6068)\nShubham Agrawal(7C6104)\nTanya Jain(7C6112)","About Turing Machine Simulator",javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_AboutActionPerformed

    private void Help_ContentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Help_ContentsActionPerformed
        String []s=new String [2];
        Help.main(s);
    }//GEN-LAST:event_Help_ContentsActionPerformed

   
    public static void main(String args[]) throws Exception {

        javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JMenu Edit_Menu;
    private javax.swing.JMenuItem Edit_Project;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenu File_Menu;
    private javax.swing.JMenuItem Help_Contents;
    private javax.swing.JMenu Help_Menu;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem New_Project;
    private javax.swing.JMenuItem Open_Project;
    private javax.swing.JMenuItem Save_Project;
    // End of variables declaration//GEN-END:variables

}
