/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyParameterSubRequestParent.java
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
 * Abstract base class for all BatchRequestNotifyParameter related UdtSubRequestParents
 *
 */
public abstract class BatchRequestNotifyParameterSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BatchRequestNotifyParameterRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchRequestNotifyParameterRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BatchRequestNotifyParameterSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BatchRequestNotifyParameterSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BatchRequestNotifyParameterSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BatchRequestNotifyParameterSubRequestParent(String id, String method) {
    super(id, "BatchRequestNotifyParameter", method);
  }
}
