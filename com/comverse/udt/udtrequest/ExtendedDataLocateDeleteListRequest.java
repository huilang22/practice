/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataLocateDeleteListRequest.java
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
 * Class used to create a ExtendedDataLocateDeleteListRequest Udt Request
 *
 */

public class ExtendedDataLocateDeleteListRequest extends ExtendedDataLocateSubRequestParent {
/**
 *
 * Constructor to create a  ExtendedDataLocateDeleteListRequest
 * @param id Unique request name
 * @param elxlistIn ExtendedDataLocateObjectFilter for ExtendedDataLocateDeleteListRequest
 *
 */
@JsonCreator
  public ExtendedDataLocateDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExtendedDataLocate")ExtendedDataLocateObjectFilter elxlistIn) {
    super(id, "ExtendedDataLocateDeleteList");
    if (elxlistIn != null) {
      Integer index =  elxlistIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExtendedDataLocate", ExtendedDataLocateObjectHelper.toMap(elxlistIn, new HashMap(), "ExtendedDataLocate").get("ExtendedDataLocate"));
    }
  }

/**
 *
 * Retrieves the ExtendedDataLocateObjectData that results from the ExtendedDataLocateDeleteListRequest call
 * @return ExtendedDataLocateObjectData resulting from udt call
 *
 */

  public ExtendedDataLocateObjectData getOutput() {
    return ExtendedDataLocateObjectHelper.fromMap(outputMap, "ExtendedDataLocate");
  }
}
