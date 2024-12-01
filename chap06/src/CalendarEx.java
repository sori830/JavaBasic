/*
    예제 6-11 : Calendar를 이용하여 현재 날짜와 시간 알아내기/날짜 시간 설정하기
 */

import java.util.Calendar;

public class CalendarEx {
    public static void printCalendar(String msg, Calendar cal) {
        int year = cal.get(Calendar.YEAR);

        // get()은 0~30까지의 정수 리턴
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        int hour = cal.get(Calendar.HOUR);
        int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
        int ampm = cal.get(Calendar.AM_PM);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        int millisecond = cal.get(Calendar.MILLISECOND);

        System.out.print(msg + year + "/" + month + "/" + day + "/");

        switch (dayOfWeek) {
            case Calendar.SUNDAY : System.out.println("일요일"); break;
            case Calendar.MONDAY : System.out.println("월요일"); break;
            case Calendar.TUESDAY : System.out.println("화요일"); break;
            case Calendar.WEDNESDAY : System.out.println("수요일"); break;
            case Calendar.THURSDAY : System.out.println("목요일"); break;
            case Calendar.FRIDAY : System.out.println("금요일"); break;
            case Calendar.SATURDAY : System.out.println("토요일"); break;
        }
        System.out.println("(" + hourOfDay + "시)");
        if(ampm == Calendar.AM) System.out.print("오전");
        else System.out.print("오후");
        System.out.println(hour + "시 " + minute + "분 " + second + "초 " + millisecond + "밀리초");
    }
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance(); // Calendar는 추상클래스이므로 XXXnew Calendar()XXX
        printCalendar("현재", now);

        Calendar firstDate = Calendar.getInstance();
        firstDate.clear();
        // 2016년 12월 25일. 12월을 표현하기 위해 month에 11로 설정
        firstDate.set(2016, 11, 25);
        firstDate.set(Calendar.HOUR_OF_DAY, 20);
        firstDate.set(Calendar.MINUTE, 30);
        printCalendar("처음 데이트한 날은 ", firstDate);
    }
}
