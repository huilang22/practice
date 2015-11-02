/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcFindRequest.java
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
 * Class used to create a NrcFindRequest Udt Request
 *
 */

public class NrcFindRequest extends NrcRequest {
/**
 *
 * Constructor to create a  NrcFindRequest
 * @param id Unique request name
 * @param NrcFindIn NrcObjectBaseFilter for NrcFindRequest
 * @param ViewableOnly Boolean for NrcFindRequest
 *
 */
@JsonCreator
  public NrcFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Nrc")NrcObjectBaseFilter NrcFindIn, @JsonProperty("ViewableOnly")Boolean ViewableOnly) {
    super(id, "NrcFind");
    if (NrcFindIn != null) {
      Integer index =  NrcFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Nrc", NrcObjectBaseHelper.toMap(NrcFindIn, new HashMap(), "Nrc").get("Nrc"));
    }
    if (ViewableOnly != null) {
      addInput("ViewableOnly", ViewableOnly);
    }
  }

/**
 *
 * Retrieves the NrcObjectBaseDataList that results from the NrcFindRequest call
 * @return NrcObjectBaseDataList resulting from udt call
 *
 */

  public NrcObjectBaseDataList getOutput() {
    return NrcObjectBaseHelper.fromMapList(outputMap, "NrcList");
  }
}
