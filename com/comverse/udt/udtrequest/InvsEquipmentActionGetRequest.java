/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsEquipmentActionGetRequest.java
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
 * Class used to create a InvsEquipmentActionGetRequest Udt Request
 *
 */

public class InvsEquipmentActionGetRequest extends InvsEquipmentActionSubRequestParent {
/**
 *
 * Constructor to create a  InvsEquipmentActionGetRequest
 * @param id Unique request name
 * @param InvsEquipmentActionGetIn InvsEquipmentActionObjectKeyData for InvsEquipmentActionGetRequest
 *
 */
@JsonCreator
  public InvsEquipmentActionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsEquipmentAction")InvsEquipmentActionObjectKeyData InvsEquipmentActionGetIn) {
    super(id, "InvsEquipmentActionGet");
    if (InvsEquipmentActionGetIn != null) {
      addInput("InvsEquipmentAction", InvsEquipmentActionObjectKeyHelper.toMap(InvsEquipmentActionGetIn, new HashMap(), "InvsEquipmentActionObjectKeyData").get("InvsEquipmentActionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsEquipmentActionObjectData that results from the InvsEquipmentActionGetRequest call
 * @return InvsEquipmentActionObjectData resulting from udt call
 *
 */

  public InvsEquipmentActionObjectData getOutput() {
    return InvsEquipmentActionObjectHelper.fromMap(outputMap, "InvsEquipmentAction");
  }
}
