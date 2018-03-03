

package turing_machine_simulator;

public class Help extends javax.swing.JFrame {

 
    public Help() {
        initComponents();
        this.setContentPane(this.HelpPanel);
        this.HelpArea.setEditable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HelpPanel = new javax.swing.JScrollPane();
        HelpArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Turing Machine Simulator- Help");

        HelpArea.setColumns(20);
        HelpArea.setRows(5);
        HelpArea.setText("\n                                                                         HOW TO USE TM SIMULATOR\n\n\tA (one-tape) Turing machine is formally defined as a 5-tuple\n\n\tM = (Q, ∑, Γ, q0, δ)\n\n\tWhere\n\n\tQ  is a finite set of states.\n\n\tΓ  is a finite set of the tape alphabet/symbols.\n\n\t∑  is the set of input symbols and ∑ is a subset of Γ.\n\n\tδ: Q X (Γ U {Δ}) --> (Q U {h}) X (Γ U {Δ}) X {L,R,S} is a partial function called the transition function, where L is left shift, R is right shift, S is stationary(no shift).\n\n\tq0 is the initial state\n\n\tIn addition to above tuples, there is a blank symbol (the only symbol allowed to occur on the tape infinitely often at any step during the computation). It is usually represented by Δ.\n\n\tThere also exists a halt state (the state at which Turing Machine halts).\n\n\tAnything that operates according to these specifications is a Turing Machine.\n\n\tThis Software can be used to create and simulate single-tape deterministic Turing Machines.\n\n\tUser can add States, Moves and tape symbols using GUI tools given. User can also delete state or moves.\n\n\tAfter clicking on the proceed button user gets options to initialize the tape and execute the machine.\n\n\tUser can execute machine step by step or in one go. An execution summary along with the machine configuration is shown at each step.\n\n\tUser can also save a turing machine(the s/w uses .tm extension to recognize turing machine files) and the execution summary for future reference.");
        HelpPanel.setViewportView(HelpArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HelpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1181, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HelpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Help().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea HelpArea;
    private javax.swing.JScrollPane HelpPanel;
    // End of variables declaration//GEN-END:variables

}
