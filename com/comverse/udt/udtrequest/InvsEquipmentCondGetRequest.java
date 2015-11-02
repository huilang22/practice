/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentCondGetRequest.java
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
 * Class used to create a InvsEquipmentCondGetRequest Udt Request
 *
 */

public class InvsEquipmentCondGetRequest extends InvsEquipmentCondSubRequestParent {
/**
 *
 * Constructor to create a  InvsEquipmentCondGetRequest
 * @param id Unique request name
 * @param IECGetIn InvsEquipmentCondObjectKeyData for InvsEquipmentCondGetRequest
 *
 */
@JsonCreator
  public InvsEquipmentCondGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipmentCond")InvsEquipmentCondObjectKeyData IECGetIn) {
    super(id, "InvsEquipmentCondGet");
    if (IECGetIn != null) {
      addInput("InvsEquipmentCond", InvsEquipmentCondObjectKeyHelper.toMap(IECGetIn, new HashMap(), "InvsEquipmentCondObjectKeyData").get("InvsEquipmentCondObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsEquipmentCondObjectData that results from the InvsEquipmentCondGetRequest call
 * @return InvsEquipmentCondObjectData resulting from udt call
 *
 */

  public InvsEquipmentCondObjectData getOutput() {
    return InvsEquipmentCondObjectHelper.fromMap(outputMap, "InvsEquipmentCond");
  }
}
