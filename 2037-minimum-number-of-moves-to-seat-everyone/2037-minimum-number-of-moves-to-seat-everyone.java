class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
       Arrays.sort(seats);
        Arrays.sort(students);
        int n = seats.length;
        int m = students.length;
        int count = 0;
        for( int i = 0; i < n ; i++){
            if(seats[i] < students[i]){
                count = count + students[i] - seats[i];
            }
            else{
                count = count + seats[i] -students[i];
            }
        }
        return count;
    }
}