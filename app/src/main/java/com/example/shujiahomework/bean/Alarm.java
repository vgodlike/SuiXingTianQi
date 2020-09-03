package com.example.shujiahomework.bean;

import java.util.List;

public class Alarm {


    private List<ResultsBean> results;

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * location : {"id":"WX4FBXXFKE4F","name":"北京","country":"CN","path":"北京,北京,中国","timezone":"Asia/Shanghai","timezone_offset":"+08:00"}
         * alarms : [{"title":"北京市气象台2020年09月02日20时00分发布大风蓝色预警信号","type":"大风","level":"蓝色","status":"","description":"市气象台2020年9月2日20时00分发布大风蓝色预警信号：受冷空气影响，本市2日夜间至3日白天偏北风将逐渐增大至4级左右，阵风可达7级左右，请注意防范。","pub_date":"2020-09-02T20:06:57+08:00"}]
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
             * id : WX4FBXXFKE4F
             * name : 北京
             * country : CN
             * path : 北京,北京,中国
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
             * title : 北京市气象台2020年09月02日20时00分发布大风蓝色预警信号
             * type : 大风
             * level : 蓝色
             * status :
             * description : 市气象台2020年9月2日20时00分发布大风蓝色预警信号：受冷空气影响，本市2日夜间至3日白天偏北风将逐渐增大至4级左右，阵风可达7级左右，请注意防范。
             * pub_date : 2020-09-02T20:06:57+08:00
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
