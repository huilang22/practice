/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentDeleteRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ComponentDeleteRequest Udt Request
 *
 */

public class ComponentDeleteRequest extends ComponentSubRequestParent {
/**
 *
 * Constructor to create a  ComponentDeleteRequest
 * @param id Unique request name
 * @param ComponentDeleteIn ComponentObjectBaseKeyData for ComponentDeleteRequest
 * @param CDCeaseDate Date for ComponentDeleteRequest
 *
 */
@JsonCreator
  public ComponentDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("Component")ComponentObjectBaseKeyData ComponentDeleteIn, @JsonProperty("InactiveDate")Date CDCeaseDate) {
    super(id, "ComponentDelete");
    if (ComponentDeleteIn != null) {
      addInput("Component", ComponentObjectBaseKeyHelper.toMap(ComponentDeleteIn, new HashMap(), "ComponentObjectBaseKeyData").get("ComponentObjectBaseKeyData"));
    }
    if (CDCeaseDate != null) {
      addInput("InactiveDate", CDCeaseDate);
    }
  }

/**
 *
 * Retrieves the ComponentObjectBaseData that results from the ComponentDeleteRequest call
 * @return ComponentObjectBaseData resulting from udt call
 *
 */

  public ComponentObjectBaseData getOutput() {
    return ComponentObjectBaseHelper.fromMap(outputMap, "Component");
  }
}
