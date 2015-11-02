/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServComponentTypeSubRequestParent.java
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
 * Abstract base class for all ServComponentType related UdtSubRequestParents
 *
 */
public abstract class ServComponentTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ServComponentTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServComponentTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServComponentTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServComponentTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ServComponentTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServComponentTypeSubRequestParent(String id, String method) {
    super(id, "ServComponentType", method);
  }
}
