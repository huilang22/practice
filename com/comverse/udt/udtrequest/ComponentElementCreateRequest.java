/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentElementCreateRequest.java
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
 * Class used to create a ComponentElementCreateRequest Udt Request
 *
 */

public class ComponentElementCreateRequest extends ComponentElementSubRequestParent {
/**
 *
 * Constructor to create a  ComponentElementCreateRequest
 * @param id Unique request name
 * @param ComponentElementCreateIn ComponentElementObjectData for ComponentElementCreateRequest
 *
 */
@JsonCreator
  public ComponentElementCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ComponentElement")ComponentElementObjectData ComponentElementCreateIn) {
    super(id, "ComponentElementCreate");
    if (ComponentElementCreateIn != null) {
      addInput("ComponentElement", ComponentElementObjectHelper.toMap(ComponentElementCreateIn, new HashMap(), "ComponentElement").get("ComponentElement"));
    }
  }

/**
 *
 * Retrieves the ComponentElementObjectData that results from the ComponentElementCreateRequest call
 * @return ComponentElementObjectData resulting from udt call
 *
 */

  public ComponentElementObjectData getOutput() {
    return ComponentElementObjectHelper.fromMap(outputMap, "ComponentElement");
  }
}
