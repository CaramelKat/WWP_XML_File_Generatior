import java.util.ArrayList;
import java.util.List;

public class post {
    private String body, community_id, feeling_id, id, language_id, mii;
    private painting painting;
    private String pid, reply_count, title_id, app_data, country_id, created_at;
    private data data;
    private String  is_autopost, is_spoiler, is_netabare, empathy_added, message_to_pid, number, platform_id, region_id, reply_to_id, screen_name;
    private screenshot screenshot;
    private topic_tag topic_tag;
    private String url;


    public post(String body, String mii,painting painting, String reply_count, String title_id, String created_at, data data, screenshot screenshot, topic_tag topic_tag) {
        this.body = body;
        this.community_id = "4294967295";
        this.feeling_id = "0";
        this.id = "";
        this.language_id = "1";
        this.mii = mii;
        this.painting = painting;
        this.pid = "0";
        this.reply_count = reply_count;
        this.title_id = title_id;
        this.app_data = "botu";
        this.country_id = "1";
        this.created_at = created_at;
        this.data = data;
        this.is_autopost = "0";
        this.is_spoiler = "0";
        this.is_netabare = "0";
        this.empathy_added = "0";
        this.message_to_pid = "a";
        this.number = "0";
        this.platform_id = "1";
        this.region_id = "1";
        this.reply_to_id = "0";
        this.screen_name = "";
        this.topic_tag = topic_tag;
        this.screenshot = screenshot;
        this.url = "http://botu";

    }


}
