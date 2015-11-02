/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogicalServiceOrderSubRequestParent.java
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
 * Abstract base class for all LogicalServiceOrder related UdtSubRequestParents
 *
 */
public abstract class LogicalServiceOrderSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on LogicalServiceOrderRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(LogicalServiceOrderRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on LogicalServiceOrderSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(LogicalServiceOrderSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for LogicalServiceOrderSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public LogicalServiceOrderSubRequestParent(String id, String method) {
    super(id, "LogicalServiceOrder", method);
  }
}
