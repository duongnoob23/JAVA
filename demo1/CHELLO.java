import java.util.Scanner;

public class CHELLO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Đọc số lượng bộ test
        int T = scanner.nextInt();
        
        // Vòng lặp qua từng bộ test
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int H = scanner.nextInt();
            
            // Tính và in kết quả
            double[] distances = calculateDistances(N, H);
            for (double distance : distances) {
                System.out.printf("%.6f\n", distance);
            }
        }
        
        scanner.close();
    }
    
    // Hàm tính khoảng cách từ lát cắt thứ i tới đỉnh của tam giác
    public static double[] calculateDistances(int N, int H) {
        double[] distances = new double[N - 1];
        for (int i = 1; i < N; i++) {
            double distance = ((double) i / N) * H;
            distances[i - 1] = distance;
        }
        return distances;
    }
}