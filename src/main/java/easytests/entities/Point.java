package easytests.entities;

import java.util.List;

/**
 * @author nikitalpopov
 */
public class Point implements PointInterface {

    private Integer id;

    private String type;

    private String text;

    private QuizInterface quiz;

    private List<SolutionInterface> solutions;

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public PointInterface setId(Integer id) {
        this.id = id;
        return this;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public PointInterface setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String getText() {
        return this.text;
    }

    @Override
    public PointInterface setText(String text) {
        this.text = text;
        return this;
    }

    @Override
    public QuizInterface getQuiz() {
        return this.quiz;
    }

    @Override
    public PointInterface setQuiz(QuizInterface quiz) {
        this.quiz = quiz;
        return this;
    }

    @Override
    public List<SolutionInterface> getSolutions() {
        return this.solutions;
    }

    @Override
    public PointInterface setSolutions(List<SolutionInterface> solutions) {
        this.solutions = solutions;
        return this;
    }
}