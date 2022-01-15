def print_fun(string, x):
    # Your code here
    print(string *x)


def main():
    testcases = int(input())

    while(testcases > 0):
        string = input()
        x = int(input())
        print_fun(string, x)
        testcases -= 1

if __name__ == '__main__':
    main()
    
