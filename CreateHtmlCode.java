import java.util.Scanner;

class CreateHtmlCode {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What header feature do you need (list,link,search): ");
        String codeRequest = scanner.nextLine();   
        System.out.print("How many of the "+codeRequest+" code do you need (e.g 1,2,etc): ");
        int codeNum = scanner.nextInt();
        String result = "";

        switch (codeRequest.toLowerCase()) {
            case "logo":
            for(int i = 0; i < codeNum; i++){
                result += "<img src=\"\" width=\"\" height=\"\" /> \n";
            } 
                break;
            case "link-list":
            result += "<ul> \n";
            for(int i = 0; i < codeNum; i++){
                result += "<li><a href=\"\">...</a></li> \n";
            } 
                result += "</ul>";
                break;
            case "list":
                result += "<ul> \n";
            for(int i = 0; i < codeNum; i++){
                result += "<li>...</li> \n";
            } 
                result += "</ul>";
                break;
            case "link":
            for(int i = 0; i < codeNum; i++){
                result += "<a>...</a> \n";
            } 
                break;
            case "title":
            for(int i = 0; i < codeNum; i++){
                result += "<strong>...</strong> \n";
            } 
                break;
            case "search":
            for(int i = 0; i < codeNum; i++){
                result += "<input type=\"text\" /> \n";
            } 
                break;
            case "nav":
            for(int i = 0; i < codeNum; i++){
                result += "<nav>...</nav> \n";
            } 
                    break; 
            default:
            result = "Code not available";
                break;
        }
        System.out.println(result);
    }
}