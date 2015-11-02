/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdAcctMapSubRequestParent.java
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
 * Abstract base class for all ExternalIdAcctMap related UdtSubRequestParents
 *
 */
public abstract class ExternalIdAcctMapSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ExternalIdAcctMapRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ExternalIdAcctMapRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ExternalIdAcctMapSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ExternalIdAcctMapSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ExternalIdAcctMapSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ExternalIdAcctMapSubRequestParent(String id, String method) {
    super(id, "ExternalIdAcctMap", method);
  }
}
