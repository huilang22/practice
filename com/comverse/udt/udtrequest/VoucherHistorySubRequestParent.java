/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherHistorySubRequestParent.java
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
 * Abstract base class for all VoucherHistory related UdtSubRequestParents
 *
 */
public abstract class VoucherHistorySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on VoucherHistoryRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(VoucherHistoryRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on VoucherHistorySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(VoucherHistorySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for VoucherHistorySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public VoucherHistorySubRequestParent(String id, String method) {
    super(id, "VoucherHistory", method);
  }
}
