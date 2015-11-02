/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointTransTypeUpdateRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BonusPointTransTypeUpdateRequest Udt Request
 *
 */

public class BonusPointTransTypeUpdateRequest extends BonusPointTransTypeSubRequestParent {
/**
 *
 * Constructor to create a  BonusPointTransTypeUpdateRequest
 * @param id Unique request name
 * @param BPTTUpdateIn BonusPointTransTypeObjectData for BonusPointTransTypeUpdateRequest
 *
 */
@JsonCreator
  public BonusPointTransTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BonusPointTransType")BonusPointTransTypeObjectData BPTTUpdateIn) {
    super(id, "BonusPointTransTypeUpdate");
    if (BPTTUpdateIn != null) {
      addInput("BonusPointTransType", BonusPointTransTypeObjectHelper.toMap(BPTTUpdateIn, new HashMap(), "BonusPointTransType").get("BonusPointTransType"));
    }
  }

/**
 *
 * Retrieves the BonusPointTransTypeObjectData that results from the BonusPointTransTypeUpdateRequest call
 * @return BonusPointTransTypeObjectData resulting from udt call
 *
 */

  public BonusPointTransTypeObjectData getOutput() {
    return BonusPointTransTypeObjectHelper.fromMap(outputMap, "BonusPointTransType");
  }
}
