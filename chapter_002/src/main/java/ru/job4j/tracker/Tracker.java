package ru.job4j.tracker;
import java.util.*;

/**
 * @author Igor Shirokov (mailto:freelancerigor@yandex.ru)
 * @version $Id$
 * @since 19.09.2018.
 */
 
public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;
	private static final Random RN = new Random();
    
	public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }
    protected Item findById(String id) {
    	Item result = null;
    	for (Item item : items) {
			if (item != null && item.getId().equals(id)) {
				result = item;
				break;
			}
		}
		return result;
	}
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }
	public Item[] getAll() {
		return Arrays.copyOf(this.items, this.position);
	}
	public void replace(String id, Item item) {
	    for (int i = 0; i != this.position; i++) {
			if (this.items[i].getId().equals(id)) {
				item.setId(id);
				this.items[i] = item;
				break;
			}
		}
	}
	public void delete(String id) {
        for (int i = 0; i != this.position; i++) {
			if (this.items[i].getId().equals(id)) {
				System.arraycopy(this.items, i + 1, this.items, i, this.items.length - 1 - i);
				this.position--;
				break;
			}
		}
	}
	public Item[] findByName(String key) {
		Item[] result = new Item[this.position];
		int i = 0;
   for (Item item : items) {
      if (item != null && item.getName().equals(key)) {
         result[i++] = item;
      }
   }     
   return Arrays.copyOf(result, i);
}
} 