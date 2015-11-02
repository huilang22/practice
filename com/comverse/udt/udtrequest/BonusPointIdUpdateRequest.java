/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointIdUpdateRequest.java
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
 * Class used to create a BonusPointIdUpdateRequest Udt Request
 *
 */

public class BonusPointIdUpdateRequest extends BonusPointIdSubRequestParent {
/**
 *
 * Constructor to create a  BonusPointIdUpdateRequest
 * @param id Unique request name
 * @param BPIUpdateIn BPIObjectData for BonusPointIdUpdateRequest
 *
 */
@JsonCreator
  public BonusPointIdUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BonusPointId")BPIObjectData BPIUpdateIn) {
    super(id, "BonusPointIdUpdate");
    if (BPIUpdateIn != null) {
      addInput("BonusPointId", BPIObjectHelper.toMap(BPIUpdateIn, new HashMap(), "BonusPointId").get("BonusPointId"));
    }
  }

/**
 *
 * Retrieves the BPIObjectData that results from the BonusPointIdUpdateRequest call
 * @return BPIObjectData resulting from udt call
 *
 */

  public BPIObjectData getOutput() {
    return BPIObjectHelper.fromMap(outputMap, "BonusPointId");
  }
}
