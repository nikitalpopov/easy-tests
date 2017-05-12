package easytests.options;

import easytests.models.PointModelInterface;
import easytests.services.PointsServiceInterface;
import easytests.services.QuizzesServiceInterface;
import easytests.services.SolutionsServiceInterface;

import java.util.List;

/**
 * @author loriens
 */
public interface PointsOptionsInterface {
    void setPointsService(PointsServiceInterface pointsService);

    void setSolutionsService(SolutionsServiceInterface solutionsService);

    void setQuizzesService(QuizzesServiceInterface quizzesService);

    PointsOptionsInterface withQuiz(QuizzesOptionsInterface quizzesOptions);

    PointsOptionsInterface withSolution(SolutionsOptionsInterface solutionsOptions);

    PointModelInterface withRelations(PointModelInterface pointModel);

    List<PointModelInterface> withRelations(List<PointModelInterface> pointModels);

    void saveWithRelations(PointModelInterface pointModel);

    void deleteWithRelations(PointModelInterface pointModel);
}
