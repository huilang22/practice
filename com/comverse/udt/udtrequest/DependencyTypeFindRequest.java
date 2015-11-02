/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyTypeFindRequest.java
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
 * Class used to create a DependencyTypeFindRequest Udt Request
 *
 */

public class DependencyTypeFindRequest extends DependencyTypeRequest {
/**
 *
 * Constructor to create a  DependencyTypeFindRequest
 * @param id Unique request name
 * @param DependencyTypeFindIn DependencyTypeObjectFilter for DependencyTypeFindRequest
 *
 */
@JsonCreator
  public DependencyTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("DependencyType")DependencyTypeObjectFilter DependencyTypeFindIn) {
    super(id, "DependencyTypeFind");
    if (DependencyTypeFindIn != null) {
      Integer index =  DependencyTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DependencyType", DependencyTypeObjectHelper.toMap(DependencyTypeFindIn, new HashMap(), "DependencyType").get("DependencyType"));
    }
  }

/**
 *
 * Retrieves the DependencyTypeObjectDataList that results from the DependencyTypeFindRequest call
 * @return DependencyTypeObjectDataList resulting from udt call
 *
 */

  public DependencyTypeObjectDataList getOutput() {
    return DependencyTypeObjectHelper.fromMapList(outputMap, "DependencyTypeList");
  }
}
