package com.wl;
public class Username {
    String reg = "[a-zA-Z]";
    String regx = "[a-zA-Z0-9_]";
    String username;
    Boolean isval;
    String tip;
    public String getTip() {
        return tip;
    }
    public void setTip(String tip) {
        this.tip = tip;
    }
    public String getUsername() {
        return username;
    }
    public Boolean getIsval() {
        return isValid();
    }
    public void setIsval(Boolean isval) {
        this.isval = isval;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public boolean isValid(){
        String name = getUsername();
        String firstname = String.valueOf(name.charAt(0));
        //首字母为字母
        if(firstname.matches(reg)){
            for(int i=1;i<name.length();i++){
                if(!String.valueOf(name.charAt(i)).matches(regx)){
                    setTip("用户姓名错误，只能由字母、数字和下划线组成！");
                    return false;
                }
            }
            setTip("用户格式正确！");
            return true;
        }else{
            setTip("用户姓名错误，首字符必须为字母！");
            return false;
        }
    }
}
