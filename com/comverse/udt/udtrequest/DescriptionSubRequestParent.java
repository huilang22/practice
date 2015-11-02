/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DescriptionSubRequestParent.java
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
 * Abstract base class for all Description related UdtSubRequestParents
 *
 */
public abstract class DescriptionSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on DescriptionRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DescriptionRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on DescriptionSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(DescriptionSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for DescriptionSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public DescriptionSubRequestParent(String id, String method) {
    super(id, "Description", method);
  }
}
