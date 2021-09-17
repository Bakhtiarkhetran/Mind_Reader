#!/usr/bin/env python
# coding: utf-8

# In[1]:


import pandas as pd
import string
import nltk
from nltk.tokenize import word_tokenize


# In[8]:


df = pd.read_csv ('Module 2.csv')
dfi = df.sample()

dframe= pd.DataFrame(dfi)
List=(list(dframe.columns.values))


# In[7]:


def Asking_questions():
    count=1
    for x in range(10):
        
        try:
            print("Question:",count)
            count=count+1
            Question = input("Ask:")
            token=word_tokenize(Question)
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
             print ("please ask a relevant question\n")
             
    if x==9: 
        list_places = dframe['Placesss'].to_list()  
        str2=" " 
        string2=str2.join( list_places)
        print("Have you guessed what i am thinking?\n")    
        Answer = input("Enter the place: ").upper()
        if (len(Answer.strip())):
            if Answer in string2.strip():
                print("You are right")
            else:
                print("sorry i was thinking about:\n"+string2.capitalize())
        else:
             print("sorry i was thinking about:\n"+string2.capitalize())
            

Asking_questions()               


# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:




