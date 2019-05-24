package org.immutables.criteria;

import org.immutables.criteria.constraints.Expressional;
import org.reactivestreams.Publisher;

/**
 * Access abstraction to a data-source.
 * @param <T>
 */
public interface Repository<T> {

    Publisher<T> query(Expressional<T> expressional);

}