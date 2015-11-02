/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrDefinitionSubRequestParent.java
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
 * Abstract base class for all UnitCrDefinition related UdtSubRequestParents
 *
 */
public abstract class UnitCrDefinitionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on UnitCrDefinitionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UnitCrDefinitionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on UnitCrDefinitionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(UnitCrDefinitionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for UnitCrDefinitionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public UnitCrDefinitionSubRequestParent(String id, String method) {
    super(id, "UnitCrDefinition", method);
  }
}
