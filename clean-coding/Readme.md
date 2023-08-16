**What is Clean Coding**

1. Most important reason for Learning Low Level Design is to Learn How to Clean Code.

2. For whom do you want to write clean code ? Machine or Human . The answer is Human , Machine does not care about how clean or dirty your code is or how unintended your code is. But humans do care about clarity.

3. Clean Code becomes a necessity when the size of a team or organization increases. As there are multiple developers working on some project , Hence clean code makes it easier for them to understand the logic behind the code.

4. Dirty Code Leads to Confusion , Errors , Difficulties , Frustration and lesser productivity.

5. Wrong Code which is understandable and clean is much better than correct code but non understandable and dirty.

6. If at any point there is a bug in the code then it will be much difficult for developers to debug it.

7. Code Modularity is Important and a developer should take care of following points

    Same Code Segment Should Not repeat multiple times in the same code. Instead make a separate function for this part of the code.
    Passing More Variables to a Function is Not a Good practice.
    Keep Single Responsible function , which will do single work instead of multiple work.
    Try to keep small different functions rather than one single big function.
    There should not be too many indentation levels.

8. Let’s see an Example of Clean and Dirty Code.

→  Dirty Code



    public class MyClass {

    public static void main(String args[]) {
    
        int []nums=new int []{5,3,7,9,12,4,7};
        int c1=0,c2=0;
        for(int i=0;i<nums.length-1;i++)
        {
        if(i<nums.length-1)
        {
        if((nums[i]+nums[i+1])%3==0)
        {
        c1++;
        }
        if((nums[i]+nums[i+1])%5==0)
        {
        c2++;
        }

           }
       }
       System.out.println(c1 + " " + c1);

    }
    }



→Clean Code



    public class MyClass {
    
    public static boolean isSumDivisibleByVal(int sum,int val)
    {
    return sum%val==0;
    }
    
    public static void main(String args[]) {
    
    int []nums=new int []{5,3,7,9,12,4,7};
    int []divisors = new int[]{3,5};
    int []countOfDivisibleAdjPairs=new int []{0,0};
    
    for(int i=0;i<nums.length-1;i++)
    {
    int adjPairSum=nums[i]+nums[i+1];
    for(int j=0;j<divisors.length;j++)
    {
    if(isSumDivisibleByVal(adjPairSum,divisors[j]))
    {
    countOfDivisibleAdjPairs[j]++;
    }
    }
    }
    System.out.println(countOfDivisibleAdjPairs[0]+" " + countOfDivisibleAdjPairs[1]);
    
    }
    }



**Importance of Naming**

1. Naming Plays a crucial role in code clarity and cleaness.

2. Hard coded Numeric Values and random variable names are a bit frustrating and irritating for a person who is trying to understand the logic behind the code.

3. Example d = b - a   vs  displacement = finalPosition - initialPosition , the latter one is more readable and understandable.

4. Only original Coder / writer / programmer knows the use of variables which were named randomly , another developer will face difficulties while understanding the logic , and even there are chances that he/she won’t be able to decode some variable use.

5. Named variables make sense in the code and reveal most of the logic about code.

6. We should always use proper statically defined name variables for constant. And we should minimize the use of hard coded numeric values and magic numbers in the code.

7. Readability increases fold time with proper naming convention in the code.



**Best Practices for Naming**

1. Names should be descriptive , it should reveal to the user what is variable all about. Example instead of int count  use int countOfStudents for counting students in class.

2. Big NO to the number series naming , example int i1, i2, i3, c1, c2, c3, student1, student2 etc

3. Do not club the name of data structures with the variable name , example int PriceArray[10].

4. For example , For a Hashmap use a name like ElementToFrequencyValues instead of ElementTofFrequencyMap.

5. Name should be Pronounceable , Don’t use unpronounceable name like cntLvs , instead use countLeaves

6. Use searchable Names , Like for counting number of points , use NumberOfPoints in the place of NP , NOP, N etc.

7. Use the Rule for length of names, i.e. length of name is directly proportional to scope of variable .

8. More the scope , more importance that variable will hold , hence more well defined names should be used.

9. Don’t Use hard coded numeric values or magic numbers. This leads to loss of information with time.

10. Explanatory names should be used , so that code readability increases for the users .

11. Example : pair<int,pair<bool,int>> p;

    Now ,
    ````
    if(p.second.first)
    
    {
    }
    ````

The above piece of code is not explanatory , Hence we should do like this

    bool  isPrime = p.second.first;
    
    if(isPrime)
    
    {
    }

12. Example of Best practice Naming Code for checking if child value is greater than parent or not is

    
    bool isChildValGreater( Node * parent , Node * child )
    {      
        return parent->value < child->value;
    }


**Clean Functions**

1. No one Likes to read a function with too many lines , it should be as concise as possible.

2. Function should not do too many things , it should be a single responsible function.

3. Function should not manipulate the original values provided in parameters (Like arrays etc) until it is necessary or asked .

4. Multiple smaller functions with unique responsibility is far better than a single large function with multiple responsibility.

5. A Function does exactly 1 thing if it holds either of these

    One can’t meaningfully extract any other function from it .
    
    All lines are just 1 level of abstraction below the function level.

6. Things which are more understandable to the human should be at higher level and things which are more understandable to machines should be at lower level (Like bitwise operators , byte arrays ).

7. It should not happen that the lower level operations are being performed in higher level API’s.

**Best Practices for Functions**

1. Try to make a small and single responsible function.

2. Reorganization should be there , different functions can club into classes , different classes can club into packages , different packages can club into Modules.

3. Descriptive Names (Preferably Verbs ) should be used to declare functions
    ````
    ( return type verb (Noun, Noun,.. )
    
    {
    
    
    
    }
    
    )
   ````

    Example FindMax(Node * parent, Node * child)

4. Long Descriptive Names are better than short undescriptive names.

5. Stick to one prefix policy , Example getData() , getMarks() , getUser()  are better than getData(), fetchMarks() , retriveUser().

6. It is Better to have write functions as void and read Functions as non-void

    Examples of read Functions are getData() , getMarks(), getUser() .
    
    Examples of write Functions are updateData() , updateMarks(), deleteUser() .

7. Try to avoid if-else statements as much as possible because these statements can change very frequently with time .

Example



    void  processOrder(int id, bool isCovidEssential)
    
    {

    if(isCovidEssential)

    {

           ___________
    }

     else  

     { 

           __________

     }

    }

   Instead of the above format , we can declare two different functions for them.

→ processCovidEssentialOrder()

→ processGeneralOrder()

Try to avoid or delay conditional statements as much as possible.

8. Having switch / Enums statements are as bad as if-else statements.

9. If in the worst case we have to use if-else or conditional statements then we will keep no more than 2 levels of indentation in our code.

10. Number of arguments passed should be low , it increases code clarity , readability , understandability and ease of testing.

11. Operations like reading files etc should be done in separate functions.

Example

    Marks getMarks()
    
    {
    
    String dataFromFile= readFromFile(fileName);
    
    ….
    
    ….
    
    }

    String readFromFile(fileName)
    
    {

     Open the file 

     Read Data

     Close the file

     Return Data

    }


12. These types of functions “ readFromFile(fileName) “ are called side effect functions.

13. You should always undo the system changes after performing operations of these side effect functions. Example: close the File after reading the file. Client will not be responsible for closing the file separately.

14. These functions come in pair of operation Example open - close , malloc - free etc

15. Function should not be read and write, both at the same time .
16. Always Follow DRY principle (Do not Repeat Yourself). Always make separate functions for frequently used code segments. 