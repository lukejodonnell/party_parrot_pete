
import com.slack.api.bolt.App;
import com.slack.api.bolt.jetty.SlackAppServer;

public class SlackAPI {
	  public void main() throws Exception {
		    var app = new App();

		     // All the room in the world for your code

		    var server = new SlackAppServer(app);
		    server.start();
		  }

}
