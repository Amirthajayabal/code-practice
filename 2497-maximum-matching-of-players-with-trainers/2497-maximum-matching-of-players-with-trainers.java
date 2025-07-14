class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int n1=players.length;
        int n2=trainers.length;
        int count=0;
        int st=0;
        int e=0;
        while(st<n1 && e<n2){
            if(players[st]<=trainers[e]){
                count++;
                st++;
                e++;
            }
            else{
                e++;
            }
        }
        return count;
    }
}