package org.terasology.entitySystem;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used to mark up methods that can be registered to receive events through the EventSystem
 *
 * These methods should have the form
 * <code>public void handlerMethod(EventType event, EntityRef entity, Component component)</code>
 * If the method only services a single type of component, then the concrete Component type can be used for the third
 * argument.
 *
 * @author Immortius <immortius@gmail.com>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ReceiveEvent {
    /**
     * What component types the method handles. Can be omitted if the method only handles one and the concrete
     * type is used.
     */
    Class<? extends Component>[] components() default {};
}