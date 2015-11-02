/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobHistorySubRequestParent.java
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
 * Abstract base class for all InvJobHistory related UdtSubRequestParents
 *
 */
public abstract class InvJobHistorySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvJobHistoryRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvJobHistoryRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvJobHistorySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvJobHistorySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvJobHistorySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvJobHistorySubRequestParent(String id, String method) {
    super(id, "InvJobHistory", method);
  }
}
