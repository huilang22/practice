/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcInventorySubRequestParent.java
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
 * Abstract base class for all SvcInventory related UdtSubRequestParents
 *
 */
public abstract class SvcInventorySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on SvcInventoryRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SvcInventoryRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on SvcInventorySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SvcInventorySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for SvcInventorySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public SvcInventorySubRequestParent(String id, String method) {
    super(id, "SvcInventory", method);
  }
}
