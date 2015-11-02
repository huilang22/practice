/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyTypeGetRequest.java
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
 * Class used to create a DependencyTypeGetRequest Udt Request
 *
 */

public class DependencyTypeGetRequest extends DependencyTypeSubRequestParent {
/**
 *
 * Constructor to create a  DependencyTypeGetRequest
 * @param id Unique request name
 * @param DependencyTypeGetIn DependencyTypeObjectKeyData for DependencyTypeGetRequest
 *
 */
@JsonCreator
  public DependencyTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("DependencyType")DependencyTypeObjectKeyData DependencyTypeGetIn) {
    super(id, "DependencyTypeGet");
    if (DependencyTypeGetIn != null) {
      addInput("DependencyType", DependencyTypeObjectKeyHelper.toMap(DependencyTypeGetIn, new HashMap(), "DependencyTypeObjectKeyData").get("DependencyTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the DependencyTypeObjectData that results from the DependencyTypeGetRequest call
 * @return DependencyTypeObjectData resulting from udt call
 *
 */

  public DependencyTypeObjectData getOutput() {
    return DependencyTypeObjectHelper.fromMap(outputMap, "DependencyType");
  }
}
