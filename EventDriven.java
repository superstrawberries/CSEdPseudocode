// Example of Main Loop
/* Main loops usually contain all the information to run a game. */
...
int counter ← 0
while(True) 
    if (counter % 500 == 0) 
        ...
        onCustomerEnter(counter)
        ...
    end if
        
    if (mouse_clicked == True) 
        onMouseClick(Mouse.x, Mouse.y)
    end if
    
    counter+=1;

end while
...
    
// Event Handlers
void onCustomerEnter(int counter, Customer latestCustomer) 
    customerQueue.add(latestCustomer, counter)
end onCustomerEnter

void onMouseClick(float x, float y)
    if ( x ≥ 800 && y ≤ 200)
        exit()
    end if
    ...
end onMouseClick


// Video



while(True) 
        
    if (mouse_clicked == True) 
        onMouseClick(Mouse.x, Mouse.y)
    end if

end while
    
    
void onMouseClick(float x, float y)
    if ( x ≥ 800 && y ≤ 200)
        exit()
    end if
    ...
end onMouseClick
