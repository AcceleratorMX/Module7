package src.homeWork.h8;

class WordFreqCounter {
    public float countFreq(String phrase, String word) {
        int count = 0;
        for (String s : phrase.split(" ")){
            if (s.toLowerCase().equals(word.toLowerCase())){
                count++;
            }
        }
        return (float) count / phrase.split(" ").length;
    }
}

class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}
