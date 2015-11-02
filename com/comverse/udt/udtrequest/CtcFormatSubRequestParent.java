/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatSubRequestParent.java
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
 * Abstract base class for all CtcFormat related UdtSubRequestParents
 *
 */
public abstract class CtcFormatSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtcFormatRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcFormatRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtcFormatSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcFormatSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtcFormatSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtcFormatSubRequestParent(String id, String method) {
    super(id, "CtcFormat", method);
  }
}
