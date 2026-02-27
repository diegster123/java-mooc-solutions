class Teams {
    private String team1, team2;
    private int ct, t;
    
    public Teams(String team1, String team2, int ct, int t) {
        this.team1 = team1;
        this.team2 = team2;
        this.ct = ct;
        this.t = t;
    }
    public String getTeamOne() {
        return team1;
    }
    
    public String getTeamTwo() {
        return team2;
    }
    
    public int getCt() {
        return ct;
    }
    
    public int getT() {
        return t;
    }
    
    @Override
    public String toString() {
        return team1 + team2 + ct + t;
    }
}
