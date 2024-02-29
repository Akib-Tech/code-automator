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

# Modification in the prompting:
- Variables to prompt the automator now come from an environment variable, which is contained in the config.properties. It also takes the feature and codenumber.
