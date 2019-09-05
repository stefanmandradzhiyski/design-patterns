package com.snmi.creationalPatterns.prototype;

import com.snmi.creationalPatterns.prototype.enums.ItemType;
import com.snmi.creationalPatterns.prototype.items.Book;
import com.snmi.creationalPatterns.prototype.items.Game;
import com.snmi.creationalPatterns.prototype.items.Item;
import com.snmi.creationalPatterns.prototype.items.Movie;

/**
 * The program implement Prototype design pattern
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramPrototype {

    /**
     * Program constants
     */
    private static final String ITEM_TITLE = "%s title is '%s'";
    private static final String NO_SUCH_ITEM = "No such item type!";

    public static void main(String[] args) {

        createItem(ItemType.MOVIE, "Hobbs and Shaw");
        createItem(ItemType.MOVIE, "Spider-Man Far From Home");
        createItem(ItemType.BOOK, "Unknown book");
        createItem(ItemType.GAME, "Heavy Rain");
        createItem(ItemType.GAME, "Red Dead Redemption 2");

    }

    /**
     * Create item by his type and set his title
     * @param itemType take the item's type
     * @param title take the item's title
     */
    private static void createItem(ItemType itemType, String title) {
        Registry registry = new Registry();

        switch (itemType) {
            case BOOK:
                Book book = (Book) registry.createItem(itemType);
                changeItemTitle(book, "Book", title);
                break;
            case MOVIE:
                Movie movie = (Movie) registry.createItem(itemType);
                changeItemTitle(movie, "Movie", title);
                break;
            case GAME:
                Game game = (Game) registry.createItem(itemType);
                changeItemTitle(game, "Game", title);
                break;
            default: throw new IllegalArgumentException(NO_SUCH_ITEM);
        }

        System.out.println();
    }

    /**
     * Change the title of newly created item
     * @param item take the specific item
     * @param itemType take the item's type
     * @param title take the item's title
     */
    private static void changeItemTitle(Item item, String itemType, String title) {
        item.setTitle(title);
        System.out.printf(ITEM_TITLE, itemType, item.getTitle());
    }
}
