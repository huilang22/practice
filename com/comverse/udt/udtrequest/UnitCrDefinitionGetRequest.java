/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrDefinitionGetRequest.java
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
 * Class used to create a UnitCrDefinitionGetRequest Udt Request
 *
 */

public class UnitCrDefinitionGetRequest extends UnitCrDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  UnitCrDefinitionGetRequest
 * @param id Unique request name
 * @param ucdGetIn UnitCrDefinitionObjectKeyData for UnitCrDefinitionGetRequest
 *
 */
@JsonCreator
  public UnitCrDefinitionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitCrDefinition")UnitCrDefinitionObjectKeyData ucdGetIn) {
    super(id, "UnitCrDefinitionGet");
    if (ucdGetIn != null) {
      addInput("UnitCrDefinition", UnitCrDefinitionObjectKeyHelper.toMap(ucdGetIn, new HashMap(), "UnitCrDefinitionObjectKeyData").get("UnitCrDefinitionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UnitCrDefinitionObjectData that results from the UnitCrDefinitionGetRequest call
 * @return UnitCrDefinitionObjectData resulting from udt call
 *
 */

  public UnitCrDefinitionObjectData getOutput() {
    return UnitCrDefinitionObjectHelper.fromMap(outputMap, "UnitCrDefinition");
  }
}
