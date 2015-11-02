/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyTypeSubRequestParent.java
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
 * Abstract base class for all DependencyType related UdtSubRequestParents
 *
 */
public abstract class DependencyTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on DependencyTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DependencyTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on DependencyTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DependencyTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for DependencyTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public DependencyTypeSubRequestParent(String id, String method) {
    super(id, "DependencyType", method);
  }
}
