/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepartmentCreateRequest.java
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
 * Class used to create a DepartmentCreateRequest Udt Request
 *
 */

public class DepartmentCreateRequest extends DepartmentSubRequestParent {
/**
 *
 * Constructor to create a  DepartmentCreateRequest
 * @param id Unique request name
 * @param DepartmentCreateIn DepartmentObjectData for DepartmentCreateRequest
 *
 */
@JsonCreator
  public DepartmentCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Department")DepartmentObjectData DepartmentCreateIn) {
    super(id, "DepartmentCreate");
    if (DepartmentCreateIn != null) {
      addInput("Department", DepartmentObjectHelper.toMap(DepartmentCreateIn, new HashMap(), "Department").get("Department"));
    }
  }

/**
 *
 * Retrieves the DepartmentObjectData that results from the DepartmentCreateRequest call
 * @return DepartmentObjectData resulting from udt call
 *
 */

  public DepartmentObjectData getOutput() {
    return DepartmentObjectHelper.fromMap(outputMap, "Department");
  }
}
