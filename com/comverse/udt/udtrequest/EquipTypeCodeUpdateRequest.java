/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EquipTypeCodeUpdateRequest.java
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
 * Class used to create a EquipTypeCodeUpdateRequest Udt Request
 *
 */

public class EquipTypeCodeUpdateRequest extends EquipTypeCodeSubRequestParent {
/**
 *
 * Constructor to create a  EquipTypeCodeUpdateRequest
 * @param id Unique request name
 * @param ETGUpdateIn ETGObjectData for EquipTypeCodeUpdateRequest
 *
 */
@JsonCreator
  public EquipTypeCodeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("EquipTypeCode")ETGObjectData ETGUpdateIn) {
    super(id, "EquipTypeCodeUpdate");
    if (ETGUpdateIn != null) {
      addInput("EquipTypeCode", ETGObjectHelper.toMap(ETGUpdateIn, new HashMap(), "EquipTypeCode").get("EquipTypeCode"));
    }
  }

/**
 *
 * Retrieves the ETGObjectData that results from the EquipTypeCodeUpdateRequest call
 * @return ETGObjectData resulting from udt call
 *
 */

  public ETGObjectData getOutput() {
    return ETGObjectHelper.fromMap(outputMap, "EquipTypeCode");
  }
}
