/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecuritySubRequestParent.java
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
 * Abstract base class for all Security related UdtSubRequestParents
 *
 */
public abstract class SecuritySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on SecurityRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SecurityRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on SecuritySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SecuritySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for SecuritySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public SecuritySubRequestParent(String id, String method) {
    super(id, "Security", method);
  }
}
