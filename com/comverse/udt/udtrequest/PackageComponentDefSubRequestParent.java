/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentDefSubRequestParent.java
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
 * Abstract base class for all PackageComponentDef related UdtSubRequestParents
 *
 */
public abstract class PackageComponentDefSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on PackageComponentDefRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PackageComponentDefRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on PackageComponentDefSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PackageComponentDefSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for PackageComponentDefSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public PackageComponentDefSubRequestParent(String id, String method) {
    super(id, "PackageComponentDef", method);
  }
}
