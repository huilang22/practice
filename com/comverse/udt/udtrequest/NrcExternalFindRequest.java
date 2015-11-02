/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcExternalFindRequest.java
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
import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a NrcExternalFindRequest Udt Request
 *
 */

public class NrcExternalFindRequest extends NrcRequest {
/**
 *
 * Constructor to create a  NrcExternalFindRequest
 * @param id Unique request name
 * @param NSEXFindIn NrcObjectFilter for NrcExternalFindRequest
 * @param __viewable_only Boolean for NrcExternalFindRequest
 *
 */
@JsonCreator
  public NrcExternalFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Nrc")NrcObjectFilter NSEXFindIn, @JsonProperty("ViewableOnly")Boolean __viewable_only) {
    super(id, "NrcExternalFind");
    if (NSEXFindIn != null) {
      Integer index =  NSEXFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Nrc", NrcObjectHelper.toMap(NSEXFindIn, new HashMap(), "Nrc").get("Nrc"));
    }
    if (__viewable_only != null) {
      addInput("ViewableOnly", __viewable_only);
    }
  }

/**
 *
 * Retrieves the NrcObjectDataList that results from the NrcExternalFindRequest call
 * @return NrcObjectDataList resulting from udt call
 *
 */

  public NrcObjectDataList getOutput() {
    return NrcObjectHelper.fromMapList(outputMap, "NrcList");
  }
}
