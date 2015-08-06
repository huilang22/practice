'''
Created on 2015

@author: Leo

'''
def printlist(ll):
    '''used to print list items in a line'''
    for i in ll:
        print i,
    print "\n"    
def printA(count):
    print 1   ##first one is special ,so move out
       
    for i in range(count-1):
        res = []
        res.append(1)
        lineNum = i+2 ## moved 1 line outside and range() start from 0 ,so +2 here
        colNum = lineNum +1
        index = colNum/2
        if (colNum %2 == 1):
            for i in range(index):
               num=(i+2)*lineNum/2
               res.append(num)  
            res.extend(res[:-1][::-1])
            printlist(res)
        if (colNum %2 == 0):
            for i in range(index-1):
               num=(i+1)*lineNum
               res.append(num) 
            res.extend(res[::-1])    
            printlist(res)   
        
if __name__ == '__main__':
    printA(5)
    print "-"*100
    printA(10)
