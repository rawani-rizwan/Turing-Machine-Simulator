package turing_machine_simulator;


public class Move implements java.io.Serializable{
    private int id;
    private State current_state, next_state;
    private char current_symbol,new_symbol,head_movement;
    private int MoveNumberBetweenTheseStates;
    private String description;
    private String detail;
    private String [] table_entry=new String[6];
    public Move(){}
    public Move(int n, State cur_state, char cur_symbol, State n_state, char n_symbol, char h_movement,int M_no) {
        this.id=n;
        this.current_state = cur_state;
        this.next_state=n_state;
        this.current_symbol=cur_symbol;
        this.new_symbol=n_symbol;
        this.head_movement=h_movement;
        this.current_state.addMove(this);
        this.next_state.addMoveToThisState(this);
        this.MoveNumberBetweenTheseStates=M_no;
        String s1=String.valueOf(this.current_symbol);
        String s2=String.valueOf(this.new_symbol);
        String s3=String.valueOf(Character.toUpperCase(this.head_movement));
        description="m"+this.id;
        detail=description+"  "+s1+"/"+s2+" ,"+s3;
        table_entry[0]=this.description;
        table_entry[1]=this.current_state.getDescription();
        table_entry[2]=s1;
        table_entry[3]=this.next_state.getDescription();
        table_entry[4]=s2;
        if(h_movement=='s')
            table_entry[5]="Stationary";
        else if(h_movement=='l')
            table_entry[5]="Left";
        else
            table_entry[5]="Right";

    }

    public int getId() {
        return id;
    }
    public State getCurrentState() {
        return this.current_state;
    }
    public State getNextState() {
        return this.next_state;
    }
    public char getCurrentSymbol() {
        return this.current_symbol;
    }
    public char getNewSymbol() {
        return this.new_symbol;
    }
    public char getHeadMovement() {
        return this.head_movement;
    }
   public int getMoveNumber(){
       return this.MoveNumberBetweenTheseStates;
   }

   public String getDescription(){
       return this.description;
   }
   public String getDetail(){
       return this.detail;
   }

   public String[] getTableEntry(){
       return this.table_entry;
   }
}
