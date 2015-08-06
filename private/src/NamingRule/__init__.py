class A(object):
   def __init__(self):
      self.__private()
      print "self=",self
      self.public()
   def __private(self):
      print 'A.__private()'
   def public(self):
      print 'A.public()'
class B(A):
   def __private(self):
      print 'B.__private()'
   def public(self):
      print 'B.public()'
              
if __name__ == "__main__":
    b = B()
    print b