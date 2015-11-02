/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcFindWithExtendedDataRequest.java
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
 * Class used to create a NrcFindWithExtendedDataRequest Udt Request
 *
 */

public class NrcFindWithExtendedDataRequest extends NrcRequest {
/**
 *
 * Constructor to create a  NrcFindWithExtendedDataRequest
 * @param id Unique request name
 * @param NFindWithIn NrcObjectFilter for NrcFindWithExtendedDataRequest
 * @param ___viewable_only Boolean for NrcFindWithExtendedDataRequest
 *
 */
@JsonCreator
  public NrcFindWithExtendedDataRequest(@JsonProperty("RequestId") String id, @JsonProperty("Nrc")NrcObjectFilter NFindWithIn, @JsonProperty("ViewableOnly")Boolean ___viewable_only) {
    super(id, "NrcFindWithExtendedData");
    if (NFindWithIn != null) {
      Integer index =  NFindWithIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Nrc", NrcObjectHelper.toMap(NFindWithIn, new HashMap(), "Nrc").get("Nrc"));
    }
    if (___viewable_only != null) {
      addInput("ViewableOnly", ___viewable_only);
    }
  }

/**
 *
 * Retrieves the NrcObjectDataList that results from the NrcFindWithExtendedDataRequest call
 * @return NrcObjectDataList resulting from udt call
 *
 */

  public NrcObjectDataList getOutput() {
    return NrcObjectHelper.fromMapList(outputMap, "NrcList");
  }
}
