Exercise
Your company has been hired to deliver the new RejseKort. You have been tasked with creating the first prototype of the product. You must create a java class called RejseKort, which should store the relevant information for a single user anonymous rejsekort. The class must have the following methods:

public void depositMoney(int dkk)
public boolean isCheckedIn(int timeStamp)
public void checkIn(int x, int y, int timeStamp)
public void checkOut(int x, int y, int timeStamp)
It must also have constructor taking no parameters. The internal representation and details of implementation is left up to you. The behavior of the class must be as follows:

A new RejseKort initially has a balance of 100 DKK, and is checked out.
Money can be deposited into the account by calling the depositMoney(int dkk) method, which must increment the current balance by dkk. If dkk is negative, an error must be given. Example messages:
100 DKK deposited. New balance: 200 DKK
0 DKK deposited. New balance: 100 DKK
Error: Cannot deposit negative amount

isCheckedIn(int timeStamp) must return whether the card was succesfully checked in within the last two hours, and has not been checked out since the last succesful checkIn.
Three methods take a timeStamp parameter. You may assume that subsequent calls to methods will always have non-decreasing time values. Time is a int that represents time. It only means something in relation to another timeStamp. You do not have to worry about actual time.
Example:
checkIn(0, 0, 4)
isCheckedIn(6) //returns true, 2 minutes has passed since last checkin
isCheckedIn(44) //returns true, 40 minutes has passed since last checkin
isCheckedIn(115) //returns true, 111 minutes has passed since last checkin
isCheckedIn(260) // returns false, 256 minutes has passed since last checkin

The two last methods also take x and y parameters, which is the current location in the city, to be used for determining the price upon checkout
checkIn(int x, int y, int timeStamp) either begins a new journey, or continues the current one if already checked in. You can keep travelling forever, as long as you check in at least every two hours. Example messages:
Checked in
Continued journey (100 minutes since last check in)

checkOut(int x, int y, int timeStamp) ends the current journey and deducts the price for the whole journey from the balance, using the formula 12 + (maxX - minX + maxY - minY) * 3, where the max and min are taken over all coordinates of checkIns and the final checkOut. Example messages:
Checked out! 100 minutes since last check in. Price is 12 DKK, remaining balance is 88 DKK
Checked out! 100 minutes since last check in. Price is 30 DKK, remaining balance is 70 DKK
Error: Cannot check out; Not currently checked in

The ticket price is capped at 50, so even if you travel really far, the price should never go above 50. The lowest price is 12.
If the balance of the account is less that 100, checkIn must be refused, and the user must be told how much to deposit to allow for a checkin. Example messages:
Not enough money in account to check in. Please deposit at least 62 DKK
Not enough money in account to check in. Please deposit at least 100 DKK