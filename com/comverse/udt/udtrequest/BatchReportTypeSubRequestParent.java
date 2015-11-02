/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportTypeSubRequestParent.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtSubRequestParent;
import com.csgsystems.udt.SubRequestWrapper;
import com.csgsystems.udt.SubRequestData;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all BatchReportType related UdtSubRequestParents
 *
 */
public abstract class BatchReportTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BatchReportTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchReportTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BatchReportTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchReportTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BatchReportTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BatchReportTypeSubRequestParent(String id, String method) {
    super(id, "BatchReportType", method);
  }
}
