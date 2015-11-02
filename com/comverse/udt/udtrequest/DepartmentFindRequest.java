/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepartmentFindRequest.java
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

import com.csgsystems.we.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a DepartmentFindRequest Udt Request
 *
 */

public class DepartmentFindRequest extends DepartmentRequest {
/**
 *
 * Constructor to create a  DepartmentFindRequest
 * @param id Unique request name
 * @param DepartmentFindIn DepartmentObjectFilter for DepartmentFindRequest
 *
 */
@JsonCreator
  public DepartmentFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Department")DepartmentObjectFilter DepartmentFindIn) {
    super(id, "DepartmentFind");
    if (DepartmentFindIn != null) {
      Integer index =  DepartmentFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Department", DepartmentObjectHelper.toMap(DepartmentFindIn, new HashMap(), "Department").get("Department"));
    }
  }

/**
 *
 * Retrieves the DepartmentObjectDataList that results from the DepartmentFindRequest call
 * @return DepartmentObjectDataList resulting from udt call
 *
 */

  public DepartmentObjectDataList getOutput() {
    return DepartmentObjectHelper.fromMapList(outputMap, "DepartmentList");
  }
}
