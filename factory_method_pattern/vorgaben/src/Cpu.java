public class Cpu {
    private int kerne;
    private float frequency;

    public Cpu(int kerne, float frequency) {
        this.kerne = kerne;
        this.frequency = frequency;
    }

    public int getKerne() {
        return kerne;
    }

    public float getFrequency() {
        return frequency;
    }
}
