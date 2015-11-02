/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsagePointTextSubRequestParent.java
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
 * Abstract base class for all UsagePointText related UdtSubRequestParents
 *
 */
public abstract class UsagePointTextSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on UsagePointTextRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UsagePointTextRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on UsagePointTextSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UsagePointTextSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for UsagePointTextSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public UsagePointTextSubRequestParent(String id, String method) {
    super(id, "UsagePointText", method);
  }
}
