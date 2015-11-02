/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvHistorySubRequestParent.java
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
 * Abstract base class for all InvHistory related UdtSubRequestParents
 *
 */
public abstract class InvHistorySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvHistoryRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvHistoryRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvHistorySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvHistorySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvHistorySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvHistorySubRequestParent(String id, String method) {
    super(id, "InvHistory", method);
  }
}
