package model;

import java.util.ArrayList;
import java.util.List;

/**
 * 一期干货
 * <p>
 * hujiawei 16/4/28
 */
public class WeeklyIssue {

    private int num;//编号
    private String id;//id
    private String url;//网址
    private String title;//标题
    private String file;//文件路径
    private List<WeeklyItem> items;//日报中的item列表

    public WeeklyIssue() {
        this.items = new ArrayList<WeeklyItem>();
    }

    @Override
    public String toString() {
        return "WeeklyIssue{" +
                "num=" + num +
                ", id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", file='" + file + '\'' +
                ", items=" + items +
                '}';
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public List<WeeklyItem> getItems() {
        return items;
    }

    public void setItems(List<WeeklyItem> items) {
        this.items = items;
    }
}
