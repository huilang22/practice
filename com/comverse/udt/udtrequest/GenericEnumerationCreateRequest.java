/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenericEnumerationCreateRequest.java
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
 * Class used to create a GenericEnumerationCreateRequest Udt Request
 *
 */

public class GenericEnumerationCreateRequest extends GenericEnumerationSubRequestParent {
/**
 *
 * Constructor to create a  GenericEnumerationCreateRequest
 * @param id Unique request name
 * @param GECreateIn GEObjectData for GenericEnumerationCreateRequest
 *
 */
@JsonCreator
  public GenericEnumerationCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("GenericEnumeration")GEObjectData GECreateIn) {
    super(id, "GenericEnumerationCreate");
    if (GECreateIn != null) {
      addInput("GenericEnumeration", GEObjectHelper.toMap(GECreateIn, new HashMap(), "GenericEnumeration").get("GenericEnumeration"));
    }
  }

/**
 *
 * Retrieves the GEObjectData that results from the GenericEnumerationCreateRequest call
 * @return GEObjectData resulting from udt call
 *
 */

  public GEObjectData getOutput() {
    return GEObjectHelper.fromMap(outputMap, "GenericEnumeration");
  }
}
