/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationDetailSubRequestParent.java
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
 * Abstract base class for all InvsLocationDetail related UdtSubRequestParents
 *
 */
public abstract class InvsLocationDetailSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsLocationDetailRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsLocationDetailRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsLocationDetailSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsLocationDetailSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsLocationDetailSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsLocationDetailSubRequestParent(String id, String method) {
    super(id, "InvsLocationDetail", method);
  }
}
