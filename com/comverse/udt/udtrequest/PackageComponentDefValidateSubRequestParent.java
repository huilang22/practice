/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentDefValidateSubRequestParent.java
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
 * Abstract base class for all PackageComponentDefValidate related UdtSubRequestParents
 *
 */
public abstract class PackageComponentDefValidateSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on PackageComponentDefValidateRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PackageComponentDefValidateRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on PackageComponentDefValidateSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(PackageComponentDefValidateSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for PackageComponentDefValidateSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public PackageComponentDefValidateSubRequestParent(String id, String method) {
    super(id, "PackageComponentDefValidate", method);
  }
}
