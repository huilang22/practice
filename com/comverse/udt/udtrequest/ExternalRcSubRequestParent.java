/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalRcSubRequestParent.java
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
 * Abstract base class for all ExternalRc related UdtSubRequestParents
 *
 */
public abstract class ExternalRcSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ExternalRcRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ExternalRcRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ExternalRcSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ExternalRcSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ExternalRcSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ExternalRcSubRequestParent(String id, String method) {
    super(id, "ExternalRc", method);
  }
}
