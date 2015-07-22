package com.mmnaseri.cs.qa;

/**
 * @author Mohammad Milad Naseri (m.m.naseri@gmail.com)
 * @since 1.0 (7/20/15)
 */
public enum Stage {

    /**
     * Marked element is not completely implemented, so there are not any reliable tests
     * for it
     */
    INCOMPLETE,
    /**
     * Marked elements does not behave as it should
     */
    BUGGY,
    /**
     * Marked element is believed to behave as it should, though there are no tests directly targeting it
     */
    UNTESTED,
    /**
     * Marked element has an associated test but the tests are failing
     */
    FAILING,
    /**
     *  Marked element is believed to have been sufficiently tested and is therefore assumed to be reliable for
     *  use and study
     */
    TESTED

}
