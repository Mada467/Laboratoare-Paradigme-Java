public static void main(String[] args) {
    Random rand = new Random();
    List<Integer> x = new ArrayList<>();
    List<Integer> y = new ArrayList<>();
    List<Integer> xPlusY = new ArrayList<>(); // a
    Set<Integer> zSet = new TreeSet<>(); // b
    List<Integer> xMinusY = new ArrayList<>(); // c
    int p = 4;
    List<Integer> xPlusYLimitedByP = new ArrayList<>(); // d

    // Generare valori aleatorii pentru x și y
    for (int i = 0; i < 5; i++) x.add(rand.nextInt(11));
    for (int i = 0; i < 5; i++) y.add(rand.nextInt(11));

    // Sortare liste x și y
    Collections.sort(x);
    Collections.sort(y);

    // a) xPlusY conține toate elementele din x și y
    xPlusY.addAll(x);
    xPlusY.addAll(y);
    Collections.sort(xPlusY);

    // b) zSet conține valorile comune din x și y, fără duplicate
    for (Integer val : x) {
        if (y.contains(val)) {
            zSet.add(val);
        }
    }
    // c) xMinusY conține elementele din x care nu sunt în y
    for (Integer val : x) {
        if (!y.contains(val)) {
            xMinusY.add(val);
        }
    }
    Collections.sort(xMinusY);

    // d) xPlusYLimitedByP conține elementele din x și y ce nu depășesc p
    for (Integer val : xPlusY) {
        if (val <= p) {
            xPlusYLimitedByP.add(val);
        }
    }

    // Afișare rezultate
    System.out.println("Lista x: " + x);
    System.out.println("Lista y: " + y);
    System.out.println("Lista xPlusY: " + xPlusY);
    System.out.println("Set zSet (valori comune): " + zSet);
    System.out.println("Lista xMinusY: " + xMinusY);
    System.out.println("Lista xPlusYLimitedByP: " + xPlusYLimitedByP);
}






