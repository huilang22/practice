/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EquipTypeCodeDeleteRequest.java
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
 * Class used to create a EquipTypeCodeDeleteRequest Udt Request
 *
 */

public class EquipTypeCodeDeleteRequest extends EquipTypeCodeSubRequestParent {
/**
 *
 * Constructor to create a  EquipTypeCodeDeleteRequest
 * @param id Unique request name
 * @param ETGDeleteIn ETGObjectKeyData for EquipTypeCodeDeleteRequest
 *
 */
@JsonCreator
  public EquipTypeCodeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("EquipTypeCode")ETGObjectKeyData ETGDeleteIn) {
    super(id, "EquipTypeCodeDelete");
    if (ETGDeleteIn != null) {
      addInput("EquipTypeCode", ETGObjectKeyHelper.toMap(ETGDeleteIn, new HashMap(), "ETGObjectKeyData").get("ETGObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ETGObjectData that results from the EquipTypeCodeDeleteRequest call
 * @return ETGObjectData resulting from udt call
 *
 */

  public ETGObjectData getOutput() {
    return ETGObjectHelper.fromMap(outputMap, "EquipTypeCode");
  }
}
