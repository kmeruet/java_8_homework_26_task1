public interface Connactionable {
    void open();
    void close();
    void checkDB();
    void read();
    void checkOneRecording();
    void readRecordOfKey();
    void readFromBase(int first, int finaly);
    void countRecord();
    void addRecord();
    void updateIntRecordOfId();
    void updateStringRecordOfKey();
}
