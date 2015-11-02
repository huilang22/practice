/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectSubRequestParent.java
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
 * Abstract base class for all BsdObject related UdtSubRequestParents
 *
 */
public abstract class BsdObjectSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BsdObjectRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdObjectRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BsdObjectSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdObjectSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BsdObjectSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BsdObjectSubRequestParent(String id, String method) {
    super(id, "BsdObject", method);
  }
}
