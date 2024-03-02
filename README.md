# code-automator
Helps get the correct html code for common names of website page section. This program is written both with Javascript and remodified with JAVA

The only recognized features are logo , link-list , list , link , nav , title ,list , search without case insensitivity, but must be spelt the same was as it is here.

# How to use the Javascript aspect:
The application works with restrictions on how to ask question. 
- You make your request, starting with number and a single space between and the thing you need the application to give you html code for. e.g "4 link". 

- If you need code for more than one thing, you will seperate each one with a comma and immediately followed by the next thing e.g "5 link,6 logo,3 nav",etc.

- logo,link-list,list,link,nav,title,list,search are the only recognized word for now, just as it is spelt.

Don't use quote around your request!!!


- Common response and their meaning:
** If you are told that "Specify the number you want", it means you did not tell how many of the code you want to generate for your request.

** If you are told that "Request not recognized", it means the application doesn't have the code for what you are currently asking, you might use a more familiar word or check your request for any error of either spaces or any special character

Note: Work is still ongoing to ensure all this modifications are considered.

# How to prompt the Java aspect:
- The program request for which header feature you want e.g list, link, search, nav,etc. While javascript aspect can take multiple feature, the Java is currently restricted to take only one.
- Another prompt request how many of the code of this feature you are asking of, which can be any numerical number.
- The result is displayed as the html code you request, if it can't find a feature you requested, it will return "Code not available" 

#Configuration:  Modification in the prompting:
- Variables required for this file to work has to be configured as a system variable. Hence, a system variable for FEATURE_NAME and CODE_NUMBER must be set, for this application to run.

#Code Design & Cleaning
- The code is built with consideration of readability and reuseability. This is achieved with the principle of Object Oriented Programming. Restructuring the code to have classes and method perform specific function will make reviewing the code in later times easy and independent of other functions.
- The Class that deals with getting the environment variable has been made static with its variable as constant, since it's not going to be changing.