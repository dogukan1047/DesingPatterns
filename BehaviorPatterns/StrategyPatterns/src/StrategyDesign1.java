public class StrategyDesign1 {
    private static SortingContext context = new SortingContext();

    public static void main(String[] args) {

        double[] array = ArrayCreator.createArray(900_000);
        context.sortDouble(array);

        array = ArrayCreator.createArray(99);
        context.sortDouble(array);

        array = ArrayCreator.createArray(10_000_000);
        context.sortDouble(array);

    }
}