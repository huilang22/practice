/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundReasonSubRequestParent.java
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
 * Abstract base class for all RefundReason related UdtSubRequestParents
 *
 */
public abstract class RefundReasonSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RefundReasonRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RefundReasonRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RefundReasonSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RefundReasonSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RefundReasonSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RefundReasonSubRequestParent(String id, String method) {
    super(id, "RefundReason", method);
  }
}
