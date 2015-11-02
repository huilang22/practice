ary = [ "fred", 10, 3.14, "This is a string", "last element", ]
puts ary[1]
ary+[2]
puts ary
ary.each do |i|
    puts i
end

name="Ruby" 
puts "the name=",name 
puts "#{name}"
puts "#{name+",ok"}"

hsh = colors = { "red" => 0xf00, "green" => 0x0f0, "blue" => 0x00f }
hsh.each do |key, value|
    print key, " is ", value, "\n"
end

flag=true
if flag
  puts "flag is #{flag}"
end
str="xxxbbbxxxxccc"
if (str =~ /xx/)
  puts str
end