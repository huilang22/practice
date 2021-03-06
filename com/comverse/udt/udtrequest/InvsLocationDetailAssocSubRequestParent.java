/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationDetailAssocSubRequestParent.java
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
 * Abstract base class for all InvsLocationDetailAssoc related UdtSubRequestParents
 *
 */
public abstract class InvsLocationDetailAssocSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsLocationDetailAssocRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsLocationDetailAssocRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsLocationDetailAssocSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsLocationDetailAssocSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsLocationDetailAssocSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsLocationDetailAssocSubRequestParent(String id, String method) {
    super(id, "InvsLocationDetailAssoc", method);
  }
}
