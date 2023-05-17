# CS6650 GoChat Project

## Overview
Our GoChat system is a real-time messaging platform that allows users to communicate with each other in a group setting. The system is designed to be scalable and reliable.

At a high level, the chatroom system consists of several components:

* Client-side interface: The interface allows users to interact with the chatroom system.

* Server-side API: The API serves as a communication bridge between the client-side interface and the chatroom server. It handles incoming requests from the client, such as sending messages and joining/leaving chatrooms, and communicates with the chatroom server to perform the necessary actions.

* Chatroom server: The chatroom server is responsible for managing chatrooms and handling message routing between clients. It maintains a list of all active chatrooms and the users who are currently members of each chatroom. It also ensures that messages are only delivered to users who are members of the chatroom in which the message was sent.

## instruction
> Note: We are going to provide ready-to-use executable `JAR` in target folder. If it is working, skip all prerequisite and build steps.

### prerequisite
Maven is a command-line tool for building and managing any Java-based project. If you haven't install maven yet, kindly choose one following method to have it done.
> + Refer to [maven](https://maven.apache.org/download.cgi) to complete installation.
> + ```brew install maven``` If using mac.

### build
> Just follow the maven command to complete compiling and packaging. Basically, few things you have to do in sequence here,
> + download the package, open termial and get into the root directory.
> + run ```mvn clean```
> + run ```mvn package```

If everything is good, you could find a `JAR` in target folder which includes all dependencies. According to configuration in `pom.xml`, It should be `chat-1.0.jar`.

### execute
To have GoChat executing, we need to provide one argument which indicates working as server or client.
> ```java -jar target/chat-1.0.jar server```
> 
> ```java -jar target/chat-1.0.jar client```

To test, __run the server as shown above in a terminal. Once it is completed, run one or more client as above syntax in each of their own terminals__. 

Here I provide 3 basic use cases. For detailed guideness, you could move forward to demo video.

- sign in / up
> When starting a client, a sign in/up screen appears first. You can either choose to login to an existing account or sign up a new account. I highly recommend to sign up a new account since our system haven't record your information yet. Upon logging in with a valid username and password, you would see the Chatroom Selection screen.
- new / join Chatroom
> In this screen, you can either join an existing chatroom or new one with a unique chatroom name. The existing chatrooms will be shown as well. Upon you entered the correct information, clicking "create" will bring you to Chatroom GUI screen and open a ChatroomServer GUI screen since you are the host right now.
- chat
> Participants in the chatroom can exchange messages which will be multicast to every members. You can clearly see who sends the information.

