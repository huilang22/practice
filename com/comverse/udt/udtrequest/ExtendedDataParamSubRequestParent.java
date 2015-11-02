/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataParamSubRequestParent.java
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
 * Abstract base class for all ExtendedDataParam related UdtSubRequestParents
 *
 */
public abstract class ExtendedDataParamSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ExtendedDataParamRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ExtendedDataParamRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ExtendedDataParamSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ExtendedDataParamSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ExtendedDataParamSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ExtendedDataParamSubRequestParent(String id, String method) {
    super(id, "ExtendedDataParam", method);
  }
}
