
def inPut():
    #Take input and assign the input to a, b, c, d. Please also typecast as type() will produce wrong answer without it
    a = int(input())
    b = input()
    c = float(input())
    d=bool(input())
   
    
    print(a, type(a))
    print(b, type(b))
    print(c, type(c))
    print(d, type(d))



def main():
    testcases=int(input()) #testcases
    while(testcases>0):
        inPut() #the function that gets things done
        testcases-=1
        


if __name__=='__main__':
    main()

