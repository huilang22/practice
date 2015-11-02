/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyTypeCreateRequest.java
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
 * Class used to create a DependencyTypeCreateRequest Udt Request
 *
 */

public class DependencyTypeCreateRequest extends DependencyTypeSubRequestParent {
/**
 *
 * Constructor to create a  DependencyTypeCreateRequest
 * @param id Unique request name
 * @param DependencyTypeCreateIn DependencyTypeObjectData for DependencyTypeCreateRequest
 *
 */
@JsonCreator
  public DependencyTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("DependencyType")DependencyTypeObjectData DependencyTypeCreateIn) {
    super(id, "DependencyTypeCreate");
    if (DependencyTypeCreateIn != null) {
      addInput("DependencyType", DependencyTypeObjectHelper.toMap(DependencyTypeCreateIn, new HashMap(), "DependencyType").get("DependencyType"));
    }
  }

/**
 *
 * Retrieves the DependencyTypeObjectData that results from the DependencyTypeCreateRequest call
 * @return DependencyTypeObjectData resulting from udt call
 *
 */

  public DependencyTypeObjectData getOutput() {
    return DependencyTypeObjectHelper.fromMap(outputMap, "DependencyType");
  }
}
