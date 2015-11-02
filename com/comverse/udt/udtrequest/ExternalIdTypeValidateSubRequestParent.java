/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdTypeValidateSubRequestParent.java
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
 * Abstract base class for all ExternalIdTypeValidate related UdtSubRequestParents
 *
 */
public abstract class ExternalIdTypeValidateSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ExternalIdTypeValidateRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ExternalIdTypeValidateRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ExternalIdTypeValidateSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ExternalIdTypeValidateSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ExternalIdTypeValidateSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ExternalIdTypeValidateSubRequestParent(String id, String method) {
    super(id, "ExternalIdTypeValidate", method);
  }
}
