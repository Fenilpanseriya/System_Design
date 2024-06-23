package Strategy;

import java.util.List;

public interface DisplayDoctorStrategy {
    public List<List<String>> earlyTimeAvailableStrategy(String speciality);
    public void doctorRatingStrategy(String speciality);
}
