/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherStatusInfoSubRequestParent.java
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
 * Abstract base class for all VoucherStatusInfo related UdtSubRequestParents
 *
 */
public abstract class VoucherStatusInfoSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on VoucherStatusInfoRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(VoucherStatusInfoRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on VoucherStatusInfoSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(VoucherStatusInfoSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for VoucherStatusInfoSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public VoucherStatusInfoSubRequestParent(String id, String method) {
    super(id, "VoucherStatusInfo", method);
  }
}
