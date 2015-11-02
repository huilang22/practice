/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcCmfPackageSubRequestParent.java
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
 * Abstract base class for all SvcCmfPackage related UdtSubRequestParents
 *
 */
public abstract class SvcCmfPackageSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on SvcCmfPackageRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SvcCmfPackageRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on SvcCmfPackageSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SvcCmfPackageSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for SvcCmfPackageSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public SvcCmfPackageSubRequestParent(String id, String method) {
    super(id, "SvcCmfPackage", method);
  }
}
