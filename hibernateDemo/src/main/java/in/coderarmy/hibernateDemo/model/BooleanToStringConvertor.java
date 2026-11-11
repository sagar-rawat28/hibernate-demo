package in.coderarmy.hibernateDemo.model;

import jakarta.persistence.AttributeConverter;

public class BooleanToStringConvertor implements AttributeConverter<Boolean, String> {

    @Override
    public String convertToDatabaseColumn(Boolean aBoolean) {
        if(aBoolean == null) {
            return null;
        }

//        return aBoolean?"Yes":"No";
        if(aBoolean==true){
           return "Yes";
        }
        return "No";
    }

    @Override
    public Boolean convertToEntityAttribute(String s) {
        if(s==null){
            return null;
        }
        if(s.equals("Yes")){
            return true;
        }
        return false;
    }
}
