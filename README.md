# Project 3 : GWack Slack Simulator

## Help Received

Please document any help you received in completing this lab. Note that the what you submit should be your own work. Refer to the syllabus for more details. 

I went to Marlee's office hours a lot. She's the best!

## Describe the OOP design of your GWack Slack Simulator

Please provide a short description of your programming progress

My programming process started wth building the GUI. I implemented a chat box for typing a message, buttons for sending, a place to see a list of all the members in the chat, and a panel of buttons and textAreas for connecting to the actual server. Once I had all of my buttons and GUI features in place, I started working on connecting to the server with the ClientHandler and socket. This was definitely the harder portion of the project. I started off by connecting with the socket to Dr. Aviv's server by making a new socket whenever the connect button was pressed. When the button was pressed again, I disconnected from the server by closing the socket. There was definitely some error testing/debugging that went on to finish this piece of the project, but I eventually got it working. 

Finally, I worked on using threading to connect to the server and be able to send and receive messages from classmates on the server. Here I created a ClientHandler class that extends Thread. My ClientHandler class uses the BufferedReader to read in the input from other classmates. I created a while loop to iterate through the client list, print out the user names to the appopriate text area and append the messages to the message stream area. 

Finally, I error checked by creating a new panel that pops up if any of the user's entries are null. 
## What additional features did you attempt and how can we test them

I did not make my own server because I did not have enough time, but my code definitely connects to Dr.Aviv's server. I broke up a lot of my code into different files just to keep things a little bit more organized, but they can all be run and tested through the java GWackClientGUI command. 


