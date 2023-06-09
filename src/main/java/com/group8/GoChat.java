package com.group8;

import java.util.Arrays;

import com.group8.client.Client;
import com.group8.server.LookUpServer;

/**
 * GoChat class for one single entry into the Chatroom application. Servers or a
 * client can be created from this Driver.
 */
public class GoChat {

    /**
     * Main static method for creating a client or servers for a Chatroom application.
     *
     * @param args
     */
    public static void main(String[] args) {
        if (args.length < 1
                || (!args[0].equalsIgnoreCase("client")
                && !args[0].equalsIgnoreCase("server"))) {
            System.out.println("Must have argument of 'client' or 'server'.");
        } else if (args[0].equalsIgnoreCase("client")) {
            String[] arguments = Arrays.copyOfRange(args, 1, args.length);
            Client.main(arguments);
        } else {
            String[] arguments = Arrays.copyOfRange(args, 1, args.length);
            LookUpServer.main(arguments);
        }
    }
}