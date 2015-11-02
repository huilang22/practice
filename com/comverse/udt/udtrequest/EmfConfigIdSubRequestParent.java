/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigIdSubRequestParent.java
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
 * Abstract base class for all EmfConfigId related UdtSubRequestParents
 *
 */
public abstract class EmfConfigIdSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on EmfConfigIdRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(EmfConfigIdRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on EmfConfigIdSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(EmfConfigIdSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for EmfConfigIdSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public EmfConfigIdSubRequestParent(String id, String method) {
    super(id, "EmfConfigId", method);
  }
}
