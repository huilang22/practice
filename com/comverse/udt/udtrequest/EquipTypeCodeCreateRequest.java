/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EquipTypeCodeCreateRequest.java
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
 * Class used to create a EquipTypeCodeCreateRequest Udt Request
 *
 */

public class EquipTypeCodeCreateRequest extends EquipTypeCodeSubRequestParent {
/**
 *
 * Constructor to create a  EquipTypeCodeCreateRequest
 * @param id Unique request name
 * @param ETGCreateIn ETGObjectData for EquipTypeCodeCreateRequest
 *
 */
@JsonCreator
  public EquipTypeCodeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("EquipTypeCode")ETGObjectData ETGCreateIn) {
    super(id, "EquipTypeCodeCreate");
    if (ETGCreateIn != null) {
      addInput("EquipTypeCode", ETGObjectHelper.toMap(ETGCreateIn, new HashMap(), "EquipTypeCode").get("EquipTypeCode"));
    }
  }

/**
 *
 * Retrieves the ETGObjectData that results from the EquipTypeCodeCreateRequest call
 * @return ETGObjectData resulting from udt call
 *
 */

  public ETGObjectData getOutput() {
    return ETGObjectHelper.fromMap(outputMap, "EquipTypeCode");
  }
}
