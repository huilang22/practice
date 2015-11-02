/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatTypeSubRequestParent.java
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
 * Abstract base class for all CtcFormatType related UdtSubRequestParents
 *
 */
public abstract class CtcFormatTypeSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on CtcFormatTypeRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcFormatTypeRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on CtcFormatTypeSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(CtcFormatTypeSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for CtcFormatTypeSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public CtcFormatTypeSubRequestParent(String id, String method) {
    super(id, "CtcFormatType", method);
  }
}
