/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentDefinitionFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ComponentDefinitionFindRequest Udt Request
 *
 */

public class ComponentDefinitionFindRequest extends ComponentDefinitionRequest {
/**
 *
 * Constructor to create a  ComponentDefinitionFindRequest
 * @param id Unique request name
 * @param CDFindIn CDObjectFilter for ComponentDefinitionFindRequest
 *
 */
@JsonCreator
  public ComponentDefinitionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ComponentDefinition")CDObjectFilter CDFindIn) {
    super(id, "ComponentDefinitionFind");
    if (CDFindIn != null) {
      Integer index =  CDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ComponentDefinition", CDObjectHelper.toMap(CDFindIn, new HashMap(), "ComponentDefinition").get("ComponentDefinition"));
    }
  }

/**
 *
 * Retrieves the CDObjectDataList that results from the ComponentDefinitionFindRequest call
 * @return CDObjectDataList resulting from udt call
 *
 */

  public CDObjectDataList getOutput() {
    return CDObjectHelper.fromMapList(outputMap, "ComponentDefinitionList");
  }
}
