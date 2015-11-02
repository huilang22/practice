/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MIHSubscriberSyncRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a MIHSubscriberSyncRequest Udt Request
 *
 */

public class MIHSubscriberSyncRequest extends MIHSubscriberRequest {
/**
 *
 * Constructor to create a  MIHSubscriberSyncRequest
 * @param id Unique request name
 * @param ____msisdn String for MIHSubscriberSyncRequest
 *
 */
@JsonCreator
  public MIHSubscriberSyncRequest(@JsonProperty("RequestId") String id, @JsonProperty("Msisdn")String ____msisdn) {
    super(id, "MIHSubscriberSync");
    if (____msisdn != null) {
      addInput("Msisdn", ____msisdn);
    }
  }

/**
 *
 * Retrieves the Integer that results from the MIHSubscriberSyncRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("Output");
  }
}
