package turing_machine_simulator;


public class TuringMachine implements java.io.Serializable {

    private int state_count,move_count,tape_symbols_count;
    private int speed_of_execution;
    private char current_tape_symbol,blank_symbol;
    private String input_string,name="New Turing Machine.tm";
    private Tape T = new Tape();
    private State start_state,halt_state,current_state;
    private Move current_move;
    private java.util.ArrayList<Character> tape_alphabet=new  java.util.ArrayList<Character>(0);
    private java.util.ArrayList<State> set_of_states=new java.util.ArrayList<State>(0);
    private java.util.ArrayList<Move> set_of_moves=new java.util.ArrayList<Move>(0);
    public static int Machine_Halted=0;
    public static int Machine_Crashed=1;
    public static int More_Moves=2;
    public static int Machine_Entered_Infinite_Loop=3;

    public void TuringMachine() {

        this.state_count=0;
        this.move_count=0;
        this.tape_symbols_count=0;
        this.speed_of_execution=10;
        name="New Turing Machine.tm";

    }

    public void setName(String s){
        this.name=s;
    }

    public String getName(){
        return this.name;
    }

    public int getStateCount(){
        return this.state_count;
    }

    public int getMoveCount() {
        return this.move_count;
    }

    public int getTapeAlphabetCount() {
        return this.tape_symbols_count;
    }

    public void setSpeedOfExecution(int s) {
        this.speed_of_execution=s;
    }
    public int getSpeedOfExecution() {
        return this.speed_of_execution;
    }

    public void setBlankSymbol(char b){
        this.blank_symbol=b;
        T.setBlankSymbol(b);
    }

    public char getBlankSymbol(){
        return this.blank_symbol;
    }

    public char getCurrentTapeSymbol(){
        return this.current_tape_symbol;
    }

    public void setInputString(String s) {
        this.input_string=s;
    }

    public String getInputString() {
        return this.input_string;
    }

    public State getCurrentState(){
        return this.current_state;
    }

    public void setCurrentState(State s){
        this.current_state=s;
    }

    public void setCurrentMove(Move m){
        this.current_move=m;
    }

    public State getStartState(){
        return this.start_state;
    }

    public State getHaltState(){
        return this.halt_state;
    }

    public State getState(int id){
       return this.set_of_states.get(id);
    }

    public Move getMove(int id){
        return this.set_of_moves.get(id);
     
    }

    public java.util.ArrayList<Character> getTapeAlphabet(){
        return this.tape_alphabet;
    }


    public void setStartState(int id){
        this.start_state=this.getState(id);

    }

    public void setHaltState(int id){
        this.halt_state=this.getState(id);
    }

    public State addState(){
        this.set_of_states.ensureCapacity(this.state_count+1);
        State s=new State(this.state_count);
        this.set_of_states.add(s);
        this.state_count++;
        return s;
    }

    public Move addMove(int cur_state_id, char cur_symbol, int n_state_id, char n_symbol, char h_movement) {
        this.set_of_moves.ensureCapacity(move_count+1);
        State cur_state=this.getState(cur_state_id);
        State n_state=this.getState(n_state_id);
        int MoveNumberBetweenTheseStates=this.getNumberOfMovesBetWeenStates(cur_state, n_state)+1;
        Move M=new Move(this.move_count,cur_state,cur_symbol,n_state,n_symbol,h_movement,MoveNumberBetweenTheseStates);
        this.set_of_moves.add(M);
        this.move_count++;
        return M;
    }

    public void addTapeSymbol(char c) {
        this.tape_alphabet.ensureCapacity(this.tape_symbols_count+1);
        this.tape_alphabet.add(c);
        this.tape_symbols_count++;
    }

    public void deleteState(int id){
        State S=this.getState(id);
        if(S!=null) {
        this.set_of_states.set(id, null);
        for(int i=0;i<S.getNumberOfMoves();i++){
            this.deleteMove(S.getMove(i).getId());
            i--;
        }
        for(int i=0;i<S.getNumberOfMovesToThisState();i++){
            this.deleteMove(S.getMoveToThisState(i).getId());
            i--;
        }
        if(S==this.start_state)
            this.start_state=null;
        if (S==this.halt_state)
            this.halt_state=null;
        S=null;
        System.gc();
        }
    }

