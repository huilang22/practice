/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BonusPointTransTypeGetRequest.java
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
 * Class used to create a BonusPointTransTypeGetRequest Udt Request
 *
 */

public class BonusPointTransTypeGetRequest extends BonusPointTransTypeSubRequestParent {
/**
 *
 * Constructor to create a  BonusPointTransTypeGetRequest
 * @param id Unique request name
 * @param BPTTGetIn BonusPointTransTypeObjectKeyData for BonusPointTransTypeGetRequest
 *
 */
@JsonCreator
  public BonusPointTransTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BonusPointTransType")BonusPointTransTypeObjectKeyData BPTTGetIn) {
    super(id, "BonusPointTransTypeGet");
    if (BPTTGetIn != null) {
      addInput("BonusPointTransType", BonusPointTransTypeObjectKeyHelper.toMap(BPTTGetIn, new HashMap(), "BonusPointTransTypeObjectKeyData").get("BonusPointTransTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BonusPointTransTypeObjectData that results from the BonusPointTransTypeGetRequest call
 * @return BonusPointTransTypeObjectData resulting from udt call
 *
 */

  public BonusPointTransTypeObjectData getOutput() {
    return BonusPointTransTypeObjectHelper.fromMap(outputMap, "BonusPointTransType");
  }
}
