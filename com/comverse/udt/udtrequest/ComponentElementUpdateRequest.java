/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentElementUpdateRequest.java
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
 * Class used to create a ComponentElementUpdateRequest Udt Request
 *
 */

public class ComponentElementUpdateRequest extends ComponentElementSubRequestParent {
/**
 *
 * Constructor to create a  ComponentElementUpdateRequest
 * @param id Unique request name
 * @param ComponentElementUpdateIn ComponentElementObjectData for ComponentElementUpdateRequest
 *
 */
@JsonCreator
  public ComponentElementUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ComponentElement")ComponentElementObjectData ComponentElementUpdateIn) {
    super(id, "ComponentElementUpdate");
    if (ComponentElementUpdateIn != null) {
      addInput("ComponentElement", ComponentElementObjectHelper.toMap(ComponentElementUpdateIn, new HashMap(), "ComponentElement").get("ComponentElement"));
    }
  }

/**
 *
 * Retrieves the ComponentElementObjectData that results from the ComponentElementUpdateRequest call
 * @return ComponentElementObjectData resulting from udt call
 *
 */

  public ComponentElementObjectData getOutput() {
    return ComponentElementObjectHelper.fromMap(outputMap, "ComponentElement");
  }
}
