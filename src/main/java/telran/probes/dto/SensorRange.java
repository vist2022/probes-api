package telran.probes.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import telran.probes.messages.ErrorMessages;

public record SensorRange(@Min(value= 1, message= ErrorMessages.WRONG_SENSOR_ID) long id,@NotNull(message = ErrorMessages.MISSING_RANGE ) Range range) {

}
