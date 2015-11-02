/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointIdDeleteRequest.java
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
 * Class used to create a BonusPointIdDeleteRequest Udt Request
 *
 */

public class BonusPointIdDeleteRequest extends BonusPointIdSubRequestParent {
/**
 *
 * Constructor to create a  BonusPointIdDeleteRequest
 * @param id Unique request name
 * @param BPIDeleteIn BPIObjectKeyData for BonusPointIdDeleteRequest
 *
 */
@JsonCreator
  public BonusPointIdDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BonusPointId")BPIObjectKeyData BPIDeleteIn) {
    super(id, "BonusPointIdDelete");
    if (BPIDeleteIn != null) {
      addInput("BonusPointId", BPIObjectKeyHelper.toMap(BPIDeleteIn, new HashMap(), "BPIObjectKeyData").get("BPIObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BPIObjectData that results from the BonusPointIdDeleteRequest call
 * @return BPIObjectData resulting from udt call
 *
 */

  public BPIObjectData getOutput() {
    return BPIObjectHelper.fromMap(outputMap, "BonusPointId");
  }
}
