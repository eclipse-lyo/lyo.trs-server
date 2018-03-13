package org.eclipse.lyo.oslc4j.trs.server;

import java.util.Date;

/**
 * Created on 2018-03-13
 *
 * @author Andrew Berezovskyi (andriib@kth.se)
 * @version $version-stub$
 * @since 0.0.1
 */
public interface HistoryDataContainer {
    HistoryData[] getHistoryData(Date dateAfter);
}
