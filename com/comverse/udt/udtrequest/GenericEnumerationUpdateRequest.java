/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenericEnumerationUpdateRequest.java
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
 * Class used to create a GenericEnumerationUpdateRequest Udt Request
 *
 */

public class GenericEnumerationUpdateRequest extends GenericEnumerationSubRequestParent {
/**
 *
 * Constructor to create a  GenericEnumerationUpdateRequest
 * @param id Unique request name
 * @param GEUpdateIn GEObjectData for GenericEnumerationUpdateRequest
 *
 */
@JsonCreator
  public GenericEnumerationUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GenericEnumeration")GEObjectData GEUpdateIn) {
    super(id, "GenericEnumerationUpdate");
    if (GEUpdateIn != null) {
      addInput("GenericEnumeration", GEObjectHelper.toMap(GEUpdateIn, new HashMap(), "GenericEnumeration").get("GenericEnumeration"));
    }
  }

/**
 *
 * Retrieves the GEObjectData that results from the GenericEnumerationUpdateRequest call
 * @return GEObjectData resulting from udt call
 *
 */

  public GEObjectData getOutput() {
    return GEObjectHelper.fromMap(outputMap, "GenericEnumeration");
  }
}
