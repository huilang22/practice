/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentExternalFindRequest.java
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
 * Class used to create a ComponentExternalFindRequest Udt Request
 *
 */

public class ComponentExternalFindRequest extends ComponentRequest {
/**
 *
 * Constructor to create a  ComponentExternalFindRequest
 * @param id Unique request name
 * @param CSEXFindIn ComponentObjectFilter for ComponentExternalFindRequest
 *
 */
@JsonCreator
  public ComponentExternalFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Component")ComponentObjectFilter CSEXFindIn) {
    super(id, "ComponentExternalFind");
    if (CSEXFindIn != null) {
      Integer index =  CSEXFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Component", ComponentObjectHelper.toMap(CSEXFindIn, new HashMap(), "Component").get("Component"));
    }
  }

/**
 *
 * Retrieves the ComponentObjectDataList that results from the ComponentExternalFindRequest call
 * @return ComponentObjectDataList resulting from udt call
 *
 */

  public ComponentObjectDataList getOutput() {
    return ComponentObjectHelper.fromMapList(outputMap, "ComponentList");
  }
}
