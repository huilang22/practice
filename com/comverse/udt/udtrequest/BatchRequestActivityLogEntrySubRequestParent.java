/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestActivityLogEntrySubRequestParent.java
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
 * Abstract base class for all BatchRequestActivityLogEntry related UdtSubRequestParents
 *
 */
public abstract class BatchRequestActivityLogEntrySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BatchRequestActivityLogEntryRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchRequestActivityLogEntryRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BatchRequestActivityLogEntrySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchRequestActivityLogEntrySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BatchRequestActivityLogEntrySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BatchRequestActivityLogEntrySubRequestParent(String id, String method) {
    super(id, "BatchRequestActivityLogEntry", method);
  }
}
