class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        ArrayList<Integer> peaks = new ArrayList<>();

        for(int i=0; i<mountain.length-2; i++){
            int prev = mountain[i];
            int current = mountain[i+1];
            int next = mountain[i+2];

            if(current > prev && current > next){
                peaks.add(i+1);
            }
        }

        if(peaks.contains(mountain.length-1)){
            peaks.remove(peaks.indexOf(mountain.length-1));
        }

        return peaks;
    }
}