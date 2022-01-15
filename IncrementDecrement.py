

def do_operation(X, Y):
    # Your code here
    X=X-1
    Y=Y+1
    print (X)
    print (Y)


# Driver code
def main():
    testcase = int(input())
    
    while(testcase > 0):
        input1 = input().split()
        X = int(input1[0])
        Y = int(input1[1])
        do_operation(X, Y)
        testcase -= 1
        

if __name__ == '__main__':
    main()
