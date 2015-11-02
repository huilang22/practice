/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrDefinitionCreateRequest.java
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
 * Class used to create a UnitCrDefinitionCreateRequest Udt Request
 *
 */

public class UnitCrDefinitionCreateRequest extends UnitCrDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  UnitCrDefinitionCreateRequest
 * @param id Unique request name
 * @param ucdCrIn UnitCrDefinitionObjectData for UnitCrDefinitionCreateRequest
 *
 */
@JsonCreator
  public UnitCrDefinitionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitCrDefinition")UnitCrDefinitionObjectData ucdCrIn) {
    super(id, "UnitCrDefinitionCreate");
    if (ucdCrIn != null) {
      addInput("UnitCrDefinition", UnitCrDefinitionObjectHelper.toMap(ucdCrIn, new HashMap(), "UnitCrDefinition").get("UnitCrDefinition"));
    }
  }

/**
 *
 * Retrieves the UnitCrDefinitionObjectData that results from the UnitCrDefinitionCreateRequest call
 * @return UnitCrDefinitionObjectData resulting from udt call
 *
 */

  public UnitCrDefinitionObjectData getOutput() {
    return UnitCrDefinitionObjectHelper.fromMap(outputMap, "UnitCrDefinition");
  }
}
