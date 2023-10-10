After the first example is correctly implemented, we are going to create our own Selenium scripts.

To do this, create a new class with a public static void main method. Use the Selenium methods in the previous example to implement the following actions on the main method:

Navigate to the webpage (https://wikipedia.org)

Navigate to the webpage (https://wikipedia.org)

Write in the search box the text “Microsoft”

Click on the search button aside the search box

Wait for the new webpage to load

Get the title of the new webpage and check if it matches with “Microsoft”, print a message in the console indicating whether it matches or not.

Get all the anchor links on the web page (hint: find by HTML tag “a”), and for each one of them, print on the console its respective text.

Note: For steps b, c, d, e, you can find the elements using the selenium Class By and its method CSS. To get the CSS locator of an element on a web page, right click on it and click inspect, then, the HTML code of the web page will be displayed. Right-click on the highlighted element and select copy > selector (only with chrome)

Make sure to execute the main class and make the required adjustments for the script to properly work.