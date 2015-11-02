/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EquipClassCodeDeleteRequest.java
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
 * Class used to create a EquipClassCodeDeleteRequest Udt Request
 *
 */

public class EquipClassCodeDeleteRequest extends EquipClassCodeSubRequestParent {
/**
 *
 * Constructor to create a  EquipClassCodeDeleteRequest
 * @param id Unique request name
 * @param ECCDeleteIn ECCObjectKeyData for EquipClassCodeDeleteRequest
 *
 */
@JsonCreator
  public EquipClassCodeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("EquipClassCode")ECCObjectKeyData ECCDeleteIn) {
    super(id, "EquipClassCodeDelete");
    if (ECCDeleteIn != null) {
      addInput("EquipClassCode", ECCObjectKeyHelper.toMap(ECCDeleteIn, new HashMap(), "ECCObjectKeyData").get("ECCObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ECCObjectData that results from the EquipClassCodeDeleteRequest call
 * @return ECCObjectData resulting from udt call
 *
 */

  public ECCObjectData getOutput() {
    return ECCObjectHelper.fromMap(outputMap, "EquipClassCode");
  }
}
