package de.mhaeusser.designpatterns.templatemethod;

/** from https://sourcemaking.com/design_patterns/template_method/java/2 */
public class TemplateMethodDemo {

    public static void main(String[] args) {
        Generalization algorithm = new Realization();
        algorithm.findSolution();
    }
}
