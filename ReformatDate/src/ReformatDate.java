public class ReformatDate {
    public static String reformatDate(String date) {
        String modifiedDate = "";
        String[] dateSplit = date.split(" ");
        if(dateSplit[0].length() == 3 )
            dateSplit[0] = "0" + dateSplit[0];
        String day = dateSplit[0].substring(0,3) ;
        String month = dateSplit[1] ;
        String year= dateSplit[2] ;
        switch(month){
            case "Jan":
                month = "01";
                break;
            case "Feb":
                month = "02";
                break;
            case "Mar":
                month = "03";
                break;
            case "Apr":
                month = "04";
                break;
            case "May":
                month = "05";
                break;
            case "Jun":
                month = "06";
                break;
            case "Jul":
                month = "07";
                break;
            case "Aug":
                month = "08";
                break;
            case "Sep":
                month = "09";
                break;
            case "Oct":
                month = "10";
                break;
            case "Nov":
                month = "11";
                break;
            case "Dec":
                month = "12";
                break;
        }
        modifiedDate = year + "-"+month + "-"+ day;
        return modifiedDate;
    }

    public static void main(String[] args) {
        System.out.println(reformatDate("20th Oct 2052"));

    }
}
