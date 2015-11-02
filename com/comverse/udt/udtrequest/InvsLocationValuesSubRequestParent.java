/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationValuesSubRequestParent.java
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
 * Abstract base class for all InvsLocationValues related UdtSubRequestParents
 *
 */
public abstract class InvsLocationValuesSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsLocationValuesRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsLocationValuesRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsLocationValuesSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsLocationValuesSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsLocationValuesSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsLocationValuesSubRequestParent(String id, String method) {
    super(id, "InvsLocationValues", method);
  }
}
