/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EquipClassCodeUpdateRequest.java
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
 * Class used to create a EquipClassCodeUpdateRequest Udt Request
 *
 */

public class EquipClassCodeUpdateRequest extends EquipClassCodeSubRequestParent {
/**
 *
 * Constructor to create a  EquipClassCodeUpdateRequest
 * @param id Unique request name
 * @param ECCUpdateIn ECCObjectData for EquipClassCodeUpdateRequest
 *
 */
@JsonCreator
  public EquipClassCodeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("EquipClassCode")ECCObjectData ECCUpdateIn) {
    super(id, "EquipClassCodeUpdate");
    if (ECCUpdateIn != null) {
      addInput("EquipClassCode", ECCObjectHelper.toMap(ECCUpdateIn, new HashMap(), "EquipClassCode").get("EquipClassCode"));
    }
  }

/**
 *
 * Retrieves the ECCObjectData that results from the EquipClassCodeUpdateRequest call
 * @return ECCObjectData resulting from udt call
 *
 */

  public ECCObjectData getOutput() {
    return ECCObjectHelper.fromMap(outputMap, "EquipClassCode");
  }
}
