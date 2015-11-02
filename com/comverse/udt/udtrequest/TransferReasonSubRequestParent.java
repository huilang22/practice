/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransferReasonSubRequestParent.java
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
 * Abstract base class for all TransferReason related UdtSubRequestParents
 *
 */
public abstract class TransferReasonSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on TransferReasonRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(TransferReasonRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on TransferReasonSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(TransferReasonSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for TransferReasonSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public TransferReasonSubRequestParent(String id, String method) {
    super(id, "TransferReason", method);
  }
}
