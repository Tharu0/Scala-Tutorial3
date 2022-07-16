object Q4 extends App{
	def total(a:Int):Double=a*24.95
	def discount(b:Double):Double=b*0.4 
	def shippingCost(a:Int):Double=3*a+(a-50)*.75
	var amount=total(60)
	printf("%.3f",amount-discount(amount)+shippingCost(60))
}