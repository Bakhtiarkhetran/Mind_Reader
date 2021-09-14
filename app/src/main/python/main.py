def main():
    from six.moves import input
    import pandas as pd
    import random
    from os.path import dirname, join
    filename = join(dirname(__file__), "libs/Final_dataset.csv")
    df = pd.read_csv(filename)
    #df = pd.read_csv("dataset1.csv")
    #df.head()
    list_ran=df.keys()
    list_ran=list(list_ran)
    list_ran.remove('places')

    def find(s, el):
        for i in s.index:
            if s[i] == el:
                return i
        return None
    def rando():
        nnn='yes'
        while nnn=='yes':
            random_index = random.randrange(len(list_ran))
            rand=str(list_ran[random_index])
            nnn=input(rand)

    count=1

    while df.shape[0]>1:
        a=df.sum(axis=0)
        a=a.drop(a.index[0])
        maximum=a.max()
        questionask=find(a,maximum)
        print(count,". ",questionask)
        count=count+1
        answer=input()
        if answer == 'yes':
            filt=(df[questionask]>0)
            inputs=df.loc[filt]
            inputs = inputs.drop([questionask],axis='columns')
            df = inputs
        else:
            filt=(df[questionask]==0)
            inputs=df.loc[filt]
            inputs = inputs.drop([questionask],axis='columns')
            df = inputs
    lis_a=df.values.tolist()
    qwe=lis_a[0]
    rando()
    print("YOU ARE THINKING OF ",qwe[0])
    yesno=input("Am I RIGHT?")
    if yesno=='yes':
        print("thanks")
    else:
        rightplace = input("Enter place name")
        #print(rigthplace)
        ##text_file = open("newPlaces.txt", "a")
        ##text_file.write("\n"+rightplace)
        #exit()
        #rightplace=input("I lose, please enter the name of place you are thinking!")
        #uniqueQ=input("Enter the Question that uniquely identifies your place!")
        #import csv
        #row1 = [ ['places',uniqueQ ] ] # data rows of csv file
        #row2 = [ [rightplace,'1'] ]
        #print("I am here")
        #with open(rightplace, 'w') as f: # using csv.writer method from CSV package
        #    write = csv.writer(f)
         #   write.writerows(row1)
          #  write.writerows(row2)
    filename = join(dirname(__file__), "libs/dataset1.csv")
    df = pd.read_csv(filename)
    #df = pd.read_csv("dataset1.csv")
    count=1
