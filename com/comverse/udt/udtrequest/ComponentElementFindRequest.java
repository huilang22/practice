/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentElementFindRequest.java
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
 * Class used to create a ComponentElementFindRequest Udt Request
 *
 */

public class ComponentElementFindRequest extends ComponentElementRequest {
/**
 *
 * Constructor to create a  ComponentElementFindRequest
 * @param id Unique request name
 * @param findIn ComponentElementObjectFilter for ComponentElementFindRequest
 *
 */
@JsonCreator
  public ComponentElementFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ComponentElement")ComponentElementObjectFilter findIn) {
    super(id, "ComponentElementFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ComponentElement", ComponentElementObjectHelper.toMap(findIn, new HashMap(), "ComponentElement").get("ComponentElement"));
    }
  }

/**
 *
 * Retrieves the ComponentElementObjectDataList that results from the ComponentElementFindRequest call
 * @return ComponentElementObjectDataList resulting from udt call
 *
 */

  public ComponentElementObjectDataList getOutput() {
    return ComponentElementObjectHelper.fromMapList(outputMap, "ComponentElementList");
  }
}
