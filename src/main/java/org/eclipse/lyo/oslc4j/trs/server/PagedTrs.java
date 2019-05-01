package org.eclipse.lyo.oslc4j.trs.server;

import org.eclipse.lyo.core.trs.Base;
import org.eclipse.lyo.core.trs.ChangeLog;

public interface PagedTrs {

//    @Deprecated
//    HistoryData[] getHistory(Date dateAfter);

//    /**
//     * Implemented by inheriting classes. returns the changes through time to the resources exposes
//     * by the adapter starting from the given point in time.
//     */
//    Collection<HistoryData> getHistory(long orderNo, int limit);
//
//    void updateHistories(Collection<HistoryData> hd);

//    @Deprecated
//    HistoryData[] getOrderedHistory(Date dateAfter);

//    /**
//     * Order the history data returned by the getHistory method to use it in the rest of the class
//     */
//    Collection<HistoryData> getOrderedHistory(long orderNo, int limit);


//    @Deprecated
//    Base getBaseResource(String page);

    /**
     * Return page's Base resource
     *
     * @param page            the required page of the base
     * @return the required page of the base
     */
    Base getBaseResource(Integer page);

    int basePageCount();

//    @Deprecated
//    ChangeLog getChangeLog(String page);

    /**
     * Return page's ChangeLog
     *
     * @param page            the required page of the change log
     * @return the required page of the change log
     */
    ChangeLog getChangeLog(Integer page);

    int changelogPageCount();
}
