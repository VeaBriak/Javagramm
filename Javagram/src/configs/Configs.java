package configs;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Configs
{
    public static BufferedImage BG_IMAGE, LOGO, ICON_HIDE, ICON_CLOSE, ICON_PHONE, LOGO_MINI, ICON_LOCK, MASK_DG_BIG, ICON_SEARCH,
            LOGO_MICRO, ICON_SETTINGS, BLUEM_MINI, ICON_EDIT, ICON_PLUS, BUTTON_SEND, MS_GRAY_ONLINE, ICON_FRAME,
            AVATAR_A, AVA_B, AVA_C, AVA_D, AVA_E;


    static {
        BG_IMAGE = readImage("res/img/background.png");
        ICON_HIDE = readImage("res/img/icon-hide.png");
        ICON_CLOSE = readImage("res/img/icon-close.png");;
        LOGO = readImage("res/img/logo.png");
        ICON_PHONE = readImage("res/img/icon-phone.png");
        LOGO_MINI = readImage("res/img/logo-mini.png");
        ICON_LOCK = readImage("res/img/icon-lock.png");
        MASK_DG_BIG = readImage("res/img/mask-dark-gray-big.png");
        ICON_SEARCH = readImage("res/img/icon-search.png");
        LOGO_MICRO = readImage("res/img/logo-micro.png");
        ICON_SETTINGS = readImage("res/img/icon-settings.png");
        BLUEM_MINI = readImage("res/img/mask-blue-mini.png");
        ICON_EDIT = readImage("res/img/icon-edit.png");
        ICON_PLUS = readImage("res/img/icon-plus.png");
        BUTTON_SEND = readImage("res/img/button-send.png");
        MS_GRAY_ONLINE = readImage("res/img/mask-gray-online.png");
        ICON_FRAME = readImage("res/img/icon-frame.png");

        AVATAR_A = readImage("res/img/avatar/ava-a.png");
        AVA_B = readImage("res/img/avatar/ava-b.png");
        AVA_C = readImage("res/img/avatar/ava-c.png");
        AVA_D = readImage("res/img/avatar/ava-d.png");
        AVA_E = readImage("res/img/avatar/ava-e.png");
    }

    private static BufferedImage readImage(String path) {
        BufferedImage image = null;
        try{
            image = ImageIO.read(new File(path));
        } catch (IOException e){
            e.printStackTrace();
        }
        return image;
    }

    public static Font getFont(int size) {
        return new Font("OpenSans", Font.BOLD, size);
    }
}
