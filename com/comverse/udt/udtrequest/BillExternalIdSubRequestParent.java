/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillExternalIdSubRequestParent.java
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
 * Abstract base class for all BillExternalId related UdtSubRequestParents
 *
 */
public abstract class BillExternalIdSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BillExternalIdRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillExternalIdRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BillExternalIdSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillExternalIdSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BillExternalIdSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BillExternalIdSubRequestParent(String id, String method) {
    super(id, "BillExternalId", method);
  }
}
