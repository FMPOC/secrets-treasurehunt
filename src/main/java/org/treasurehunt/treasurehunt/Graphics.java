package org.treasurehunt.treasurehunt;


public class Graphics {

    public static final String map ="<pre>"+
            "                            Avast! Where be the treasure? <br/>" +
            "      ____________________________________________________________________<br/>" +
            "     / \\-----     ---------  -----------     -------------- ------    ----\\<br/>" +
            "     \\_/__________________________________________________________________/<br/>" +
            "22   |~ ~~ ~~~ ~ ~ ~~~ ~ _____.----------._ ~~~  ~~~~ ~~   ~~  ~~~~~ ~~~~|<br/>" +
            "21   |  _   ~~ ~~ __,---'_       \"         `. ~~~ _,--.  ~~~~ __,---.  ~~|<br/>" +
            "20   | | \\___ ~~ /      ( )   \"          \"   `-.,' (') \\~~ ~ (  / _\\ \\~~ |<br/>" +
            "19   |  \\    \\__/_   __(( _)_      (    \"   \"     (_\\_) \\___~ `-.___,'  ~|<br/>" +
            "18   |~~ \\     (  )_(__)_|( ))  \"   ))          \"   |    \"  \\ ~~ ~~~ _ ~~|<br/>" +
            "17   |  ~ \\__ (( _( (  ))  ) _)    ((     \\\\//    \" |   \"    \\_____,' | ~|<br/>" +
            "16   |~~ ~   \\  ( ))(_)(_)_)|  \"    ))    //\\\\ \" __,---._  \"  \"   \"  /~~~|<br/>" +
            "15   |    ~~~ |(_ _)| | |   |   \"  (   \"      ,-'~~~ ~~~ `-.   ___  /~ ~ |<br/>" +
            "14   | ~~     |  |  |   |   _,--- ,--. _  \"  (~~  ~~~~  ~~~ ) /___\\ \\~~ ~|<br/>" +
            "13   |  ~ ~~ /   |      _,----._,'`--'\\.`-._  `._~~_~__~_,-'  |H__|  \\ ~~|<br/>" +
            "12   |~~    / \"     _,-' / `\\ ,' / _'  \\`.---.._          __        \" \\~ |<br/>" +
            "11   | ~~~ / /   .-' , / ' _,'_  -  _ '- _`._ `.`-._    _/- `--.   \" \" \\~|<br/>" +
            "10   |  ~ / / _-- `---,~.-' __   --  _,---.  `-._   _,-'- / ` \\ \\_   \" |~|<br/>" +
            " 9   | ~ | | -- _    /~/  `-_- _  _,' '  \\ \\_`-._,-'  / --   \\  - \\_   / |<br/>" +
            " 8   |~~ | \\ -      /~~| \"     ,-'_ /-  `_ ._`._`-...._____...._,--'  /~~|<br/>" +
            " 7   | ~~\\  \\_ /   /~~/    ___  `---  ---  - - ' ,--.     ___        |~ ~|<br/>" +
            " 6   |~   \\      ,'~~|  \" (o o)   \"         \" \" |~~~ \\_,-' ~ `.     ,'~~ |<br/>" +
            " 5   | ~~ ~|__,-'~~~~~\\    \\\"/      \"  \"   \"    /~ ~~   O ~ ~~`-.__/~ ~~~|<br/>" +
            " 4   |~~~ ~~~  ~~~~~~~~`.______________________/ ~~~    |   ~~~ ~~ ~ ~~~~|<br/>" +
            " 3   |____~jrei~__~_______~~_~____~~_____~~___~_~~___~\\_|_/ ~_____~___~__|<br/>" +
            " 2   / \\----- ----- ------------  ------- ----- -------  --------  -------\\<br/>" +
            " 1   \\_/__________________________________________________________________/<br/>"+
            "<br/>"+
            "    1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24<br/>"+
            "</pre>";
    // from http://ascii.co.uk/art/treasuremap

