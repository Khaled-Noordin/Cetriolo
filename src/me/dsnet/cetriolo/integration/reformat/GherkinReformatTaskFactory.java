/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.integration.reformat;

import org.netbeans.modules.editor.indent.spi.Context;
import org.netbeans.modules.editor.indent.spi.ReformatTask;

/**
 *
 * @author SessonaD
 */
public class GherkinReformatTaskFactory implements ReformatTask.Factory {

    public ReformatTask createTask(Context context) {
        System.out.println("******** init reformat task");
        return new GherkinReformatTask(context);
    }
}
    
