
public class marks {
    public static void main(String[] args) {
        String name[]={"Ram","Shyam","Rohit","Vineet"};
        int[][] marks={{50,60,70},{70,64,79},{90,90,79},{80,30,80}};
        int mlen=marks.length,nlen=name.length;
        
                int[] totalScores = new int[nlen];
        for (int i = 0; i < nlen; i++) {
            totalScores[i] = totalmarks(marks[i]);
        }

        int[] indices = {0, 1, 2, 3};
        for (int i = 0; i < nlen - 1; i++) {
            for (int j = 0; j < nlen - i - 1; j++) {
                if (totalScores[indices[j]] < totalScores[indices[j + 1]]) {
                    int temp = indices[j];
                    indices[j] = indices[j + 1];
                    indices[j + 1] = temp;
                }
            }
        }


        System.out.println(" Students Ranked by Highest Marks");
        
        int rank = 1;
        for (int idx : indices) {
            float percentage = marksperce(totalScores[idx]);
            
            System.out.println("Rank: " + rank + ", Name:  "+name[idx]+", Total Marks: "+totalScores[idx]+", Percentage: "+ percentage );
            rank++;
        }

    }

    static int totalmarks(int[] marks){
        int total=0;
        for (int ele:marks) {
            total+=ele;
        }
        
        return total;
    }
    static float marksperce(int total){
        return (total/3.0f);
    }
}
