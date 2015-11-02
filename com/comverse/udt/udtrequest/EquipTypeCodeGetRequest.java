/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EquipTypeCodeGetRequest.java
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
 * Class used to create a EquipTypeCodeGetRequest Udt Request
 *
 */

public class EquipTypeCodeGetRequest extends EquipTypeCodeSubRequestParent {
/**
 *
 * Constructor to create a  EquipTypeCodeGetRequest
 * @param id Unique request name
 * @param ETGGetIn ETGObjectKeyData for EquipTypeCodeGetRequest
 *
 */
@JsonCreator
  public EquipTypeCodeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("EquipTypeCode")ETGObjectKeyData ETGGetIn) {
    super(id, "EquipTypeCodeGet");
    if (ETGGetIn != null) {
      addInput("EquipTypeCode", ETGObjectKeyHelper.toMap(ETGGetIn, new HashMap(), "ETGObjectKeyData").get("ETGObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ETGObjectData that results from the EquipTypeCodeGetRequest call
 * @return ETGObjectData resulting from udt call
 *
 */

  public ETGObjectData getOutput() {
    return ETGObjectHelper.fromMap(outputMap, "EquipTypeCode");
  }
}
