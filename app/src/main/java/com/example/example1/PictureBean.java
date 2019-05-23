package com.example.example1;



import java.util.List;

public class PictureBean {


    /**
     * statusCode : 000000
     * desc : 请求成功
     * result : {"petFamilyList":[{"petID":1,"name":"埃及猫","engName":"Egyptian Mau","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/img99961410946559.jpg"},{"petID":2,"name":"伯曼猫","engName":"Birman","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/img43731405667543.jpg"},{"petID":3,"name":"卡尔特猫","engName":"Chartreux","price":"10000以上","coverURL":"http://img.boqiicdn.com/Data/BK/P/img49891406109364.jpg"},{"petID":4,"name":"金吉拉","engName":"Chinchilla","price":"2500-5000元","coverURL":"http://img.boqiicdn.com/Data/BK/P/img12571406109486.jpg"},{"petID":5,"name":"俄罗斯蓝猫","engName":"Russian Blue","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/img46251406108822.jpg"},{"petID":6,"name":"斯芬克斯猫","engName":"Canadian Hairless","price":"20000以上","coverURL":"http://img.boqiicdn.com/Data/BK/P/img38291406017823.jpg"},{"petID":7,"name":"苏格兰折耳猫","engName":"Scottish Fold","price":"8000--20000","coverURL":"http://img.boqiicdn.com/Data/BK/P/imagick44371435642982.png"},{"petID":8,"name":"加拿大无毛猫","engName":"Sphynx","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/img66841406110188.jpg"},{"petID":9,"name":"暹罗猫","engName":"Siamese","price":"500-1500","coverURL":"http://img.boqiicdn.com/Data/BK/P/img78961410942863.jpg"},{"petID":10,"name":"波斯猫","engName":"Persian","price":"4000--20000","coverURL":"http://img.boqiicdn.com/Data/BK/P/imagick56891435629771.png"},{"petID":11,"name":"美国短毛猫","engName":"","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/img79491416973896.jpg"},{"petID":12,"name":"异国短毛猫","engName":"Exotic Shorthair","price":"3500--12000","coverURL":"http://img.boqiicdn.com/Data/BK/P/imagick48961435629470.png"},{"petID":13,"name":"中国狸花猫","engName":"Dragon Li","price":"2000--5000","coverURL":"http://img.boqiicdn.com/Data/BK/P/img68361406281613.jpg"},{"petID":14,"name":"英国短毛猫","engName":"British Shorthair","price":"5000--10000","coverURL":"http://img.boqiicdn.com/Data/BK/P/img63891406280994.jpg"},{"petID":15,"name":"布偶猫","engName":"Ragdoll","price":"宠物级:8000-18000 赛级: 18000-25000","coverURL":"http://img.boqiicdn.com/Data/BK/P/img91405652854.jpg"},{"petID":16,"name":"奥西猫","engName":"Ocicat","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/img74051410945489.jpg"},{"petID":17,"name":"缅因猫","engName":"","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/imagick18281508393528.png"},{"petID":18,"name":"曼基康猫","engName":"","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/imagick68661508384319.jpg"},{"petID":19,"name":"孟买猫","engName":"","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/20090529141017.jpg"},{"petID":20,"name":"孟加拉豹猫","engName":"","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/imagick67191497233207.jpg"},{"petID":21,"name":"中华田园猫","engName":"","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/imagick12791473240420.jpg"},{"petID":22,"name":"重点色短毛猫","engName":"Colorpoint Shorthair","price":"10000以上","coverURL":"http://img.boqiicdn.com/Data/BK/P/img72221406282181.jpg"},{"petID":23,"name":"东奇尼猫","engName":"Tonkinese","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/img95801405672398.jpg"},{"petID":24,"name":"内华达猫","engName":"Nebelung","price":"8000--20000","coverURL":"http://img.boqiicdn.com/Data/BK/P/img21151410859877.jpg"},{"petID":25,"name":"威尔士猫","engName":"Cymric","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/img87301406196811.jpg"},{"petID":26,"name":"欧洲缅甸猫","engName":"European Burmese","price":"5000--10000","coverURL":"http://img.boqiicdn.com/Data/BK/P/img93211405935300.jpg"},{"petID":27,"name":"柯尼斯卷毛猫","engName":"Cornish Rex","price":"20000以上","coverURL":"http://img.boqiicdn.com/Data/BK/P/img4921406022121.jpg"},{"petID":28,"name":"索马里猫","engName":"Somali ","price":"10000以上","coverURL":"http://img.boqiicdn.com/Data/BK/P/img2951406018758.jpg"},{"petID":29,"name":"哈瓦那猫","engName":"Havana ","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/img98071410947762.jpg"},{"petID":30,"name":"科拉特猫","engName":"Korat","price":"10000以上","coverURL":"http://img.boqiicdn.com/Data/BK/P/img58431406016800.jpg"}],"totalCount":45}
     */

    private String statusCode;
    private String desc;
    private ResultBean result;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        @Override
        public String toString() {
            return "ResultBean{" +
                    "totalCount=" + totalCount +
                    ", petFamilyList=" + petFamilyList +
                    '}';
        }

