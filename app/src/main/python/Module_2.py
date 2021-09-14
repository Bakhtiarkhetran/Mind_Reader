def Model2():
    import nltk
    import pandas as pd
    import string
    from nltk.tokenize import word_tokenize
    from os.path import dirname, join
    #while not nltk.download("All"):
      #  print("Retrying download")

    filename = join(dirname(__file__), "libs/Module_2.csv")
    df = pd.read_csv(filename)
    #df = pd.read_csv ('mode2.csv')
    dfi = df.sample()
    dframe= pd.DataFrame(dfi)
    List=(list(dframe.columns.values))

    def Asking_questions():
        count=1
        for x in range(10):          
            try:
                print("Ask Question No:",count)
                count=count+1
                Question = input("")
                #token=word_tokenize(Question)
                #print("Tokenize nai kr raha hai bsdka.?")
                token=Question.split()
                #Split kr raha hai
                a=list(token)
                for i in range(len(a)):
                     a[i] = a[i].capitalize()
                res = [ele for ele in List if(ele in a)]
                str1=" " 
                # return string  
                string=str1.join(res)
                string1=string[0].upper() + string[1:]
                print(dframe.loc[:,dframe.columns.str.startswith(string1)])
            except:
                 print ("please ask a relevant question")
                 
        if x==9: 
            list_places = dframe['Placesss'].to_list()  
            str2=" " 
            string2=str2.join( list_places)
            print("Have you guessed what i am thinking?")
            Answer = input("Enter the place: ").upper()
            
            if Answer in string2.strip() and len(Answer)>2:
                 print("You are right")
            else:
                print("sorry i was thinking about:\n"+string2.capitalize())

    Asking_questions()               









