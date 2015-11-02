/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestErrorLogEntrySubRequestParent.java
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
 * Abstract base class for all BatchRequestErrorLogEntry related UdtSubRequestParents
 *
 */
public abstract class BatchRequestErrorLogEntrySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BatchRequestErrorLogEntryRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchRequestErrorLogEntryRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BatchRequestErrorLogEntrySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchRequestErrorLogEntrySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BatchRequestErrorLogEntrySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BatchRequestErrorLogEntrySubRequestParent(String id, String method) {
    super(id, "BatchRequestErrorLogEntry", method);
  }
}
