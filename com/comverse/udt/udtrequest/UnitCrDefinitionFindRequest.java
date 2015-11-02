/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrDefinitionFindRequest.java
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
 * Class used to create a UnitCrDefinitionFindRequest Udt Request
 *
 */

public class UnitCrDefinitionFindRequest extends UnitCrDefinitionRequest {
/**
 *
 * Constructor to create a  UnitCrDefinitionFindRequest
 * @param id Unique request name
 * @param ucdFndIn UnitCrDefinitionObjectFilter for UnitCrDefinitionFindRequest
 *
 */
@JsonCreator
  public UnitCrDefinitionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitCrDefinition")UnitCrDefinitionObjectFilter ucdFndIn) {
    super(id, "UnitCrDefinitionFind");
    if (ucdFndIn != null) {
      Integer index =  ucdFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnitCrDefinition", UnitCrDefinitionObjectHelper.toMap(ucdFndIn, new HashMap(), "UnitCrDefinition").get("UnitCrDefinition"));
    }
  }

/**
 *
 * Retrieves the UnitCrDefinitionObjectDataList that results from the UnitCrDefinitionFindRequest call
 * @return UnitCrDefinitionObjectDataList resulting from udt call
 *
 */

  public UnitCrDefinitionObjectDataList getOutput() {
    return UnitCrDefinitionObjectHelper.fromMapList(outputMap, "UnitCrDefinitionList");
  }
}
