
def bitwise(a, b, c):
    print(a^a)
    e=c^b
    print(e)
    print(a&b)
    print(c| (a^a))
    print(~e)



def main():
    testcases=int(input()) #testcases
    while(testcases>0):
        a = int(input())
        b = int(input())
        c = int(input())
        bitwise(a, b, c)
        testcases-=1
        


if __name__=='__main__':
    main()
