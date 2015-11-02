/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrDefinitionUpdateRequest.java
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
 * Class used to create a UnitCrDefinitionUpdateRequest Udt Request
 *
 */

public class UnitCrDefinitionUpdateRequest extends UnitCrDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  UnitCrDefinitionUpdateRequest
 * @param id Unique request name
 * @param ucdUpdIn UnitCrDefinitionObjectData for UnitCrDefinitionUpdateRequest
 *
 */
@JsonCreator
  public UnitCrDefinitionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitCrDefinition")UnitCrDefinitionObjectData ucdUpdIn) {
    super(id, "UnitCrDefinitionUpdate");
    if (ucdUpdIn != null) {
      addInput("UnitCrDefinition", UnitCrDefinitionObjectHelper.toMap(ucdUpdIn, new HashMap(), "UnitCrDefinition").get("UnitCrDefinition"));
    }
  }

/**
 *
 * Retrieves the UnitCrDefinitionObjectData that results from the UnitCrDefinitionUpdateRequest call
 * @return UnitCrDefinitionObjectData resulting from udt call
 *
 */

  public UnitCrDefinitionObjectData getOutput() {
    return UnitCrDefinitionObjectHelper.fromMap(outputMap, "UnitCrDefinition");
  }
}
