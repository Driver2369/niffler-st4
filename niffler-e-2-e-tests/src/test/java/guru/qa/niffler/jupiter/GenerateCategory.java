package guru.qa.niffler.jupiter;

import guru.qa.niffler.model.CurrencyValues;
import jdk.jfr.Category;
import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@ExtendWith({CategoryExtension.class, CategoryResolverExtension.class})
public @interface GenerateCategory {

  String username();
  String category();


}
