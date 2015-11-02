/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentFindCountRequest.java
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
 * Class used to create a ComponentFindCountRequest Udt Request
 *
 */

public class ComponentFindCountRequest extends ComponentRequest {
/**
 *
 * Constructor to create a  ComponentFindCountRequest
 * @param id Unique request name
 * @param ComponentFindCountIn ComponentObjectBaseFilter for ComponentFindCountRequest
 *
 */
@JsonCreator
  public ComponentFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("Component")ComponentObjectBaseFilter ComponentFindCountIn) {
    super(id, "ComponentFindCount");
    if (ComponentFindCountIn != null) {
      Integer index =  ComponentFindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Component", ComponentObjectBaseHelper.toMap(ComponentFindCountIn, new HashMap(), "ComponentCount").get("ComponentCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the ComponentFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("ComponentCount");
  }
}
