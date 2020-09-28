# TECHOUTS-TRAINING
Design a Book management system:

Admin can view and manage the books(Book ID, name, Book Description, Book Rating).
Admin has control/manage over collection of user details(User ID, Name, isStaff).

When user enters his ID, 
Possibilities 1: Already available purchased books list of the user is shown.
                   2: Asked with view or buy or return the book.
                   3:If invalid ID, corresponding error message should be displayed to the user and would ask if user wants to enter his ID again

When user clicks on view, he will be able to view the list of book details sorted according to the book rating.
When user clicks on buy, he will be shown with total price and asked if to confirm on the purchase?.... Purchased Successful...This increments the purchased book count for user as well.
When user clicks on return, he will be shown with his own list of purchased books... He can select a book using BookID and return... once returned successfully, purchased book count is decremented and displayed to the user. 


(OPTIONAL): When user returns the book, If the user is a staff, he will be able to update the rating of the book.
The ratings will be automatically updated in the book list details. Application will be showing with updated book details.
