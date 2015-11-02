/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeTypesSubRequestParent.java
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
 * Abstract base class for all LateFeeTypes related UdtSubRequestParents
 *
 */
public abstract class LateFeeTypesSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on LateFeeTypesRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(LateFeeTypesRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on LateFeeTypesSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(LateFeeTypesSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for LateFeeTypesSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public LateFeeTypesSubRequestParent(String id, String method) {
    super(id, "LateFeeTypes", method);
  }
}
