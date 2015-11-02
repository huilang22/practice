/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EquipClassCodeGetRequest.java
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
 * Class used to create a EquipClassCodeGetRequest Udt Request
 *
 */

public class EquipClassCodeGetRequest extends EquipClassCodeSubRequestParent {
/**
 *
 * Constructor to create a  EquipClassCodeGetRequest
 * @param id Unique request name
 * @param ECCGetIn ECCObjectKeyData for EquipClassCodeGetRequest
 *
 */
@JsonCreator
  public EquipClassCodeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("EquipClassCode")ECCObjectKeyData ECCGetIn) {
    super(id, "EquipClassCodeGet");
    if (ECCGetIn != null) {
      addInput("EquipClassCode", ECCObjectKeyHelper.toMap(ECCGetIn, new HashMap(), "ECCObjectKeyData").get("ECCObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ECCObjectData that results from the EquipClassCodeGetRequest call
 * @return ECCObjectData resulting from udt call
 *
 */

  public ECCObjectData getOutput() {
    return ECCObjectHelper.fromMap(outputMap, "EquipClassCode");
  }
}
