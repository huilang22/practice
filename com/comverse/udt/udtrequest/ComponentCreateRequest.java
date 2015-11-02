/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentCreateRequest.java
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
 * Class used to create a ComponentCreateRequest Udt Request
 *
 */

public class ComponentCreateRequest extends ComponentSubRequestParent {
/**
 *
 * Constructor to create a  ComponentCreateRequest
 * @param id Unique request name
 * @param CompCreateIn ComponentObjectBaseData for ComponentCreateRequest
 *
 */
@JsonCreator
  public ComponentCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Component")ComponentObjectBaseData CompCreateIn) {
    super(id, "ComponentCreate");
    if (CompCreateIn != null) {
      addInput("Component", ComponentObjectBaseHelper.toMap(CompCreateIn, new HashMap(), "Component").get("Component"));
    }
  }

/**
 *
 * Retrieves the ComponentObjectBaseData that results from the ComponentCreateRequest call
 * @return ComponentObjectBaseData resulting from udt call
 *
 */

  public ComponentObjectBaseData getOutput() {
    return ComponentObjectBaseHelper.fromMap(outputMap, "Component");
  }
}
