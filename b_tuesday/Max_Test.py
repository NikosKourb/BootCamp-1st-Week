##Num_Quantity=int(input("Apo posous ari8mous 8eleis na vreis ton megisto ? : "))
##
##Num_List=[0]
##
##for i in range(Num_Quantity):
##    num=int(input("Dwse mou enan 8etiko ari8mo : "))
##    if num>Num_List[i]:
##        Num_List.append(num)
##    else:
##        Num_List.insert(i,num)
##print(Num_List)
##print(Num_List[i+1])

Num_List=[0]
q=0
while q!="":
    q=input("Dwse mou enan 8etiko ari8mo : ")
    if q=="":
        print(Num_List)
        print(Num_List[0])
    elif int(q)>Num_List[0]:
        Num_List.insert(0,int(q))
    else:
        Num_List.insert(1,int(q))
