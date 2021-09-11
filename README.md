# Park-Park
Park-Park is a vehicle parking system. This system is created to be used in parking lots in supermarkets. Users can reserve a parking spot at a specific duration of time.

# Program description
### Use case diagram
![use_case_diagram](/Screenshots/ucd.jpg?raw=true)

### State diagram
![state_diagram](/Screenshots/state_diagram.png?raw=true)

# Screenshot 
### Interface of program
![screenshot1](/Screenshots/ss_1.png?raw=true)

### Sample input & output
1. When the application is first opened, the user is directed to this main page. In the main page, the user is prompted to log into own account. The application requires the user to become a member before using it to reserve a parking spot. To sign up as a member, click the Sign Up button.
![screenshot1](/Screenshots/ss_1.png?raw=true)

2. In the Sign Up page, the user has to fill up some details: name, phone number, password and vehicle registration plate.
![screenshot2](/Screenshots/ss_2.png?raw=true)

3. After creating an account in the application, the user can now log into the application by typing the phone number registered and password.
![screenshot3](/Screenshots/ss_3.png?raw=true)

4. In the parking space selection page, the user is allowed to choose any parking space, provided that the parking space is not booked by someone else beforehand. If the parking space has been booked and the user clicked on that parking space, a "Slot unavailable" message is displayed and the parking space button is greyed out. The user can then choose other parking space. Once the untaken space is selected, a "Slot available" message will appear. Also, the application requires the user to select a parking space first before clicking the Next button to display the next page. The user can click the Back button to go back to the Log In page if they desire to do so. 
 ![screenshot4](/Screenshots/ss_4.png?raw=true)
 
5. After choosing a parking space, the user can now choose the duration of the booking. There are 2 sliders for the user to choose, which represents the starting time and endting time of their booking. After choosing the start and end time, the user can press the 'calculate' button to calculate the total amount of parking fee. If they wish to change the duration, the user can do so by clicking the 'clear' button and move the slider. Once the user has selected the duration, click 'continue'. If the user wants to replace the current parking space with another one, the user is allowed to click the 'back' button to return to the previous page.
![screenshot5](/Screenshots/ss_5.png?raw=true) 

6. When the user clicks 'continue', the reference page is generated. The page has a button to generate a reference number to the user's booking. 
![screenshot6](/Screenshots/ss_6.png?raw=true) 

7. Once the reference number is generated, the generate button is greyed out. Clicking 'continue' will terminate the application. If the user wishes to change the duration, they can click the 'back' button.
![screenshot7](/Screenshots/ss_7.png?raw=true)

# Authors
Joey Lim, Y.F.,Tan, I.K.Z., Lee, S.Shabani.

# Others
The program is built using Netbeans 8.0.2. This project is made for my `TOP 2121 Object-Oriented Programming` subject. The original program of this assignment is modified and updated.
