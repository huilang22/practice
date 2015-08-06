class Singleton(object):
    global inst
  #  def __init__(cls):
        #print "Singleton2::__init__ enter", cls, name, bases, dic;
#        cls.inst = None
#
    @classmethod
    def getInstance(cls):
        #print "Singleton2::getInstance enter and cls=",cls;
        if cls.inst is None:
            #print "Singleton2::getInstance, do init";
            cls.inst = Singleton()
        #print "Singleton2::getInstance leave";
        else:
            return inst
if __name__ == "__main__":
    c=Singleton.getInstance()
    print c
    c=Singleton()
    print c
            