    public void deleteMove (int id) {
        Move M=this.getMove(id);
        if(M!=null){
        this.set_of_moves.set(id, null);
        State p=M.getCurrentState();
        State q=M.getNextState();
        p.deleteMove(M);
        q.deleteMoveToThisState(M);
        M=null;
        System.gc();

        }

    }

    public void deleteTapeSymbol(char a) {
        for(int i=0;i<this.tape_symbols_count;i++){
            if (a==this.tape_alphabet.get(i)) {
                this.tape_alphabet.remove(i);
                break;

            }
        }
        this.tape_symbols_count=this.tape_alphabet.size();
    }

    public Move getCurrentMove(){
        Move M=null;
        if(this.current_state!=null)
        for (int i=0;i<this.current_state.getNumberOfMoves();i++) {
            if (this.current_state.getMove(i)!=null)
            if (this.current_state.getMove(i).getCurrentSymbol()==this.current_tape_symbol){
                M=this.current_state.getMove(i);
                break;
            }
        }

        return M;
    }

    public void initialize(){
        this.current_state=this.start_state;
        this.current_tape_symbol=this.blank_symbol;
        this.T.initialize(input_string);
        this.current_move=this.getCurrentMove();

    }
    public int executeCurrentMove(){
        if(this.current_move!=null&&this.current_state!=this.halt_state){
        this.current_state=this.current_move.getNextState();
        this.T.replace(this.current_move.getNewSymbol());
        if (this.current_move.getHeadMovement()=='l')
            this.T.moveLeft();
        else if(this.current_move.getHeadMovement()=='r')
            this.T.moveRight();
        this.current_tape_symbol=this.T.getCurrentSymbol();
        this.current_move=this.getCurrentMove();

        }
        if (this.current_state==this.halt_state)
            return Machine_Halted;
        else if(this.current_move==null)
            return Machine_Crashed;
        else
            return More_Moves;


    }

    public void executeCounterMove(Move M){
        if(M!=null){
        this.current_state=M.getCurrentState();
        if (M.getHeadMovement()=='l')
            this.T.moveRight();
        else if(M.getHeadMovement()=='r')
            this.T.moveLeft();
        this.T.replace(M.getCurrentSymbol());
        this.current_tape_symbol=this.T.getCurrentSymbol();
        this.current_move=this.getCurrentMove();
        }

    }

    public int executeTuringMachine() throws Exception{
        int i=0;
        while(this.current_state != this.halt_state && this.current_move!=null){
            this.executeCurrentMove();
            i++;
            if(i>250)
                return Machine_Entered_Infinite_Loop;
        }
        if (this.current_state==this.halt_state)
            return Machine_Halted;
        else
            return Machine_Crashed;

    }
    public boolean alphabetContains(char c){
        for(int i=0;i<this.tape_alphabet.size();i++){
            if(this.tape_alphabet.get(i).charValue()==c)
                return true;
        }


        return false;
    }
     public boolean moveExists(int id,char c){
         State s=this.getState(id);
         for(int i=0;i<s.getNumberOfMoves();i++)
         {
             if (s.getMove(i).getCurrentSymbol()==c)
                 return true;
         }
         return false;
     }
     public int getNumberOfMovesBetWeenStates(State p,State q){
         int i=0;
         for(int j=0;j<p.getNumberOfMoves();j++){
             if(p.getMove(j).getNextState()==q)
                 i++;
         }
         for(int j=0;j<p.getNumberOfDeletedMoves();j++){
             if(p.getDeletedMove(j).getNextState()==q)
                 i++;
         }
         if(p!=q){
         for (int k=0;k<q.getNumberOfMoves();k++){
             if(q.getMove(k).getNextState()==p)
                 i++;
         }
         for (int k=0;k<q.getNumberOfDeletedMoves();k++){
             if(q.getDeletedMove(k).getNextState()==p)
                 i++;
         }
         }
         return i;
     }
     public Tape getTape(){
         return this.T;
     }

     public char getAlphabetCharacterAt(int i){
         return this.tape_alphabet.get(i);
     }
}
