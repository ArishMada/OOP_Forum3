# OOP_Forum3
This repository contains a banking system project.

# The different files
Bank.java -> Bank class <br />
Account.java -> Account class <br />
Customer.java -> Customer class <br />
BankSystem.java -> driver file <br />

# Description
In this atm program, customers have a choice between three different banks which are MCB, BCA and BNI.

There are options for the customer who can open, manage and close their accounts. For the opening, they’ll be required to enter their names, then a pin that will be used to manage their accounts. For managing, they will have to enter their name for the verification if their account exists at the bank selected, then if it does, they have to enter the pin as a matter of security. If the pin is right, they can deposit or withdraw money, either integers (1000, 2500, 7852, …) or doubles (14,78; 2578,45; …). But if the wrong pin is entered 3 times, the account will be frozen and the customer will not be able to withdraw or deposit money into their account unless the manager of the ATM unfroze the account. The last option for customers is to close their account, this will just be about deleting the account from the bank, if there is still money in the account the customer will be asked to withdraw it before closing.

There are also options for the manager. In order to use those options, you have to enter the manager code (in this example: 2548), the consequence of entering the wrong manager code 3 times hasn’t been decided yet but I was thinking of locking the whole atm. The manager can see all accounts per bank or for all of them at once. He/she can also freeze or unfreeze any account as a matter of security.

# Extra features
• Pin: it is needed to withdraw or deposit money into your account. The pin is initialized when opening the account, it consists of 4 digits. <br />
• Manager’s options: <br />
 &emsp;  • See all accounts: the manager can see all accounts per bank or even for all of them together with the name of the customers and the balance. <br />
 &emsp;  • Freezing/unfreezing an account: He can also freeze or unfreeze an account, if an account is frozen the client will not be able to deposit or withdraw money until it is unfrozen by the manager again. <br />
