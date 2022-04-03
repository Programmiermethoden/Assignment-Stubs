public abstract class Computer {
    private Ram ram;
    private Drive drive;

    public Computer(Ram ram, Drive drive) {
        this.ram = ram;
        this.drive = drive;
    }

    public Ram getRam() {
        return ram;
    }

    public Drive getDrive() {
        return drive;
    }
}