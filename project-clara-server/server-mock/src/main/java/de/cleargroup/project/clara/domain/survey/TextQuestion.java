package de.cleargroup.project.clara.domain.survey;

/**
 * Created by jonas on 27.10.2017.
 */
public class TextQuestion extends Question{
    public TextQuestion(Long id, String question) {
        super(id,question);
    }

    public TextQuestion(String question) {
        this(null,question);
    }

    @Override
    protected String questionType() {
        return getClass().getSimpleName();
    }
}
