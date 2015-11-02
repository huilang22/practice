/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencySubRequestParent.java
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
 * Abstract base class for all Dependency related UdtSubRequestParents
 *
 */
public abstract class DependencySubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on DependencyRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DependencyRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on DependencySubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DependencySubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for DependencySubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public DependencySubRequestParent(String id, String method) {
    super(id, "Dependency", method);
  }
}
