
package turing_machine_simulator;

class Filter2 extends javax.swing.filechooser.FileFilter{
     public String getDescription() {
        return "Text Document(*.txt)";
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
            if (extension.equals("txt")) {
                    return true;
            } else {
                return false;
            }
        }

        return false;
    }
}

public class ExecutionPanel extends javax.swing.JPanel {      
    GUI gui;
    int number_of_transitions=0,number_of_transitions_till_current_configuration=0;
    boolean stopped=false,paused=false,execution_started=false;
    java.util.Stack<Move> ExecutedMoves =new java.util.Stack<Move>();
   

    public ExecutionPanel(GUI g) {
        initComponents();
        gui=g;
        this.TapeArea=new javax.swing.JPanel();
        this.TapePane.setViewportView(this.TapeArea);
        this.SummaryArea.setEditable(false);
    }

    public void initialize(){
        this.stopped=this.paused=this.execution_started=false;
        this.ExecutedMoves.removeAllElements();
        this.number_of_transitions=this.number_of_transitions_till_current_configuration=0;
        this.SummaryArea.setText("");
        this.gui.setContentPane(this);
        this.Drawing_Area=this.gui.newprojectpanel.getDrawingArea();
        this.DrawingAreaTab.setViewportView(this.Drawing_Area);
        javax.swing.table.DefaultTableModel tableModel= new javax.swing.table.DefaultTableModel();
        tableModel.addColumn("Move Id");
        tableModel.addColumn("Current State");
        tableModel.addColumn("Current Symbol");
        tableModel.addColumn("Next State");
        tableModel.addColumn("New Symbol");
        tableModel.addColumn("Head Movement");
        this.TapeArea.removeAll();
        this.gui.tm.setInputString("");
        this.gui.tm.initialize();
        for(int j=0;j<this.gui.tm.getTape().getTapeLength();j++){
            javax.swing.JLabel l=new javax.swing.JLabel(" "+String.valueOf(this.gui.tm.getTape().getSymbol(j))+" ");
            if(j==this.gui.tm.getTape().getCurrentHeadPosition())
                l.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED));
            else
                l.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.BLACK));
            this.TapeArea.add(l);
            this.TapeArea.validate();
        }
        this.TapeArea.repaint();
       

        Move M;
        for(int i=0;i<this.gui.tm.getMoveCount();i++){
            M=this.gui.tm.getMove(i);
            if(M!=null)
                 tableModel.addRow(M.getTableEntry());
        }
        this.TransitionTable.setModel(tableModel);
        this.TransitionTable.setEnabled(false);
    
        
    }

    public void redrawMachine(){
      this.gui.newprojectpanel.redrawMachine();
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        SummaryPane = new javax.swing.JScrollPane();
        SummaryArea = new javax.swing.JTextArea();
        RightSplitPane = new javax.swing.JSplitPane();
        OptionPanel = new javax.swing.JPanel();
        Play = new javax.swing.JButton();
        StepForward = new javax.swing.JButton();
        InputString = new javax.swing.JTextField();
        InputStringLabel = new javax.swing.JLabel();
        Stop = new javax.swing.JButton();
        InitializeTape = new javax.swing.JButton();
        SaveSummary = new javax.swing.JButton();
        StepBackward = new javax.swing.JButton();
        BottomSplitPane = new javax.swing.JSplitPane();
        TabbedPane = new javax.swing.JTabbedPane();
        TransitionTableTab = new javax.swing.JScrollPane();
        TransitionTable = new javax.swing.JTable();
        DrawingAreaTab = new javax.swing.JScrollPane();
        Drawing_Area = new javax.swing.JPanel();
        TapePane = new javax.swing.JScrollPane();
        TapeArea = new javax.swing.JPanel();

        SplitPane.setResizeWeight(1.0);

        SummaryArea.setColumns(20);
        SummaryArea.setRows(5);
        SummaryPane.setViewportView(SummaryArea);

        SplitPane.setLeftComponent(SummaryPane);

        RightSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        Play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turing_machine_simulator/images/Play24.gif"))); // NOI18N
        Play.setToolTipText("Execute Machine ");
        Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayActionPerformed(evt);
            }
        });

        StepForward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turing_machine_simulator/images/StepForward24.gif"))); // NOI18N
        StepForward.setToolTipText("Execute Current Move ");
        StepForward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StepForwardActionPerformed(evt);
            }
        });

        InputStringLabel.setFont(new java.awt.Font("Tahoma", 1, 12));
        InputStringLabel.setText("Enter Input string :");

        Stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turing_machine_simulator/images/Stop24.gif"))); // NOI18N
        Stop.setToolTipText("Stop");
        Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopActionPerformed(evt);
            }
        });

        InitializeTape.setText("Initialize Tape");
        InitializeTape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InitializeTapeActionPerformed(evt);
            }
        });

        SaveSummary.setText("Save Summary");
        SaveSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveSummaryActionPerformed(evt);
            }
        });

        StepBackward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turing_machine_simulator/images/StepBack24.gif"))); // NOI18N
        StepBackward.setToolTipText("Execute Machine ");
        StepBackward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StepBackwardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OptionPanelLayout = new javax.swing.GroupLayout(OptionPanel);
        OptionPanel.setLayout(OptionPanelLayout);
        OptionPanelLayout.setHorizontalGroup(
            OptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OptionPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(SaveSummary)
                .addGap(13, 13, 13)
                .addComponent(StepBackward, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Play, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StepForward, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Stop, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InputStringLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InputString)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InitializeTape)
                .addContainerGap())
        );
        OptionPanelLayout.setVerticalGroup(
            OptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(OptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InitializeTape)
                    .addComponent(InputString, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputStringLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OptionPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(OptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(StepBackward, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Play, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StepForward, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Stop, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaveSummary))
                .addContainerGap())
        );

        RightSplitPane.setTopComponent(OptionPanel);

        BottomSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        BottomSplitPane.setResizeWeight(1.0);

        TabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                TabbedPaneStateChanged(evt);
            }
        });

        TransitionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Move Id", "Present State", "Current Symbol", "Next State", "New Symbol", "Head Movement"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TransitionTableTab.setViewportView(TransitionTable);

        TabbedPane.addTab("Transition Table", TransitionTableTab);

        javax.swing.GroupLayout Drawing_AreaLayout = new javax.swing.GroupLayout(Drawing_Area);
        Drawing_Area.setLayout(Drawing_AreaLayout);
        Drawing_AreaLayout.setHorizontalGroup(
            Drawing_AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1026, Short.MAX_VALUE)
        );
        Drawing_AreaLayout.setVerticalGroup(
            Drawing_AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );

        DrawingAreaTab.setViewportView(Drawing_Area);

        TabbedPane.addTab("State Diagram", DrawingAreaTab);

        BottomSplitPane.setTopComponent(TabbedPane);

        TapePane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        javax.swing.GroupLayout TapeAreaLayout = new javax.swing.GroupLayout(TapeArea);
        TapeArea.setLayout(TapeAreaLayout);
        TapeAreaLayout.setHorizontalGroup(
            TapeAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        TapeAreaLayout.setVerticalGroup(
            TapeAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        TapePane.setViewportView(TapeArea);

        BottomSplitPane.setRightComponent(TapePane);

        RightSplitPane.setRightComponent(BottomSplitPane);

        SplitPane.setRightComponent(RightSplitPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_TabbedPaneStateChanged

    }//GEN-LAST:event_TabbedPaneStateChanged

    private void InitializeTapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InitializeTapeActionPerformed
    this.SummaryArea.setText("");
    String S=this.InputString.getText();
    for(int i=0;i<S.length();i++){
        if(!this.gui.tm.alphabetContains(S.charAt(i))&&!(S.charAt(i)==this.gui.tm.getBlankSymbol())){
            javax.swing.JOptionPane.showMessageDialog(this,"'"+S.charAt(i)+"'"+" does not exist in Tape Alphabet","Invalid Input String!",javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
        }
    }
    this.number_of_transitions=this.number_of_transitions_till_current_configuration=0;
    this.stopped=this.paused=this.execution_started=false;
    this.ExecutedMoves.removeAllElements();
    this.TapeArea.removeAll();
        this.gui.tm.setInputString(S);
        this.gui.tm.initialize();
        for(int j=0;j<this.gui.tm.getTape().getTapeLength();j++){
            javax.swing.JLabel l=new javax.swing.JLabel(" "+String.valueOf(this.gui.tm.getTape().getSymbol(j))+" ");
            if(j==this.gui.tm.getTape().getCurrentHeadPosition())
                l.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED));
            else
                l.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.BLACK));
            this.TapeArea.add(l);
            this.TapeArea.validate();

        }
        this.TapeArea.repaint();
        this.redrawMachine();

    }//GEN-LAST:event_InitializeTapeActionPerformed

    private void StepForwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StepForwardActionPerformed
       Move M=this.gui.tm.getCurrentMove();
       if(!this.execution_started){
           this.SummaryArea.setText("");
           java.util.Date d=new java.util.Date();
           this.SummaryArea.append("\nExecution of the file "+this.gui.tm.getName()+"\nover the input string '"+this.gui.tm.getInputString()+"'.\nStarted on "+ d.toString());
           this.SummaryArea.append("\nInitial Configuration: <"+this.gui.tm.getCurrentState().getDescription()+",");
           for(int j=0;j<this.gui.tm.getTape().getTapeLength();j++){
               if(j==this.gui.tm.getTape().getCurrentHeadPosition()){
                   this.SummaryArea.append("[");
                   this.SummaryArea.append(String.valueOf(this.gui.tm.getTape().getSymbol(j)));
                   this.SummaryArea.append("]");
               }
               else
                this.SummaryArea.append(String.valueOf(this.gui.tm.getTape().getSymbol(j)));
           }
           this.execution_started=true;
           this.SummaryArea.append(">");
           
       }
       if(M!=null){
           this.ExecutedMoves.push(M);
           int status=this.gui.tm.executeCurrentMove();
           if(this.number_of_transitions==this.number_of_transitions_till_current_configuration){
               this.number_of_transitions++;
               this.SummaryArea.append("\n\nExecuted Transition: "+M.getDetail());
               this.SummaryArea.append("\nMoved to State: "+this.gui.tm.getCurrentState().getDescription());
               this.SummaryArea.append("\nCurrent Configuration: <"+this.gui.tm.getCurrentState().getDescription()+",");
                          for(int j=0;j<this.gui.tm.getTape().getTapeLength();j++){
               if(j==this.gui.tm.getTape().getCurrentHeadPosition()){
                   this.SummaryArea.append("[");
                   this.SummaryArea.append(String.valueOf(this.gui.tm.getTape().getSymbol(j)));
                   this.SummaryArea.append("]");
               }
               else
                this.SummaryArea.append(String.valueOf(this.gui.tm.getTape().getSymbol(j)));
           }
           this.execution_started=true;
           this.SummaryArea.append(">");
        }
           this.number_of_transitions_till_current_configuration++;
           if(status==TuringMachine.Machine_Halted){
              this.SummaryArea.append("\n\nMachine Halted Successfully!");
              this.SummaryArea.append("\nNo of Transitions: "+this.number_of_transitions);
              this.SummaryArea.append("\nFinal Configuration: <"+this.gui.tm.getCurrentState().getDescription()+",");
              for(int j=0;j<this.gui.tm.getTape().getTapeLength();j++){
               if(j==this.gui.tm.getTape().getCurrentHeadPosition()){
                   this.SummaryArea.append("[");
                   this.SummaryArea.append(String.valueOf(this.gui.tm.getTape().getSymbol(j)));
                   this.SummaryArea.append("]");
               }
               else
                this.SummaryArea.append(String.valueOf(this.gui.tm.getTape().getSymbol(j)));
              }
             this.execution_started=true;
             this.SummaryArea.append(">");

           }
           else if (status==TuringMachine.Machine_Crashed){
              this.SummaryArea.append("\n\nMachine Crashed");
              this.SummaryArea.append("\nNo of Transitions = "+this.number_of_transitions);
              this.SummaryArea.append("\nFinal Configuration: <"+this.gui.tm.getCurrentState().getDescription()+",");
              for(int j=0;j<this.gui.tm.getTape().getTapeLength();j++){
               if(j==this.gui.tm.getTape().getCurrentHeadPosition()){
                   this.SummaryArea.append("[");
                   this.SummaryArea.append(String.valueOf(this.gui.tm.getTape().getSymbol(j)));
                   this.SummaryArea.append("]");
               }
               else
                this.SummaryArea.append(String.valueOf(this.gui.tm.getTape().getSymbol(j)));
              }
             this.execution_started=true;
             this.SummaryArea.append(">");
           }
           this.TapeArea.removeAll();
           for(int j=0;j<this.gui.tm.getTape().getTapeLength();j++){
                javax.swing.JLabel l=new javax.swing.JLabel(" "+String.valueOf(this.gui.tm.getTape().getSymbol(j))+" ");
                if(j==this.gui.tm.getTape().getCurrentHeadPosition())
                   l.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED));
                else
                   l.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.BLACK));
                this.TapeArea.add(l);
                this.TapeArea.validate();

           }
           this.TapeArea.repaint();
           this.redrawMachine();
   
       }
       else if(this.gui.tm.getCurrentState()==this.gui.tm.getHaltState()){
            this.SummaryArea.append("\n\nMachine Halted Successfully!");
            this.SummaryArea.append("\nNo of Transitions = "+this.number_of_transitions);
            this.SummaryArea.append("\nFinal Configuration: <"+this.gui.tm.getCurrentState().getDescription()+",");
               for(int j=0;j<this.gui.tm.getTape().getTapeLength();j++){
               if(j==this.gui.tm.getTape().getCurrentHeadPosition()){
                   this.SummaryArea.append("[");
                   this.SummaryArea.append(String.valueOf(this.gui.tm.getTape().getSymbol(j)));
                   this.SummaryArea.append("]");
               }
               else
                this.SummaryArea.append(String.valueOf(this.gui.tm.getTape().getSymbol(j)));
              }
             this.execution_started=true;
             this.SummaryArea.append(">");
       }
       else {
            this.SummaryArea.append("\n\nMachine Crashed!");
            this.SummaryArea.append("\nNo of Transitions = "+this.number_of_transitions);
            this.SummaryArea.append("\nFinal Configuration: <"+this.gui.tm.getCurrentState().getDescription()+",");
            for(int j=0;j<this.gui.tm.getTape().getTapeLength();j++){
                if(j==this.gui.tm.getTape().getCurrentHeadPosition()){
                   this.SummaryArea.append("[");
                   this.SummaryArea.append(String.valueOf(this.gui.tm.getTape().getSymbol(j)));
                   this.SummaryArea.append("]");
                }
               else
                this.SummaryArea.append(String.valueOf(this.gui.tm.getTape().getSymbol(j)));
             }
             this.execution_started=true;
             this.SummaryArea.append(">");
       }

    }//GEN-LAST:event_StepForwardActionPerformed

    private void SaveSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveSummaryActionPerformed
        javax.swing.JFileChooser fc=new javax.swing.JFileChooser();
        fc.setAcceptAllFileFilterUsed(false);
        fc.addChoosableFileFilter(new Filter2());
        int returnVal =fc.showSaveDialog(this.gui);
        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {
            java.io.File file = fc.getSelectedFile();
             try{
                  String path=file.getPath();
                 if(!(path.endsWith(".txt")))
                          path=path+".txt";
                  java.io.OutputStream os = new java.io.FileOutputStream(path);
                  java.io.PrintWriter p = new java.io.PrintWriter( os );

                  try{
                        p.print(this.SummaryArea.getText());
                     }
                  finally{

                        p.close();
                        os.close();
                         }
                }
             catch(Exception ex){
             javax.swing.JOptionPane.showMessageDialog(this,"Requested action could not be performed!","Action Failed",javax.swing.JOptionPane.INFORMATION_MESSAGE);
             }
        }
}//GEN-LAST:event_SaveSummaryActionPerformed

    private void StopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopActionPerformed
        this.stopped=true;
        this.InputString.setText(this.gui.tm.getInputString());
        this.gui.tm.initialize();
        this.TapeArea.removeAll();
         for(int j=0;j<this.gui.tm.getTape().getTapeLength();j++){
            javax.swing.JLabel l=new javax.swing.JLabel(" "+String.valueOf(this.gui.tm.getTape().getSymbol(j))+" ");
            if(j==this.gui.tm.getTape().getCurrentHeadPosition())
                l.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED));
            else
                l.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.BLACK));
            this.TapeArea.add(l);
            this.TapeArea.validate();

        }
        this.TapeArea.repaint();
        this.redrawMachine();
        this.SummaryArea.setText("");
        this.execution_started=false;
        this.number_of_transitions=this.number_of_transitions_till_current_configuration=0;
        this.ExecutedMoves.removeAllElements();
        this.SummaryArea.append("\nExecution Stopped by User");
     
    }//GEN-LAST:event_StopActionPerformed

    private void PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayActionPerformed
       int i=0;
       this.paused=this.stopped=false;
       Move M=this.gui.tm.getCurrentMove();
       if(!this.execution_started){
           this.SummaryArea.setText("");
           java.util.Date d=new java.util.Date();
           this.SummaryArea.append("\nExecution of the file "+this.gui.tm.getName()+"\nover the input string '"+this.gui.tm.getInputString()+"'.\nStarted on "+ d.toString());
           this.SummaryArea.append("\nInitial Configuration: <"+this.gui.tm.getCurrentState().getDescription()+",");
           for(int j=0;j<this.gui.tm.getTape().getTapeLength();j++){
               if(j==this.gui.tm.getTape().getCurrentHeadPosition()){
                   this.SummaryArea.append("[");
                   this.SummaryArea.append(String.valueOf(this.gui.tm.getTape().getSymbol(j)));
                   this.SummaryArea.append("]");
               }
               else
                this.SummaryArea.append(String.valueOf(this.gui.tm.getTape().getSymbol(j)));
           }
           this.execution_started=true;
           this.SummaryArea.append(">");

       }
       if(M!=null){
           while(M!=null){  
           if(i==250){
               javax.swing.JOptionPane.showMessageDialog(this,"Machine has probably entered an infinite loop!\nExecution can be resumed by clicking on play button.","Pausing Execution",javax.swing.JOptionPane.ERROR_MESSAGE);
               this.redrawMachine();
               return;
           }
           i++;
           this.ExecutedMoves.push(M);
           int status=this.gui.tm.executeCurrentMove();
           if(this.number_of_transitions==this.number_of_transitions_till_current_configuration){
               this.number_of_transitions++;
               this.SummaryArea.append("\n\nExecuted Transition: "+M.getDetail());
               this.SummaryArea.append("\nMoved to State: "+this.gui.tm.getCurrentState().getDescription());
               this.SummaryArea.append("\nCurrent Configuration: <"+this.gui.tm.getCurrentState().getDescription()+",");
                          for(int j=0;j<this.gui.tm.getTape().getTapeLength();j++){
               if(j==this.gui.tm.getTape().getCurrentHeadPosition()){
                   this.SummaryArea.append("[");
                   this.SummaryArea.append(String.valueOf(this.gui.tm.getTape().getSymbol(j)));
                   this.SummaryArea.append("]");
               }
               else
                this.SummaryArea.append(String.valueOf(this.gui.tm.getTape().getSymbol(j)));
           }
           this.execution_started=true;
           this.SummaryArea.append(">");
        }
           this.number_of_transitions_till_current_configuration++;
           if(status==TuringMachine.Machine_Halted){
              this.SummaryArea.append("\n\nMachine Halted Successfully!");
              this.SummaryArea.append("\nNo of Transitions: "+this.number_of_transitions);
              this.SummaryArea.append("\nFinal Configuration: <"+this.gui.tm.getCurrentState().getDescription()+",");
              for(int j=0;j<this.gui.tm.getTape().getTapeLength();j++){
               if(j==this.gui.tm.getTape().getCurrentHeadPosition()){
                   this.SummaryArea.append("[");
                   this.SummaryArea.append(String.valueOf(this.gui.tm.getTape().getSymbol(j)));
                   this.SummaryArea.append("]");
               }
               else
                this.SummaryArea.append(String.valueOf(this.gui.tm.getTape().getSymbol(j)));
              }
             this.execution_started=true;
             this.SummaryArea.append(">");

           }
           else if (status==TuringMachine.Machine_Crashed){
              this.SummaryArea.append("\n\nMachine Crashed");
              this.SummaryArea.append("\nNo of Transitions = "+this.number_of_transitions);
              this.SummaryArea.append("\nFinal Configuration: <"+this.gui.tm.getCurrentState().getDescription()+",");
              for(int j=0;j<this.gui.tm.getTape().getTapeLength();j++){
               if(j==this.gui.tm.getTape().getCurrentHeadPosition()){
                   this.SummaryArea.append("[");
                   this.SummaryArea.append(String.valueOf(this.gui.tm.getTape().getSymbol(j)));
                   this.SummaryArea.append("]");
               }
               else
                this.SummaryArea.append(String.valueOf(this.gui.tm.getTape().getSymbol(j)));
              }
             this.execution_started=true;
             this.SummaryArea.append(">");
           }
           this.TapeArea.removeAll();
           for(int j=0;j<this.gui.tm.getTape().getTapeLength();j++){
                javax.swing.JLabel l=new javax.swing.JLabel(" "+String.valueOf(this.gui.tm.getTape().getSymbol(j))+" ");
                if(j==this.gui.tm.getTape().getCurrentHeadPosition())
                   l.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED));
                else
                   l.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.BLACK));
                this.TapeArea.add(l);
                this.TapeArea.validate();

           }
           this.TapeArea.repaint();
           this.redrawMachine();
           M=this.gui.tm.getCurrentMove();
           if(this.paused||this.stopped){
               this.paused=this.stopped=false;
               return;
           }
           }

       }
       else if(this.gui.tm.getCurrentState()==this.gui.tm.getHaltState()){
            this.SummaryArea.append("\n\nMachine Halted Successfully!");
            this.SummaryArea.append("\nNo of Transitions = "+this.number_of_transitions);
            this.SummaryArea.append("\nFinal Configuration: <"+this.gui.tm.getCurrentState().getDescription()+",");
               for(int j=0;j<this.gui.tm.getTape().getTapeLength();j++){
               if(j==this.gui.tm.getTape().getCurrentHeadPosition()){
                   this.SummaryArea.append("[");
                   this.SummaryArea.append(String.valueOf(this.gui.tm.getTape().getSymbol(j)));
                   this.SummaryArea.append("]");
               }
               else
                this.SummaryArea.append(String.valueOf(this.gui.tm.getTape().getSymbol(j)));
              }
             this.execution_started=true;
             this.SummaryArea.append(">");
       }
       else {
            this.SummaryArea.append("\n\nMachine Crashed!");
            this.SummaryArea.append("\nNo of Transitions = "+this.number_of_transitions);
            this.SummaryArea.append("\nFinal Configuration: <"+this.gui.tm.getCurrentState().getDescription()+",");
            for(int j=0;j<this.gui.tm.getTape().getTapeLength();j++){
                if(j==this.gui.tm.getTape().getCurrentHeadPosition()){
                   this.SummaryArea.append("[");
                   this.SummaryArea.append(String.valueOf(this.gui.tm.getTape().getSymbol(j)));
                   this.SummaryArea.append("]");
                }
               else
                this.SummaryArea.append(String.valueOf(this.gui.tm.getTape().getSymbol(j)));
             }
             this.execution_started=true;
             this.SummaryArea.append(">");
       }

    }//GEN-LAST:event_PlayActionPerformed

    private void StepBackwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StepBackwardActionPerformed
         if(!this.ExecutedMoves.empty()){
            Move M=this.ExecutedMoves.pop();
             if(M!=null){
               if(this.number_of_transitions_till_current_configuration!=0){
                 this.gui.tm.executeCounterMove(M);
                 this.number_of_transitions_till_current_configuration--;
                 this.TapeArea.removeAll();
                 for(int j=0;j<this.gui.tm.getTape().getTapeLength();j++){
                     javax.swing.JLabel l=new javax.swing.JLabel(" "+String.valueOf(this.gui.tm.getTape().getSymbol(j))+" ");
                     if(j==this.gui.tm.getTape().getCurrentHeadPosition())
                        l.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED));
                     else
                        l.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.BLACK));
                     this.TapeArea.add(l);
                     this.TapeArea.validate();
                }
                this.TapeArea.repaint();
                this.redrawMachine();
             }
         }
         }
}//GEN-LAST:event_StepBackwardActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane BottomSplitPane;
    private javax.swing.JScrollPane DrawingAreaTab;
    private javax.swing.JPanel Drawing_Area;
    private javax.swing.JButton InitializeTape;
    private javax.swing.JTextField InputString;
    private javax.swing.JLabel InputStringLabel;
    private javax.swing.JPanel OptionPanel;
    private javax.swing.JButton Play;
    private javax.swing.JSplitPane RightSplitPane;
    private javax.swing.JButton SaveSummary;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JButton StepBackward;
    private javax.swing.JButton StepForward;
    private javax.swing.JButton Stop;
    private javax.swing.JTextArea SummaryArea;
    private javax.swing.JScrollPane SummaryPane;
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JPanel TapeArea;
    private javax.swing.JScrollPane TapePane;
    private javax.swing.JTable TransitionTable;
    private javax.swing.JScrollPane TransitionTableTab;
    // End of variables declaration//GEN-END:variables

}
