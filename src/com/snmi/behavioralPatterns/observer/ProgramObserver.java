package com.snmi.behavioralPatterns.observer;

/**
 * The program implement the Observer design pattern
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramObserver {

    public static void main(String[] args) {
        Channel channelJava = new ChannelStream();
        channelJava.setChannelName("Java channel");

        Channel channelGames = new ChannelStream();
        channelGames.setChannelName("Games channel");

        User user = new User("Chefo");

        subscribe(user, channelJava);
        subscribe(user, channelGames);

        createVideo(channelJava, "How to code clean in Java");
        createVideo(channelGames, "Last Of Us 2 New Game play");

        unsubscribe(user, channelJava);

        createVideo(channelJava, "How to code more cleaner in Java");
        createVideo(channelGames, "Spider man 2 New Game play");
    }

    /**
     * Subscribe to channel
     * @param user take the user
     * @param channel take the channel
     */
    private static void subscribe(User user, Channel channel) {
        user.attach(channel);
    }

    /**
     * Unsubscribe from channel
     * @param user take the user
     * @param channel take the channel
     */
    private static void unsubscribe(User user, Channel channel) {
        user.detach(channel);
    }

    /**
     * Create video to specific channel
     * @param channel take the channel
     * @param videoName take the video name
     */
    private static void createVideo(Channel channel, String videoName) {
        Video video = new Video(channel);
        video.createVideo(videoName);
    }

}
