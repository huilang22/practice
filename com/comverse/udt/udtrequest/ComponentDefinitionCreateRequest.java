/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentDefinitionCreateRequest.java
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
 * Class used to create a ComponentDefinitionCreateRequest Udt Request
 *
 */

public class ComponentDefinitionCreateRequest extends ComponentDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  ComponentDefinitionCreateRequest
 * @param id Unique request name
 * @param CDCreateIn CDObjectData for ComponentDefinitionCreateRequest
 *
 */
@JsonCreator
  public ComponentDefinitionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ComponentDefinition")CDObjectData CDCreateIn) {
    super(id, "ComponentDefinitionCreate");
    if (CDCreateIn != null) {
      addInput("ComponentDefinition", CDObjectHelper.toMap(CDCreateIn, new HashMap(), "ComponentDefinition").get("ComponentDefinition"));
    }
  }

/**
 *
 * Retrieves the CDObjectData that results from the ComponentDefinitionCreateRequest call
 * @return CDObjectData resulting from udt call
 *
 */

  public CDObjectData getOutput() {
    return CDObjectHelper.fromMap(outputMap, "ComponentDefinition");
  }
}
