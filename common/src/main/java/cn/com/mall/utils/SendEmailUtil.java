package cn.com.mall.utils;

import cn.com.mall.common.EmailDTO;
import com.sun.mail.util.MailSSLSocketFactory;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.GeneralSecurityException;
import java.util.Properties;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SendEmailUtil {

    private static ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5, 10, 5L,
            TimeUnit.MINUTES, new ArrayBlockingQueue<>(20));

    private static final String FROM = "3454812181@qq.com";
    private static final String PASSWORD = "sbddeaknqcysdacj";
    //邮件发送的服务器
    private static final String HOST = "smtp.qq.com";

    public static void sendMsg(EmailDTO dto) {
        threadPool.execute(()->{
            try {
                Properties properties = new Properties();

                properties.setProperty("mail.host", "smtp.qq.com");

                properties.setProperty("mail.transport.protocol", "smtp");

                properties.setProperty("mail.smtp.auth", "true");

                //QQ存在一个特性设置SSL加密
                MailSSLSocketFactory sf = null;
                try {
                    sf = new MailSSLSocketFactory();
                } catch (GeneralSecurityException e) {
                    e.printStackTrace();
                }
                sf.setTrustAllHosts(true);
                properties.put("mail.smtp.ssl.enable", "true");
                properties.put("mail.smtp.ssl.socketFactory", sf);

                //创建一个session对象
                Session session = Session.getDefaultInstance(properties, new Authenticator() {
                    @Override
                    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                        return new javax.mail.PasswordAuthentication(FROM, PASSWORD);
                    }
                });

                //开启debug模式
                session.setDebug(true);

                //获取连接对象
                Transport transport = null;
                transport = session.getTransport();

                //连接服务器
                transport.connect(HOST, FROM, PASSWORD);


                //创建一个邮件发送对象
                MimeMessage mimeMessage = new MimeMessage(session);
                //邮件发送人
                mimeMessage.setFrom(new InternetAddress(FROM));

                //邮件接收人
                mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(dto.getRecipient()));

                //邮件标题
                mimeMessage.setSubject(dto.getSubject());

                //邮件内容
                mimeMessage.setContent(dto.getContent(), "text/html;charset=UTF-8");

                //发送邮件
                transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());

                transport.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }
}

