package enums;

public enum GenderEnum {
    MALE("男"),FEMALE("女");
    private String sex;
    private GenderEnum(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "GenderEnum{" +
                "sex='" + sex + '\'' +
                '}';
    }

    public static GenderEnum getGenderEnum(String index) {
        if(index.equals("M")){
            return MALE;
        }else if(index.equals("F")){
            return FEMALE;
        }else {
            return null;
        }
    }
}
