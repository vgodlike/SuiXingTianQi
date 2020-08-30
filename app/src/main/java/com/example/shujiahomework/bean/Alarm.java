package com.example.shujiahomework.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Alarm {

    private List<ResultsBean> results;

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    @SerializedName("alarms")
    public List<ResultsBean.AlarmsBean> alarmsBeanList;

    public static class ResultsBean {
        /**
         * location : {"id":"WTG7R0CSBHZ9","name":"蚌埠","country":"CN","path":"蚌埠,蚌埠,安徽,中国","timezone":"Asia/Shanghai","timezone_offset":"+08:00"}
         * alarms : [{"title":"蚌埠市气象台发布雷雨大风黄色预警","type":"雷雨大风","level":"黄色","status":"","description":"未来6小时内我市部分地区将出现雷雨大风天气，请注意防范！","pub_date":"2020-08-19T14:34:00+08:00"},{"title":"蚌埠市气象台发布高温黄色预警","type":"高温","level":"黄色","status":"","description":"24小时内我市最高气温将在35℃以上。请注意防范！","pub_date":"2020-08-19T11:57:00+08:00"}]
         */

        private LocationBean location;
        private List<AlarmsBean> alarms;

        public LocationBean getLocation() {
            return location;
        }

        public void setLocation(LocationBean location) {
            this.location = location;
        }

        public List<AlarmsBean> getAlarms() {
            return alarms;
        }

        public void setAlarms(List<AlarmsBean> alarms) {
            this.alarms = alarms;
        }

        public static class LocationBean {
            /**
             * id : WTG7R0CSBHZ9
             * name : 蚌埠
             * country : CN
             * path : 蚌埠,蚌埠,安徽,中国
             * timezone : Asia/Shanghai
             * timezone_offset : +08:00
             */

            private String id;
            private String name;
            private String country;
            private String path;
            private String timezone;
            private String timezone_offset;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public String getPath() {
                return path;
            }

            public void setPath(String path) {
                this.path = path;
            }

            public String getTimezone() {
                return timezone;
            }

            public void setTimezone(String timezone) {
                this.timezone = timezone;
            }

            public String getTimezone_offset() {
                return timezone_offset;
            }

            public void setTimezone_offset(String timezone_offset) {
                this.timezone_offset = timezone_offset;
            }
        }

        public static class AlarmsBean {
            /**
             * title : 蚌埠市气象台发布雷雨大风黄色预警
             * type : 雷雨大风
             * level : 黄色
             * status :
             * description : 未来6小时内我市部分地区将出现雷雨大风天气，请注意防范！
             * pub_date : 2020-08-19T14:34:00+08:00
             */

            private String title;
            private String type;
            private String level;
            private String status;
            private String description;
            private String pub_date;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getPub_date() {
                return pub_date;
            }

            public void setPub_date(String pub_date) {
                this.pub_date = pub_date;
            }
        }
    }
}
