/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointTransTypeCreateRequest.java
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
 * Class used to create a BonusPointTransTypeCreateRequest Udt Request
 *
 */

public class BonusPointTransTypeCreateRequest extends BonusPointTransTypeSubRequestParent {
/**
 *
 * Constructor to create a  BonusPointTransTypeCreateRequest
 * @param id Unique request name
 * @param BPTTCreateIn BonusPointTransTypeObjectData for BonusPointTransTypeCreateRequest
 *
 */
@JsonCreator
  public BonusPointTransTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BonusPointTransType")BonusPointTransTypeObjectData BPTTCreateIn) {
    super(id, "BonusPointTransTypeCreate");
    if (BPTTCreateIn != null) {
      addInput("BonusPointTransType", BonusPointTransTypeObjectHelper.toMap(BPTTCreateIn, new HashMap(), "BonusPointTransType").get("BonusPointTransType"));
    }
  }

/**
 *
 * Retrieves the BonusPointTransTypeObjectData that results from the BonusPointTransTypeCreateRequest call
 * @return BonusPointTransTypeObjectData resulting from udt call
 *
 */

  public BonusPointTransTypeObjectData getOutput() {
    return BonusPointTransTypeObjectHelper.fromMap(outputMap, "BonusPointTransType");
  }
}
