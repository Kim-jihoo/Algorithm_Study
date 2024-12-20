import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        // spell을 정렬하여 비교의 기준으로 사용
        Arrays.sort(spell);
        String spellKey = String.join("", spell);

        for (String word : dic) {
            // dic의 각 단어도 정렬하여 비교
            char[] wordChars = word.toCharArray();
            Arrays.sort(wordChars);
            String sortedWord = new String(wordChars);

            if (spellKey.equals(sortedWord)) {
                return 1; // 일치하는 단어가 있으면 1 반환
            }
        }

        return 2; // 없으면 2 반환
    }
}
