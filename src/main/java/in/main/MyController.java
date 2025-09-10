package in.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.ContextExposingHttpServletRequest;
import org.springframework.web.servlet.HttpServletBean;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @GetMapping("/helloPage")
    public ModelAndView openHelloPage() {
        System.out.println("openHelloPage() method executed");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("hello");
        return mav;
    }

    @GetMapping("/aboutUs")
    public String aboutUsPage() {
        return "about-us";
    }

    @GetMapping("/myForm")
    public String openMyFormPage() {
        return "my-form";
    }
//    @PostMapping("/submitForm")
//    public  String handleMyForm(@RequestParam("name1") String myname,
//                                @RequestParam("email1") String myemail,
//                                @RequestParam("phoneno1") String myphoneno,
//                                Model model){
//
//        System.out.println("Name:       "+myname);
//        System.out.println("Email Id :  "+myemail);
//        System.out.println("Phone No:   "+myphoneno);
//
//        model.addAttribute("model_name", myname);
//        model.addAttribute("model_email", myemail);
//        model.addAttribute("model_phoneno", myphoneno);
//
//        return "profile";
//    }
//@PostMapping("/submitForm")
//public  String handleMyForm(@RequestParam("name1") String myname,
//                            @RequestParam("email1") String myemail,
//                            @RequestParam("phoneno1") String myphoneno,
//                            Model model){
//
//    System.out.println("Name:       "+myname);
//    System.out.println("Email Id :  "+myemail);
//    System.out.println("Phone No:   "+myphoneno);
//    User user= new User();
//    user.setName(myname);
//    user.setEmail(myemail);
//    user.setPhoneno(myphoneno);
//
//    model.addAttribute("model_user", user);
//
//
//    return "profile";
//}


    @PostMapping("/submitForm")
    public  String handleMyForm(@ModelAttribute User user){

        System.out.println("Name:       "+user.getName());
        System.out.println("Email Id :  "+user.getEmail());
        System.out.println("Phone No:   "+user.getPhoneno());

        return "profile";
    }
}
