package turing_machine_simulator;

public class State implements java.io.Serializable{
    private int id;
    private java.util.ArrayList<Move> moves_from_this_state=new java.util.ArrayList<Move>(0);
    private java.util.ArrayList<Move> moves_to_this_state=new java.util.ArrayList<Move>(0);
    private java.util.ArrayList<Move> deleted_moves_from_this_state=new java.util.ArrayList<Move>(0);
    private String description;
    DraggableLabel label=new DraggableLabel(Icons.stateicon);
    public State(int n) {
        id=n;
        this.label.setState(this);
        description="q"+this.id;
        this.label.setText(description);
        this.label.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.BLACK));

   }

    public int getId() {
        return id;
    }

    public void addMove(Move m){
        this.moves_from_this_state.ensureCapacity(this.moves_from_this_state.size()+1);
        this.moves_from_this_state.add(m);
    }

    public void addMoveToThisState(Move m){
        this.moves_to_this_state.ensureCapacity(this.moves_to_this_state.size()+1);
        this.moves_to_this_state.add(m);
    }

    public Move getMove(int n){
        return this.moves_from_this_state.get(n);
    }

     public Move getMoveToThisState(int n){
        return this.moves_to_this_state.get(n);
    }

    public Move getDeletedMove(int n){
        return this.deleted_moves_from_this_state.get(n);
    }

    public int getNumberOfMoves(){
        return this.moves_from_this_state.size();
    }

    public int getNumberOfMovesToThisState(){
        return this.moves_to_this_state.size();
    }

    public int getNumberOfDeletedMoves(){
        return this.deleted_moves_from_this_state.size();
    }

    public String getDescription(){
        return this.description;
    }
    public void deleteMove(Move M){
        for(int i=0;i<this.moves_from_this_state.size();i++){
            if(this.moves_from_this_state.get(i)==M){
                this.moves_from_this_state.remove(i);
                this.deleted_moves_from_this_state.ensureCapacity(this.deleted_moves_from_this_state.size()+1);
                this.deleted_moves_from_this_state.add(M);
            }
        }
    }

     public void deleteMoveToThisState(Move M){
        for(int i=0;i<this.moves_to_this_state.size();i++){
            if(this.moves_to_this_state.get(i)==M){
                this.moves_to_this_state.remove(i);

            }
        }
    }
}
