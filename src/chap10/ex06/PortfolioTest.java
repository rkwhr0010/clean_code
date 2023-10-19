package chap10.ex06;

import org.junit.*;

public class PortfolioTest {
	private FixedStockExchangeStub exchange;
	private Portfolio portfolio;
	
	@Before
	protected void setUp() throws Exception {
		exchange = new FixedStockExchangeStub();
		//마소 종목은 시세가 100달라
		exchange.fix("Microsoft", 100);
		portfolio = new Portfolio(exchange);
	}
	
	@Test
	public void 종목_5개_구매_총_500달러() throws Exception {
		portfolio.add(5, "Microsoft");
		Assert.assertEquals(500L, portfolio.value());
	}
}

