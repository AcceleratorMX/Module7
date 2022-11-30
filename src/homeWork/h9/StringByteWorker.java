package src.homeWork.h9;

import java.nio.charset.StandardCharsets;

class StringByteWorker {
    public String process(byte[] bytes) {
        String str = new String(bytes, StandardCharsets.ISO_8859_1);
        return str.toLowerCase();
    }
}

class StringByteWorkerTest {
    public static void main(String[] args) {
        byte[] startBytes = {74, 97, 86, 97};

        //java
        System.out.println(new StringByteWorker().process(startBytes));
    }
}
