/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherLocationSubRequestParent.java
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
 * Abstract base class for all VoucherLocation related UdtSubRequestParents
 *
 */
public abstract class VoucherLocationSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on VoucherLocationRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(VoucherLocationRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on VoucherLocationSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(VoucherLocationSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for VoucherLocationSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public VoucherLocationSubRequestParent(String id, String method) {
    super(id, "VoucherLocation", method);
  }
}
