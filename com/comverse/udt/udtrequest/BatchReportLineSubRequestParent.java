/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportLineSubRequestParent.java
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
 * Abstract base class for all BatchReportLine related UdtSubRequestParents
 *
 */
public abstract class BatchReportLineSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BatchReportLineRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchReportLineRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BatchReportLineSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchReportLineSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BatchReportLineSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BatchReportLineSubRequestParent(String id, String method) {
    super(id, "BatchReportLine", method);
  }
}
