
public class PrintBoard {

    public void draw (int wrongPredict) {
        if (wrongPredict != 11 && !Game.endOf )
            System.out.println ((11-wrongPredict)+" hakkiniz kaldi..." );
        if ( wrongPredict == 1 ) {
            System.out.println (
                    " _\n"
            );
        } else if ( wrongPredict == 2 ) {
            System.out.println (

                            "  |\n" +
                            "  |\n" +
                            "  |\n" +
                            "  |\n" +
                            " _|\n"
            );
        }
        else if (wrongPredict == 3) {
            System.out.println (
                            "  _______\n" +
                            "  |\n" +
                            "  |\n" +
                            "  |\n" +
                            "  |\n" +
                            " _|\n"
            );
        }
        else if (wrongPredict == 4) {
            System.out.println (
                            "  _______\n" +
                            "  | /\n" +
                            "  |/\n" +
                            "  |\n" +
                            "  |\n" +
                            " _|\n"
            );
        }
        else if (wrongPredict == 5 ) {
            System.out.println (
                            "  _______\n" +
                            "  | /   '\n" +
                            "  |/    '\n" +
                            "  |\n" +
                            "  |\n" +
                            " _|\n"
            );
        }
        else if (wrongPredict == 6 ) {
            System.out.println (
                            "  _______  \n" +
                            "  | /   '  \n" +
                            "  |/    O  \n" +
                            "  |        \n" +
                            "  |        \n" +
                            " _|        \n"
            );
        }
        else if (wrongPredict == 7 ) {
            System.out.println (
                            "  _______  \n" +
                            "  | /   '  \n" +
                            "  |/    O  \n" +
                            "  |     |  \n" +
                            "  |        \n" +
                            " _|        \n"
            );
        }
        else if (wrongPredict == 8 ) {
            System.out.println (
                            "  _______  \n" +
                            "  | /   '  \n" +
                            "  |/    O  \n" +
                            "  |     |  \n" +
                            "  |    /   \n" +
                            " _|        \n"
            );
        }
        else if (wrongPredict == 9 ) {
            System.out.println (
                            "  _______   \n" +
                            "  | /   '   \n" +
                            "  |/    O   \n" +
                            "  |     |   \n" +
                            "  |    / \\  \n" +
                            " _|         \n"
            );
        }
        else if (wrongPredict == 10 ) {
            System.out.println (
                            "  _______   \n" +
                            "  | /   '   \n" +
                            "  |/   \\O   \n" +
                            "  |     |   \n" +
                            "  |    / \\  \n" +
                            " _|         \n"
            );
        }
        else if (wrongPredict == 11 ) {
            System.out.println (
                            "  _______  \n" +
                            "  | /   '  \n" +
                            "  |/   \\O/ \n" +
                            "  |     |  \n" +
                            "  |    / \\ \n" +
                            " _|        \n"
            );
            System.out.println ("KAYBETTIN ¯\\_(ツ)_/¯" );
        }
    }
}
