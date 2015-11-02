/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcProductSubRequestParent.java
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
 * Abstract base class for all SvcProduct related UdtSubRequestParents
 *
 */
public abstract class SvcProductSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on SvcProductRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SvcProductRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on SvcProductSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SvcProductSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for SvcProductSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public SvcProductSubRequestParent(String id, String method) {
    super(id, "SvcProduct", method);
  }
}
