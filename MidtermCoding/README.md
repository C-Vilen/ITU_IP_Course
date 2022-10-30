Please note that in this programming question, it is important that the naming of your classes, and signature of methods exactly follow the description. All fields must be private and all methods must be public.  

This question is about implementing a program that can track and report the expenses and savings during months in a year. To this end, you need to implement two classes Invoice and ExpensesTracker as follows. We assume that the value of amount for invoices are already rounded numbers (whole numbers) and we assume that the arguments in method calls have valid values and you do not need to use defensive programming (check for validity of arguments). For instance you may assume that for a method that receives a month number the value of the argument is always between 1 and 12. (points 65)


1-Implement a class called Invoice. The class has three fields amount, month, and day of type int. Furthermore, it has a field of type String called payee. Initialise all fields in the constructor with the value of the constructor parameters. 

2-In class Invoice, implement a method printInvoice() which prints a string that contains the invoice information 
"amount:<amount>, month:<month>, day:<day>, payee:<payee>"

for example for an invoice where amount= 200, day=31, month=9,  payee="AB" it prints:
amount:200, month:9, day:31, payee:AB

3-In class Invoice, implement methods getAmount(), getMonth(), getDay(), and getPayee() which return values of amount, month, day, and payee respectively.

4-Implement a class ExpensesTracker with a field called income of type int which represents the rounded value of monthly income. The class has another field of type List<Invoice> called yearlyInvoices. This list is used for keeping track of the invoices.

5-In the constructor of ExpensesTracker class, yearlyInvoices is initialised as an empty list and income is initialised with the only parameter of the constructor. 

6-In the ExpensesTracker class, implement a method called addInvoice(i) which receives a parameter of type Invoice (e.g., i) and adds it to yearlyInvoices.

7-In the ExpensesTracker class, implement a method monthExpenses(m) which receives a parameter of type int. This method returns a whole number that is the total amount (sum of amounts) of invoices in month m.  (m is the month number)

8-In the ExpensesTracker class, implement a method monthSaving(m) which receives a month number, that is a variable of type int. This method returns a whole number that is the total amount that has been saved in month m (by comparing the income and total amount of invoices in that month.)

9-In the ExpensesTracker class, implement a method readInvoice() that reads the information of an invoice from user input and adds the invoice to the yearlyInvoices. In the user input values of an invoice are given per line with the following order:
day
month
year
Payee

10-In the ExpensesTracker class, implement a method clearMonthInvoices(m) which receives a month number that is of type int. This method removes all the invoices in month m.

11-In the ExpensesTracker class, implement a method listYearlySavings() which prints the saved total amount in each month per line. If there was zero or less saving it prints "no saving in month <m>" where <m> is the month number, otherwise it prints "the saved amount in month <m> is <x>" where <x> is the amount that has been saved.

12-In the ExpensesTracker class, implement a method payeeAmount() that returns a map of type Map<String,Integer> that contains keys showing payees that appear in invoices in yearlyInvoices and the total amount that is payed to them.