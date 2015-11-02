/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitsTypeFindRequest.java
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
 * Class used to create a UnitsTypeFindRequest Udt Request
 *
 */

public class UnitsTypeFindRequest extends UnitsTypeRequest {
/**
 *
 * Constructor to create a  UnitsTypeFindRequest
 * @param id Unique request name
 * @param utFindIn UnitsTypeObjectFilter for UnitsTypeFindRequest
 *
 */
@JsonCreator
  public UnitsTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnitsType")UnitsTypeObjectFilter utFindIn) {
    super(id, "UnitsTypeFind");
    if (utFindIn != null) {
      Integer index =  utFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnitsType", UnitsTypeObjectHelper.toMap(utFindIn, new HashMap(), "UnitsType").get("UnitsType"));
    }
  }

/**
 *
 * Retrieves the UnitsTypeObjectDataList that results from the UnitsTypeFindRequest call
 * @return UnitsTypeObjectDataList resulting from udt call
 *
 */

  public UnitsTypeObjectDataList getOutput() {
    return UnitsTypeObjectHelper.fromMapList(outputMap, "UnitsTypeList");
  }
}
