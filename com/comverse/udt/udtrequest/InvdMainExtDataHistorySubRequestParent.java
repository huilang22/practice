/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainExtDataHistorySubRequestParent.java
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
 * Abstract base class for all InvdMainExtDataHistory related UdtSubRequestParents
 *
 */
public abstract class InvdMainExtDataHistorySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvdMainExtDataHistoryRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvdMainExtDataHistoryRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvdMainExtDataHistorySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvdMainExtDataHistorySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvdMainExtDataHistorySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvdMainExtDataHistorySubRequestParent(String id, String method) {
    super(id, "InvdMainExtDataHistory", method);
  }
}
