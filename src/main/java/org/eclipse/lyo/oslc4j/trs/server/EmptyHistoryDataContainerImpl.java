package org.eclipse.lyo.oslc4j.trs.server;

import java.util.Date;
import javax.enterprise.inject.Default;

/**
 * Created on 2018-03-13
 *
 * @author Andrew Berezovskyi (andriib@kth.se)
 * @version $version-stub$
 * @since 0.0.1
 */
@Default
public class EmptyHistoryDataContainerImpl implements HistoryDataContainer {
    @Override
    public HistoryData[] getHistoryData(final Date dateAfter) {
        return new HistoryData[0];
    }
}
