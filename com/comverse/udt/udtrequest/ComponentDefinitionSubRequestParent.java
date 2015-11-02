/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentDefinitionSubRequestParent.java
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
 * Abstract base class for all ComponentDefinition related UdtSubRequestParents
 *
 */
public abstract class ComponentDefinitionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ComponentDefinitionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ComponentDefinitionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ComponentDefinitionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ComponentDefinitionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ComponentDefinitionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ComponentDefinitionSubRequestParent(String id, String method) {
    super(id, "ComponentDefinition", method);
  }
}
