/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BillModeOverrideSubRequestParent.java
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
 * Abstract base class for all BillModeOverride related UdtSubRequestParents
 *
 */
public abstract class BillModeOverrideSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BillModeOverrideRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillModeOverrideRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BillModeOverrideSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BillModeOverrideSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BillModeOverrideSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BillModeOverrideSubRequestParent(String id, String method) {
    super(id, "BillModeOverride", method);
  }
}
