/**
 * 
 */
 
let cart=[];
let cartTotal =0;
const cartDom = document.querySelector(".cart");
const addToCartBtn = document.querySelectorAll('[data_action="add-to-cart"]');

addToCartBtn.forEach(addToCartBtn=>{
	addToCartBtn.addEventListener("click",()=>{
		const itemDom = addToCartBtn.parentNode.parentNode;
		const item ={
			img: itemDom.querySelector(".img").getAttribute("src"),
			name: itemDom.querySelector(".title").innerText,
			price: itemDom.querySelector(".item-price").innerText,
			quantity : 1
		};
		
		const isInCart = cart.filter(cartItem => cartItem.name ===product.name).length>0;
		if(isInCart === false){
			cartDom.insertAdjacentHTML("beforeend",`
			<div class="row border-top border-bottom">
					<div class="row main align-items-center">
						<div class="col-2">
							<img src="${product.img}" alt="${product.name}" style="max-width:80px;"/>
						</div>
						<div class="col">
							<div class="row">${product.name}</div>
						</div>
						<div class="col">
							<p>${product.price}</p>
						</div>
						<div class="p-2 mt-3 ml-auto">
							<button class="btn badge badge-secondary" type="button" data-action="increase-item">&plus;
						</div>
						<div class="p-2 mt-3">
							<p >${product.quantity}</p>
						</div>
						<div class="p-2 mt-3 ml-auto">
							<button class="btn badge badge-info" type="button" data-action="decrease-item">&minus;
						</div>
						<div>
							<button class="btn badge badge-danger" type="button" data-action="remove-item">&times;
						</div>
					</div>
				</div>
			`);
		}
		
	
   
	})
})