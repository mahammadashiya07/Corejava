class ClassCastDemo {
    public static void main(String[] args) {
        try {
            Object value = Integer.valueOf(100);
            String text = (String) value;
            System.out.println(text);
        } catch (ClassCastException e) {
            System.out.println("Exception: Invalid type casting");
        }
    }
}
