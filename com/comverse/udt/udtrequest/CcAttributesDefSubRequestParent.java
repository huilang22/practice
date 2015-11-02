/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcAttributesDefSubRequestParent.java
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
 * Abstract base class for all CcAttributesDef related UdtSubRequestParents
 *
 */
public abstract class CcAttributesDefSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CcAttributesDefRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CcAttributesDefRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CcAttributesDefSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CcAttributesDefSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CcAttributesDefSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CcAttributesDefSubRequestParent(String id, String method) {
    super(id, "CcAttributesDef", method);
  }
}
