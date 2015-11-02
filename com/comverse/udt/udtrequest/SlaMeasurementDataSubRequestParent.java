/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SlaMeasurementDataSubRequestParent.java
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
 * Abstract base class for all SlaMeasurementData related UdtSubRequestParents
 *
 */
public abstract class SlaMeasurementDataSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on SlaMeasurementDataRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SlaMeasurementDataRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on SlaMeasurementDataSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(SlaMeasurementDataSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for SlaMeasurementDataSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public SlaMeasurementDataSubRequestParent(String id, String method) {
    super(id, "SlaMeasurementData", method);
  }
}
