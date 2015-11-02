/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentSubRequestParent.java
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
 * Abstract base class for all PackageComponent related UdtSubRequestParents
 *
 */
public abstract class PackageComponentSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on PackageComponentRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PackageComponentRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on PackageComponentSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PackageComponentSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for PackageComponentSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public PackageComponentSubRequestParent(String id, String method) {
    super(id, "PackageComponent", method);
  }
}
