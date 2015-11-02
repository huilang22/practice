/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointIdGetRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BonusPointIdGetRequest Udt Request
 *
 */

public class BonusPointIdGetRequest extends BonusPointIdSubRequestParent {
/**
 *
 * Constructor to create a  BonusPointIdGetRequest
 * @param id Unique request name
 * @param BPIGetIn BPIObjectKeyData for BonusPointIdGetRequest
 *
 */
@JsonCreator
  public BonusPointIdGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BonusPointId")BPIObjectKeyData BPIGetIn) {
    super(id, "BonusPointIdGet");
    if (BPIGetIn != null) {
      addInput("BonusPointId", BPIObjectKeyHelper.toMap(BPIGetIn, new HashMap(), "BPIObjectKeyData").get("BPIObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BPIObjectData that results from the BonusPointIdGetRequest call
 * @return BPIObjectData resulting from udt call
 *
 */

  public BPIObjectData getOutput() {
    return BPIObjectHelper.fromMap(outputMap, "BonusPointId");
  }
}
