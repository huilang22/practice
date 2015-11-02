/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherDefinitionsSubRequestParent.java
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
 * Abstract base class for all VoucherDefinitions related UdtSubRequestParents
 *
 */
public abstract class VoucherDefinitionsSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on VoucherDefinitionsRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(VoucherDefinitionsRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on VoucherDefinitionsSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(VoucherDefinitionsSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for VoucherDefinitionsSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public VoucherDefinitionsSubRequestParent(String id, String method) {
    super(id, "VoucherDefinitions", method);
  }
}
