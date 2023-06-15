
public class ReverseDinerMenuIterator implements Iterator {

	MenuItem[] items;
	int position;

	public ReverseDinerMenuIterator(MenuItem[] items) {
		this.items = items;
		position = items.length - 1;
	}

	public MenuItem next() {
		MenuItem menuItem = items[position];
		position = position - 1;
		return menuItem;
	}

	public boolean hasNext() {
		if (position < 0 || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public void remove() {
		
		throw new UnsupportedOperationException();
	}
}

