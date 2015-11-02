/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SpecialDestinationTypeSubRequestParent.java
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
 * Abstract base class for all SpecialDestinationType related UdtSubRequestParents
 *
 */
public abstract class SpecialDestinationTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on SpecialDestinationTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SpecialDestinationTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on SpecialDestinationTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SpecialDestinationTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for SpecialDestinationTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public SpecialDestinationTypeSubRequestParent(String id, String method) {
    super(id, "SpecialDestinationType", method);
  }
}
