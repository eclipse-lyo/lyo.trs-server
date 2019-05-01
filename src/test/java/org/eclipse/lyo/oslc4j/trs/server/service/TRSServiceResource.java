package org.eclipse.lyo.oslc4j.trs.server.service;

import java.util.ArrayList;
import javax.ws.rs.Path;
import javax.ws.rs.core.UriBuilder;
import org.eclipse.lyo.oslc4j.core.OSLC4JUtils;
import org.eclipse.lyo.oslc4j.trs.server.PagedTrs;
import org.eclipse.lyo.oslc4j.trs.server.InmemPagedTrs;
import org.eclipse.lyo.oslc4j.trs.server.TRSUtilTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/trs")
public class TRSServiceResource extends TrackedResourceSetService {
    private final static Logger log = LoggerFactory.getLogger(TRSServiceResource.class);

    public TRSServiceResource() {
        log.info("Starting up");
    }

    @Override
    protected PagedTrs getChangeHistories() {
        log.trace("Change History objects requested");
        final InmemPagedTrs inmemPagedTrs = new InmemPagedTrs(5, 5,
                UriBuilder.fromUri(OSLC4JUtils.getServletURI()).path("trs").build(),
                new ArrayList<>(0));
        inmemPagedTrs.onHistoryData(TRSUtilTest.createHistory());
        inmemPagedTrs.onHistoryData(TRSUtilTest.createHistory());
        inmemPagedTrs.onHistoryData(TRSUtilTest.createHistory());
        inmemPagedTrs.onHistoryData(TRSUtilTest.createHistory());
        inmemPagedTrs.onHistoryData(TRSUtilTest.createHistory());
        return inmemPagedTrs;
    }

}
