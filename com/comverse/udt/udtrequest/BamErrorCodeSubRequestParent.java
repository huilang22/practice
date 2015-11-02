/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BamErrorCodeSubRequestParent.java
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
 * Abstract base class for all BamErrorCode related UdtSubRequestParents
 *
 */
public abstract class BamErrorCodeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BamErrorCodeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BamErrorCodeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BamErrorCodeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BamErrorCodeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BamErrorCodeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BamErrorCodeSubRequestParent(String id, String method) {
    super(id, "BamErrorCode", method);
  }
}
