import java.util.Arrays;

public class FracKnapSack {
    public static void main(String[] args) {
        int w = 50, values[] = { 100, 60, 120 }, weights[] = { 20, 10, 30 };
        fractional(values, weights, w);
    }

    static void fractional(int values[], int weights[], int target) {
        Thing things[] = new Thing[weights.length];
        for (int i = 0; i < weights.length; i++) {
            things[i] = new Thing(values[i], weights[i]);
        }

        Arrays.sort(things, (a, b) -> (b.value / b.weight) - (a.value / a.weight));
        int sum = 0;
        int currentWeight = 0;
        for (Thing thing : things) {
            System.out.println(thing.value + " " + thing.weight + " " + thing.ratio);
        }
        for (int i = 0; i < things.length; i++) {

            if (currentWeight - things[i].weight < target) {
                sum += things[i].value;

            } else {
                int remain = (target - currentWeight);
                System.out.println(remain);
                sum += remain * ( things[i].value / things[i].weight);

            }
        }
        System.out.println(sum);
    }
}

class Thing {

    int value;
    int weight;
    int ratio;

    Thing(int value, int weight) {
        this.value = value;
        this.weight = weight;
        this.ratio = value / weight;
    }
}
