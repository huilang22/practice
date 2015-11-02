/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatusTypeSubRequestParent.java
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
 * Abstract base class for all StatusType related UdtSubRequestParents
 *
 */
public abstract class StatusTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on StatusTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(StatusTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on StatusTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(StatusTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for StatusTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public StatusTypeSubRequestParent(String id, String method) {
    super(id, "StatusType", method);
  }
}
