import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;
public class Bot extends ListenerAdapter
{
    public static void main(String[] args) throws LoginException
    {
        JDABuilder builder=new JDABuilder(AccountType.BOT);
        builder.setToken(args[0]);
        builder.addEventListeners(new Bot());
        builder.build();
    }
    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        if (event.getMessage().getContentRaw().equals("!David"))
        {
            event.getChannel().sendMessage("idolul la femei").queue();
        }
    }
}