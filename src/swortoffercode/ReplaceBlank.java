package swortoffercode;

/**
 * 替换空格
 * @title  请实现一个函数，将一个字符串中的空格替换成“%20”。
 *          例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @author LiaoYangJun
 * @createTime 2018/5/6.
 */
public class ReplaceBlank {

    public String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }

        StringBuilder strBuld = new StringBuilder();
        for (int i = 0 ; i < str.length(); i++ ) {
            if (str.charAt(i)== ' ') {
                strBuld.append("%20");
            }else {
                strBuld.append(str.charAt(i));
            }
        }
        return strBuld.toString();
    }
}
