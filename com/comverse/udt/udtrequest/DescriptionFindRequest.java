/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DescriptionFindRequest.java
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
 * Class used to create a DescriptionFindRequest Udt Request
 *
 */

public class DescriptionFindRequest extends DescriptionRequest {
/**
 *
 * Constructor to create a  DescriptionFindRequest
 * @param id Unique request name
 * @param DescriptionFindIn DescriptionObjectFilter for DescriptionFindRequest
 *
 */
@JsonCreator
  public DescriptionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Description")DescriptionObjectFilter DescriptionFindIn) {
    super(id, "DescriptionFind");
    if (DescriptionFindIn != null) {
      Integer index =  DescriptionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Description", DescriptionObjectHelper.toMap(DescriptionFindIn, new HashMap(), "Description").get("Description"));
    }
  }

/**
 *
 * Retrieves the DescriptionObjectDataList that results from the DescriptionFindRequest call
 * @return DescriptionObjectDataList resulting from udt call
 *
 */

  public DescriptionObjectDataList getOutput() {
    return DescriptionObjectHelper.fromMapList(outputMap, "DescriptionList");
  }
}
