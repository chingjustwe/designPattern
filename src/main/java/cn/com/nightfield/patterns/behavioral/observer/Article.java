package cn.com.nightfield.patterns.behavioral.observer;

/**
 * public account that publishes articles
 * @author: nightfield
 * @create: 2020/5/10
 **/
public class Article {
    private String name;
    private String content;

    Article(String name, String content) {
        this.name = name;
        this. content = content;
    };

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}