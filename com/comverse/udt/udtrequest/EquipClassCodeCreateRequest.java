/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EquipClassCodeCreateRequest.java
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
 * Class used to create a EquipClassCodeCreateRequest Udt Request
 *
 */

public class EquipClassCodeCreateRequest extends EquipClassCodeSubRequestParent {
/**
 *
 * Constructor to create a  EquipClassCodeCreateRequest
 * @param id Unique request name
 * @param ECCCreateIn ECCObjectData for EquipClassCodeCreateRequest
 *
 */
@JsonCreator
  public EquipClassCodeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("EquipClassCode")ECCObjectData ECCCreateIn) {
    super(id, "EquipClassCodeCreate");
    if (ECCCreateIn != null) {
      addInput("EquipClassCode", ECCObjectHelper.toMap(ECCCreateIn, new HashMap(), "EquipClassCode").get("EquipClassCode"));
    }
  }

/**
 *
 * Retrieves the ECCObjectData that results from the EquipClassCodeCreateRequest call
 * @return ECCObjectData resulting from udt call
 *
 */

  public ECCObjectData getOutput() {
    return ECCObjectHelper.fromMap(outputMap, "EquipClassCode");
  }
}
