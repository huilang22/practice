/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherTypesSubRequestParent.java
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
 * Abstract base class for all VoucherTypes related UdtSubRequestParents
 *
 */
public abstract class VoucherTypesSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on VoucherTypesRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(VoucherTypesRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on VoucherTypesSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(VoucherTypesSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for VoucherTypesSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public VoucherTypesSubRequestParent(String id, String method) {
    super(id, "VoucherTypes", method);
  }
}
