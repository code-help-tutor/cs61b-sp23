WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package adventure;

import java.util.Map;

public interface AdventureStage {
    void playStage();
    String nextStagePrompt();
    Map<String, AdventureStage> getResponses();
}
