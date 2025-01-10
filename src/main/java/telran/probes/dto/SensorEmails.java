package telran.probes.dto;

import jakarta.validation.constraints.Min;
import telran.probes.messages.ErrorMessages;

public record SensorEmails(@Min(value= 1, message= ErrorMessages.WRONG_SENSOR_ID) long id, String[] emails) {

}
