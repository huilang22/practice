/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusReasonMapSubRequestParent.java
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
 * Abstract base class for all StatusReasonMap related UdtSubRequestParents
 *
 */
public abstract class StatusReasonMapSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on StatusReasonMapRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(StatusReasonMapRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on StatusReasonMapSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(StatusReasonMapSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for StatusReasonMapSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public StatusReasonMapSubRequestParent(String id, String method) {
    super(id, "StatusReasonMap", method);
  }
}
