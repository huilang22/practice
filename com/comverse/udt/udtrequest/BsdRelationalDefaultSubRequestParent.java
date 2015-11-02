/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalDefaultSubRequestParent.java
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
 * Abstract base class for all BsdRelationalDefault related UdtSubRequestParents
 *
 */
public abstract class BsdRelationalDefaultSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BsdRelationalDefaultRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdRelationalDefaultRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BsdRelationalDefaultSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdRelationalDefaultSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BsdRelationalDefaultSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BsdRelationalDefaultSubRequestParent(String id, String method) {
    super(id, "BsdRelationalDefault", method);
  }
}
