/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SpecialDestinationTypeFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a SpecialDestinationTypeFindRequest Udt Request
 *
 */

public class SpecialDestinationTypeFindRequest extends SpecialDestinationTypeRequest {
/**
 *
 * Constructor to create a  SpecialDestinationTypeFindRequest
 * @param id Unique request name
 * @param sdFindIn SpecialDestinationTypeObjectFilter for SpecialDestinationTypeFindRequest
 *
 */
@JsonCreator
  public SpecialDestinationTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("SpecialDestinationType")SpecialDestinationTypeObjectFilter sdFindIn) {
    super(id, "SpecialDestinationTypeFind");
    if (sdFindIn != null) {
      Integer index =  sdFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SpecialDestinationType", SpecialDestinationTypeObjectHelper.toMap(sdFindIn, new HashMap(), "SpecialDestinationType").get("SpecialDestinationType"));
    }
  }

/**
 *
 * Retrieves the SpecialDestinationTypeObjectDataList that results from the SpecialDestinationTypeFindRequest call
 * @return SpecialDestinationTypeObjectDataList resulting from udt call
 *
 */

  public SpecialDestinationTypeObjectDataList getOutput() {
    return SpecialDestinationTypeObjectHelper.fromMapList(outputMap, "SpecialDestinationTypeList");
  }
}
