package ru.job4j.array;

 /**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 27.08.2018.
 */
 
public class SortedArray {
     /**
     * @param first отсортированный массив.
     * @param second отсортированный массив.
     * @return third array.
     */
    public int[] third(int[] first, int[] second) {
        int[] thirdArr = new int[first.length + second.length];
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 0; i < thirdArr.length; i++) {
            if (firstIndex >=  first.length) {
                thirdArr[i] = second[secondIndex];
                secondIndex++;
                continue;
            } else if (secondIndex >= second.length) {
                thirdArr[i] = first[firstIndex];
                firstIndex++;
                continue;
            }
            if (first[firstIndex] > second[secondIndex]) {
                thirdArr[i] = second[secondIndex];
                secondIndex++;
            } else if (first[firstIndex] < second[secondIndex]) {
                thirdArr[i] = first[firstIndex];
                firstIndex++;
            } else {
                thirdArr[i] = first[firstIndex];
                thirdArr[i + 1] = second[secondIndex];
                i++; firstIndex++; secondIndex++;
            }
        }
        return thirdArr;
    }
} 