/**
 * @author super lollipop
 * @date 2019/10/19
 * 用来测试依赖注入的UserService类
 */
public class UserService {

    /*声明userDao属性*/
    private UserDao userDao;
    /*添加userDao属性的setter方法，用于实现依赖注入*/
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void saySomething(){
        this.userDao.saySomething(); //测试userDao是否注入
        System.out.println("UserService saySomething");
    }
}
