package com.plugtree.solrmeter.runMode;

import com.google.inject.Injector;
import com.plugtree.solrmeter.view.ConsoleFrame;

public interface SolrMeterRunMode {

    void main(Injector injector);
    void restartApplication();
    ConsoleFrame getMainFrame();
}
