/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationDefaultSubRequestParent.java
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
 * Abstract base class for all BsdApplicationDefault related UdtSubRequestParents
 *
 */
public abstract class BsdApplicationDefaultSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BsdApplicationDefaultRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdApplicationDefaultRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BsdApplicationDefaultSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdApplicationDefaultSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BsdApplicationDefaultSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BsdApplicationDefaultSubRequestParent(String id, String method) {
    super(id, "BsdApplicationDefault", method);
  }
}
