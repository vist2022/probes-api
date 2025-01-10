package telran.probes.dto;

import jakarta.validation.constraints.Min;
import telran.probes.messages.ErrorMessages;

public record SensorUpdateData(@Min(value= 1, message= ErrorMessages.WRONG_SENSOR_ID) long id, Range range, String[] emails) {

}
