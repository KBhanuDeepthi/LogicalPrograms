
class CouponNumber {

	public static void main(String[] args) {
		char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		int max=1000000000;
		int random=(int)(Math.random()*max);
		StringBuffer sb=new StringBuffer();
		while(random>0)
		{
			sb.append(chars[random % chars.length]);
			random /=chars.length;
		}
		String couponnumber=sb.toString();
		System.out.println("Coupon number :" +couponnumber);		

	}

}

