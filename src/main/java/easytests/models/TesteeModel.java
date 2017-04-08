package easytests.models;

import easytests.entities.TesteeEntity;
import lombok.*;

/**
 * @author DoZor-80
 */
@Data
public class TesteeModel implements TesteeModelInterface {
    private Integer id;

    private String firstName;

    private String lastName;

    private String surname;

    private Integer groupNumber;

    public void map(TesteeEntity testeeEntity) {
        this.setId(testeeEntity.getId());
        this.setFirstName(testeeEntity.getFirstName());
        this.setLastName(testeeEntity.getLastName());
        this.setSurname(testeeEntity.getSurname());
        this.setGroupNumber(testeeEntity.getGroupNumber());
    }
}
