package org.shenchanghui.retrofit2withrxjava2_demo.bean;

import java.util.List;

/**
 * 新闻
 * Created by shenc on 2017/7/17.
 */

public class NewsBean {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"9bb4b7aea9578f85381ab682ec185240","title":"守望相助70载丨内蒙古高速公路里程突破6000公里","date":"2017-07-17 19:29","category":"头条","author_name":"新华社","url":"http://mini.eastday.com/mobile/170717192901251.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170717/20170717192901_028748affe45bb80ede2556b66c47297_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170717/20170717192901_15bbe17d2983eb36078f8a3e630ebd75_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170717/20170717192901_6d764f6eb8ec24a2831e7f7191228ab2_5_mwpm_03200403.jpg"},{"uniquekey":"6069156450865e366ce444afa656c76a","title":"游客投诉在广西北海就餐点6个菜花2023元 工商回应","date":"2017-07-17 19:01","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170717190101843.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170717/20170717190101_85cf6e6e3a3592f9bfd08e632545f999_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170717/20170717190101_85cf6e6e3a3592f9bfd08e632545f999_2_mwpm_03200403.jpg"},{"uniquekey":"d8841d64469a580b8e902b16769e4f66","title":"美国海军最新科幻战舰已被放弃：连中国护卫舰都打不过","date":"2017-07-17 18:58","category":"头条","author_name":"利刃军事","url":"http://mini.eastday.com/mobile/170717185816636.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170717/20170717_a69e4021ca575ce9b0dc05b49b8aba12_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170717/20170717_db75875450dcbc10b4cc99cd4f6f9c0f_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170717/20170717_2f54dfdd6307829bd4fadb872a6181d0_cover_mwpm_03200403.jpeg"},{"uniquekey":"479c00b6280112649065c8f42848b1e9","title":"基建影响力不行了？ 日本选择靠输出医疗等软实力对抗中国","date":"2017-07-17 18:53","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170717185354398.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170717/20170717185354_29c592feb8a1bc2efec91035d8ed49a5_1_mwpm_03200403.jpg"},{"uniquekey":"380ddc8419d9ef092c6df248796eadc5","title":"北京\u201c共享睡眠舱\u201d停业","date":"2017-07-17 18:50","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170717185056501.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170717/20170717185056_42a960e008a6e70ea462aba272cacf7e_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170717/20170717185056_42a960e008a6e70ea462aba272cacf7e_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170717/20170717185056_42a960e008a6e70ea462aba272cacf7e_4_mwpm_03200403.jpg"},{"uniquekey":"6df15c944366d8f565aae0564237b948","title":"乌总理称将减少乌政府中外籍官员数量 吸引本国人治国","date":"2017-07-17 18:43","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170717184344252.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170717/20170717184344_dc8357db86ccdb371bc54394f579bfd3_1_mwpm_03200403.jpg"},{"uniquekey":"b627a2feeab7963e35f831cbce0c1f8d","title":"湖南张家界用直径2米大锅煮鱼 游客争相体验","date":"2017-07-17 18:20","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170717182042150.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170717/20170717182042_76819e8983431030938b0a54235e1f5f_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170717/20170717182042_76819e8983431030938b0a54235e1f5f_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170717/20170717182042_76819e8983431030938b0a54235e1f5f_1_mwpm_03200403.jpg"},{"uniquekey":"6a15b6eda87f550eb8fbc295960588e1","title":"河南南阳路边女子捡60元，钱上面写着：打110救救我我在六楼","date":"2017-07-17 18:16","category":"头条","author_name":"怡然生活","url":"http://mini.eastday.com/mobile/170717181649905.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170717/20170717_6b17d037127319768d34933c07ba69c3_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170717/20170717_8231dd1cdbbf3d19843803e7bd4b3fa7_mwpm_03200403.png","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170717/20170717_2937bbe686a1c0a278e2b365b24f3448_mwpm_03200403.png"},{"uniquekey":"1f79a6608bd26ecd59c4e28243c8ab74","title":"外交部就美评估美台军舰互访、朝鲜半岛局势等答问","date":"2017-07-17 18:12","category":"头条","author_name":"外交部网站","url":"http://mini.eastday.com/mobile/170717181248219.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170717/20170717181248_926b205212b00794f16d7548b480a10b_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170717/20170717181248_926b205212b00794f16d7548b480a10b_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170717/20170717181248_926b205212b00794f16d7548b480a10b_3_mwpm_03200403.jpg"},{"uniquekey":"91563d582911a8cdf106ef0d3319461b","title":"A股现黑色星期一，两市逾500股跌停，原因更悲凉","date":"2017-07-17 17:44","category":"头条","author_name":"风生焱起","url":"http://mini.eastday.com/mobile/170717174449349.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170717/20170717_c5a69d57cda9020e59deaa2200104c56_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170717/20170717_091d5dd5d9cfcab3bbc1d54b813839d3_cover_mwpm_03200403.png","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170717/20170717_dd7411b014131543abd99f20775a7bfc_cover_mwpm_03200403.png"},{"uniquekey":"ee593a354336ad572e6db02dfa5645e6","title":"2017农村土地改革宅基地确权，父母房屋或无法继承将被收回！","date":"2017-07-17 17:44","category":"头条","author_name":"雪花神剑财经资讯","url":"http://mini.eastday.com/mobile/170717174421739.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170717/20170717_05421dc5c4e2dee5447d7d9ee2b3a39b_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170717/20170717_c860523ba6bfdbf0258d1749fdcf90fe_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170717/20170717_80b382e2c1bcc3df8b4d65d10bb71302_mwpm_03200403.jpg"},{"uniquekey":"597c7e738ba9fe964abf013ecc112c31","title":"7月底桃花运最好的三大星座","date":"2017-07-17 17:38","category":"头条","author_name":"星座占卜","url":"http://mini.eastday.com/mobile/170717173834594.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170717/20170717_ffd3ee54ea3417a75e6dc9f1aacc62f0_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170717/20170717_e40f5ce76b9b509c1a0871337627eb7d_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170717/20170717_9da398ae20f637f34bc8f2b9697cb7e8_mwpm_03200403.jpg"},{"uniquekey":"41f77b2a49cfbe2f110d02587c53c0ff","title":"歼-20两处惊喜，美日大呼难以置信！","date":"2017-07-17 17:35","category":"头条","author_name":"馨语军事","url":"http://mini.eastday.com/mobile/170717173538405.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170717/20170717_143dfed7241d6ccd2479e7b7113ba690_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170717/20170717_941d2a55f935f6ba732a47482e87c5f8_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170717/20170717_3fe38d239b21bddd54b0fdc39252546c_cover_mwpm_03200403.jpeg"},{"uniquekey":"6089a578d05d7cdf14df57567206ad6d","title":"同城交友广告遭\u201c擒狼\u201d挂马 360国内独家查杀","date":"2017-07-17 17:29","category":"头条","author_name":"中国网","url":"http://mini.eastday.com/mobile/170717172951540.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170717/20170717172951_344d3bd47bd9d6d348f476fbc6b0d610_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170717/20170717172951_344d3bd47bd9d6d348f476fbc6b0d610_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170717/20170717172951_344d3bd47bd9d6d348f476fbc6b0d610_3_mwpm_03200403.jpg"},{"uniquekey":"292ca2a7bd3330283424aeb90052671f","title":"iPhone8与iPhone7的不同，兼容苹果专用投影仪相同","date":"2017-07-17 17:09","category":"头条","author_name":"励凡大学院","url":"http://mini.eastday.com/mobile/170717170929454.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170717/20170717170929_d41d8cd98f00b204e9800998ecf8427e_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170717/20170717170929_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170717/20170717170929_d41d8cd98f00b204e9800998ecf8427e_8_mwpm_03200403.jpg"},{"uniquekey":"77ee73728846fa0f6c83f4814601449c","title":"日本男房东醉酒后强奸暴打韩国女游客 自辩只是\u201c摸摸而已\u201d","date":"2017-07-17 17:02","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170717170231489.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170717/20170717170231_362f2d7af17febf5e2d50296fe5918fc_1_mwpm_03200403.jpg"},{"uniquekey":"66e645095aa36d3221e25d019a6ab6f8","title":"菲媒：\u201c任何权力和财富都救不了菲律宾前总统阿基诺\u201d","date":"2017-07-17 17:02","category":"头条","author_name":"中国东盟博览杂志","url":"http://mini.eastday.com/mobile/170717170228970.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170717/20170717170228_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg"},{"uniquekey":"582c89208a4f711f17508cb4b73ea9fd","title":"日本无业男子手刃外祖父母 直认不讳：就是想杀人","date":"2017-07-17 17:02","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170717170212250.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170717/20170717170212_a0903f0241fa70d583041550acb9adee_1_mwpm_03200403.jpg"},{"uniquekey":"9db5838618c5321db244ac4251800de4","title":"中国\u201c天眼\u201d成功首飞：几乎可以永不降落，专门监视边境无人区","date":"2017-07-17 16:56","category":"头条","author_name":"123军情观察室","url":"http://mini.eastday.com/mobile/170717165607171.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170717/20170717_4ba630df6b82e2e0b2f0c8f6f5a1ccfe_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170717/20170717_70b8d89504c24207b5fb2149d47c24be_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170717/20170717_8ad7bf6c9f6f189c7a5eb3dfcd50f957_cover_mwpm_03200403.jpeg"},{"uniquekey":"47206972f7a3de5cf343b578f4ab5005","title":"19岁父亲把纹身纹到了这个地方，却让女儿的生活造成了困扰！","date":"2017-07-17 16:53","category":"头条","author_name":"娱乐新看点","url":"http://mini.eastday.com/mobile/170717165308949.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170717/20170717_e39dd625c281d5dedf0dad91b5e7da1f_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170717/20170717_03908eecec1df2d116de2630c0a5a25f_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170717/20170717_6b7b48b3ca89569fe5ad74810eeaf9ce_cover_mwpm_03200403.jpeg"},{"uniquekey":"b92116e71541adf06c490065d9fc9baa","title":"崂山啤酒以足球之名点燃盛夏足球盛宴","date":"2017-07-17 16:31","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170717163124740.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170717/20170717163124_789c6cfb6b5613f54e74a32cdda906c3_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170717/20170717163124_789c6cfb6b5613f54e74a32cdda906c3_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170717/20170717163124_789c6cfb6b5613f54e74a32cdda906c3_4_mwpm_03200403.jpg"},{"uniquekey":"f898273bb84332ee3e7136b445e61987","title":"今日大盘全面下跌 为何？","date":"2017-07-17 16:23","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/170717162323149.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170717/20170717162323_db16ebec839e4b9023c6bd4434630831_1_mwpm_03200403.jpg"},{"uniquekey":"5997d899d040ca0198a623055eb1d1c5","title":"姚笛说出真相文章哭 出轨门真相令人大吃一惊","date":"2017-07-17 16:20","category":"头条","author_name":"时尚女人杂志","url":"http://mini.eastday.com/mobile/170717162059004.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170717/20170717_afc43336dbfbb4b237109e46ae36de43_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170717/20170717_c1c438db7830d4e0df1b7a867c7d2aa7_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170717/20170717_47a8ae79b42f55fd092efdf7da9c67e7_mwpm_03200403.jpg"},{"uniquekey":"1c725df06bd6a59731865c03943e0e6d","title":"中国网剧：如何\u201c唱\u201d出好声音","date":"2017-07-17 16:18","category":"头条","author_name":"新华社","url":"http://mini.eastday.com/mobile/170717161841470.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170717/20170717161841_9625b2a526ec8d896ca6cf5fac691f91_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170717/20170717161841_9625b2a526ec8d896ca6cf5fac691f91_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170717/20170717161841_9625b2a526ec8d896ca6cf5fac691f91_2_mwpm_03200403.jpg"},{"uniquekey":"e04d9b6a49d9ca98254252f5ff20a78f","title":"中国反隐形雷达太过先进被禁止出售，并要求提交设计图纸由美保管","date":"2017-07-17 16:10","category":"头条","author_name":"猛禽","url":"http://mini.eastday.com/mobile/170717161033061.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170717/20170717_2c83862f56c9a8535fd394e079f6ece8_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170717/20170717_af75b16b1d868b13a7a4678bd08e6293_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170717/20170717_f96b4b839f10e54cfb8b6393ec004fda_cover_mwpm_03200403.jpeg"},{"uniquekey":"7d4315306881a285783fd54d0a22a9a1","title":"地表最强的肌肉巨兽，大到让人害怕，却是个慈爱的好父亲","date":"2017-07-17 16:05","category":"头条","author_name":" 运动发骚客","url":"http://mini.eastday.com/mobile/170717160550396.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170717/20170717_752dff2d61a24bd2618aae89b74263e4_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170717/20170717_f18f523f87d7c5399ee8cfed4180464a_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170717/20170717_2c6083ebc5504097b89c4a01569199a5_cover_mwpm_03200403.jpeg"},{"uniquekey":"45c58f85caa6c29bd2b19889f49ea0c0","title":"张敬华任江苏省委常委 接替吴政隆任南京市委书记(图|简历)","date":"2017-07-17 15:53","category":"头条","author_name":"中国经济网综合","url":"http://mini.eastday.com/mobile/170717155305820.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170717/20170717155305_be33eabf04f663aba444ed97dc69a347_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170717/20170717155305_8b1cf9f4682251a3a60ec1de1b7eb874_1_mwpm_03200403.jpg"},{"uniquekey":"47f38cd55b5ade40eb16e7116e221ab5","title":"一幅令中国人悲伤的地图","date":"2017-07-17 15:49","category":"头条","author_name":"政商大参考","url":"http://mini.eastday.com/mobile/170717154905092.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170717/20170717154905_2827d163b762b7a5da30221a9260a62a_12_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170717/20170717154905_2827d163b762b7a5da30221a9260a62a_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170717/20170717154905_2827d163b762b7a5da30221a9260a62a_13_mwpm_03200403.jpg"},{"uniquekey":"dc11d850afbe863c378e1777581da7ca","title":"最高检机关入额遴选收官，配偶子女移居国外等7情形禁止入额","date":"2017-07-17 15:39","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170717153922808.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170717/20170717153922_04180464114bee189e55ad21cb6ad36d_1_mwpm_03200403.jpg"},{"uniquekey":"6097b7801f9353fcd56f802ac783b715","title":"张敬华任江苏省委常委、南京市委书记（图/简历）","date":"2017-07-17 15:35","category":"头条","author_name":"南京日报","url":"http://mini.eastday.com/mobile/170717153508566.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170717/20170717153508_c935924d69a02b0cfc963275f88630ae_2_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    @Override
    public String toString() {
        return "NewsBean{" +
                "reason='" + reason + '\'' +
                ", result=" + result +
                ", error_code=" + error_code +
                '}';
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"9bb4b7aea9578f85381ab682ec185240","title":"守望相助70载丨内蒙古高速公路里程突破6000公里","date":"2017-07-17 19:29","category":"头条","author_name":"新华社","url":"http://mini.eastday.com/mobile/170717192901251.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170717/20170717192901_028748affe45bb80ede2556b66c47297_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170717/20170717192901_15bbe17d2983eb36078f8a3e630ebd75_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170717/20170717192901_6d764f6eb8ec24a2831e7f7191228ab2_5_mwpm_03200403.jpg"},{"uniquekey":"6069156450865e366ce444afa656c76a","title":"游客投诉在广西北海就餐点6个菜花2023元 工商回应","date":"2017-07-17 19:01","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170717190101843.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170717/20170717190101_85cf6e6e3a3592f9bfd08e632545f999_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170717/20170717190101_85cf6e6e3a3592f9bfd08e632545f999_2_mwpm_03200403.jpg"},{"uniquekey":"d8841d64469a580b8e902b16769e4f66","title":"美国海军最新科幻战舰已被放弃：连中国护卫舰都打不过","date":"2017-07-17 18:58","category":"头条","author_name":"利刃军事","url":"http://mini.eastday.com/mobile/170717185816636.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170717/20170717_a69e4021ca575ce9b0dc05b49b8aba12_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170717/20170717_db75875450dcbc10b4cc99cd4f6f9c0f_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170717/20170717_2f54dfdd6307829bd4fadb872a6181d0_cover_mwpm_03200403.jpeg"},{"uniquekey":"479c00b6280112649065c8f42848b1e9","title":"基建影响力不行了？ 日本选择靠输出医疗等软实力对抗中国","date":"2017-07-17 18:53","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170717185354398.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170717/20170717185354_29c592feb8a1bc2efec91035d8ed49a5_1_mwpm_03200403.jpg"},{"uniquekey":"380ddc8419d9ef092c6df248796eadc5","title":"北京\u201c共享睡眠舱\u201d停业","date":"2017-07-17 18:50","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170717185056501.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170717/20170717185056_42a960e008a6e70ea462aba272cacf7e_5_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170717/20170717185056_42a960e008a6e70ea462aba272cacf7e_7_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170717/20170717185056_42a960e008a6e70ea462aba272cacf7e_4_mwpm_03200403.jpg"},{"uniquekey":"6df15c944366d8f565aae0564237b948","title":"乌总理称将减少乌政府中外籍官员数量 吸引本国人治国","date":"2017-07-17 18:43","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170717184344252.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170717/20170717184344_dc8357db86ccdb371bc54394f579bfd3_1_mwpm_03200403.jpg"},{"uniquekey":"b627a2feeab7963e35f831cbce0c1f8d","title":"湖南张家界用直径2米大锅煮鱼 游客争相体验","date":"2017-07-17 18:20","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170717182042150.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170717/20170717182042_76819e8983431030938b0a54235e1f5f_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170717/20170717182042_76819e8983431030938b0a54235e1f5f_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170717/20170717182042_76819e8983431030938b0a54235e1f5f_1_mwpm_03200403.jpg"},{"uniquekey":"6a15b6eda87f550eb8fbc295960588e1","title":"河南南阳路边女子捡60元，钱上面写着：打110救救我我在六楼","date":"2017-07-17 18:16","category":"头条","author_name":"怡然生活","url":"http://mini.eastday.com/mobile/170717181649905.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170717/20170717_6b17d037127319768d34933c07ba69c3_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170717/20170717_8231dd1cdbbf3d19843803e7bd4b3fa7_mwpm_03200403.png","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170717/20170717_2937bbe686a1c0a278e2b365b24f3448_mwpm_03200403.png"},{"uniquekey":"1f79a6608bd26ecd59c4e28243c8ab74","title":"外交部就美评估美台军舰互访、朝鲜半岛局势等答问","date":"2017-07-17 18:12","category":"头条","author_name":"外交部网站","url":"http://mini.eastday.com/mobile/170717181248219.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170717/20170717181248_926b205212b00794f16d7548b480a10b_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170717/20170717181248_926b205212b00794f16d7548b480a10b_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170717/20170717181248_926b205212b00794f16d7548b480a10b_3_mwpm_03200403.jpg"},{"uniquekey":"91563d582911a8cdf106ef0d3319461b","title":"A股现黑色星期一，两市逾500股跌停，原因更悲凉","date":"2017-07-17 17:44","category":"头条","author_name":"风生焱起","url":"http://mini.eastday.com/mobile/170717174449349.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170717/20170717_c5a69d57cda9020e59deaa2200104c56_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170717/20170717_091d5dd5d9cfcab3bbc1d54b813839d3_cover_mwpm_03200403.png","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170717/20170717_dd7411b014131543abd99f20775a7bfc_cover_mwpm_03200403.png"},{"uniquekey":"ee593a354336ad572e6db02dfa5645e6","title":"2017农村土地改革宅基地确权，父母房屋或无法继承将被收回！","date":"2017-07-17 17:44","category":"头条","author_name":"雪花神剑财经资讯","url":"http://mini.eastday.com/mobile/170717174421739.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170717/20170717_05421dc5c4e2dee5447d7d9ee2b3a39b_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170717/20170717_c860523ba6bfdbf0258d1749fdcf90fe_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170717/20170717_80b382e2c1bcc3df8b4d65d10bb71302_mwpm_03200403.jpg"},{"uniquekey":"597c7e738ba9fe964abf013ecc112c31","title":"7月底桃花运最好的三大星座","date":"2017-07-17 17:38","category":"头条","author_name":"星座占卜","url":"http://mini.eastday.com/mobile/170717173834594.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170717/20170717_ffd3ee54ea3417a75e6dc9f1aacc62f0_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170717/20170717_e40f5ce76b9b509c1a0871337627eb7d_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170717/20170717_9da398ae20f637f34bc8f2b9697cb7e8_mwpm_03200403.jpg"},{"uniquekey":"41f77b2a49cfbe2f110d02587c53c0ff","title":"歼-20两处惊喜，美日大呼难以置信！","date":"2017-07-17 17:35","category":"头条","author_name":"馨语军事","url":"http://mini.eastday.com/mobile/170717173538405.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170717/20170717_143dfed7241d6ccd2479e7b7113ba690_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170717/20170717_941d2a55f935f6ba732a47482e87c5f8_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170717/20170717_3fe38d239b21bddd54b0fdc39252546c_cover_mwpm_03200403.jpeg"},{"uniquekey":"6089a578d05d7cdf14df57567206ad6d","title":"同城交友广告遭\u201c擒狼\u201d挂马 360国内独家查杀","date":"2017-07-17 17:29","category":"头条","author_name":"中国网","url":"http://mini.eastday.com/mobile/170717172951540.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170717/20170717172951_344d3bd47bd9d6d348f476fbc6b0d610_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170717/20170717172951_344d3bd47bd9d6d348f476fbc6b0d610_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170717/20170717172951_344d3bd47bd9d6d348f476fbc6b0d610_3_mwpm_03200403.jpg"},{"uniquekey":"292ca2a7bd3330283424aeb90052671f","title":"iPhone8与iPhone7的不同，兼容苹果专用投影仪相同","date":"2017-07-17 17:09","category":"头条","author_name":"励凡大学院","url":"http://mini.eastday.com/mobile/170717170929454.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170717/20170717170929_d41d8cd98f00b204e9800998ecf8427e_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170717/20170717170929_d41d8cd98f00b204e9800998ecf8427e_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170717/20170717170929_d41d8cd98f00b204e9800998ecf8427e_8_mwpm_03200403.jpg"},{"uniquekey":"77ee73728846fa0f6c83f4814601449c","title":"日本男房东醉酒后强奸暴打韩国女游客 自辩只是\u201c摸摸而已\u201d","date":"2017-07-17 17:02","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170717170231489.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170717/20170717170231_362f2d7af17febf5e2d50296fe5918fc_1_mwpm_03200403.jpg"},{"uniquekey":"66e645095aa36d3221e25d019a6ab6f8","title":"菲媒：\u201c任何权力和财富都救不了菲律宾前总统阿基诺\u201d","date":"2017-07-17 17:02","category":"头条","author_name":"中国东盟博览杂志","url":"http://mini.eastday.com/mobile/170717170228970.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170717/20170717170228_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg"},{"uniquekey":"582c89208a4f711f17508cb4b73ea9fd","title":"日本无业男子手刃外祖父母 直认不讳：就是想杀人","date":"2017-07-17 17:02","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170717170212250.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170717/20170717170212_a0903f0241fa70d583041550acb9adee_1_mwpm_03200403.jpg"},{"uniquekey":"9db5838618c5321db244ac4251800de4","title":"中国\u201c天眼\u201d成功首飞：几乎可以永不降落，专门监视边境无人区","date":"2017-07-17 16:56","category":"头条","author_name":"123军情观察室","url":"http://mini.eastday.com/mobile/170717165607171.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170717/20170717_4ba630df6b82e2e0b2f0c8f6f5a1ccfe_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170717/20170717_70b8d89504c24207b5fb2149d47c24be_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170717/20170717_8ad7bf6c9f6f189c7a5eb3dfcd50f957_cover_mwpm_03200403.jpeg"},{"uniquekey":"47206972f7a3de5cf343b578f4ab5005","title":"19岁父亲把纹身纹到了这个地方，却让女儿的生活造成了困扰！","date":"2017-07-17 16:53","category":"头条","author_name":"娱乐新看点","url":"http://mini.eastday.com/mobile/170717165308949.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170717/20170717_e39dd625c281d5dedf0dad91b5e7da1f_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170717/20170717_03908eecec1df2d116de2630c0a5a25f_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170717/20170717_6b7b48b3ca89569fe5ad74810eeaf9ce_cover_mwpm_03200403.jpeg"},{"uniquekey":"b92116e71541adf06c490065d9fc9baa","title":"崂山啤酒以足球之名点燃盛夏足球盛宴","date":"2017-07-17 16:31","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170717163124740.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170717/20170717163124_789c6cfb6b5613f54e74a32cdda906c3_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170717/20170717163124_789c6cfb6b5613f54e74a32cdda906c3_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05.imgmini.eastday.com/mobile/20170717/20170717163124_789c6cfb6b5613f54e74a32cdda906c3_4_mwpm_03200403.jpg"},{"uniquekey":"f898273bb84332ee3e7136b445e61987","title":"今日大盘全面下跌 为何？","date":"2017-07-17 16:23","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/170717162323149.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170717/20170717162323_db16ebec839e4b9023c6bd4434630831_1_mwpm_03200403.jpg"},{"uniquekey":"5997d899d040ca0198a623055eb1d1c5","title":"姚笛说出真相文章哭 出轨门真相令人大吃一惊","date":"2017-07-17 16:20","category":"头条","author_name":"时尚女人杂志","url":"http://mini.eastday.com/mobile/170717162059004.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170717/20170717_afc43336dbfbb4b237109e46ae36de43_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170717/20170717_c1c438db7830d4e0df1b7a867c7d2aa7_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170717/20170717_47a8ae79b42f55fd092efdf7da9c67e7_mwpm_03200403.jpg"},{"uniquekey":"1c725df06bd6a59731865c03943e0e6d","title":"中国网剧：如何\u201c唱\u201d出好声音","date":"2017-07-17 16:18","category":"头条","author_name":"新华社","url":"http://mini.eastday.com/mobile/170717161841470.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170717/20170717161841_9625b2a526ec8d896ca6cf5fac691f91_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170717/20170717161841_9625b2a526ec8d896ca6cf5fac691f91_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170717/20170717161841_9625b2a526ec8d896ca6cf5fac691f91_2_mwpm_03200403.jpg"},{"uniquekey":"e04d9b6a49d9ca98254252f5ff20a78f","title":"中国反隐形雷达太过先进被禁止出售，并要求提交设计图纸由美保管","date":"2017-07-17 16:10","category":"头条","author_name":"猛禽","url":"http://mini.eastday.com/mobile/170717161033061.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170717/20170717_2c83862f56c9a8535fd394e079f6ece8_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170717/20170717_af75b16b1d868b13a7a4678bd08e6293_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170717/20170717_f96b4b839f10e54cfb8b6393ec004fda_cover_mwpm_03200403.jpeg"},{"uniquekey":"7d4315306881a285783fd54d0a22a9a1","title":"地表最强的肌肉巨兽，大到让人害怕，却是个慈爱的好父亲","date":"2017-07-17 16:05","category":"头条","author_name":" 运动发骚客","url":"http://mini.eastday.com/mobile/170717160550396.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170717/20170717_752dff2d61a24bd2618aae89b74263e4_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170717/20170717_f18f523f87d7c5399ee8cfed4180464a_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170717/20170717_2c6083ebc5504097b89c4a01569199a5_cover_mwpm_03200403.jpeg"},{"uniquekey":"45c58f85caa6c29bd2b19889f49ea0c0","title":"张敬华任江苏省委常委 接替吴政隆任南京市委书记(图|简历)","date":"2017-07-17 15:53","category":"头条","author_name":"中国经济网综合","url":"http://mini.eastday.com/mobile/170717155305820.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170717/20170717155305_be33eabf04f663aba444ed97dc69a347_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170717/20170717155305_8b1cf9f4682251a3a60ec1de1b7eb874_1_mwpm_03200403.jpg"},{"uniquekey":"47f38cd55b5ade40eb16e7116e221ab5","title":"一幅令中国人悲伤的地图","date":"2017-07-17 15:49","category":"头条","author_name":"政商大参考","url":"http://mini.eastday.com/mobile/170717154905092.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170717/20170717154905_2827d163b762b7a5da30221a9260a62a_12_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170717/20170717154905_2827d163b762b7a5da30221a9260a62a_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170717/20170717154905_2827d163b762b7a5da30221a9260a62a_13_mwpm_03200403.jpg"},{"uniquekey":"dc11d850afbe863c378e1777581da7ca","title":"最高检机关入额遴选收官，配偶子女移居国外等7情形禁止入额","date":"2017-07-17 15:39","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170717153922808.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170717/20170717153922_04180464114bee189e55ad21cb6ad36d_1_mwpm_03200403.jpg"},{"uniquekey":"6097b7801f9353fcd56f802ac783b715","title":"张敬华任江苏省委常委、南京市委书记（图/简历）","date":"2017-07-17 15:35","category":"头条","author_name":"南京日报","url":"http://mini.eastday.com/mobile/170717153508566.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170717/20170717153508_c935924d69a02b0cfc963275f88630ae_2_mwpm_03200403.jpg"}]
         */

        private String stat;
        private List<DataBean> data;

        @Override
        public String toString() {
            return "ResultBean{" +
                    "stat='" + stat + '\'' +
                    ", data=" + data +
                    '}';
        }

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : 9bb4b7aea9578f85381ab682ec185240
             * title : 守望相助70载丨内蒙古高速公路里程突破6000公里
             * date : 2017-07-17 19:29
             * category : 头条
             * author_name : 新华社
             * url : http://mini.eastday.com/mobile/170717192901251.html
             * thumbnail_pic_s : http://07.imgmini.eastday.com/mobile/20170717/20170717192901_028748affe45bb80ede2556b66c47297_2_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://07.imgmini.eastday.com/mobile/20170717/20170717192901_15bbe17d2983eb36078f8a3e630ebd75_3_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://07.imgmini.eastday.com/mobile/20170717/20170717192901_6d764f6eb8ec24a2831e7f7191228ab2_5_mwpm_03200403.jpg
             */


            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            @Override
            public String toString() {
                return "DataBean{" +
                        "uniquekey='" + uniquekey + '\'' +
                        ", title='" + title + '\'' +
                        ", date='" + date + '\'' +
                        ", category='" + category + '\'' +
                        ", author_name='" + author_name + '\'' +
                        ", url='" + url + '\'' +
                        ", thumbnail_pic_s='" + thumbnail_pic_s + '\'' +
                        ", thumbnail_pic_s02='" + thumbnail_pic_s02 + '\'' +
                        ", thumbnail_pic_s03='" + thumbnail_pic_s03 + '\'' +
                        '}';
            }

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
