/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentFindRequest.java
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
 * Class used to create a ComponentFindRequest Udt Request
 *
 */

public class ComponentFindRequest extends ComponentRequest {
/**
 *
 * Constructor to create a  ComponentFindRequest
 * @param id Unique request name
 * @param CompFindIn ComponentObjectBaseFilter for ComponentFindRequest
 *
 */
@JsonCreator
  public ComponentFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Component")ComponentObjectBaseFilter CompFindIn) {
    super(id, "ComponentFind");
    if (CompFindIn != null) {
      Integer index =  CompFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Component", ComponentObjectBaseHelper.toMap(CompFindIn, new HashMap(), "Component").get("Component"));
    }
  }

/**
 *
 * Retrieves the ComponentObjectBaseDataList that results from the ComponentFindRequest call
 * @return ComponentObjectBaseDataList resulting from udt call
 *
 */

  public ComponentObjectBaseDataList getOutput() {
    return ComponentObjectBaseHelper.fromMapList(outputMap, "ComponentList");
  }
}
