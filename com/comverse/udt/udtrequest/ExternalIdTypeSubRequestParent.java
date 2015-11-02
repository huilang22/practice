/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdTypeSubRequestParent.java
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
 * Abstract base class for all ExternalIdType related UdtSubRequestParents
 *
 */
public abstract class ExternalIdTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ExternalIdTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ExternalIdTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ExternalIdTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ExternalIdTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ExternalIdTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ExternalIdTypeSubRequestParent(String id, String method) {
    super(id, "ExternalIdType", method);
  }
}
