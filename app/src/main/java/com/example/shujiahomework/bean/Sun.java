package com.example.shujiahomework.bean;

import java.util.List;

public class Sun {


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
         * sun : [{"date":"2020-09-03","sunrise":"05:44","sunset":"18:46"},{"date":"2020-09-04","sunrise":"05:45","sunset":"18:45"},{"date":"2020-09-05","sunrise":"05:46","sunset":"18:43"},{"date":"2020-09-06","sunrise":"05:47","sunset":"18:41"},{"date":"2020-09-07","sunrise":"05:48","sunset":"18:40"},{"date":"2020-09-08","sunrise":"05:49","sunset":"18:38"},{"date":"2020-09-09","sunrise":"05:50","sunset":"18:37"}]
         */

        private LocationBean location;
        private List<SunBean> sun;

        public LocationBean getLocation() {
            return location;
        }

        public void setLocation(LocationBean location) {
            this.location = location;
        }

        public List<SunBean> getSun() {
            return sun;
        }

        public void setSun(List<SunBean> sun) {
            this.sun = sun;
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

        public static class SunBean {
            /**
             * date : 2020-09-03
             * sunrise : 05:44
             * sunset : 18:46
             */

            private String date;
            private String sunrise;
            private String sunset;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getSunrise() {
                return sunrise;
            }

            public void setSunrise(String sunrise) {
                this.sunrise = sunrise;
            }

            public String getSunset() {
                return sunset;
            }

            public void setSunset(String sunset) {
                this.sunset = sunset;
            }
        }
    }
}
