package in.sp.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
    @RequestMapping(value = "/HelloPage",method = RequestMethod.GET)
   // @GetMapping("/helloPage")
    public ModelAndView openHelloPage(){
        System.out.println("openHelloPage() method excuted");
        ModelAndView mav=new ModelAndView();
        mav.setViewName("HelloPage");
        return mav;
    }

}
