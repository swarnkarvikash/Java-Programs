class this1{
    void show(){
        System.out.println(this);
    }
    public static void main(String[] args) {
        this1 r = new this1();
        System.out.println(r);
        r.show(); 
    }
}

