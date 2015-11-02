/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepartmentGetRequest.java
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
 * Class used to create a DepartmentGetRequest Udt Request
 *
 */

public class DepartmentGetRequest extends DepartmentSubRequestParent {
/**
 *
 * Constructor to create a  DepartmentGetRequest
 * @param id Unique request name
 * @param DepartmentGetIn DepartmentObjectKeyData for DepartmentGetRequest
 *
 */
@JsonCreator
  public DepartmentGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Department")DepartmentObjectKeyData DepartmentGetIn) {
    super(id, "DepartmentGet");
    if (DepartmentGetIn != null) {
      addInput("Department", DepartmentObjectKeyHelper.toMap(DepartmentGetIn, new HashMap(), "DepartmentObjectKeyData").get("DepartmentObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the DepartmentObjectData that results from the DepartmentGetRequest call
 * @return DepartmentObjectData resulting from udt call
 *
 */

  public DepartmentObjectData getOutput() {
    return DepartmentObjectHelper.fromMap(outputMap, "Department");
  }
}