    public static final String missed = "<pre>"+
            "                    _,-._<br/>" +
            "                   ; ___ :           ,------------------------------.<br/>" +
            "               ,--' (. .) '--.__    |                                |<br/>" +
            "             _;      |||        \\   |           Aaarrrr,             |<br/>" +
            "            '._,-----''';=.____,\"   |   there be no treasure here!   |<br/>" +
            "              /// < o>   |##|       |          %s attempts left       |<br/>" +
            "              (o        \\`--'       //`-----------------------------'<br/>" +
            "             ///\\ >>>>  _\\ <<<<    //<br/>" +
            "            --._>>>>>>>><<<<<<<<  / <br/>" +
            "            ___() >>>[||||]<<<<<br/>" +
            "            `--'>>>>>>>><<<<<<<<br/>" +
            "                 >>>>>>><<<<<<<br/>" +
            "                   >>>>><<<<<<br/>" +
            "                    >>ctr<<"+
            "</pre>";

    //from http://ascii.co.uk/art/pirate

    public static final String died = "<pre>"+
            "                           _______________<br/>" +
            "                          /               \\<br/>" +
            "                         /                 \\<br/>" +
            "                        /                   \\<br/>" +
            "                        |   XXXX     XXXX   |<br/>" +
            "                        |   XXXX     XXXX   |<br/>" +
            "                        |   XXX       XXX   |<br/>" +
            "                        |         X         |<br/>" +
            "                        \\__      XXX     __/<br/>" +
            "                          |\\     XXX     /|<br/>" +
            "                          | |           | |<br/>" +
            "                          | I I I I I I I |<br/>" +
            "                          |  I I I I I I  |<br/>" +
            "                           \\_           _/<br/>" +
            "                            \\_         _/<br/>" +
            "                              \\_______/<br/>" +
            "                    XXX                        XXX<br/>" +
            "                  XXXXX                        XXXXX<br/>" +
            "                   XXXXXXXXXX             XXXXXXXXXX<br/>" +
            "                           XXXXX     XXXXX<br/>" +
            "                               XXXXXXX<br/>" +
            "                           XXXXX     XXXXX<br/>" +
            "                   XXXXXXXXXX             XXXXXXXXXX<br/>" +
            "                  XXXXX                        XXXXX<br/>" +
            "                    XXX                        XXX"+
            "</pre>";
    // from http://ascii.co.uk/art/skull

    public static final String treasure = "<pre>"+
            "                            _.--.<br/>" +
            "                        _.-'_:-'||<br/>" +
            "                    _.-'_.-::::'||<br/>" +
            "               _.-:'_.-::::::'  ||<br/>" +
            "             .'`-.-:::::::'     ||<br/>" +
            "            /.'`;|:::::::'      ||_<br/>" +
            "           ||   ||::::::'     _.;._'-._<br/>" +
            "           ||   ||:::::'  _.-!oo @.!-._'-.<br/>" +
            "           \\'.  ||:::::.-!()oo @!()@.-'_.|<br/>" +
            "            '.'-;|:.-'.&$@.& ()$%-'o.'\\U||<br/>" +
            "              `>'-.!@%()@'@_%-'_.-o _.|'||<br/>" +
            "               ||-._'-.@.-'_.-' _.-o  |'||<br/>" +
            "               ||=[ '-._.-\\U/.-'    o |'||<br/>" +
            "               || '-.]=|| |'|      o  |'||<br/>" +
            "               ||      || |'|        _| ';<br/>" +
            "               ||      || |'|    _.-'_.-'<br/>" +
            "               |'-._   || |'|_.-'_.-'<br/>" +
            "            jgs '-._'-.|| |' `_.-'<br/>" +
            "                    '-.||_/.-'<br/>"+
                    "</pre>";
    //http://ascii.co.uk/art/treasure
}
