/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogSubRequestParent.java
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
 * Abstract base class for all Log related UdtSubRequestParents
 *
 */
public abstract class LogSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on LogRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(LogRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on LogSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(LogSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for LogSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public LogSubRequestParent(String id, String method) {
    super(id, "Log", method);
  }
}
