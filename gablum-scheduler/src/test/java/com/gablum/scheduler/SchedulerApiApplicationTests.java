package com.gablum.scheduler;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataMongoTest
class SchedulerApiApplicationTests {

	@Test
	public void contextLoads() {
		Assertions.assertEquals(0,0);
	}

}
