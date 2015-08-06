import random
class CC(object):
    name ="CC"
    def __init__(self):
        self.name = 'with 1'
        
    def __gv__(self,ll,**ll2):
        print "gv called"
    def calCounter(self,list_):
        counter=0
        dict={}
        for num in list_:
            if (not dict):
                print "first add value for dict"
                dict={num:counter+1}
            else:
                if(dict.has_key(num)):
                    dict[num]=dict[num]+1
                    
                else:
                    dict.update({num:counter+1})
        return dict
def gen():  
    for x in xrange(4):  
        tmp = yield x  
        if tmp == 'hello':  
            print 'world'  
        else:  
            print str(tmp)  
def changevalue(v):
    v=110
if __name__ == "__main__":
    g=gen()
    g.next()
    g.next()
    g.send('hello')
    ll=[]
    #for i in range(1000):
    #    ll.append(random.randint(1,100))
    #print ll
    c1=CC()
    c1.__gv__(ll)
    if (hasattr(c1,"name")):
        setattr(c1,'age',11)
        print c1.age;
        print "has"
    v=10
    changevalue(v)
    print "afer changed v=",v
    #res =cc.calCounter(ll)
   # print res