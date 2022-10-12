package com.kim.TeaShop.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.kim.TeaShop.model.Cart;
import com.kim.TeaShop.model.ProductDetails;
import com.kim.TeaShop.model.User;
import com.kim.TeaShop.repository.CartRepository;
import com.kim.TeaShop.repository.ProductRepository;
import com.kim.TeaShop.services.CartService;
import com.kim.TeaShop.services.ProductService;
import com.kim.TeaShop.services.UserService;
//import com.kim.TeaShop.services.impl.ProductServiceImpl;
import com.kim.TeaShop.services.impl.UserServiceImpl;


import lombok.*;



@Controller
//@RestController
public class CartController {
//	@Autowired
//	private final CartService cartService;
	//@Autowired
//    private final ProductService productService;
	
	@Autowired
	private ProductRepository productRepo;
	@Autowired
	private ProductService productService;
	
//	public CartController() {
//		this.productService = new ProductService();}

//    @Autowired
//    public CartController(CartService shoppingCartService, ProductService productService) {
////        this.cartService = shoppingCartService;
//        this.productService = productService;
//    }
    
    @PostMapping("/showAddedItem")
    //@RequestParam // 
    public String getItem(Model model) {
        ProductDetails p = productService.findById2(2);
        model.addAttribute("item",p);
        return "cart4";
    }
    
    
//    // Testing purpose
//    @GetMapping({"/showview"})
//    public String sendDatatwo (Model model){
//		ProductDetails p = new ProductDetails();
//		p.setName("Green Tea");
//		model.addAttribute("myp", p);
//		return "cart4";
//     }
//    
//    @PostMapping("/addedbt")
//    public void sendBT(@ModelAttribute Map<ProductDetails,Integer> products_map,Model model) {
//    	//Optional<ProductDetails> bt = productService.findById(5);
//    	ProductDetails bt = productService.findByName("Black Tea");
//    	cartService.addProduct(bt);
//    	products_map= cartService.getProducts();
//    	System.out.println(products_map.toString());
//    	//return "cart4";
//    }
//    
//    
//    
//    // handler method to handle list of users
//    @GetMapping("/cart4")
//    public String users(Model model){
//    	ProductDetails bt = productService.findByName("Black Tea");
//    	cartService.addProduct(bt);
//    	Map<ProductDetails, Integer> map= cartService.getProducts();
//    	model.addAttribute("map",map);
//        return "cart4";
//    }
//    
//    
//
//
//    
//    
//    @GetMapping("/shoppingCart")
//    public ModelAndView shoppingCart() {
//        ModelAndView modelAndView = new ModelAndView("/shoppingCart");
//        modelAndView.addObject("products", cartService.getProductsInCart());
//        //modelAndView.addObject("total", shoppingCartService.gettoString());
//        return modelAndView;
//    }

    

//    @GetMapping("/shoppingCart/removeProduct/{productId}")
//    public ModelAndView removeProductFromCart(@PathVariable("productId") Integer productId) {
//        productService.findById(productId).ifPresent(shoppingCartService::removeProduct);
//        return shoppingCart();
//    }
//	@Autowired
//	private CartService cartService;
//	
//	@Autowired
//	private ProductRepository productRepo;
//	@Autowired
//	private UserServiceImpl userServiceImpl;
//	
//	@GetMapping("/cart3/kim")
//	public String showCart(Model model){
//		Cart cart = new Cart();
//		Map<ProductDetails, Integer> map = new HashMap<>();
//		ProductDetails product = productRepo.getReferenceById(1);
//		map.put(product, 1);
//		cart.setProducts(map);
//		model.addAttribute("map",map);
//		return "cart3";
//		
//		
//	}
//	@GetMapping("/cart3")
//	public String showShoppingCart(Model model, @AuthenticationPrincipal Authentication authentication) {
//		UserDetails userD = userServiceImpl.getCurrentLoggedInUser(authentication);
//		User user = (User) userD;
//		Cart cart = cartService.getUser(user);
//		model.addAttribute("cart", cart);
//		model.addAttribute("title","Your Cart");
//		
//		
//		return "cart3";
//	}
//	
	
	

}
