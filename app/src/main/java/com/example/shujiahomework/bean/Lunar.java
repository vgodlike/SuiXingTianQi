package com.example.shujiahomework.bean;

import java.util.List;

public class Lunar {


    /**
     * results : {"chinese_calendar":[{"date":"2020-09-03","zodiac":"鼠","ganzhi_year":"庚子","ganzhi_month":"甲申","ganzhi_day":"己酉","lunar_year":"2020","lunar_month":"8","lunar_day":"16","lunar_month_name":"七月","lunar_day_name":"十六","lunar_leap_month":"4","lunar_festival":"","solar_term":""},{"date":"2020-09-04","zodiac":"鼠","ganzhi_year":"庚子","ganzhi_month":"甲申","ganzhi_day":"庚戌","lunar_year":"2020","lunar_month":"8","lunar_day":"17","lunar_month_name":"七月","lunar_day_name":"十七","lunar_leap_month":"4","lunar_festival":"","solar_term":""},{"date":"2020-09-05","zodiac":"鼠","ganzhi_year":"庚子","ganzhi_month":"甲申","ganzhi_day":"辛亥","lunar_year":"2020","lunar_month":"8","lunar_day":"18","lunar_month_name":"七月","lunar_day_name":"十八","lunar_leap_month":"4","lunar_festival":"","solar_term":""},{"date":"2020-09-06","zodiac":"鼠","ganzhi_year":"庚子","ganzhi_month":"甲申","ganzhi_day":"壬子","lunar_year":"2020","lunar_month":"8","lunar_day":"19","lunar_month_name":"七月","lunar_day_name":"十九","lunar_leap_month":"4","lunar_festival":"","solar_term":""},{"date":"2020-09-07","zodiac":"鼠","ganzhi_year":"庚子","ganzhi_month":"乙酉","ganzhi_day":"癸丑","lunar_year":"2020","lunar_month":"8","lunar_day":"20","lunar_month_name":"七月","lunar_day_name":"二十","lunar_leap_month":"4","lunar_festival":"","solar_term":"白露"},{"date":"2020-09-08","zodiac":"鼠","ganzhi_year":"庚子","ganzhi_month":"乙酉","ganzhi_day":"甲寅","lunar_year":"2020","lunar_month":"8","lunar_day":"21","lunar_month_name":"七月","lunar_day_name":"廿一","lunar_leap_month":"4","lunar_festival":"","solar_term":""},{"date":"2020-09-09","zodiac":"鼠","ganzhi_year":"庚子","ganzhi_month":"乙酉","ganzhi_day":"乙卯","lunar_year":"2020","lunar_month":"8","lunar_day":"22","lunar_month_name":"七月","lunar_day_name":"廿二","lunar_leap_month":"4","lunar_festival":"","solar_term":""}]}
     */

    private ResultsBean results;

    public ResultsBean getResults() {
        return results;
    }

    public void setResults(ResultsBean results) {
        this.results = results;
    }

    public static class ResultsBean {
        private List<ChineseCalendarBean> chinese_calendar;

        public List<ChineseCalendarBean> getChinese_calendar() {
            return chinese_calendar;
        }

        public void setChinese_calendar(List<ChineseCalendarBean> chinese_calendar) {
            this.chinese_calendar = chinese_calendar;
        }

        public static class ChineseCalendarBean {
            /**
             * date : 2020-09-03
             * zodiac : 鼠
             * ganzhi_year : 庚子
             * ganzhi_month : 甲申
             * ganzhi_day : 己酉
             * lunar_year : 2020
             * lunar_month : 8
             * lunar_day : 16
             * lunar_month_name : 七月
             * lunar_day_name : 十六
             * lunar_leap_month : 4
             * lunar_festival :
             * solar_term :
             */

            private String date;
            private String zodiac;
            private String ganzhi_year;
            private String ganzhi_month;
            private String ganzhi_day;
            private String lunar_year;
            private String lunar_month;
            private String lunar_day;
            private String lunar_month_name;
            private String lunar_day_name;
            private String lunar_leap_month;
            private String lunar_festival;
            private String solar_term;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getZodiac() {
                return zodiac;
            }

            public void setZodiac(String zodiac) {
                this.zodiac = zodiac;
            }

            public String getGanzhi_year() {
                return ganzhi_year;
            }

            public void setGanzhi_year(String ganzhi_year) {
                this.ganzhi_year = ganzhi_year;
            }

            public String getGanzhi_month() {
                return ganzhi_month;
            }

            public void setGanzhi_month(String ganzhi_month) {
                this.ganzhi_month = ganzhi_month;
            }

            public String getGanzhi_day() {
                return ganzhi_day;
            }

            public void setGanzhi_day(String ganzhi_day) {
                this.ganzhi_day = ganzhi_day;
            }

            public String getLunar_year() {
                return lunar_year;
            }

            public void setLunar_year(String lunar_year) {
                this.lunar_year = lunar_year;
            }

            public String getLunar_month() {
                return lunar_month;
            }

            public void setLunar_month(String lunar_month) {
                this.lunar_month = lunar_month;
            }

            public String getLunar_day() {
                return lunar_day;
            }

            public void setLunar_day(String lunar_day) {
                this.lunar_day = lunar_day;
            }

            public String getLunar_month_name() {
                return lunar_month_name;
            }

            public void setLunar_month_name(String lunar_month_name) {
                this.lunar_month_name = lunar_month_name;
            }

            public String getLunar_day_name() {
                return lunar_day_name;
            }

            public void setLunar_day_name(String lunar_day_name) {
                this.lunar_day_name = lunar_day_name;
            }

            public String getLunar_leap_month() {
                return lunar_leap_month;
            }

            public void setLunar_leap_month(String lunar_leap_month) {
                this.lunar_leap_month = lunar_leap_month;
            }

            public String getLunar_festival() {
                return lunar_festival;
            }

            public void setLunar_festival(String lunar_festival) {
                this.lunar_festival = lunar_festival;
            }

            public String getSolar_term() {
                return solar_term;
            }

            public void setSolar_term(String solar_term) {
                this.solar_term = solar_term;
            }
        }
    }
}
