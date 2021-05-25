page 50100 TestPage
{
    trigger OnOpenPage()
    begin
        FrequentWords();
    end;

    local procedure Introduction()
    // Call the Message procedure
    // Show the following to the user:
    // <name>, <your favorite types of music>
    begin
        Message('Hello my name is Tom.');
    end;

    local procedure Variables()
    // Create a global variable to store your name
    // Assign a value to the variable
    // Create a local variable and assign your age as a value
    // Show the assigned values to the users
    // The Message Prodecure can be called only once
    var
        age: Integer;
    begin
        name := 'Tom';
        age := 30;
        Message('Hello my name is %1 and I am %2', name, age);
    end;

    local procedure CodingHours()
    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    //
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    //
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52
    var
        hours: Integer;
    begin
        hours := 6 * 5 * 17;
        Message('Hours is spent with coding: %1 (%2%)', hours, Format((hours / (17 * 52)) * 100, 2));
    end;

    local procedure Cuboid()
    // Write a program that stores 3 sides of a cuboid as variables (doubles)
    // The program should write the surface area and volume of the cuboid like:
    //
    // Surface Area: 600
    // Volume: 1000
    var
        a: Integer;
        b: Integer;
        c: Integer;
    begin
        a := 5;
        b := 6;
        c := 8;
        Message('Surface Area: %1 \ Volume: %2', 2 * (a * b + b * c + c * a), a * b * c);
    end;

    local procedure GreaterNumber()
    // Given two random numbers A and B
    // Write code that determines which number is greater
    // Don't forget that they can be even
    // Show a few examples to the user
    // Store the values in variables
    var
        rand1: Integer;
        rand2: Integer;
    begin
        rand1 := Random(10);
        rand2 := Random(10);

        if (rand1 > rand2) then begin
            Message('%1 is bigger than %2', rand1, rand2);
        end
        else
            if (rand1 < rand2) then begin
                Message('%1 is smaller than %2', rand1, rand2);
            end
            else begin
                Message('%1 is equal to %2', rand1, rand2);
            end;
    end;

    local procedure EvenNumber()
    // Write code that determines if a number is odd or even
    // Let the user choose from a bunch of numbers
    // Use the StrMenu function
    // Show the user if the choosen number is odd or even
    var
        Numbers: Text;
        Selected: Integer;
    begin
        Numbers := '1,2,3,4,5,6,7,8,9,10';
        Selected := StrMenu(Numbers, 1, 'Choose a number');

        if (Selected MOD 2 = 0) then begin
            Message('The choosen number is even.');
        end else begin
            Message('The choosen number is odd.');
        end;
    end;

    local procedure GreatestNumber()
    // Given an array of numbers [1, -2, 3.5, 3.1, 0, 9.7, 3.6]
    // Show the user the array
    // Show the user the greatest number
    // Optional: also show second greatest number
    var
        Numbers: array[7] of Decimal;
    begin
        Numbers[1] := 1;
        Numbers[2] := -2;
        Numbers[3] := 3.5;
        Numbers[4] := 3.1;
        Numbers[5] := 0;
        Numbers[6] := 9.7;
        Numbers[7] := 3.6;

        Message('The greatest number is %1', FindBiggestNumber(Numbers));
    end;

    local procedure FindBiggestNumber(Numbers: array[1] of Decimal) ReturnValue: Decimal
    var
        Biggest: Decimal;
        i: Integer;
    begin
        Biggest := Numbers[1];
        for i := 1 to ArrayLen(Numbers) do begin
            if (Numbers[i] > Biggest) then begin
                Biggest := Numbers[i]
            end;
        end;
        ReturnValue := Biggest;
    end;

    local procedure FrequentWords()
    // Given a list of names ['Luke', 'Anna', 'Emily', 'Luke', 'Anna', 'Tom', 'Emily', 'Tom', 'Anna' ,'Susan']
    // Show the user the most frequent name in the list
    // Optional: show all names and the number of their occurencies
    var
        Frequency: Dictionary of [Text, Integer];
        Names: List of [Text];
        Name: Text;
        i: Integer;
        MostFrequentName: Text;
    begin
        Names.AddRange('Luke', 'Anna', 'Emily', 'Luke', 'Anna', 'Tom', 'Emily', 'Tom', 'Anna', 'Susan');

        foreach Name in Names do begin
            if Frequency.ContainsKey(Name) then begin
                Frequency.Set(Name, Frequency.Get(Name) + 1);
            end else begin
                Frequency.Add(Name, 1);
            end;
        end;

        i := 0;
        foreach Name in Frequency.Keys do begin
            if Frequency.Get(Name) > i then begin
                i := Frequency.Get(Name);
                MostFrequentName := Name;
            end;
        end;

        Message('The most frequent name is ' + MostFrequentName);
    end;

    var
        name: Text[10];
}