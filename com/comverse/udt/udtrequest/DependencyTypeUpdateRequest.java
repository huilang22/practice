/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyTypeUpdateRequest.java
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
 * Class used to create a DependencyTypeUpdateRequest Udt Request
 *
 */

public class DependencyTypeUpdateRequest extends DependencyTypeSubRequestParent {
/**
 *
 * Constructor to create a  DependencyTypeUpdateRequest
 * @param id Unique request name
 * @param DependencyTypeUpdateIn DependencyTypeObjectData for DependencyTypeUpdateRequest
 *
 */
@JsonCreator
  public DependencyTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("DependencyType")DependencyTypeObjectData DependencyTypeUpdateIn) {
    super(id, "DependencyTypeUpdate");
    if (DependencyTypeUpdateIn != null) {
      addInput("DependencyType", DependencyTypeObjectHelper.toMap(DependencyTypeUpdateIn, new HashMap(), "DependencyType").get("DependencyType"));
    }
  }

/**
 *
 * Retrieves the DependencyTypeObjectData that results from the DependencyTypeUpdateRequest call
 * @return DependencyTypeObjectData resulting from udt call
 *
 */

  public DependencyTypeObjectData getOutput() {
    return DependencyTypeObjectHelper.fromMap(outputMap, "DependencyType");
  }
}
