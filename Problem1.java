    import java.util.*;

    public class Problem1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            ArrayList<Number> list = new ArrayList<>();
            System.out.print("Enter five integers and five doubles: ");
            for(int i = 0; i < 5; i++){
                int n = input.nextInt();
                list.add(n);
            }
            for(int i = 0; i < 5; i++){
                double n = input.nextDouble();
                list.add(n);
            }
            
            sort(list);

            for (int i = 0; i < list.size(); i++){
                System.out.print(list.get(i) + " ");
            }
        }

        public static void sort(ArrayList<Number> arr) {
            for (int i = 0; i < arr.size() - 1; i++) {
                for (int j = 0; j < arr.size() - i - 1; j++) {
                    if (arr.get(j).doubleValue() > arr.get(j+1).doubleValue()) {
                        Number temp = arr.get(j);
                        arr.set(j, arr.get(j + 1));
                        arr.set(j + 1, temp);
                    }
                }
            }
        }
    }