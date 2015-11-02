/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayDefinitionSubRequestParent.java
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
 * Abstract base class for all BusinessDayDefinition related UdtSubRequestParents
 *
 */
public abstract class BusinessDayDefinitionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BusinessDayDefinitionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BusinessDayDefinitionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BusinessDayDefinitionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BusinessDayDefinitionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BusinessDayDefinitionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BusinessDayDefinitionSubRequestParent(String id, String method) {
    super(id, "BusinessDayDefinition", method);
  }
}
