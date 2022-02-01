package cn.com.mall.utils;

import java.util.Random;

/**
 * @author liaoyuming
 * @date 2022/2/1 20:25
 * @Description
 */
public class RandomUtil {
    private static String randomNumber[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    public static String PREFIX = "乐优购_";
    
    /**
     * 生成随机昵称
     *
     * @return
     */
    public static String generateRandomString(Integer len) {
        int rnLen= randomNumber.length;

        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for(int i = 0; i < len; i++){
            sb.append(randomNumber[random.nextInt(rnLen)]);
        }
        return sb.toString();
    }

    // 随机的头像 url
    private static String randomPicUrl[] = {
            "https://eventimg.pconline.com.cn/pconline/images/pc_picture/20211223/487514.png?x-oss-process=image/resize,w_340",
            "https://eventimg.pconline.com.cn/pconline/images/pc_picture/20211223/487531.png?x-oss-process=image/resize,w_340",
            "https://eventimg.pconline.com.cn/pconline/images/pc_picture/20211223/487515.png?x-oss-process=image/resize,w_340",
            "https://eventimg.pconline.com.cn/pconline/images/pc_picture/20211223/487532.png?x-oss-process=image/resize,w_340"
    };

    /**
     * 生成随机头像
     *
     * @return
     */
    public static String generateHeadPicture() {
        int rnLen= randomPicUrl.length;
        Random random = new Random();
        return randomPicUrl[random.nextInt(rnLen)];
    }
}
