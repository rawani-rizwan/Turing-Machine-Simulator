package turing_machine_simulator;


class DraggableMgr extends net.java.swingfx.jdraggable.DefaultDraggableManager{
    NewProjectPanel panel;
    public DraggableMgr(NewProjectPanel tmp){
        super();
        panel=tmp;
    }
    public boolean dragging() {
		boolean b=super.dragging();
        if (b){
            panel.redrawMachine();
              }
        return b;
	}
    public boolean stopDrag(){
        boolean b=super.stopDrag();
        panel.redrawMachine();
        return b;
    }
}
public class NewProjectPanel extends javax.swing.JPanel {

    public GUI gui;
    DraggableMgr ddm;
    boolean addstateenabled=false;
    boolean FirstStateAdded=false;
    boolean FileOpened=false;


    public NewProjectPanel(GUI g) {
        initComponents();
        gui=g;
        this.registerForDragging();
        this.HeadMoveMent.addItem("Left");
        this.HeadMoveMent.addItem("Right");
        this.HeadMoveMent.addItem("Stationary");
        this.CurrentTapeSymbol.addItem('_');
        this.NewTapeSymbol.addItem('_');
        this.gui.tm.setBlankSymbol('_');

    }

    public  void registerForDragging(){
        ddm=new DraggableMgr(this);
        ddm.registerDraggableContainer(this.Drawing_Area);
        ddm.setNullifyLayout(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        Drawing_Pane = new javax.swing.JScrollPane();
        Drawing_Area = new javax.swing.JPanel();
        Toolbox = new javax.swing.JPanel();
        AddAlphabet = new javax.swing.JButton();
        AddMoveLabel = new javax.swing.JLabel();
        StartStateLabel = new javax.swing.JLabel();
        HaltStateLabel = new javax.swing.JLabel();
        CurrentState_Label = new javax.swing.JLabel();
        NewTapeSymbol_Label = new javax.swing.JLabel();
        CurrentTapeSymbol_Label = new javax.swing.JLabel();
        HeadMoveMentLabel = new javax.swing.JLabel();
        StartState = new javax.swing.JComboBox();
        HaltState = new javax.swing.JComboBox();
        CurrentTapeSymbol = new javax.swing.JComboBox();
        NextState = new javax.swing.JComboBox();
        NewTapeSymbol = new javax.swing.JComboBox();
        HeadMoveMent = new javax.swing.JComboBox();
        NextState_Label = new javax.swing.JLabel();
        Add_Move = new javax.swing.JButton();
        AlphabetElement = new javax.swing.JTextField();
        BlankSymbolLabel = new javax.swing.JLabel();
        DeleteState = new javax.swing.JButton();
        MoveToDelete = new javax.swing.JComboBox();
        DeleteMove = new javax.swing.JButton();
        AddState = new javax.swing.JButton();
        StateToDelete = new javax.swing.JComboBox();
        CurrentState = new javax.swing.JComboBox();
        Next = new javax.swing.JButton();

        Drawing_Area.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Drawing_AreaMouseClicked(evt);
            }
        });
        Drawing_Area.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Drawing_AreaMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout Drawing_AreaLayout = new javax.swing.GroupLayout(Drawing_Area);
        Drawing_Area.setLayout(Drawing_AreaLayout);
        Drawing_AreaLayout.setHorizontalGroup(
            Drawing_AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        Drawing_AreaLayout.setVerticalGroup(
            Drawing_AreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        Drawing_Pane.setViewportView(Drawing_Area);

        SplitPane.setRightComponent(Drawing_Pane);

        Toolbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToolboxMouseClicked(evt);
            }
        });

        AddAlphabet.setText("Add Symbol");
        AddAlphabet.setToolTipText("Add to Tape Alphabet");
        AddAlphabet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddAlphabetMouseClicked(evt);
            }
        });
        AddAlphabet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAlphabetActionPerformed(evt);
            }
        });

        AddMoveLabel.setFont(new java.awt.Font("Tahoma", 1, 14));
        AddMoveLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddMoveLabel.setText("Add Move");

        StartStateLabel.setText("Select Start State");

        HaltStateLabel.setText("Select Halt State");

        CurrentState_Label.setText("Current State");

        NewTapeSymbol_Label.setText("New Tape Symbol");

        CurrentTapeSymbol_Label.setText("Current Tape Symbol");

        HeadMoveMentLabel.setText("Direction");

        StartState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartStateActionPerformed(evt);
            }
        });
        StartState.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                StartStateVetoableChange(evt);
            }
        });

        HaltState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HaltStateActionPerformed(evt);
            }
        });

        CurrentTapeSymbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurrentTapeSymbolActionPerformed(evt);
            }
        });

        NewTapeSymbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewTapeSymbolActionPerformed(evt);
            }
        });

        NextState_Label.setText("Next State");

        Add_Move.setText("Add");
        Add_Move.setToolTipText("Add Move");
        Add_Move.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_MoveMouseClicked(evt);
            }
        });
        Add_Move.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_MoveActionPerformed(evt);
            }
        });

        AlphabetElement.setToolTipText("Type the Symbol to be added to tape alphabet.");
        AlphabetElement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlphabetElementActionPerformed(evt);
            }
        });
        AlphabetElement.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                AlphabetElementInputMethodTextChanged(evt);
            }
        });
        AlphabetElement.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AlphabetElementKeyTyped(evt);
            }
        });

        BlankSymbolLabel.setFont(new java.awt.Font("Tahoma", 1, 18));
        BlankSymbolLabel.setText("Blank Symbol is '_'");

        DeleteState.setText("Delete State");
        DeleteState.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteStateMouseClicked(evt);
            }
        });
        DeleteState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteStateActionPerformed(evt);
            }
        });

        MoveToDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveToDeleteActionPerformed(evt);
            }
        });

        DeleteMove.setText("Delete Move");
        DeleteMove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMoveMouseClicked(evt);
            }
        });
        DeleteMove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteMoveActionPerformed(evt);
            }
        });

        AddState.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/state.gif"))); // NOI18N
        AddState.setToolTipText("Add State");
        AddState.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddStateMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AddStateMouseReleased(evt);
            }
        });
        AddState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStateActionPerformed(evt);
            }
        });

        StateToDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StateToDeleteActionPerformed(evt);
            }
        });

        Next.setText("Proceed");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ToolboxLayout = new javax.swing.GroupLayout(Toolbox);
        Toolbox.setLayout(ToolboxLayout);
        ToolboxLayout.setHorizontalGroup(
            ToolboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToolboxLayout.createSequentialGroup()
                .addGroup(ToolboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ToolboxLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(ToolboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ToolboxLayout.createSequentialGroup()
                                .addComponent(StateToDelete, 0, 50, Short.MAX_VALUE)
                                .addGap(30, 30, 30)
                                .addGroup(ToolboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ToolboxLayout.createSequentialGroup()
                                        .addComponent(Add_Move, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(42, 42, 42))
                                    .addComponent(DeleteState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(ToolboxLayout.createSequentialGroup()
                                .addComponent(MoveToDelete, 0, 50, Short.MAX_VALUE)
                                .addGap(30, 30, 30)
                                .addGroup(ToolboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Next, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                    .addComponent(DeleteMove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(20, 20, 20))
                    .addGroup(ToolboxLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(AddMoveLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(62, 62, 62))
                    .addGroup(ToolboxLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(ToolboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ToolboxLayout.createSequentialGroup()
                                .addComponent(AlphabetElement, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                .addGap(30, 30, 30)
                                .addComponent(AddAlphabet, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ToolboxLayout.createSequentialGroup()
                                .addComponent(StartStateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(45, 45, 45)
                                .addComponent(StartState, 0, 63, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ToolboxLayout.createSequentialGroup()
                                .addComponent(HaltStateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addGap(50, 50, 50)
                                .addComponent(HaltState, 0, 63, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ToolboxLayout.createSequentialGroup()
                                .addComponent(HeadMoveMentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(88, 88, 88)
                                .addComponent(HeadMoveMent, 0, 63, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ToolboxLayout.createSequentialGroup()
                                .addComponent(NewTapeSymbol_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(45, 45, 45)
                                .addComponent(NewTapeSymbol, 0, 63, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ToolboxLayout.createSequentialGroup()
                                .addGroup(ToolboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CurrentTapeSymbol_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(ToolboxLayout.createSequentialGroup()
                                        .addComponent(CurrentState_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(35, 35, 35))
                                    .addGroup(ToolboxLayout.createSequentialGroup()
                                        .addComponent(NextState_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(49, 49, 49)))
                                .addGap(29, 29, 29)
                                .addGroup(ToolboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CurrentState, 0, 63, Short.MAX_VALUE)
                                    .addComponent(CurrentTapeSymbol, 0, 63, Short.MAX_VALUE)
                                    .addComponent(NextState, 0, 63, Short.MAX_VALUE)))
                            .addGroup(ToolboxLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(BlankSymbolLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ToolboxLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(AddState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(85, 85, 85))
        );
        ToolboxLayout.setVerticalGroup(
            ToolboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToolboxLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(BlankSymbolLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(AddState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(ToolboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ToolboxLayout.createSequentialGroup()
                        .addComponent(AlphabetElement)
                        .addGap(3, 3, 3))
                    .addComponent(AddAlphabet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(ToolboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ToolboxLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(StartStateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(StartState))
                .addGap(10, 10, 10)
                .addGroup(ToolboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ToolboxLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(HaltStateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(HaltState))
                .addGap(12, 12, 12)
                .addComponent(AddMoveLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ToolboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ToolboxLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(CurrentState_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(CurrentState))
                .addGap(10, 10, 10)
                .addGroup(ToolboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ToolboxLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(CurrentTapeSymbol_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(CurrentTapeSymbol))
                .addGap(10, 10, 10)
                .addGroup(ToolboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NextState)
                    .addComponent(NextState_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(ToolboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ToolboxLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(NewTapeSymbol_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(NewTapeSymbol))
                .addGap(10, 10, 10)
                .addGroup(ToolboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ToolboxLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(HeadMoveMentLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(HeadMoveMent))
                .addGap(12, 12, 12)
                .addComponent(Add_Move, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(ToolboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ToolboxLayout.createSequentialGroup()
                        .addComponent(StateToDelete)
                        .addGap(3, 3, 3)))
                .addGap(17, 17, 17)
                .addGroup(ToolboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ToolboxLayout.createSequentialGroup()
                        .addComponent(MoveToDelete)
                        .addGap(3, 3, 3))
                    .addComponent(DeleteMove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(Next, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        SplitPane.setLeftComponent(Toolbox);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1169, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddStateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStateMouseClicked

    }//GEN-LAST:event_AddStateMouseClicked

    private void AddStateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddStateMouseReleased

    }//GEN-LAST:event_AddStateMouseReleased

    private void Drawing_AreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Drawing_AreaMouseClicked
     if(addstateenabled){
       State s=this.gui.tm.addState();
       DraggableLabel statelabel=s.label;
       this.Drawing_Area.add(statelabel, this.Drawing_Area);
       statelabel.setBounds(evt.getX(), evt.getY(),60,30);
       statelabel.repaint();
       if(this.StartState.getItemCount()==0){
           gui.tm.setStartState(s.getId());
           this.FirstStateAdded=true;
       }
       else
           this.FirstStateAdded=false;

       this.Drawing_Area.validate();
       this.CurrentState.addItem(s.getDescription());
       this.StartState.addItem(s.getDescription());
       this.HaltState.addItem(s.getDescription());
       this.NextState.addItem(s.getDescription());
       this.StateToDelete.addItem(s.getDescription());
     }
     this.redrawMachine();
    }//GEN-LAST:event_Drawing_AreaMouseClicked

    private void StartStateVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_StartStateVetoableChange
    
    }//GEN-LAST:event_StartStateVetoableChange

    private void ToolboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ToolboxMouseClicked
        this.addstateenabled=false;      
    }//GEN-LAST:event_ToolboxMouseClicked

    private void StartStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartStateActionPerformed
        this.addstateenabled=false;
        if(this.FirstStateAdded)
          this.addstateenabled=true;
        if(this.StartState.getSelectedItem()!=null){
        int id=Integer.parseInt(this.StartState.getSelectedItem().toString().substring(1));
        State s=this.gui.tm.getState(id);
        if(s==gui.tm.getHaltState()&&s!=null){
            if(!this.FileOpened)
                javax.swing.JOptionPane.showMessageDialog(this,"Halt State can't be Start State!","Invalid Selection",javax.swing.JOptionPane.ERROR_MESSAGE);
                State p=this.gui.tm.getStartState();
                if(p!=null)
                    this.StartState.setSelectedItem(p.getDescription());
                else this.StartState.setSelectedIndex(-1);
        }
        else {
            s=gui.tm.getStartState();
            if(s!=null){
                s.label.setIcon(Icons.stateicon);
                s.label.setSize(60, 30);
            }

            this.gui.tm.setStartState(id);
            s=gui.tm.getStartState();
            if(s!=null){
                s.label.setIcon(Icons.startstateicon);
                s.label.setSize(65, 30);
        }
      }
    
      }
  
      this.redrawMachine();

    }//GEN-LAST:event_StartStateActionPerformed

    private void HaltStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HaltStateActionPerformed

       this.addstateenabled=false;
       if(this.FirstStateAdded)
        this.addstateenabled=true;
       if(this.HaltState.getSelectedItem()!=null){
       int id=Integer.parseInt(this.HaltState.getSelectedItem().toString().substring(1));
       State  s=this.gui.tm.getState(id);
       if(s==gui.tm.getStartState()&&s!=null){
            if(!this.FirstStateAdded&&!this.FileOpened)
                javax.swing.JOptionPane.showMessageDialog(this,"Start State can't be Halt State!","Invalid Selection",javax.swing.JOptionPane.ERROR_MESSAGE);
            State p=this.gui.tm.getHaltState();
            if(p!=null)
                this.HaltState.setSelectedItem(p.getDescription());
            else this.HaltState.setSelectedIndex(-1);
       }
       else if(s.getNumberOfMoves()!=0){
           javax.swing.JOptionPane.showMessageDialog(this,"Halt State can't have outgoing moves. Delete outgoing moves from this state to perform this operation. ","Invalid Selection",javax.swing.JOptionPane.ERROR_MESSAGE);
            State p=this.gui.tm.getHaltState();
            if(p!=null)
                this.HaltState.setSelectedItem(p.getDescription());
            else this.HaltState.setSelectedIndex(-1);
      }
      else {
            s=gui.tm.getHaltState();
            if(s!=null){
                s.label.setIcon(Icons.stateicon);
                s.label.setSize(60, 30);
            }

            this.gui.tm.setHaltState(id);
            s=gui.tm.getHaltState();
            if(s!=null){
                s.label.setIcon(Icons.haltstateicon);
                s.label.setSize(60, 30);
            }
      }
      }

      this.redrawMachine();
      this.FirstStateAdded=false;
    }//GEN-LAST:event_HaltStateActionPerformed

    public void drawMove(Move M){
        int x1,x2,y1,y2,control_x,control_y,mid_x,mid_y,factor,control_x2,control_y2,arrow_x1,arrow_y1,arrow_x2,arrow_y2,arrow_x3,arrow_y3,String_x,String_y;
        int sign,move_no;
        java.awt.Graphics2D g;
        g=(java.awt.Graphics2D)this.Drawing_Area.getGraphics();
        if(M==this.gui.tm.getCurrentMove())
            g.setColor(java.awt.Color.RED);
        else
            g.setColor(java.awt.Color.BLACK);
        x1 = M.getCurrentState().label.getX();
        y1 = M.getCurrentState().label.getY();
        x2 = M.getNextState().label.getX();
        y2 = M.getNextState().label.getY();
        x1=x1+M.getCurrentState().label.getWidth()/2;
        x2=x2+ M.getNextState().label.getWidth()/2;
        y1=y1+M.getCurrentState().label.getHeight()/2;
        y2=y2+M.getNextState().label.getHeight()/2;
        mid_x=(x2+x1)/2;
        mid_y=(y1+y2)/2;
        move_no=M.getMoveNumber();
        if(M.getCurrentState()!=M.getNextState()){
        if(move_no%2==0){
                    sign=1;
                    factor=move_no/2;
        }
        else{
            sign=-1;
            factor=move_no/2+1;
        }
        if(y2>=y1)
            control_x=mid_x+sign*((y2-y1)*factor/2);
        else
            control_x=mid_x+sign*((y1-y2)*factor/2);
        if(x2>=x1)
            control_y=mid_y+sign*((x2-x1)*factor/2);
        else
            control_y=mid_y+sign*((x1-x2)*factor/2);
        java.awt.geom.QuadCurve2D curve = new java.awt.geom.QuadCurve2D.Float(x1, y1, control_x,control_y, x2, y2);
        g.draw(curve);
        curve.subdivide(curve,null);
        arrow_x3=(int)curve.getX2();
        arrow_y3=(int)curve.getY2();
        arrow_x1=arrow_x3-sign*(int)((y2-y1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*6);
        arrow_x2=arrow_x3+sign*(int)((y2-y1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*6);
        arrow_y1=arrow_y3+sign*(int)((x2-x1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*6);
        arrow_y2=arrow_y3-sign*(int)((x2-x1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*6);
        if(x2>=x1)
            String_x=arrow_x1;
        else
            String_x=arrow_x2;
        if(y2>=y1)
            String_y=arrow_y1;
        else
            String_y=arrow_y2;


        if(y2>=y1){
           arrow_y1=arrow_y1-Math.abs((int)((y2-y1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*6));
           arrow_y2=arrow_y2-Math.abs((int)((y2-y1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*6));
           String_y=String_y-sign*Math.abs((int)((y2-y1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*10));
        }
        else{
           arrow_y1=arrow_y1+Math.abs((int)((y2-y1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*6));
           arrow_y2=arrow_y2+Math.abs((int)((y2-y1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*6));
           String_y=String_y-sign*Math.abs((int)((y2-y1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*10));
        }
        if(x2>=x1){
           arrow_x1=arrow_x1-Math.abs((int)((x2-x1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*6));
           arrow_x2=arrow_x2-Math.abs((int)((x2-x1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*6));
           String_x=String_x-sign*Math.abs((int)((x2-x1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*10));
        }
        else{
           arrow_x1=arrow_x1+Math.abs((int)((x2-x1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*6));
           arrow_x2=arrow_x2+Math.abs((int)((x2-x1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*6));
           String_x=String_x-sign*Math.abs((int)((x2-x1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*10));
        }
        if(sign==1){
            String_x=String_x+10;
            String_y=String_y-15;
        }
      
        if(y2<y1&& x2>x1){
            if(sign==-1){
            String_y=String_y+10;
            String_x+=5;
            }
            else{
               String_x=String_x-60;
            String_y+=8;
            }
        }
        if(x2<x1&& y2>y1){
            if(sign==-1){
            String_x=String_x-55;
            String_y-=8;
            }
            else{
                 String_y=String_y+30;
            String_x+=5;
            }
        }
      
        g.drawLine(arrow_x1,arrow_y1,arrow_x3,arrow_y3);
        g.drawLine(arrow_x2,arrow_y2,arrow_x3,arrow_y3);
        g.drawString(M.getDetail(),String_x,String_y);
        M.getCurrentState().label.repaint();
        M.getNextState().label.repaint();
        }
        else
        {  if(move_no%4==1){
               factor=move_no/4 + 1;
               control_x=mid_x-factor*50;
               control_y=mid_y-100-(factor-1)*50;
               control_x2=mid_x+factor*50;
               control_y2=mid_y-100-(factor-1)*50;
            
               

           }
           else if(move_no%4==2){
               factor=move_no/4+1;
               control_x=mid_x-factor*50;
               control_y=mid_y+100+(factor-1)*50;
               control_x2=mid_x+factor*50;
               control_y2=mid_y+100+(factor-1)*50;
           }
          else if(move_no%4==3){
               factor=move_no/4+1;
               control_x=mid_x-100-(factor-1)*80;
               control_y=mid_y-factor*50;
               control_x2=mid_x-100-(factor-1)*80;
               control_y2=mid_y+factor*50;
              
             
          }
          else {
               factor=move_no/4;
               control_x=mid_x+100+(factor-1)*80;
               control_y=mid_y-factor*50;
               control_x2=mid_x+100+(factor-1)*80;
               control_y2=mid_y+factor*50;
           }
           java.awt.geom.CubicCurve2D curve=new java.awt.geom.CubicCurve2D.Float(x1,y1,control_x,control_y,control_x2,control_y2,x2,y2);
           g.draw(curve);
           curve.subdivide(curve,null);
           x2=(int)curve.getX2();
           y2=(int)curve.getY2();
           if(move_no%4==1){
               String_y=y2-5;
               String_x=x2-20;
           }
           else if(move_no%4==2){
               String_y=y2+10;
               String_x=x2-20;

           }
           else if(move_no%4==3){

               String_x=x2-50;
               String_y=y2;

           }
            else {

               String_x=x2+5;
                String_y=y2;

           }


           curve.subdivide(curve, null);
           arrow_x3=(int)curve.getX2();
           arrow_y3=(int)curve.getY2();
           arrow_x1=arrow_x3+(int)((y2-y1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*6);
          arrow_x2=arrow_x3-(int)((y2-y1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*6);
          arrow_y1=arrow_y3-(int)((x2-x1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*6);
          arrow_y2=arrow_y3+(int)((x2-x1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*6);
          if(y2>=y1){
           arrow_y1=arrow_y1-Math.abs((int)((y2-y1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*6));
           arrow_y2=arrow_y2-Math.abs((int)((y2-y1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*6));
          }
          else{
           arrow_y1=arrow_y1+Math.abs((int)((y2-y1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*6));
           arrow_y2=arrow_y2+Math.abs((int)((y2-y1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*6));
          }
          if(x2>=x1){
           arrow_x1=arrow_x1-Math.abs((int)((x2-x1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*6));
           arrow_x2=arrow_x2-Math.abs((int)((x2-x1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*6));
          }
          else{
           arrow_x1=arrow_x1+Math.abs((int)((x2-x1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*6));
           arrow_x2=arrow_x2+Math.abs((int)((x2-x1)/Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))*6));
          }
          
          g.drawLine(arrow_x1,arrow_y1,arrow_x3,arrow_y3);
          g.drawLine(arrow_x2,arrow_y2,arrow_x3,arrow_y3);
          g.drawString(M.getDetail(),String_x,String_y);
          M.getCurrentState().label.repaint();
          M.getNextState().label.repaint();
        }

    }
    public void drawAllStates(){
        State s;
          for(int i=0;i<this.gui.tm.getStateCount();i++){
            s=this.gui.tm.getState(i);
            if (s!=null){
               if (s==this.gui.tm.getCurrentState())
                   s.label.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN));
               else
                   s.label.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.BLACK));
               s.label.repaint();
            }
        }
    }
    public void drawAllMoves(){
        Move m;
        for(int i=0;i<this.gui.tm.getMoveCount();i++){
            m=this.gui.tm.getMove(i);
            if (m!=null)
                this.drawMove(m);
        }
    }

    public void redrawMachine(){
        this.Drawing_Area.getGraphics().clearRect(0,0, this.Drawing_Area.getWidth(),this.Drawing_Area.getHeight());
        this.drawAllStates();
        this.drawAllMoves();
    }

    private void AlphabetElementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlphabetElementActionPerformed

    }//GEN-LAST:event_AlphabetElementActionPerformed

    private void AlphabetElementInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_AlphabetElementInputMethodTextChanged

    }//GEN-LAST:event_AlphabetElementInputMethodTextChanged

    private void AddAlphabetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddAlphabetMouseClicked
     
    }//GEN-LAST:event_AddAlphabetMouseClicked

    private void CurrentTapeSymbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurrentTapeSymbolActionPerformed
        this.addstateenabled=false;       
    }//GEN-LAST:event_CurrentTapeSymbolActionPerformed

    private void NewTapeSymbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewTapeSymbolActionPerformed
        this.addstateenabled=false;   
    }//GEN-LAST:event_NewTapeSymbolActionPerformed

    private void Add_MoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_MoveMouseClicked
  
    }//GEN-LAST:event_Add_MoveMouseClicked

    private void Drawing_AreaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Drawing_AreaMouseDragged

    }//GEN-LAST:event_Drawing_AreaMouseDragged

    private void DeleteStateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteStateMouseClicked

}//GEN-LAST:event_DeleteStateMouseClicked

    private void MoveToDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveToDeleteActionPerformed
    
}//GEN-LAST:event_MoveToDeleteActionPerformed

    private void DeleteMoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMoveMouseClicked

}//GEN-LAST:event_DeleteMoveMouseClicked

    private void StateToDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StateToDeleteActionPerformed
    
}//GEN-LAST:event_StateToDeleteActionPerformed

    private void DeleteStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteStateActionPerformed

    if(this.StateToDelete.getItemCount()!=0){
       int id=Integer.parseInt(this.StateToDelete.getSelectedItem().toString().substring(1));
       State s=this.gui.tm.getState(id);
       int choice=javax.swing.JOptionPane.showConfirmDialog(this,"Delete State "+s.getDescription()+"!","Confirm Delete",javax.swing.JOptionPane.YES_NO_OPTION);
       if  (choice==javax.swing.JOptionPane.YES_OPTION){
       if(s==this.gui.tm.getStartState())
           this.StartState.setSelectedIndex(-1);
       if(s==this.gui.tm.getHaltState())
           this.HaltState.setSelectedIndex(-1);
       this.StartState.removeItem(s.getDescription());
       this.HaltState.removeItem(s.getDescription());
       this.CurrentState.removeItem(s.getDescription());
       this.NextState.removeItem(s.getDescription());
       this.StateToDelete.removeItem(s.getDescription());
       for(int i=0;i<s.getNumberOfMoves();i++){
          Move m=s.getMove(i);
          if(m!=null){
              this.MoveToDelete.removeItem(m.getDescription());
          }
       }
       for(int j=0;j<s.getNumberOfMovesToThisState();j++){
           Move m=s.getMoveToThisState(j);
          if(m!=null){
              this.MoveToDelete.removeItem(m.getDescription());
          }
       }
       this.gui.tm.deleteState(id);
       this.Drawing_Area.remove(s.label);
       s.label=null;
       System.gc();
       this.Drawing_Area.validate();
       }
       this.redrawMachine();
       }
    }//GEN-LAST:event_DeleteStateActionPerformed

    private void AlphabetElementKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlphabetElementKeyTyped

    }//GEN-LAST:event_AlphabetElementKeyTyped

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
         if(this.gui.tm.getStartState()==null){
            javax.swing.JOptionPane.showMessageDialog(this,"Please Select a Start State!","Action Cancelled",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
         }
         if(this.gui.tm.getHaltState()==null){
            javax.swing.JOptionPane.showMessageDialog(this,"Please Select a Halt State!","Action Cancelled",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return;
         }
         this.gui.executionpanel.initialize();
         this.gui.validate();
         this.redrawMachine();
    }//GEN-LAST:event_NextActionPerformed

    private void AddStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStateActionPerformed
    this.addstateenabled=true;
    }//GEN-LAST:event_AddStateActionPerformed

    private void AddAlphabetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAlphabetActionPerformed
      this.addstateenabled=false;
         try{
          this.AlphabetElement.validate();
          String s=this.AlphabetElement.getText(0, 1);
          if(!this.AlphabetElement.getText().isEmpty()&&s!=null){
          this.AlphabetElement.setText(s);
          char c=s.charAt(0);
          if(c==this.gui.tm.getBlankSymbol())
            javax.swing.JOptionPane.showMessageDialog(this,"Tape Alphabet can't contain blank symbol!","Invalid Input",javax.swing.JOptionPane.ERROR_MESSAGE);
          else  if(!this.gui.tm.alphabetContains(c)){
            this.gui.tm.addTapeSymbol(c);
            this.AlphabetElement.setText("");
            this.CurrentTapeSymbol.addItem(c);
            this.NewTapeSymbol.addItem(c);
          }
          else
            javax.swing.JOptionPane.showMessageDialog(this,"This symbol alredy exists!","Invalid Input",javax.swing.JOptionPane.INFORMATION_MESSAGE);
         }
         else
             javax.swing.JOptionPane.showMessageDialog(this,"No Symbol Entered!","Invalid Input",javax.swing.JOptionPane.ERROR_MESSAGE);
         }
      catch(Exception E){
      javax.swing.JOptionPane.showMessageDialog(this,"No Symbol Entered!","Invalid input",javax.swing.JOptionPane.ERROR_MESSAGE);
      }

    }//GEN-LAST:event_AddAlphabetActionPerformed

    private void Add_MoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_MoveActionPerformed
      Move move;
        this.addstateenabled=false;
        int cur_state=Integer.parseInt(this.CurrentState.getSelectedItem().toString().substring(1));
        char cur_symbol = this.CurrentTapeSymbol.getSelectedItem().toString().charAt(0);
        int next_state=Integer.parseInt(this.NextState.getSelectedItem().toString().substring(1));
        char new_symbol = this.NewTapeSymbol.getSelectedItem().toString().charAt(0);
        int h_mov = this.HeadMoveMent.getSelectedIndex();
        char h_movement;
        if(h_mov==0)
           h_movement='l';
        else if (h_mov==1)
           h_movement='r';
        else
           h_movement='s';
        if(this.gui.tm.getHaltState()!=null&&cur_state==this.gui.tm.getHaltState().getId())
            javax.swing.JOptionPane.showMessageDialog(this,"Halt State can't have outgoing moves!","Invalid input",javax.swing.JOptionPane.ERROR_MESSAGE);
        else if(this.gui.tm.moveExists(cur_state, cur_symbol))
            javax.swing.JOptionPane.showMessageDialog(this,"This Software does not support Non-Deterministic Machines!","Invalid input",javax.swing.JOptionPane.ERROR_MESSAGE);
        else {
             move= this.gui.tm.addMove(cur_state, cur_symbol, next_state, new_symbol, h_movement);
             this.MoveToDelete.addItem(move.getDescription());
             this.redrawMachine();
        }
    }//GEN-LAST:event_Add_MoveActionPerformed

    private void DeleteMoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteMoveActionPerformed
   if(this.MoveToDelete.getItemCount()!=0){
     int id=Integer.parseInt(this.MoveToDelete.getSelectedItem().toString().substring(1));
     Move m = this.gui.tm.getMove(id);
     int choice=javax.swing.JOptionPane.showConfirmDialog(this,"Delete Move "+m.getDescription()+"!","Confirm Delete",javax.swing.JOptionPane.YES_NO_OPTION);
     if  (choice==javax.swing.JOptionPane.YES_OPTION){
     if(m!=null){
         this.MoveToDelete.removeItem(m.getDescription());
     }

     this.gui.tm.deleteMove(id);
     }
     this.redrawMachine();
     }
    }//GEN-LAST:event_DeleteMoveActionPerformed
public javax.swing.JPanel getDrawingArea(){
    return this.Drawing_Area;
}

public void setDrawingArea(){
    this.Drawing_Pane.setViewportView(this.Drawing_Area);

}

public void openFile(){
    this.FileOpened=true;
    State StartState1 = this.gui.tm.getStartState();
    State HaltState1 = this.gui.tm.getHaltState();
    for(int i=0;i<this.gui.tm.getStateCount();i++){
        State s=this.gui.tm.getState(i);
        if(s!=null){
            this.Drawing_Area.add(s.label);
            this.CurrentState.addItem(s.getDescription());
            this.StartState.addItem(s.getDescription());
            this.HaltState.addItem(s.getDescription());
            this.NextState.addItem(s.getDescription());
            this.StateToDelete.addItem(s.getDescription());

            this.Drawing_Area.validate();
        }
    }
    this.gui.tm.setStartState(StartState1.getId());
    this.gui.tm.setHaltState(HaltState1.getId());
    this.StartState.setSelectedItem(StartState1.getDescription());
    this.HaltState.setSelectedItem(HaltState1.getDescription());
    for(int i=0 ;i<this.gui.tm.getMoveCount();i++){
        Move m = this.gui.tm.getMove(i);
        if(m!=null){
            this.MoveToDelete.addItem(m.getDescription());

        }

    }
    for(int i=0 ; i<this.gui.tm.getTapeAlphabetCount();i++){
        this.CurrentTapeSymbol.addItem(this.gui.tm.getAlphabetCharacterAt(i));
        this.NewTapeSymbol.addItem(this.gui.tm.getAlphabetCharacterAt(i));
    }

 
    this.FileOpened=false;
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAlphabet;
    private javax.swing.JLabel AddMoveLabel;
    private javax.swing.JButton AddState;
    private javax.swing.JButton Add_Move;
    private javax.swing.JTextField AlphabetElement;
    private javax.swing.JLabel BlankSymbolLabel;
    private javax.swing.JComboBox CurrentState;
    private javax.swing.JLabel CurrentState_Label;
    private javax.swing.JComboBox CurrentTapeSymbol;
    private javax.swing.JLabel CurrentTapeSymbol_Label;
    private javax.swing.JButton DeleteMove;
    private javax.swing.JButton DeleteState;
    private javax.swing.JPanel Drawing_Area;
    private javax.swing.JScrollPane Drawing_Pane;
    private javax.swing.JComboBox HaltState;
    private javax.swing.JLabel HaltStateLabel;
    private javax.swing.JComboBox HeadMoveMent;
    private javax.swing.JLabel HeadMoveMentLabel;
    private javax.swing.JComboBox MoveToDelete;
    private javax.swing.JComboBox NewTapeSymbol;
    private javax.swing.JLabel NewTapeSymbol_Label;
    private javax.swing.JButton Next;
    private javax.swing.JComboBox NextState;
    private javax.swing.JLabel NextState_Label;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JComboBox StartState;
    private javax.swing.JLabel StartStateLabel;
    private javax.swing.JComboBox StateToDelete;
    private javax.swing.JPanel Toolbox;
    // End of variables declaration//GEN-END:variables

}
