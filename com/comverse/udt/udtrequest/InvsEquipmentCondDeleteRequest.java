/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentCondDeleteRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsEquipmentCondDeleteRequest Udt Request
 *
 */

public class InvsEquipmentCondDeleteRequest extends InvsEquipmentCondSubRequestParent {
/**
 *
 * Constructor to create a  InvsEquipmentCondDeleteRequest
 * @param id Unique request name
 * @param IECDeleteIn InvsEquipmentCondObjectKeyData for InvsEquipmentCondDeleteRequest
 *
 */
@JsonCreator
  public InvsEquipmentCondDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipmentCond")InvsEquipmentCondObjectKeyData IECDeleteIn) {
    super(id, "InvsEquipmentCondDelete");
    if (IECDeleteIn != null) {
      addInput("InvsEquipmentCond", InvsEquipmentCondObjectKeyHelper.toMap(IECDeleteIn, new HashMap(), "InvsEquipmentCondObjectKeyData").get("InvsEquipmentCondObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsEquipmentCondObjectData that results from the InvsEquipmentCondDeleteRequest call
 * @return InvsEquipmentCondObjectData resulting from udt call
 *
 */

  public InvsEquipmentCondObjectData getOutput() {
    return InvsEquipmentCondObjectHelper.fromMap(outputMap, "InvsEquipmentCond");
  }
}
