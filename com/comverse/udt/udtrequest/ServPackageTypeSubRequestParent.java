/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServPackageTypeSubRequestParent.java
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
 * Abstract base class for all ServPackageType related UdtSubRequestParents
 *
 */
public abstract class ServPackageTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ServPackageTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServPackageTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ServPackageTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ServPackageTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ServPackageTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ServPackageTypeSubRequestParent(String id, String method) {
    super(id, "ServPackageType", method);
  }
}
