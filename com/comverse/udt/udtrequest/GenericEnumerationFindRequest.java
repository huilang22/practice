/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenericEnumerationFindRequest.java
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
 * Class used to create a GenericEnumerationFindRequest Udt Request
 *
 */

public class GenericEnumerationFindRequest extends GenericEnumerationRequest {
/**
 *
 * Constructor to create a  GenericEnumerationFindRequest
 * @param id Unique request name
 * @param GEFindIn GEObjectFilter for GenericEnumerationFindRequest
 *
 */
@JsonCreator
  public GenericEnumerationFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("GenericEnumeration")GEObjectFilter GEFindIn) {
    super(id, "GenericEnumerationFind");
    if (GEFindIn != null) {
      Integer index =  GEFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("GenericEnumeration", GEObjectHelper.toMap(GEFindIn, new HashMap(), "GenericEnumeration").get("GenericEnumeration"));
    }
  }

/**
 *
 * Retrieves the GEObjectDataList that results from the GenericEnumerationFindRequest call
 * @return GEObjectDataList resulting from udt call
 *
 */

  public GEObjectDataList getOutput() {
    return GEObjectHelper.fromMapList(outputMap, "GenericEnumerationList");
  }
}
