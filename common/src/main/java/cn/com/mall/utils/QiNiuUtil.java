package cn.com.mall.utils;

import cn.com.mall.common.QiNiuParam;
import com.qiniu.util.Auth;

public class QiNiuUtil {
    public static QiNiuParam generateParam(String fileExt){
        String accessKey = "DDxkjHeHt_xlpxa1p5kfh6-1TvbwoCRQ_0GM0M-v";
        String secretKey = "L_oafJl_zDcYcCiaqjTzireY34a3nyB3NrW5sgpU";
        String bucket = "leyoumall";
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        QiNiuParam qiNiuParam = new QiNiuParam();
        qiNiuParam.setToken(upToken);
        qiNiuParam.setUrl(System.currentTimeMillis()+"."+fileExt);
        return qiNiuParam;
    }
}
