/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointIdCreateRequest.java
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
 * Class used to create a BonusPointIdCreateRequest Udt Request
 *
 */

public class BonusPointIdCreateRequest extends BonusPointIdSubRequestParent {
/**
 *
 * Constructor to create a  BonusPointIdCreateRequest
 * @param id Unique request name
 * @param BPICreateIn BPIObjectData for BonusPointIdCreateRequest
 *
 */
@JsonCreator
  public BonusPointIdCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BonusPointId")BPIObjectData BPICreateIn) {
    super(id, "BonusPointIdCreate");
    if (BPICreateIn != null) {
      addInput("BonusPointId", BPIObjectHelper.toMap(BPICreateIn, new HashMap(), "BonusPointId").get("BonusPointId"));
    }
  }

/**
 *
 * Retrieves the BPIObjectData that results from the BonusPointIdCreateRequest call
 * @return BPIObjectData resulting from udt call
 *
 */

  public BPIObjectData getOutput() {
    return BPIObjectHelper.fromMap(outputMap, "BonusPointId");
  }
}