        /**
         * petFamilyList : [{"petID":1,"name":"埃及猫","engName":"Egyptian Mau","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/img99961410946559.jpg"},{"petID":2,"name":"伯曼猫","engName":"Birman","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/img43731405667543.jpg"},{"petID":3,"name":"卡尔特猫","engName":"Chartreux","price":"10000以上","coverURL":"http://img.boqiicdn.com/Data/BK/P/img49891406109364.jpg"},{"petID":4,"name":"金吉拉","engName":"Chinchilla","price":"2500-5000元","coverURL":"http://img.boqiicdn.com/Data/BK/P/img12571406109486.jpg"},{"petID":5,"name":"俄罗斯蓝猫","engName":"Russian Blue","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/img46251406108822.jpg"},{"petID":6,"name":"斯芬克斯猫","engName":"Canadian Hairless","price":"20000以上","coverURL":"http://img.boqiicdn.com/Data/BK/P/img38291406017823.jpg"},{"petID":7,"name":"苏格兰折耳猫","engName":"Scottish Fold","price":"8000--20000","coverURL":"http://img.boqiicdn.com/Data/BK/P/imagick44371435642982.png"},{"petID":8,"name":"加拿大无毛猫","engName":"Sphynx","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/img66841406110188.jpg"},{"petID":9,"name":"暹罗猫","engName":"Siamese","price":"500-1500","coverURL":"http://img.boqiicdn.com/Data/BK/P/img78961410942863.jpg"},{"petID":10,"name":"波斯猫","engName":"Persian","price":"4000--20000","coverURL":"http://img.boqiicdn.com/Data/BK/P/imagick56891435629771.png"},{"petID":11,"name":"美国短毛猫","engName":"","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/img79491416973896.jpg"},{"petID":12,"name":"异国短毛猫","engName":"Exotic Shorthair","price":"3500--12000","coverURL":"http://img.boqiicdn.com/Data/BK/P/imagick48961435629470.png"},{"petID":13,"name":"中国狸花猫","engName":"Dragon Li","price":"2000--5000","coverURL":"http://img.boqiicdn.com/Data/BK/P/img68361406281613.jpg"},{"petID":14,"name":"英国短毛猫","engName":"British Shorthair","price":"5000--10000","coverURL":"http://img.boqiicdn.com/Data/BK/P/img63891406280994.jpg"},{"petID":15,"name":"布偶猫","engName":"Ragdoll","price":"宠物级:8000-18000 赛级: 18000-25000","coverURL":"http://img.boqiicdn.com/Data/BK/P/img91405652854.jpg"},{"petID":16,"name":"奥西猫","engName":"Ocicat","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/img74051410945489.jpg"},{"petID":17,"name":"缅因猫","engName":"","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/imagick18281508393528.png"},{"petID":18,"name":"曼基康猫","engName":"","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/imagick68661508384319.jpg"},{"petID":19,"name":"孟买猫","engName":"","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/20090529141017.jpg"},{"petID":20,"name":"孟加拉豹猫","engName":"","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/imagick67191497233207.jpg"},{"petID":21,"name":"中华田园猫","engName":"","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/imagick12791473240420.jpg"},{"petID":22,"name":"重点色短毛猫","engName":"Colorpoint Shorthair","price":"10000以上","coverURL":"http://img.boqiicdn.com/Data/BK/P/img72221406282181.jpg"},{"petID":23,"name":"东奇尼猫","engName":"Tonkinese","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/img95801405672398.jpg"},{"petID":24,"name":"内华达猫","engName":"Nebelung","price":"8000--20000","coverURL":"http://img.boqiicdn.com/Data/BK/P/img21151410859877.jpg"},{"petID":25,"name":"威尔士猫","engName":"Cymric","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/img87301406196811.jpg"},{"petID":26,"name":"欧洲缅甸猫","engName":"European Burmese","price":"5000--10000","coverURL":"http://img.boqiicdn.com/Data/BK/P/img93211405935300.jpg"},{"petID":27,"name":"柯尼斯卷毛猫","engName":"Cornish Rex","price":"20000以上","coverURL":"http://img.boqiicdn.com/Data/BK/P/img4921406022121.jpg"},{"petID":28,"name":"索马里猫","engName":"Somali ","price":"10000以上","coverURL":"http://img.boqiicdn.com/Data/BK/P/img2951406018758.jpg"},{"petID":29,"name":"哈瓦那猫","engName":"Havana ","price":"","coverURL":"http://img.boqiicdn.com/Data/BK/P/img98071410947762.jpg"},{"petID":30,"name":"科拉特猫","engName":"Korat","price":"10000以上","coverURL":"http://img.boqiicdn.com/Data/BK/P/img58431406016800.jpg"}]
         * totalCount : 45
         */

        private int totalCount;
        private List<PetFamilyListBean> petFamilyList;//数组

        public int getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(int totalCount) {
            this.totalCount = totalCount;
        }

        public List<PetFamilyListBean> getPetFamilyList() { //这个是一个集合
            return petFamilyList;
        }

        public void setPetFamilyList(List<PetFamilyListBean> petFamilyList) {
            this.petFamilyList = petFamilyList;
        }

        public static class PetFamilyListBean {
            /**
             * petID : 1
             * name : 埃及猫
             * engName : Egyptian Mau
             * price :
             * coverURL : http://img.boqiicdn.com/Data/BK/P/img99961410946559.jpg
             */

            private int petID;
            private String name;
            private String engName;
            private String price;
            private String coverURL;

            public int getPetID() {
                return petID;
            }

            public void setPetID(int petID) {
                this.petID = petID;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getEngName() {
                return engName;
            }

            public void setEngName(String engName) {
                this.engName = engName;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getCoverURL() {
                return coverURL;
            }

            public void setCoverURL(String coverURL) {
                this.coverURL = coverURL;
            }

            @Override
            public String toString() {
                return "PetFamilyListBean{" +
                        "petID=" + petID +
                        ", name='" + name + '\'' +
                        ", engName='" + engName + '\'' +
                        ", price='" + price + '\'' +
                        ", coverURL='" + coverURL + '\'' +
                        '}';
            }
        }
    }

    @Override
    public String toString() {
        return "PictureBean{" +
                "statusCode='" + statusCode + '\'' +
                ", desc='" + desc + '\'' +
                ", result=" + result +
                '}';
    }
}
