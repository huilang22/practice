/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationRelationalDefaultSubRequestParent.java
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
 * Abstract base class for all BsdApplicationRelationalDefault related UdtSubRequestParents
 *
 */
public abstract class BsdApplicationRelationalDefaultSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BsdApplicationRelationalDefaultRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdApplicationRelationalDefaultRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BsdApplicationRelationalDefaultSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdApplicationRelationalDefaultSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BsdApplicationRelationalDefaultSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BsdApplicationRelationalDefaultSubRequestParent(String id, String method) {
    super(id, "BsdApplicationRelationalDefault", method);
  }
}
