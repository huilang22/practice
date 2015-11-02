/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsNetworkDeviceSubRequestParent.java
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
 * Abstract base class for all InvsNetworkDevice related UdtSubRequestParents
 *
 */
public abstract class InvsNetworkDeviceSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on InvsNetworkDeviceRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsNetworkDeviceRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on InvsNetworkDeviceSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(InvsNetworkDeviceSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for InvsNetworkDeviceSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public InvsNetworkDeviceSubRequestParent(String id, String method) {
    super(id, "InvsNetworkDevice", method);
  }
}
