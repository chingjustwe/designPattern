package cn.com.nightfield.patterns.behavioral.observer;

/**
 * article fans that subscribers articles
 * @author: nightfield
 * @create: 2020/5/10
 **/
public class ArticleFans implements Observer<Article> {
    private String name;
    ArticleFans(String name) {
        this.name = name;
    };

    @Override
    public void update(Article article) {
        System.out.println(name + " got article「" + article.getName() + "」");
    }

}