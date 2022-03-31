public abstract class Drive {

    private int StorageSize;

    public Drive(int StorageSize) {
        this.StorageSize = StorageSize;
    }

    public int getStorageSize() {
        return StorageSize;
    }
}
