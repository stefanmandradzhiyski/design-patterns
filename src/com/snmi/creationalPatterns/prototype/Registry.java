package com.snmi.creationalPatterns.prototype;

import com.snmi.creationalPatterns.prototype.enums.ItemType;
import com.snmi.creationalPatterns.prototype.enums.PlatformType;
import com.snmi.creationalPatterns.prototype.items.Book;
import com.snmi.creationalPatterns.prototype.items.Game;
import com.snmi.creationalPatterns.prototype.items.Item;
import com.snmi.creationalPatterns.prototype.items.Movie;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Registry which realizes Prototype
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Registry {

    /**
     * Class constants
     */
    private static transient final Logger LOGGER = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);
    private static final String MISSING_ITEM = "Item is missing in the map";
    private static final String ILLEGAL_ITEM_TYPE = "Not illegal item type!";

    /**
     * Map variable
     */
    private Map<ItemType, Item> items = new HashMap<>();

    /**
     * Default constructor
     */
    public Registry() {}

    /**
     * At first time the method creat a new object of specific type.
     * Once this type is created, every object of that type have just been cloned.
     * @param itemType of object
     * @return the new object
     */
    public Item createItem(ItemType itemType) {
        Item item;

        try {
            item = (Item) (items.get(itemType)).clone();
        } catch(CloneNotSupportedException | NullPointerException e) {
            item = createNotExistingItem(itemType);
            LOGGER.setLevel(Level.FINER);
            LOGGER.log(Level.FINE, MISSING_ITEM);
        }

        return item;
    }

    /**
     * Create not existing item and put it to the map
     * @param itemType take the item's type
     */
    private Item createNotExistingItem(ItemType itemType) {
        switch (itemType) {
            case BOOK:
                Book book = new Book("BOOKTITLE", 14, 360);
                items.put(itemType, book);
                return book;
            case MOVIE:
                Movie movie = new Movie("MOVIETITLE", 30, "2hrs 15mins");
                items.put(itemType, movie);
                return movie;
            case GAME:
                Game game = new Game("GAMETITLE", 120, PlatformType.PC);
                items.put(itemType, game);
                return game;
            default: throw new IllegalArgumentException(ILLEGAL_ITEM_TYPE);
        }
    }

}
