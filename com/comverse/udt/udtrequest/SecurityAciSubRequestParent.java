/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityAciSubRequestParent.java
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
 * Abstract base class for all SecurityAci related UdtSubRequestParents
 *
 */
public abstract class SecurityAciSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on SecurityAciRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SecurityAciRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on SecurityAciSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SecurityAciSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for SecurityAciSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public SecurityAciSubRequestParent(String id, String method) {
    super(id, "SecurityAci", method);
  }
}
