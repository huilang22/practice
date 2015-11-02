/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SystemParameterSubRequestParent.java
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
 * Abstract base class for all SystemParameter related UdtSubRequestParents
 *
 */
public abstract class SystemParameterSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on SystemParameterRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SystemParameterRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on SystemParameterSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SystemParameterSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for SystemParameterSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public SystemParameterSubRequestParent(String id, String method) {
    super(id, "SystemParameter", method);
  }
}
