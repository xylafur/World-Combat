/*  This is the main startup file for the world combat game, it will initialize
 *  the server to start accepting client connections
 *
 */

class Main {
    public static void usage(){
        String usage = String.format("%s <ip address>",
                                     System.getProperty("program.name"));
        System.out.println(usage);
    }


    public static void main(String args []){
        if(args.length != 1){
            usage();
            return;
        }
    }
}
