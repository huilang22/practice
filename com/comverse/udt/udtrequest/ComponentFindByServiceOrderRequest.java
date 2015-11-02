/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentFindByServiceOrderRequest.java
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
 * Class used to create a ComponentFindByServiceOrderRequest Udt Request
 *
 */

public class ComponentFindByServiceOrderRequest extends ComponentRequest {
/**
 *
 * Constructor to create a  ComponentFindByServiceOrderRequest
 * @param id Unique request name
 * @param CompFindByServiceOrderIn ComponentObjectBaseFilter for ComponentFindByServiceOrderRequest
 * @param ServiceOrderId String for ComponentFindByServiceOrderRequest
 *
 */
@JsonCreator
  public ComponentFindByServiceOrderRequest(@JsonProperty("RequestId") String id, @JsonProperty("Component")ComponentObjectBaseFilter CompFindByServiceOrderIn, @JsonProperty("ServiceOrderId")String ServiceOrderId) {
    super(id, "ComponentFindByServiceOrder");
    if (CompFindByServiceOrderIn != null) {
      Integer index =  CompFindByServiceOrderIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Component", ComponentObjectBaseHelper.toMap(CompFindByServiceOrderIn, new HashMap(), "Component").get("Component"));
    }
    if (ServiceOrderId != null) {
      addInput("ServiceOrderId", ServiceOrderId);
    }
  }

/**
 *
 * Retrieves the ComponentObjectBaseDataList that results from the ComponentFindByServiceOrderRequest call
 * @return ComponentObjectBaseDataList resulting from udt call
 *
 */

  public ComponentObjectBaseDataList getOutput() {
    return ComponentObjectBaseHelper.fromMapList(outputMap, "ComponentList");
  }
}
