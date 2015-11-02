/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdBusinessUnitSubRequestParent.java
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
 * Abstract base class for all BsdBusinessUnit related UdtSubRequestParents
 *
 */
public abstract class BsdBusinessUnitSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BsdBusinessUnitRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdBusinessUnitRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BsdBusinessUnitSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdBusinessUnitSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BsdBusinessUnitSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BsdBusinessUnitSubRequestParent(String id, String method) {
    super(id, "BsdBusinessUnit", method);
  }
}
