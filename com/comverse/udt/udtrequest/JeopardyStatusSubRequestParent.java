/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JeopardyStatusSubRequestParent.java
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
 * Abstract base class for all JeopardyStatus related UdtSubRequestParents
 *
 */
public abstract class JeopardyStatusSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on JeopardyStatusRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(JeopardyStatusRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on JeopardyStatusSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(JeopardyStatusSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for JeopardyStatusSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public JeopardyStatusSubRequestParent(String id, String method) {
    super(id, "JeopardyStatus", method);
  }
}
