import java.util.Scanner;
import com.slack.api.bolt.App;
import com.slack.api.bolt.jetty.SlackAppServer;
import static com.slack.api.model.block.Blocks.*;
import static com.slack.api.model.block.composition.BlockCompositions.*;
import static com.slack.api.model.view.Views.*;
import com.slack.api.model.event.AppHomeOpenedEvent;
import static com.slack.api.model.block.element.BlockElements.*;
import com.slack.api.bolt.App;
import com.slack.api.bolt.AppConfig;
import com.slack.api.model.event.AppMentionEvent;


public class MainClass 
{

	public static void main(String[] args) throws Exception
	{
		System.out.println("Party Parrot Pete");
//		JavaPrintSystemEnvironmentVariables env = new JavaPrintSystemEnvironmentVariables();
//		env.print();
		String botToken = System.getenv("SLACK_BOT_TOKEN");
		String appToken = System.getenv("SLACK_SIGNING_SECRET");
		
		System.out.println("SLACK_BOT_TOKEN ------- " + botToken);
		System.out.println("SLACK_SIGNING_SECRET -- " + appToken);
		
		SmarterAlphabet sbet = new SmarterAlphabet();
		
	    App app = new App();
	    
    	//Example taken from https://api.slack.com/start/building/bolt-java#create
        app.event(AppHomeOpenedEvent.class, (payload, ctx) -> {
    	  var appHomeView = view(view -> view
    	    .type("home")
    	    .blocks(asBlocks(
    	      section(section -> section.text(markdownText(mt -> mt.text("*Welcome to your _App's Home_* :tada:")))),
    	      divider(),
    	      section(section -> section.text(markdownText(mt -> mt.text("This button won't do much for now but you can set up a listener for it using the `actions()` method and passing its unique `action_id`. See an example on <https://slack.dev/java-slack-sdk/guides/interactive-components|slack.dev/java-slack-sdk>.")))),
    	      actions(actions -> actions
    	        .elements(asElements(
    	          button(b -> b.text(plainText(pt -> pt.text("Click me!"))).value("button1").actionId("button_1"))
    	        ))
    	      )
    	    ))
    	  );

    	  var res = ctx.client().viewsPublish(r -> r
    	    .userId(payload.getEvent().getUser())
    	    .view(appHomeView)
    	  );

    	  return ctx.ack();
    	});
	    
//	    	//Found on https://api.slack.com/tutorials/tracks/responding-to-app-mentions
        app.event(AppMentionEvent.class, (req, ctx) -> {
            ctx.say(sbet.slackString("MY NAME IS PARTY PAROT PETE AND YOU KNOW WHAT I GOT", ":60fps_parrot:", ":parrot_sleep:", ":100:"));
            return ctx.ack();
          });

	    SlackAppServer server = new SlackAppServer(app);
	    server.start();
		

	    
	    
//		ParrotPrinter par = new ParrotPrinter();
//		Scanner sc = new Scanner(System.in);	
//		
//		par.print(sc.next());
//		sc.close();

		
//		for(int i=0; i<500; i++)
//		{
//			par.print(sc.next());
//		}

	}

}



//package main.java;
//import com.slack.api.bolt.App;
//import com.slack.api.bolt.jetty.SlackAppServer;
//
//public class MainClass {
//  public static void main(String[] args) throws Exception {
//    var app = new App();
//
//     // All the room in the world for your code
//
//    var server = new SlackAppServer(app);
//    server.start();
//  }
//}