class typeconversion{
    public static void main(String a[])
    {
        byte s = 12;
        int b = s;
        System.out.println(b);
        byte c = (byte) b;
        System.out.println(c);
        byte d = 10;
        byte e = 30;
        int result = d*e;
        System.out.println(result);
    }
}