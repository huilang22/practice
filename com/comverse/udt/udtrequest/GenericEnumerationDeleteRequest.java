/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenericEnumerationDeleteRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a GenericEnumerationDeleteRequest Udt Request
 *
 */

public class GenericEnumerationDeleteRequest extends GenericEnumerationSubRequestParent {
/**
 *
 * Constructor to create a  GenericEnumerationDeleteRequest
 * @param id Unique request name
 * @param GEDeleteIn GEObjectKeyData for GenericEnumerationDeleteRequest
 *
 */
@JsonCreator
  public GenericEnumerationDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("GenericEnumeration")GEObjectKeyData GEDeleteIn) {
    super(id, "GenericEnumerationDelete");
    if (GEDeleteIn != null) {
      addInput("GenericEnumeration", GEObjectKeyHelper.toMap(GEDeleteIn, new HashMap(), "GEObjectKeyData").get("GEObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GEObjectData that results from the GenericEnumerationDeleteRequest call
 * @return GEObjectData resulting from udt call
 *
 */

  public GEObjectData getOutput() {
    return GEObjectHelper.fromMap(outputMap, "GenericEnumeration");
  }
}
