/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointClassFindRequest.java
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
 * Class used to create a PointClassFindRequest Udt Request
 *
 */

public class PointClassFindRequest extends PointClassRequest {
/**
 *
 * Constructor to create a  PointClassFindRequest
 * @param id Unique request name
 * @param PCFindIn PointClassObjectFilter for PointClassFindRequest
 *
 */
@JsonCreator
  public PointClassFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("PointClass")PointClassObjectFilter PCFindIn) {
    super(id, "PointClassFind");
    if (PCFindIn != null) {
      Integer index =  PCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PointClass", PointClassObjectHelper.toMap(PCFindIn, new HashMap(), "PointClass").get("PointClass"));
    }
  }

/**
 *
 * Retrieves the PointClassObjectDataList that results from the PointClassFindRequest call
 * @return PointClassObjectDataList resulting from udt call
 *
 */

  public PointClassObjectDataList getOutput() {
    return PointClassObjectHelper.fromMapList(outputMap, "PointClassList");
  }
}
