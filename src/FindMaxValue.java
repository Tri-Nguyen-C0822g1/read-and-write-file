import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++){
            if(max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
//        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
//        List<Integer> numbers = readAndWriteFile.readFile("mai.txt");
//        int maxValue = findMax(numbers);
//        readAndWriteFile.writeFile("tung.txt", maxValue);
        
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List <Integer> numbers = readAndWriteFile.readFile("mai.txt");
        int maxValue = findMax(numbers);
//        System.out.println(maxValue);
        readAndWriteFile.writeFile("tung.txt", maxValue);
    }
}
