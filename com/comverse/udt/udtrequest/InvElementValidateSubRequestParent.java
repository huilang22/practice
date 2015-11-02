/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementValidateSubRequestParent.java
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
 * Abstract base class for all InvElementValidate related UdtSubRequestParents
 *
 */
public abstract class InvElementValidateSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvElementValidateRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvElementValidateRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvElementValidateSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvElementValidateSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvElementValidateSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvElementValidateSubRequestParent(String id, String method) {
    super(id, "InvElementValidate", method);
  }
}
