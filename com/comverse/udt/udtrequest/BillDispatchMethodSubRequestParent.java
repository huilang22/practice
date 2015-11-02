/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillDispatchMethodSubRequestParent.java
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
 * Abstract base class for all BillDispatchMethod related UdtSubRequestParents
 *
 */
public abstract class BillDispatchMethodSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BillDispatchMethodRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillDispatchMethodRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BillDispatchMethodSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillDispatchMethodSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BillDispatchMethodSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BillDispatchMethodSubRequestParent(String id, String method) {
    super(id, "BillDispatchMethod", method);
  }
}
