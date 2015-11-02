/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentMemberSubRequestParent.java
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
 * Abstract base class for all PackageComponentMember related UdtSubRequestParents
 *
 */
public abstract class PackageComponentMemberSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on PackageComponentMemberRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PackageComponentMemberRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on PackageComponentMemberSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PackageComponentMemberSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for PackageComponentMemberSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public PackageComponentMemberSubRequestParent(String id, String method) {
    super(id, "PackageComponentMember", method);
  }
}
