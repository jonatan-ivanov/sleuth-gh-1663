package hello;

import lombok.extern.slf4j.Slf4j;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Receiver {
	@JmsListener(destination = "mailbox", containerFactory = "myFactory")
	public void receiveMessage(Email email) {
		log.info("Received <" + email + ">");
		throw new IllegalArgumentException("Hulk Sad. :(");
	}
}
