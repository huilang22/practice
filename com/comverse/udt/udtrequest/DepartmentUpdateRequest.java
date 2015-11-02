/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepartmentUpdateRequest.java
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
 * Class used to create a DepartmentUpdateRequest Udt Request
 *
 */

public class DepartmentUpdateRequest extends DepartmentSubRequestParent {
/**
 *
 * Constructor to create a  DepartmentUpdateRequest
 * @param id Unique request name
 * @param DepartmentUpdateIn DepartmentObjectData for DepartmentUpdateRequest
 *
 */
@JsonCreator
  public DepartmentUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Department")DepartmentObjectData DepartmentUpdateIn) {
    super(id, "DepartmentUpdate");
    if (DepartmentUpdateIn != null) {
      addInput("Department", DepartmentObjectHelper.toMap(DepartmentUpdateIn, new HashMap(), "Department").get("Department"));
    }
  }

/**
 *
 * Retrieves the DepartmentObjectData that results from the DepartmentUpdateRequest call
 * @return DepartmentObjectData resulting from udt call
 *
 */

  public DepartmentObjectData getOutput() {
    return DepartmentObjectHelper.fromMap(outputMap, "Department");
  }
}
