/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxPackageInstSubRequestParent.java
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
 * Abstract base class for all TaxPackageInst related UdtSubRequestParents
 *
 */
public abstract class TaxPackageInstSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on TaxPackageInstRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(TaxPackageInstRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on TaxPackageInstSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(TaxPackageInstSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for TaxPackageInstSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public TaxPackageInstSubRequestParent(String id, String method) {
    super(id, "TaxPackageInst", method);
  }
}
