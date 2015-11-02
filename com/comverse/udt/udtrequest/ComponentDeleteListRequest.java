/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ComponentDeleteListRequest.java
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
 * Class used to create a ComponentDeleteListRequest Udt Request
 *
 */

public class ComponentDeleteListRequest extends ComponentRequest {
/**
 *
 * Constructor to create a  ComponentDeleteListRequest
 * @param id Unique request name
 * @param ComponentFilter ComponentObjectBaseFilter for ComponentDeleteListRequest
 * @param CDLCeaseDate Date for ComponentDeleteListRequest
 *
 */
@JsonCreator
  public ComponentDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("ComponentFilter")ComponentObjectBaseFilter ComponentFilter, @JsonProperty("InactiveDate")Date CDLCeaseDate) {
    super(id, "ComponentDeleteList");
    if (ComponentFilter != null) {
      Integer index =  ComponentFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ComponentFilter", ComponentObjectBaseHelper.toMap(ComponentFilter, new HashMap(), "Void").get("Void"));
    }
    if (CDLCeaseDate != null) {
      addInput("InactiveDate", CDLCeaseDate);
    }
  }

}
