package homework7.Task3;

public enum RomanNumber {
    M(1000), D(500), C(100), L(50), X(10), V(5), I(1);
    int value;

    RomanNumber(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
