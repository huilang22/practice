/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentUpdateRequest.java
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
 * Class used to create a ComponentUpdateRequest Udt Request
 *
 */

public class ComponentUpdateRequest extends ComponentSubRequestParent {
/**
 *
 * Constructor to create a  ComponentUpdateRequest
 * @param id Unique request name
 * @param CompUpdateIn ComponentObjectBaseData for ComponentUpdateRequest
 *
 */
@JsonCreator
  public ComponentUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Component")ComponentObjectBaseData CompUpdateIn) {
    super(id, "ComponentUpdate");
    if (CompUpdateIn != null) {
      addInput("Component", ComponentObjectBaseHelper.toMap(CompUpdateIn, new HashMap(), "Component").get("Component"));
    }
  }

/**
 *
 * Retrieves the ComponentObjectBaseData that results from the ComponentUpdateRequest call
 * @return ComponentObjectBaseData resulting from udt call
 *
 */

  public ComponentObjectBaseData getOutput() {
    return ComponentObjectBaseHelper.fromMap(outputMap, "Component");
  }
}
