package de.mhaeusser.java8.map;

import java.util.Optional;

public class MapOptionalTest2 {

    public static void main(String[] args) {
        new MapOptionalTest2().go();
    }

    private void go() {

//        Optional<String> result = Optional.ofNullable(getText())
 //               .or(() -> getText());


                        //.map(String::toUpperCase));

//                .ifPresent(id -> contactInput.setAccount(new ContactAccount().ucid(id)));


        Optional<String> opt = optString(true);
        System.out.println(opt);
        final Optional<Upper> upper = opt.map(Upper::new);
        System.out.println(upper);
        upper.ifPresent(x -> System.out.println(upper.get()));

        Optional<String> opt2 = optString(false);
        System.out.println(opt2);
        final Optional<Upper> upper2 = opt2.map(Upper::new);
        System.out.println(upper2);
        upper2.ifPresentOrElse(x -> System.out.println(upper.get()), () -> System.out.println("empty"));
    }

    public static Optional<String> optString(boolean b) {
        return b ? Optional.of("text") : Optional.empty();
    }

    public Optional<String> getText() {
        return Optional.of("text");
    }
}
