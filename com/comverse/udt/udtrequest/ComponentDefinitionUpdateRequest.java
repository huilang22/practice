/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentDefinitionUpdateRequest.java
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
 * Class used to create a ComponentDefinitionUpdateRequest Udt Request
 *
 */

public class ComponentDefinitionUpdateRequest extends ComponentDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  ComponentDefinitionUpdateRequest
 * @param id Unique request name
 * @param CDUpdateIn CDObjectData for ComponentDefinitionUpdateRequest
 *
 */
@JsonCreator
  public ComponentDefinitionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ComponentDefinition")CDObjectData CDUpdateIn) {
    super(id, "ComponentDefinitionUpdate");
    if (CDUpdateIn != null) {
      addInput("ComponentDefinition", CDObjectHelper.toMap(CDUpdateIn, new HashMap(), "ComponentDefinition").get("ComponentDefinition"));
    }
  }

/**
 *
 * Retrieves the CDObjectData that results from the ComponentDefinitionUpdateRequest call
 * @return CDObjectData resulting from udt call
 *
 */

  public CDObjectData getOutput() {
    return CDObjectHelper.fromMap(outputMap, "ComponentDefinition");
  }
}
