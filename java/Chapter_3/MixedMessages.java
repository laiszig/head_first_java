package Chapter_3;

class Mix4 {

    int counter = 0;

        public static void main(String[] args) {

            int count = 0;

            Mix4[] mixes = new Mix4[20];

            int i = 0;

            // while(i < 9) {
            // while(i < 20) {
            // while(i < 7) {
            while(i < 19) {
                    mixes[i] = new Mix4();
                    mixes[i].counter = mixes[i].counter + 1;
                    count = count + 1;
                    count = count + mixes[i].maybeNew(i);
                    i = i + 1;
            }
                System.out.println(count + " " + mixes[0].counter);
        }

        private int maybeNew(int index) {
                // if(index < 5) {
                // if(index < 5) {
                // if(index < 7) {
                if(index < 1) {                
                        Mix4 mix = new Mix4();
                        mix.counter = mix.counter + 1;
                        return 1;
                }
                return 0;
        }

}
