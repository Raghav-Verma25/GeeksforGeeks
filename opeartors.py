
def do_operation(X, Y):
   
    print( X+Y)
    print( X-Y)
    print( X*Y)
    print(X/Y)
    print(X**Y)
    print( X//Y)

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
    
