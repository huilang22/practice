/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorRateBandOverrideRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtRequest;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all CorridorRateBandOverride related UdtRequests
 *
 */

public abstract class CorridorRateBandOverrideRequest extends UdtRequest {

/**
 *
 * Adds a  CorridorRateOverrideSubRequestParent as an InputRequest
 * @param inputRequest CorridorRateOverrideSubRequestParent to add as InputRequest
 *
 */
    public void addCorridorRateOverrideCorridorRateBandOverrideInputRequest(CorridorRateOverrideSubRequestParent inputRequest) {
      if (irList == null) {
          irList = new ArrayList();
      }
      HashMap inReq = new HashMap();
      inReq.put("RequestId", inputRequest.getRequestId());
      inReq.put("RelationshipId", "CorridorRateOverride_CorridorRateBandOverride_Ref");
      irList.add(inReq);
    }
/**
 *
 * Constructor for CorridorRateBandOverrideRequests
 * @param id unique request identifier
 * @param method method to perform
 *
 */

  public CorridorRateBandOverrideRequest(String id, String method) {
    super(id, "CorridorRateBandOverride", method);
  }
}
