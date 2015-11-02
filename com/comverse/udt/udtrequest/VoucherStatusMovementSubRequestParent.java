/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusMovementSubRequestParent.java
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
 * Abstract base class for all VoucherStatusMovement related UdtSubRequestParents
 *
 */
public abstract class VoucherStatusMovementSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on VoucherStatusMovementRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(VoucherStatusMovementRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on VoucherStatusMovementSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(VoucherStatusMovementSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for VoucherStatusMovementSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public VoucherStatusMovementSubRequestParent(String id, String method) {
    super(id, "VoucherStatusMovement", method);
  }
}
