/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataLocateFindRequest.java
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
 * Class used to create a ExtendedDataLocateFindRequest Udt Request
 *
 */

public class ExtendedDataLocateFindRequest extends ExtendedDataLocateRequest {
/**
 *
 * Constructor to create a  ExtendedDataLocateFindRequest
 * @param id Unique request name
 * @param elfIn ExtendedDataLocateObjectFilter for ExtendedDataLocateFindRequest
 *
 */
@JsonCreator
  public ExtendedDataLocateFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExtendedDataLocate")ExtendedDataLocateObjectFilter elfIn) {
    super(id, "ExtendedDataLocateFind");
    if (elfIn != null) {
      Integer index =  elfIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExtendedDataLocate", ExtendedDataLocateObjectHelper.toMap(elfIn, new HashMap(), "ExtendedDataLocate").get("ExtendedDataLocate"));
    }
  }

/**
 *
 * Retrieves the ExtendedDataLocateObjectDataList that results from the ExtendedDataLocateFindRequest call
 * @return ExtendedDataLocateObjectDataList resulting from udt call
 *
 */

  public ExtendedDataLocateObjectDataList getOutput() {
    return ExtendedDataLocateObjectHelper.fromMapList(outputMap, "ExtendedDataLocateList");
  }
}
