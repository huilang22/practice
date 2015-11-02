/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusSubRequestParent.java
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
 * Abstract base class for all Status related UdtSubRequestParents
 *
 */
public abstract class StatusSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on StatusRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(StatusRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on StatusSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(StatusSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for StatusSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public StatusSubRequestParent(String id, String method) {
    super(id, "Status", method);
  }
}
