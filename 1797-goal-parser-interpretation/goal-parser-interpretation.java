class Solution {
    public String interpret(String command) {
        command=command.replace("(al)","al");
        command=command.replace("()","o");
        command=command.replace("(al)","al");


        return command;
    }
}