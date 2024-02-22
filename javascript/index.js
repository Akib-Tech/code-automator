let createCode = document.getElementById("create-code");
const generate = document.getElementById("generate");
let codeDisplay = document.getElementById("code");
generate.addEventListener('click',function(){
    let result= "";
    let codeParameters = createCode.value.split(",");
    codeParameters.forEach( (codeParameter) => {
        var verifyNumParameter = /[1-9]\s+\b/i;
        if(verifyNumParameter.test(codeParameter)){
            var getMainParameter = codeParameter.split(" ");
            switch(getMainParameter[1]){
            case "logo":
                for(let i=0;i < getMainParameter[0]; i++)
                {
                    result += `<img src="" width="" height=""/> \n`;
                }
                break;
            case "link-list":
                result += `<ul> \n`;
                for(let i=0;i < getMainParameter[0]; i++)
                {
                    result +=`<li><a href="">...</a></li> \n`;
                }
                result += `</ul> \n`;
                break;
            case "list":
                result += `<ul> \n`;
                for(let i=0;i < getMainParameter[0]; i++)
                {
                    result +=`<li>...</li> \n`;
                }
                result += `</ul> \n`;
                break;
            case "link":
                for(let i=0;i < getMainParameter[0]; i++)
                {
                    result +=`<a>...</a> \n`;
                }
                break;
            case "title":
                for(let i=0;i < getMainParameter[0]; i++)
                {
                    result +=`<strong>...</strong> \n`;
                }
                break;
            case "search":
                for(let i=0;i < getMainParameter[0]; i++)
                {
                    result +=`<input type="text" /> \n`;
                }
                break;
            case "nav":
                for(let i=0;i < getMainParameter[0]; i++)
                {
                    result +=`<nav>...</nav> \n`;
                }
                break;
            default:
                result = "Request not recognised";
        }
        }else{
                result = "Specify the number you want";
        }
    })
    codeDisplay.innerText = result;
})
