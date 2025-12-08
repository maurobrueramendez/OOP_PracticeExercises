public class TestPredictor {
    public static void main(String[] args) {
        double[] weights1 = new double[] {0.1, 0.9, 0.8, 0.5, 0.95, 0.25};
        double[] input1 = new double[] {5, 2, 9, 10, 22, 1};

        double[] weights2 = new double[] {0.33, 0.21, 0.55, 0.90, 0.2, 0.17};
        double[] input2 = new double[] {3, 2, 7, 4, 8, 9};

        ConstantPredictor constPred = new ConstantPredictor();

        LinearPredictor linearPred1 = new LinearPredictor(weights1);
        LinearPredictor linearPred2 = new LinearPredictor(weights2);

        LogisticPredictor logiPred1 = new LogisticPredictor(weights1);
        LogisticPredictor logiPred2 = new LogisticPredictor(weights2);
       
        System.out.println(" ");
        System.out.print("First input: ");
        for(int i = 0; i < input1.length; i++) {
            System.out.print(input1[i]);
            if((i+1) < input1.length) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        System.out.print("First Weights: ");
        for(int i = 0; i < weights1.length; i++) {
            System.out.print(weights1[i]);
            if((i+1) < weights1.length) {
                System.out.print(", ");
            }
        }

        System.out.println(" ");
        System.out.println(" - Constant prediction: " + constPred.predict(input1));
        System.out.println(" - Linear prediction: " + linearPred1.predict(input1));
        System.out.println(" - Logistic prediction: " + logiPred1.predict(input1));

        System.out.println(" ");
        System.out.print("Second input: ");
        for(int i = 0; i < input2.length; i++) {
            System.out.print(input2[i]);
            if((i+1) < input2.length) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        System.out.print("Second Weights: ");
        for(int i = 0; i < weights2.length; i++) {
            System.out.print(weights2[i]);
            if((i+1) < weights2.length) {
                System.out.print(", ");
            }
        }

        System.out.println(" ");
        System.out.println(" - Constant prediction: " + constPred.predict(input2));
        System.out.println(" - Linear prediction: " + linearPred2.predict(input2));
        System.out.println(" - Logistic prediction: " + logiPred2.predict(input2));
    }
}
