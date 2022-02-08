package oslomet.webprog.springintro;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 如果有改动，或者其他static里的文件有改动，都要按绿色的小锤子重新编译，或快捷键ctrl+F9
 */
@RestController
//@RestController 一般是使用在类上, 该类下的所有方法都会返回json数据格式，输出在页面上，而不会再返回视图。
public class HalloController {
    @GetMapping("/")   //限定了只有Get请求才能访问的路径。
    String hallo(String navn){
        int length = navn.length();
        return "Hallo " + navn + ", navnet ditt er " + length + " ord langt.";
    }
}
