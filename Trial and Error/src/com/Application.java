package com;
interface Mythra{
	void order();
}

class Payment implements Mythra{
	@Override
	public void order() {
		System.out.println("make a order");
	}
	class Pay{
		void payment() {
			System.out.println("paying through phonepay");
		}
	}
	class Pay1 extends Pay{
		void payment(){
			super.payment();
			System.out.println("paying through Gpay");
		}
	}
	class Pay2 extends Pay{
		void payment() {
			super.payment();
			System.out.println("paying through slicepay");
		}
	}
	class Pay3 extends Pay{
		void payment() {
			super.payment();
			System.out.println("paying through bheempay");
		}
	}
	
}


