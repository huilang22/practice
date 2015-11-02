/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeDefaultSubRequestParent.java
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
 * Abstract base class for all BsdAttributeDefault related UdtSubRequestParents
 *
 */
public abstract class BsdAttributeDefaultSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on BsdAttributeDefaultRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdAttributeDefaultRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on BsdAttributeDefaultSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(BsdAttributeDefaultSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for BsdAttributeDefaultSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public BsdAttributeDefaultSubRequestParent(String id, String method) {
    super(id, "BsdAttributeDefault", method);
  }
}
