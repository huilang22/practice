/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrVariableSubRequestParent.java
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
 * Abstract base class for all RbrVariable related UdtSubRequestParents
 *
 */
public abstract class RbrVariableSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on RbrVariableRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RbrVariableRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on RbrVariableSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(RbrVariableSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for RbrVariableSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public RbrVariableSubRequestParent(String id, String method) {
    super(id, "RbrVariable", method);
  }
}
