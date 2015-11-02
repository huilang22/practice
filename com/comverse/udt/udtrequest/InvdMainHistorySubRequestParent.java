/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainHistorySubRequestParent.java
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
 * Abstract base class for all InvdMainHistory related UdtSubRequestParents
 *
 */
public abstract class InvdMainHistorySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvdMainHistoryRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvdMainHistoryRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvdMainHistorySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvdMainHistorySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvdMainHistorySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvdMainHistorySubRequestParent(String id, String method) {
    super(id, "InvdMainHistory", method);
  }
}
