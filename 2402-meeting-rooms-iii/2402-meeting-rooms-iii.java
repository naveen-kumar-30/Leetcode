class Solution {
    public int mostBooked(int n, int[][] meetings) {
        long [] meetingCount = new long [n];
        long [] roomAvailabiltyTime = new long [n];

        Arrays.sort(meetings,(a,b) -> a[0] - b[0]);

        for(int [] meeting : meetings){
            int startTime = meeting[0];
            int endTime = meeting[1];
            boolean roomIsfound = false;

            long minRoomAvailableRoomTime = Long.MAX_VALUE;
            int minRoomTime = 0;
            for(int i=0;i<n;i++){
                 if(roomAvailabiltyTime[i] <= startTime){
                  roomAvailabiltyTime[i] = endTime;
                  meetingCount[i]++;
                  roomIsfound = true;
                  break;
            }

                if(minRoomAvailableRoomTime > roomAvailabiltyTime[i]){
                    minRoomAvailableRoomTime = roomAvailabiltyTime[i];
                    minRoomTime = i;
                }
        }

        if(!roomIsfound){
            roomAvailabiltyTime[minRoomTime] += endTime-startTime;
            meetingCount[minRoomTime]++; 
        }

    }

        long maxMeetCount = 0;
        int Result = 0;
    for(int i=0;i<n;i++){
        if(maxMeetCount < meetingCount[i]){
            maxMeetCount = meetingCount[i];
            Result = i;
        }
    }

    return Result;

    }
}