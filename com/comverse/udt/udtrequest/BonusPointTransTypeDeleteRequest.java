/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointTransTypeDeleteRequest.java
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
 * Class used to create a BonusPointTransTypeDeleteRequest Udt Request
 *
 */

public class BonusPointTransTypeDeleteRequest extends BonusPointTransTypeSubRequestParent {
/**
 *
 * Constructor to create a  BonusPointTransTypeDeleteRequest
 * @param id Unique request name
 * @param BPTTDeleteIn BonusPointTransTypeObjectKeyData for BonusPointTransTypeDeleteRequest
 *
 */
@JsonCreator
  public BonusPointTransTypeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BonusPointTransType")BonusPointTransTypeObjectKeyData BPTTDeleteIn) {
    super(id, "BonusPointTransTypeDelete");
    if (BPTTDeleteIn != null) {
      addInput("BonusPointTransType", BonusPointTransTypeObjectKeyHelper.toMap(BPTTDeleteIn, new HashMap(), "BonusPointTransTypeObjectKeyData").get("BonusPointTransTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BonusPointTransTypeObjectData that results from the BonusPointTransTypeDeleteRequest call
 * @return BonusPointTransTypeObjectData resulting from udt call
 *
 */

  public BonusPointTransTypeObjectData getOutput() {
    return BonusPointTransTypeObjectHelper.fromMap(outputMap, "BonusPointTransType");
  }
}
