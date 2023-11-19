package w9;

class CodeBuster {
    public void groupName() {
        System.out.println("hii.");
    }
}

class CodeBusterGroups extends CodeBuster {
    @Override
    public void groupName() {
        System.out.println("This is Rutvi.");
    }



    public static void main(String[] args) {
        CodeBuster codeBuster = new CodeBuster();
        CodeBusterGroups codeBusterGroups = new CodeBusterGroups();
        codeBuster.groupName();
        codeBusterGroups.groupName();
    }
}






