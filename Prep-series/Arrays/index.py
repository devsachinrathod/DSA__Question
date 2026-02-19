# # # # def my_function(*kids):
# # # #   if(kids[0] == "Emil"):
# # # #     print("emli present today")
# # # #   print("The youngest child is " + kids[0])

# # # # my_function("Emil", "Tobias", "Linus")

# # # person = {
# # #     'first_name':'Asabeneh',
# # #     'last_name':'Yetayeh',
# # #     'age':250,
# # #     'country':'Finland',
# # #     'is_marred':True,
# # #     'skills':['JavaScript', 'React', 'Node', 'MongoDB', 'Python'],
# # #     'address':{
# # #         'street':'Space street',
# # #         'zipcode':'02210'
# # #     }
# # #     }
# # # print(person['skills'][0])
# # # lang = "python"

# # # lst = list(lang)
# # # print(lst)

# # # lst2 = [ i for i in lang]
# # # print(lst2)


# # # number = [i for i in range(1 ,400)]
# # # print(number)
# # # numberSquare = [(i ,i * 2) for i in range(10)]
# # # # print(numberSquare) 
# # #  x = lambda para:
# # #  print(para)

# # # print("Hello form the lambda") 
# # def square(x):          # a square function
# #     return x ** 2

# # def cube(x):            # a cube function
# #     return x ** 3

# # def absolute(x):        # an absolute value function
# #     if x >= 0:
# #         return x
# #     else:
# #         return -(x)

# # def higher_order_function(type): # a higher order function returning a function
# #     if type == 'square':
# #         return square
# #     elif type == 'cube':
# #         return cube
# #     elif type == 'absolute':
# #         return absolute

# # result = higher_order_function('square')
# # print(result(3))       # 9
# # # result = higher_order_function('cube')
# # # print(result(3))       # 27
# # # result = higher_order_function('absolute')
# # # print(result(-3))      # 3

# def function1():
#     ten = 10

#     def function2(num):
#         print(num * ten)

#         def function3(num3):
#             print(num3 * num * ten)
#         return function3   # ✅ return from correct level

#     return function2

# call1 = function1()
# call2 = call1(10)
# print(call1(20))
# print(call2(10))
from datetime import datetime 

def fun1():
    now = datetime.now()
    print(now.strftime("%m/%d/%Y, %H:%M:%S"))
    x ="sachin"
    def fun2(name):
        print(name , x)
        def fun3(surname):
            print(x , name , surname)
        return fun3
    return fun2
cal1 = fun1()
cal2 = cal1("rathod 1")
cal3 = cal2("pawar 2")
