/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationSubRequestParent.java
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
 * Abstract base class for all BsdApplication related UdtSubRequestParents
 *
 */
public abstract class BsdApplicationSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BsdApplicationRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdApplicationRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BsdApplicationSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdApplicationSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BsdApplicationSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BsdApplicationSubRequestParent(String id, String method) {
    super(id, "BsdApplication", method);
  }
}
