class Customer
  @@counter=0
  def printH
    puts "Hello"
    puts "value=#@@counter"
  end
end
 c=Customer.new
c.printH()

arr=Array.new(10)
puts arr.length()