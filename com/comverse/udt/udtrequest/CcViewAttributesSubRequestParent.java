/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcViewAttributesSubRequestParent.java
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
 * Abstract base class for all CcViewAttributes related UdtSubRequestParents
 *
 */
public abstract class CcViewAttributesSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CcViewAttributesRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CcViewAttributesRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CcViewAttributesSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CcViewAttributesSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CcViewAttributesSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CcViewAttributesSubRequestParent(String id, String method) {
    super(id, "CcViewAttributes", method);
  }
}
