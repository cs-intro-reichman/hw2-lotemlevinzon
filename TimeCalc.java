public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minToAdd = Integer.parseInt(args[1]);
        //System.out.println(hours);
        //System.out.println(minutes);
        //System.out.println(minToAdd);
        int totalMinutes = (hours * 60) + minutes + minToAdd;
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);
        //System.out.println(newHours);
        //System.out.println(newMinutes);
        if (hours >= 0 && hours < 10 || newHours >= 0 && newHours < 10) {
System.out.print("0" + newHours);
        } else if (hours >= 10 && hours < 24 || newHours >=10 && newHours < 24) {
            System.out.print(newHours);
        }
        System.out.print(":"); 
        if (minutes >= 0 && minutes < 10 || newMinutes >= 0 && newMinutes < 10) {
            System.out.print("0" + newMinutes);
        } else {
            System.out.print(newMinutes);
        }
    }
}
