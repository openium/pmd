/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.java.rule.design.uselessoverridingmethod;

public class DirectSubclass extends BaseClass {


    @Override
    public void doBase() {
        super.doBase();
    }


    @Override
    public void doBaseWithArg(String foo) {
        super.doBaseWithArg(foo);
    }
}
