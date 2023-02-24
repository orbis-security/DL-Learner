/* ConfParser.java */
/* Generated By:JavaCC: Do not edit this line. ConfParser.java */
package org.dllearner.confparser;

import org.dllearner.cli.ConfFileOption;
import org.dllearner.core.Component;

import java.util.List;
import java.util.Map;

public interface ConfParser extends Component {

    ConfFileOption getConfOptionsByProperty(String propertyName);

    Map<String,List<ConfFileOption>> getConfOptionsByBean();

    List<ConfFileOption> getConfOptionsByBean(String beanName);

    List<ConfFileOption> getConfOptions();

}