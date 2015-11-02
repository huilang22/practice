/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportSubRequestParent.java
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
 * Abstract base class for all BatchReport related UdtSubRequestParents
 *
 */
public abstract class BatchReportSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BatchReportRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchReportRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BatchReportSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchReportSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BatchReportSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BatchReportSubRequestParent(String id, String method) {
    super(id, "BatchReport", method);
  }
}
