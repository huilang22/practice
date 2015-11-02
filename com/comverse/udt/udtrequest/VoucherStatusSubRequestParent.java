/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusSubRequestParent.java
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
 * Abstract base class for all VoucherStatus related UdtSubRequestParents
 *
 */
public abstract class VoucherStatusSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on VoucherStatusRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(VoucherStatusRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on VoucherStatusSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(VoucherStatusSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for VoucherStatusSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public VoucherStatusSubRequestParent(String id, String method) {
    super(id, "VoucherStatus", method);
  }
}
