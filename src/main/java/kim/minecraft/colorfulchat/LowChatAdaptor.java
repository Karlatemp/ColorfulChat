package kim.minecraft.colorfulchat;

import java.util.Random;

public class LowChatAdaptor implements IChatAdaptor {

    public String getColoredString(String original) {
        Random random = new Random();
        int code = random.nextInt(15);
        StringBuilder builder = new StringBuilder();
        char[] hex = "0123456789abcdef".toCharArray();
        char[] chars = original.toCharArray();
        for(int i = 0;i < chars.length;++i)
        {
            builder.append("§");
            builder.append(hex[code]);
        }
        return builder.toString();
    }

    @Override
    public String getColorfulString(String msg) {
        
        return getColoredString(msg);
    }
    
}