/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentPolicyMapSubRequestParent.java
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
 * Abstract base class for all ComponentPolicyMap related UdtSubRequestParents
 *
 */
public abstract class ComponentPolicyMapSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ComponentPolicyMapRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ComponentPolicyMapRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ComponentPolicyMapSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ComponentPolicyMapSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ComponentPolicyMapSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ComponentPolicyMapSubRequestParent(String id, String method) {
    super(id, "ComponentPolicyMap", method);
  }
}
