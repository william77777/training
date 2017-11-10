package app.testing.mocking;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.mockito.Mockito.times;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class MockitoExample {
	
	@Mock
	private MyController controller;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this); // scans this class for @Mock annotations
//		controller = new MyService();
		
	}
	
	@Test
	public void test_mock() {
		Mockito.when(controller.getValue()).thenReturn("some-test-value");
		Assert.assertEquals("some-test-value", controller.getValue());
		Assert.assertThat(controller.getValue(), equalTo("some-test-value"));
		Mockito.verify(controller,times(2)).getValue();
		Mockito.verifyNoMoreInteractions(controller);
	}
}
