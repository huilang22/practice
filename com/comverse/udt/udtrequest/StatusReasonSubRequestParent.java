/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusReasonSubRequestParent.java
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
 * Abstract base class for all StatusReason related UdtSubRequestParents
 *
 */
public abstract class StatusReasonSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on StatusReasonRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(StatusReasonRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on StatusReasonSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(StatusReasonSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for StatusReasonSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public StatusReasonSubRequestParent(String id, String method) {
    super(id, "StatusReason", method);
  }
}
