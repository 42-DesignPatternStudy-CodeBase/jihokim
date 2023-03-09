package o_VisitorPattern;

public interface Acceptor {
    public abstract void accept(Visitor v) throws FileTreatmentException;
}
