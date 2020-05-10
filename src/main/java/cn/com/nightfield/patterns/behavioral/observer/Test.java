package cn.com.nightfield.patterns.behavioral.observer;

/**
 * Observer pattern allows object being notified when a status changed, or some event happens,
 * it is the base of <b>Async Programing</b>
 *
 * @author: nightfield
 * @create: 2020/5/10
 **/
public class Test {
    public static void main(String[] args) {
        PublicAccount publicAccount = new PublicAccount("Jump x Switch");
        ArticleFans link = new ArticleFans("Link");
        ArticleFans mario = new ArticleFans("Mario");
        publicAccount.addSubscriber(link);
        publicAccount.addSubscriber(mario);

        Article article = new Article("Pro Controller is on discount!", "……");
        publicAccount.publish(article);
    }
}
